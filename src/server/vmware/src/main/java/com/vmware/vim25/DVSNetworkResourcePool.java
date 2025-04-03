
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSNetworkResourcePool complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSNetworkResourcePool">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="configVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="allocationInfo" type="{urn:internalvim25}DVSNetworkResourcePoolAllocationInfo"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSNetworkResourcePool", propOrder = {
    "key",
    "name",
    "description",
    "configVersion",
    "allocationInfo"
})
public class DVSNetworkResourcePool
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    protected String name;
    protected String description;
    @XmlElement(required = true)
    protected String configVersion;
    @XmlElement(required = true)
    protected DVSNetworkResourcePoolAllocationInfo allocationInfo;

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
     * Gets the value of the configVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigVersion() {
        return configVersion;
    }

    /**
     * Sets the value of the configVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigVersion(String value) {
        this.configVersion = value;
    }

    /**
     * Gets the value of the allocationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DVSNetworkResourcePoolAllocationInfo }
     *     
     */
    public DVSNetworkResourcePoolAllocationInfo getAllocationInfo() {
        return allocationInfo;
    }

    /**
     * Sets the value of the allocationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSNetworkResourcePoolAllocationInfo }
     *     
     */
    public void setAllocationInfo(DVSNetworkResourcePoolAllocationInfo value) {
        this.allocationInfo = value;
    }

}
