
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchHostMemberHostUplinkState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchHostMemberHostUplinkState">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="uplinkName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberHostUplinkState", propOrder = {
    "uplinkName",
    "state"
})
public class DistributedVirtualSwitchHostMemberHostUplinkState
    extends DynamicData
{

    @XmlElement(required = true)
    protected String uplinkName;
    @XmlElement(required = true)
    protected String state;

    /**
     * Gets the value of the uplinkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUplinkName() {
        return uplinkName;
    }

    /**
     * Sets the value of the uplinkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUplinkName(String value) {
        this.uplinkName = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
