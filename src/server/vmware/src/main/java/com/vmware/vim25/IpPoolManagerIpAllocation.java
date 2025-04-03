
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IpPoolManagerIpAllocation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IpPoolManagerIpAllocation">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="allocationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpPoolManagerIpAllocation", propOrder = {
    "ipAddress",
    "allocationId"
})
public class IpPoolManagerIpAllocation
    extends DynamicData
{

    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(required = true)
    protected String allocationId;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the allocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * Sets the value of the allocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocationId(String value) {
        this.allocationId = value;
    }

}
