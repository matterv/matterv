
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPCIPassthroughDynamicBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPCIPassthroughDynamicBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceDeviceBackingInfo">
 *       <sequence>
 *         <element name="allowedDevice" type="{urn:internalvim25}VirtualPCIPassthroughAllowedDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="customLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="assignedId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughDynamicBackingInfo", propOrder = {
    "allowedDevice",
    "customLabel",
    "assignedId"
})
public class VirtualPCIPassthroughDynamicBackingInfo
    extends VirtualDeviceDeviceBackingInfo
{

    protected List<VirtualPCIPassthroughAllowedDevice> allowedDevice;
    protected String customLabel;
    protected String assignedId;

    /**
     * Gets the value of the allowedDevice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedDevice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAllowedDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualPCIPassthroughAllowedDevice }
     * </p>
     * 
     * 
     * @return
     *     The value of the allowedDevice property.
     */
    public List<VirtualPCIPassthroughAllowedDevice> getAllowedDevice() {
        if (allowedDevice == null) {
            allowedDevice = new ArrayList<>();
        }
        return this.allowedDevice;
    }

    /**
     * Gets the value of the customLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomLabel() {
        return customLabel;
    }

    /**
     * Sets the value of the customLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomLabel(String value) {
        this.customLabel = value;
    }

    /**
     * Gets the value of the assignedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedId() {
        return assignedId;
    }

    /**
     * Sets the value of the assignedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedId(String value) {
        this.assignedId = value;
    }

}
