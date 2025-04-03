
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NvdimmSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="numDimms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="healthStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="totalCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="persistentCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="blockCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="availableCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="numInterleavesets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numNamespaces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmSummary", propOrder = {
    "numDimms",
    "healthStatus",
    "totalCapacity",
    "persistentCapacity",
    "blockCapacity",
    "availableCapacity",
    "numInterleavesets",
    "numNamespaces"
})
public class NvdimmSummary
    extends DynamicData
{

    protected int numDimms;
    @XmlElement(required = true)
    protected String healthStatus;
    protected long totalCapacity;
    protected long persistentCapacity;
    protected long blockCapacity;
    protected long availableCapacity;
    protected int numInterleavesets;
    protected int numNamespaces;

    /**
     * Gets the value of the numDimms property.
     * 
     */
    public int getNumDimms() {
        return numDimms;
    }

    /**
     * Sets the value of the numDimms property.
     * 
     */
    public void setNumDimms(int value) {
        this.numDimms = value;
    }

    /**
     * Gets the value of the healthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * Sets the value of the healthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthStatus(String value) {
        this.healthStatus = value;
    }

    /**
     * Gets the value of the totalCapacity property.
     * 
     */
    public long getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Sets the value of the totalCapacity property.
     * 
     */
    public void setTotalCapacity(long value) {
        this.totalCapacity = value;
    }

    /**
     * Gets the value of the persistentCapacity property.
     * 
     */
    public long getPersistentCapacity() {
        return persistentCapacity;
    }

    /**
     * Sets the value of the persistentCapacity property.
     * 
     */
    public void setPersistentCapacity(long value) {
        this.persistentCapacity = value;
    }

    /**
     * Gets the value of the blockCapacity property.
     * 
     */
    public long getBlockCapacity() {
        return blockCapacity;
    }

    /**
     * Sets the value of the blockCapacity property.
     * 
     */
    public void setBlockCapacity(long value) {
        this.blockCapacity = value;
    }

    /**
     * Gets the value of the availableCapacity property.
     * 
     */
    public long getAvailableCapacity() {
        return availableCapacity;
    }

    /**
     * Sets the value of the availableCapacity property.
     * 
     */
    public void setAvailableCapacity(long value) {
        this.availableCapacity = value;
    }

    /**
     * Gets the value of the numInterleavesets property.
     * 
     */
    public int getNumInterleavesets() {
        return numInterleavesets;
    }

    /**
     * Sets the value of the numInterleavesets property.
     * 
     */
    public void setNumInterleavesets(int value) {
        this.numInterleavesets = value;
    }

    /**
     * Gets the value of the numNamespaces property.
     * 
     */
    public int getNumNamespaces() {
        return numNamespaces;
    }

    /**
     * Sets the value of the numNamespaces property.
     * 
     */
    public void setNumNamespaces(int value) {
        this.numNamespaces = value;
    }

}
