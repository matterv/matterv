
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualHardware complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualHardware">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="numCPU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numCoresPerSocket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="autoCoresPerSocket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="memoryMB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="virtualICH7MPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="virtualSMCPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="device" type="{urn:internalvim25}VirtualDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="motherboardLayout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="simultaneousThreads" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualHardware", propOrder = {
    "numCPU",
    "numCoresPerSocket",
    "autoCoresPerSocket",
    "memoryMB",
    "virtualICH7MPresent",
    "virtualSMCPresent",
    "device",
    "motherboardLayout",
    "simultaneousThreads"
})
public class VirtualHardware
    extends DynamicData
{

    protected int numCPU;
    protected Integer numCoresPerSocket;
    protected Boolean autoCoresPerSocket;
    protected int memoryMB;
    protected Boolean virtualICH7MPresent;
    protected Boolean virtualSMCPresent;
    protected List<VirtualDevice> device;
    protected String motherboardLayout;
    protected Integer simultaneousThreads;

    /**
     * Gets the value of the numCPU property.
     * 
     */
    public int getNumCPU() {
        return numCPU;
    }

    /**
     * Sets the value of the numCPU property.
     * 
     */
    public void setNumCPU(int value) {
        this.numCPU = value;
    }

    /**
     * Gets the value of the numCoresPerSocket property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCoresPerSocket() {
        return numCoresPerSocket;
    }

    /**
     * Sets the value of the numCoresPerSocket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCoresPerSocket(Integer value) {
        this.numCoresPerSocket = value;
    }

    /**
     * Gets the value of the autoCoresPerSocket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCoresPerSocket() {
        return autoCoresPerSocket;
    }

    /**
     * Sets the value of the autoCoresPerSocket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCoresPerSocket(Boolean value) {
        this.autoCoresPerSocket = value;
    }

    /**
     * Gets the value of the memoryMB property.
     * 
     */
    public int getMemoryMB() {
        return memoryMB;
    }

    /**
     * Sets the value of the memoryMB property.
     * 
     */
    public void setMemoryMB(int value) {
        this.memoryMB = value;
    }

    /**
     * Gets the value of the virtualICH7MPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualICH7MPresent() {
        return virtualICH7MPresent;
    }

    /**
     * Sets the value of the virtualICH7MPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualICH7MPresent(Boolean value) {
        this.virtualICH7MPresent = value;
    }

    /**
     * Gets the value of the virtualSMCPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtualSMCPresent() {
        return virtualSMCPresent;
    }

    /**
     * Sets the value of the virtualSMCPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtualSMCPresent(Boolean value) {
        this.virtualSMCPresent = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the device property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualDevice }
     * </p>
     * 
     * 
     * @return
     *     The value of the device property.
     */
    public List<VirtualDevice> getDevice() {
        if (device == null) {
            device = new ArrayList<>();
        }
        return this.device;
    }

    /**
     * Gets the value of the motherboardLayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherboardLayout() {
        return motherboardLayout;
    }

    /**
     * Sets the value of the motherboardLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherboardLayout(String value) {
        this.motherboardLayout = value;
    }

    /**
     * Gets the value of the simultaneousThreads property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSimultaneousThreads() {
        return simultaneousThreads;
    }

    /**
     * Sets the value of the simultaneousThreads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSimultaneousThreads(Integer value) {
        this.simultaneousThreads = value;
    }

}
