
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="operation" type="{urn:internalvim25}VirtualDeviceConfigSpecOperation" minOccurs="0"/>
 *         <element name="fileOperation" type="{urn:internalvim25}VirtualDeviceConfigSpecFileOperation" minOccurs="0"/>
 *         <element name="device" type="{urn:internalvim25}VirtualDevice"/>
 *         <element name="profile" type="{urn:internalvim25}VirtualMachineProfileSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="backing" type="{urn:internalvim25}VirtualDeviceConfigSpecBackingSpec" minOccurs="0"/>
 *         <element name="filterSpec" type="{urn:internalvim25}VirtualMachineBaseIndependentFilterSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="changeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceConfigSpec", propOrder = {
    "operation",
    "fileOperation",
    "device",
    "profile",
    "backing",
    "filterSpec",
    "changeMode"
})
@XmlSeeAlso({
    VirtualDiskConfigSpec.class
})
public class VirtualDeviceConfigSpec
    extends DynamicData
{

    @XmlSchemaType(name = "string")
    protected VirtualDeviceConfigSpecOperation operation;
    @XmlSchemaType(name = "string")
    protected VirtualDeviceConfigSpecFileOperation fileOperation;
    @XmlElement(required = true)
    protected VirtualDevice device;
    protected List<VirtualMachineProfileSpec> profile;
    protected VirtualDeviceConfigSpecBackingSpec backing;
    protected List<VirtualMachineBaseIndependentFilterSpec> filterSpec;
    protected String changeMode;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceConfigSpecOperation }
     *     
     */
    public VirtualDeviceConfigSpecOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceConfigSpecOperation }
     *     
     */
    public void setOperation(VirtualDeviceConfigSpecOperation value) {
        this.operation = value;
    }

    /**
     * Gets the value of the fileOperation property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceConfigSpecFileOperation }
     *     
     */
    public VirtualDeviceConfigSpecFileOperation getFileOperation() {
        return fileOperation;
    }

    /**
     * Sets the value of the fileOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceConfigSpecFileOperation }
     *     
     */
    public void setFileOperation(VirtualDeviceConfigSpecFileOperation value) {
        this.fileOperation = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDevice }
     *     
     */
    public VirtualDevice getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDevice }
     *     
     */
    public void setDevice(VirtualDevice value) {
        this.device = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineProfileSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the profile property.
     */
    public List<VirtualMachineProfileSpec> getProfile() {
        if (profile == null) {
            profile = new ArrayList<>();
        }
        return this.profile;
    }

    /**
     * Gets the value of the backing property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceConfigSpecBackingSpec }
     *     
     */
    public VirtualDeviceConfigSpecBackingSpec getBacking() {
        return backing;
    }

    /**
     * Sets the value of the backing property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceConfigSpecBackingSpec }
     *     
     */
    public void setBacking(VirtualDeviceConfigSpecBackingSpec value) {
        this.backing = value;
    }

    /**
     * Gets the value of the filterSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFilterSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineBaseIndependentFilterSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the filterSpec property.
     */
    public List<VirtualMachineBaseIndependentFilterSpec> getFilterSpec() {
        if (filterSpec == null) {
            filterSpec = new ArrayList<>();
        }
        return this.filterSpec;
    }

    /**
     * Gets the value of the changeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeMode() {
        return changeMode;
    }

    /**
     * Sets the value of the changeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeMode(String value) {
        this.changeMode = value;
    }

}
