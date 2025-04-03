
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualSerialPortPipeBackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualSerialPortPipeBackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDevicePipeBackingOption">
 *       <sequence>
 *         <element name="endpoint" type="{urn:internalvim25}ChoiceOption"/>
 *         <element name="noRxLoss" type="{urn:internalvim25}BoolOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSerialPortPipeBackingOption", propOrder = {
    "endpoint",
    "noRxLoss"
})
public class VirtualSerialPortPipeBackingOption
    extends VirtualDevicePipeBackingOption
{

    @XmlElement(required = true)
    protected ChoiceOption endpoint;
    @XmlElement(required = true)
    protected BoolOption noRxLoss;

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setEndpoint(ChoiceOption value) {
        this.endpoint = value;
    }

    /**
     * Gets the value of the noRxLoss property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getNoRxLoss() {
        return noRxLoss;
    }

    /**
     * Sets the value of the noRxLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setNoRxLoss(BoolOption value) {
        this.noRxLoss = value;
    }

}
