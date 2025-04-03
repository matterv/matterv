
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDiskMappingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDiskMappingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="physicalPartition" type="{urn:internalvim25}HostDiskMappingPartitionInfo" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="exclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskMappingInfo", propOrder = {
    "physicalPartition",
    "name",
    "exclusive"
})
public class HostDiskMappingInfo
    extends DynamicData
{

    protected HostDiskMappingPartitionInfo physicalPartition;
    @XmlElement(required = true)
    protected String name;
    protected Boolean exclusive;

    /**
     * Gets the value of the physicalPartition property.
     * 
     * @return
     *     possible object is
     *     {@link HostDiskMappingPartitionInfo }
     *     
     */
    public HostDiskMappingPartitionInfo getPhysicalPartition() {
        return physicalPartition;
    }

    /**
     * Sets the value of the physicalPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDiskMappingPartitionInfo }
     *     
     */
    public void setPhysicalPartition(HostDiskMappingPartitionInfo value) {
        this.physicalPartition = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the exclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclusive() {
        return exclusive;
    }

    /**
     * Sets the value of the exclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusive(Boolean value) {
        this.exclusive = value;
    }

}
