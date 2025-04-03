
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetworkConfigNetStackSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNetworkConfigNetStackSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="netStackInstance" type="{urn:internalvim25}HostNetStackInstance"/>
 *         <element name="operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkConfigNetStackSpec", propOrder = {
    "netStackInstance",
    "operation"
})
public class HostNetworkConfigNetStackSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected HostNetStackInstance netStackInstance;
    protected String operation;

    /**
     * Gets the value of the netStackInstance property.
     * 
     * @return
     *     possible object is
     *     {@link HostNetStackInstance }
     *     
     */
    public HostNetStackInstance getNetStackInstance() {
        return netStackInstance;
    }

    /**
     * Sets the value of the netStackInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNetStackInstance }
     *     
     */
    public void setNetStackInstance(HostNetStackInstance value) {
        this.netStackInstance = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
