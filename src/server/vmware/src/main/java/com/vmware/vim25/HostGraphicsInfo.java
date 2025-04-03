
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostGraphicsInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostGraphicsInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pciId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="graphicsType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vgpuMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="memorySizeInKB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostGraphicsInfo", propOrder = {
    "deviceName",
    "vendorName",
    "pciId",
    "graphicsType",
    "vgpuMode",
    "memorySizeInKB",
    "vm"
})
public class HostGraphicsInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String deviceName;
    @XmlElement(required = true)
    protected String vendorName;
    @XmlElement(required = true)
    protected String pciId;
    @XmlElement(required = true)
    protected String graphicsType;
    protected String vgpuMode;
    protected long memorySizeInKB;
    protected List<ManagedObjectReference> vm;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the pciId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPciId() {
        return pciId;
    }

    /**
     * Sets the value of the pciId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPciId(String value) {
        this.pciId = value;
    }

    /**
     * Gets the value of the graphicsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsType() {
        return graphicsType;
    }

    /**
     * Sets the value of the graphicsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsType(String value) {
        this.graphicsType = value;
    }

    /**
     * Gets the value of the vgpuMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgpuMode() {
        return vgpuMode;
    }

    /**
     * Sets the value of the vgpuMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgpuMode(String value) {
        this.vgpuMode = value;
    }

    /**
     * Gets the value of the memorySizeInKB property.
     * 
     */
    public long getMemorySizeInKB() {
        return memorySizeInKB;
    }

    /**
     * Sets the value of the memorySizeInKB property.
     * 
     */
    public void setMemorySizeInKB(long value) {
        this.memorySizeInKB = value;
    }

    /**
     * Gets the value of the vm property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vm property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the vm property.
     */
    public List<ManagedObjectReference> getVm() {
        if (vm == null) {
            vm = new ArrayList<>();
        }
        return this.vm;
    }

}
