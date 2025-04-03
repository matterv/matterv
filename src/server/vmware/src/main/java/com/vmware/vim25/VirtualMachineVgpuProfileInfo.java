
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVgpuProfileInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVgpuProfileInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deviceVendorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="fbSizeInGib" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="profileSharing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="profileClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="stunTimeEstimates" type="{urn:internalvim25}VirtualMachineVMotionStunTimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVgpuProfileInfo", propOrder = {
    "profileName",
    "deviceVendorId",
    "fbSizeInGib",
    "profileSharing",
    "profileClass",
    "stunTimeEstimates"
})
public class VirtualMachineVgpuProfileInfo
    extends VirtualMachineTargetInfo
{

    @XmlElement(required = true)
    protected String profileName;
    protected long deviceVendorId;
    protected long fbSizeInGib;
    @XmlElement(required = true)
    protected String profileSharing;
    @XmlElement(required = true)
    protected String profileClass;
    protected List<VirtualMachineVMotionStunTimeInfo> stunTimeEstimates;

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the deviceVendorId property.
     * 
     */
    public long getDeviceVendorId() {
        return deviceVendorId;
    }

    /**
     * Sets the value of the deviceVendorId property.
     * 
     */
    public void setDeviceVendorId(long value) {
        this.deviceVendorId = value;
    }

    /**
     * Gets the value of the fbSizeInGib property.
     * 
     */
    public long getFbSizeInGib() {
        return fbSizeInGib;
    }

    /**
     * Sets the value of the fbSizeInGib property.
     * 
     */
    public void setFbSizeInGib(long value) {
        this.fbSizeInGib = value;
    }

    /**
     * Gets the value of the profileSharing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileSharing() {
        return profileSharing;
    }

    /**
     * Sets the value of the profileSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileSharing(String value) {
        this.profileSharing = value;
    }

    /**
     * Gets the value of the profileClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileClass() {
        return profileClass;
    }

    /**
     * Sets the value of the profileClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileClass(String value) {
        this.profileClass = value;
    }

    /**
     * Gets the value of the stunTimeEstimates property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stunTimeEstimates property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStunTimeEstimates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineVMotionStunTimeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the stunTimeEstimates property.
     */
    public List<VirtualMachineVMotionStunTimeInfo> getStunTimeEstimates() {
        if (stunTimeEstimates == null) {
            stunTimeEstimates = new ArrayList<>();
        }
        return this.stunTimeEstimates;
    }

}
