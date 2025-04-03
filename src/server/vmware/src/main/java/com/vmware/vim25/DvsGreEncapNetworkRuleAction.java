
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsGreEncapNetworkRuleAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsGreEncapNetworkRuleAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsNetworkRuleAction">
 *       <sequence>
 *         <element name="encapsulationIp" type="{urn:internalvim25}SingleIp"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsGreEncapNetworkRuleAction", propOrder = {
    "encapsulationIp"
})
public class DvsGreEncapNetworkRuleAction
    extends DvsNetworkRuleAction
{

    @XmlElement(required = true)
    protected SingleIp encapsulationIp;

    /**
     * Gets the value of the encapsulationIp property.
     * 
     * @return
     *     possible object is
     *     {@link SingleIp }
     *     
     */
    public SingleIp getEncapsulationIp() {
        return encapsulationIp;
    }

    /**
     * Sets the value of the encapsulationIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleIp }
     *     
     */
    public void setEncapsulationIp(SingleIp value) {
        this.encapsulationIp = value;
    }

}
