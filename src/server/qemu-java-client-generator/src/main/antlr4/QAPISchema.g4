grammar QAPISchema;
@header {
package computer.matter.qemu.parser;
}
ENUM: '\'' 'enum' '\'';
DATA: '\'' 'data' '\'';
NAME: '\'' 'name' '\'';
PREFIX: '\'' 'prefix' '\'';
IF: '\'' 'if' '\'';
FF: '\'' 'features' '\'';
STRUCT: '\'' 'struct' '\'';
BASE: '\'' 'base' '\'';
UNION: '\'' 'union' '\'';
DISCRIMINATOR: '\'' 'discriminator' '\'';
ALTERNATE: '\'' 'alternate' '\'';
COMMAND: '\'' 'command' '\'';
BOXED: '\'' 'boxed' '\'';
RETURNS: '\'' 'returns' '\'';
SR: '\'' 'success-response' '\'';
GEN: '\'' 'gen' '\'';
ALLOWOOB: '\'' 'allow-oob' '\'';
ALLOWPRECONFIG: '\'' 'allow-preconfig' '\'';
COROUTINE: '\'' 'coroutine' '\'';
EVENT: '\'' 'event' '\'';
INCLUDE: '\'' 'include' '\'';
TYPE: '\'' 'type' '\'';
PRAGMA: '\'' 'pragma' '\'';
DOCREQUIRED: '\'' 'doc-required' '\'';
CMDEXCEPTION: '\'' 'command-name-exceptions' '\'';
CMDRETURNEXCEPTION: '\'' 'command-returns-exceptions' '\'';
DOCEXCEPTION: '\'' 'documentation-exceptions' '\'';
MEMBEREXCEPTION: '\'' 'member-name-exceptions' '\'';
ALL: '\'' 'all' '\'';
NOT: '\'' 'not' '\'';
ANY: '\'' 'any' '\'';

// Parser rules
schema: topLevelExpr+ ;

topLevelExpr: directive | definition ;

directive: include | pragma ;
definition: enum | struct | union | alternate | command | event;

include: '{' INCLUDE ':' STRING '}' ;
pragma: '{' PRAGMA ':' pragmaBody '}' ;
pragmaBody: '{' pragmaItem (',' pragmaItem)* '}' ;
pragmaItem: DOCREQUIRED ':' BOOL
          | CMDEXCEPTION ':' '[' STRING (',' STRING)* ']'
          | CMDRETURNEXCEPTION ':' '[' STRING (',' STRING)* ']'
          | DOCEXCEPTION ':' '[' STRING (',' STRING)* ']'
          | MEMBEREXCEPTION ':' '[' STRING (',' STRING)* ']'
          ;

enum: '{' ENUM ':' STRING enumInfo* '}' ;
enumInfo: ',' DATA ':' '[' enumValue (',' enumValue)* ']'
    | ',' PREFIX ':' STRING
    | ',' IF ':' STRING
    | ',' FF ':' features
;
enumValue: enumValueStr | '{' NAME ':' enumValueStr enumModifiers? '}' ;
enumValueStr: STRING | DATA | ENUM | ALTERNATE | COMMAND | EVENT | ALL | ANY | NOT;
enumModifiers: ',' IF ':' STRING
             | ',' FF ':' features
             ;

struct: '{' STRUCT ':' STRING structInfo* '}' ;
structInfo: ',' base
            | ',' DATA ':' '{' members? '}'
            | structModifiers;

member: typeString ':' typeRef | STRING ':' '{' TYPE ':' typeRef structMemberModifiers? '}' ;
members: ((member (',' member)*));
base: BASE ':' STRING ;
structModifiers: ',' IF ':' cond
               | ',' FF ':' features
               ;
structMemberModifiers: ',' IF ':' cond
                     | ',' FF ':' features
                     ;

union: '{' UNION ':' STRING ',' unionBase ',' unionDiscriminator ',' unionData unionModifiers?  '}' ;
unionBase: BASE ':' (memberBase | STRING) ;
unionDiscriminator: DISCRIMINATOR ':' typeString;
unionData: DATA ':' '{' branch (',' branch)* '}';
branch: branchName ':' typeRef | branchName ':' '{' TYPE ':' typeRef unionBranchModifiers? '}' ;
branchName: STRING | ENUM | ALTERNATE | COMMAND | EVENT;
unionModifiers: ',' IF ':' cond
              | ',' FF ':' features
              ;
unionBranchModifiers: ',' IF ':' cond
                    ;
memberBase : '{' members '}';

alternate: '{' ALTERNATE ':' STRING ',' DATA ':' memberBase '}' ;

command: '{' COMMAND ':' STRING  commandInfo* '}';
commandInfo: commandData | commandAllowPreconfig | commandBoxed | commandReturn | commandCoroutine | commandAllowOOB | commandGen | commandIf | commandFF;
commandData: ',' DATA ':' (memberBase | STRING);
commandAllowPreconfig: ',' ALLOWPRECONFIG ':' BOOL;
commandBoxed: ',' BOXED ':' BOOL;
commandCoroutine: ',' COROUTINE ':' BOOL;
commandReturn: ',' RETURNS ':' typeRef;
commandAllowOOB: ',' ALLOWOOB ':' BOOL;
commandGen: ',' GEN ':' BOOL;
commandIf: ',' IF ':' cond;
commandFF: ',' FF ':' features;

event: '{' EVENT ':' STRING eventInfo* '}';
eventInfo: commandData | commandIf | commandFF;

typeRef: valueType | arrayType ;


type: STRING | ANY;
valueType: type;
arrayType: '[' type ']';

features: '[' featureInfo? ']';
featureInfo: feature (',' feature)*;
feature: STRING | '{' NAME ':' STRING (',' IF ':' cond)? '}';

typeString: TYPE | DATA | NAME | STRING | IF | FF | BASE | EVENT;
// Lexer rules
STRING: '\'' (ESC | ~['\\])* '\'' { setText(getText().substring(1, getText().length() - 1)); };
ESC: '\\\\' | '\\\'';

BOOL: 'true' | 'false';
cond: STRING
| '{' ANY ':' '[' condInfo? ']' '}'
| '{' ALL ':' '[' condInfo? ']' '}'
| '{' NOT ':' '[' condInfo? ']' '}'

;
condInfo: cond (',' cond)*;


WS: [ \t\r\n]+ -> skip ;
COMMENT: '#' ~[\r\n]* -> skip ;
