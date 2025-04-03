
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsNetworkRuleAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsNetworkRuleAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
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
@XmlType(name = "DvsNetworkRuleAction")
@XmlSeeAlso({
    DvsDropNetworkRuleAction.class,
    DvsAcceptNetworkRuleAction.class,
    DvsUpdateTagNetworkRuleAction.class,
    DvsRateLimitNetworkRuleAction.class,
    DvsLogNetworkRuleAction.class,
    DvsGreEncapNetworkRuleAction.class,
    DvsMacRewriteNetworkRuleAction.class,
    DvsPuntNetworkRuleAction.class,
    DvsCopyNetworkRuleAction.class
})
public class DvsNetworkRuleAction
    extends DynamicData
{


}
