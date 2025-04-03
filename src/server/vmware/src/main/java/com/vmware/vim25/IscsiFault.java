
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IscsiFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IscsiFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscsiFault")
@XmlSeeAlso({
    IscsiFaultInvalidVnic.class,
    IscsiFaultPnicInUse.class,
    IscsiFaultVnicAlreadyBound.class,
    IscsiFaultVnicHasActivePaths.class,
    IscsiFaultVnicHasMultipleUplinks.class,
    IscsiFaultVnicHasNoUplinks.class,
    IscsiFaultVnicHasWrongUplink.class,
    IscsiFaultVnicInUse.class,
    IscsiFaultVnicIsLastPath.class,
    IscsiFaultVnicNotBound.class,
    IscsiFaultVnicNotFound.class
})
public class IscsiFault
    extends VimFault
{


}
