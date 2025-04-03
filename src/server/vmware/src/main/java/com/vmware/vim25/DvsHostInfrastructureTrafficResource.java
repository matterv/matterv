
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsHostInfrastructureTrafficResource complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsHostInfrastructureTrafficResource">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="allocationInfo" type="{urn:internalvim25}DvsHostInfrastructureTrafficResourceAllocation"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostInfrastructureTrafficResource", propOrder = {
    "key",
    "description",
    "allocationInfo"
})
public class DvsHostInfrastructureTrafficResource
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    protected String description;
    @XmlElement(required = true)
    protected DvsHostInfrastructureTrafficResourceAllocation allocationInfo;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the allocationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DvsHostInfrastructureTrafficResourceAllocation }
     *     
     */
    public DvsHostInfrastructureTrafficResourceAllocation getAllocationInfo() {
        return allocationInfo;
    }

    /**
     * Sets the value of the allocationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvsHostInfrastructureTrafficResourceAllocation }
     *     
     */
    public void setAllocationInfo(DvsHostInfrastructureTrafficResourceAllocation value) {
        this.allocationInfo = value;
    }

}
