
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsRateLimitNetworkRuleAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsRateLimitNetworkRuleAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsNetworkRuleAction">
 *       <sequence>
 *         <element name="packetsPerSecond" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsRateLimitNetworkRuleAction", propOrder = {
    "packetsPerSecond"
})
public class DvsRateLimitNetworkRuleAction
    extends DvsNetworkRuleAction
{

    protected int packetsPerSecond;

    /**
     * Gets the value of the packetsPerSecond property.
     * 
     */
    public int getPacketsPerSecond() {
        return packetsPerSecond;
    }

    /**
     * Sets the value of the packetsPerSecond property.
     * 
     */
    public void setPacketsPerSecond(int value) {
        this.packetsPerSecond = value;
    }

}
