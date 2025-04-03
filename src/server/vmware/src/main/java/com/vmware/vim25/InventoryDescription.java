
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InventoryDescription">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="numHosts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numVirtualMachines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numResourcePools" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numClusters" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numCpuDev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numNetDev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numDiskDev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numvCpuDev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numvNetDev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numvDiskDev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryDescription", propOrder = {
    "numHosts",
    "numVirtualMachines",
    "numResourcePools",
    "numClusters",
    "numCpuDev",
    "numNetDev",
    "numDiskDev",
    "numvCpuDev",
    "numvNetDev",
    "numvDiskDev"
})
public class InventoryDescription
    extends DynamicData
{

    protected int numHosts;
    protected int numVirtualMachines;
    protected Integer numResourcePools;
    protected Integer numClusters;
    protected Integer numCpuDev;
    protected Integer numNetDev;
    protected Integer numDiskDev;
    protected Integer numvCpuDev;
    protected Integer numvNetDev;
    protected Integer numvDiskDev;

    /**
     * Gets the value of the numHosts property.
     * 
     */
    public int getNumHosts() {
        return numHosts;
    }

    /**
     * Sets the value of the numHosts property.
     * 
     */
    public void setNumHosts(int value) {
        this.numHosts = value;
    }

    /**
     * Gets the value of the numVirtualMachines property.
     * 
     */
    public int getNumVirtualMachines() {
        return numVirtualMachines;
    }

    /**
     * Sets the value of the numVirtualMachines property.
     * 
     */
    public void setNumVirtualMachines(int value) {
        this.numVirtualMachines = value;
    }

    /**
     * Gets the value of the numResourcePools property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumResourcePools() {
        return numResourcePools;
    }

    /**
     * Sets the value of the numResourcePools property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumResourcePools(Integer value) {
        this.numResourcePools = value;
    }

    /**
     * Gets the value of the numClusters property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumClusters() {
        return numClusters;
    }

    /**
     * Sets the value of the numClusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumClusters(Integer value) {
        this.numClusters = value;
    }

    /**
     * Gets the value of the numCpuDev property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCpuDev() {
        return numCpuDev;
    }

    /**
     * Sets the value of the numCpuDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCpuDev(Integer value) {
        this.numCpuDev = value;
    }

    /**
     * Gets the value of the numNetDev property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumNetDev() {
        return numNetDev;
    }

    /**
     * Sets the value of the numNetDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumNetDev(Integer value) {
        this.numNetDev = value;
    }

    /**
     * Gets the value of the numDiskDev property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDiskDev() {
        return numDiskDev;
    }

    /**
     * Sets the value of the numDiskDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDiskDev(Integer value) {
        this.numDiskDev = value;
    }

    /**
     * Gets the value of the numvCpuDev property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumvCpuDev() {
        return numvCpuDev;
    }

    /**
     * Sets the value of the numvCpuDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumvCpuDev(Integer value) {
        this.numvCpuDev = value;
    }

    /**
     * Gets the value of the numvNetDev property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumvNetDev() {
        return numvNetDev;
    }

    /**
     * Sets the value of the numvNetDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumvNetDev(Integer value) {
        this.numvNetDev = value;
    }

    /**
     * Gets the value of the numvDiskDev property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumvDiskDev() {
        return numvDiskDev;
    }

    /**
     * Sets the value of the numvDiskDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumvDiskDev(Integer value) {
        this.numvDiskDev = value;
    }

}
