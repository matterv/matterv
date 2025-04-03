
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineDeviceRuntimeInfoDeviceRuntimeState">
 *       <sequence>
 *         <element name="vmDirectPathGen2Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vmDirectPathGen2InactiveReasonVm" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vmDirectPathGen2InactiveReasonOther" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vmDirectPathGen2InactiveReasonExtended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="uptv2Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="uptv2InactiveReasonVm" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="uptv2InactiveReasonOther" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="reservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="attachmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="featureRequirement" type="{urn:internalvim25}VirtualMachineFeatureRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState", propOrder = {
    "vmDirectPathGen2Active",
    "vmDirectPathGen2InactiveReasonVm",
    "vmDirectPathGen2InactiveReasonOther",
    "vmDirectPathGen2InactiveReasonExtended",
    "uptv2Active",
    "uptv2InactiveReasonVm",
    "uptv2InactiveReasonOther",
    "reservationStatus",
    "attachmentStatus",
    "featureRequirement"
})
public class VirtualMachineDeviceRuntimeInfoVirtualEthernetCardRuntimeState
    extends VirtualMachineDeviceRuntimeInfoDeviceRuntimeState
{

    protected Boolean vmDirectPathGen2Active;
    protected List<String> vmDirectPathGen2InactiveReasonVm;
    protected List<String> vmDirectPathGen2InactiveReasonOther;
    protected String vmDirectPathGen2InactiveReasonExtended;
    protected Boolean uptv2Active;
    protected List<String> uptv2InactiveReasonVm;
    protected List<String> uptv2InactiveReasonOther;
    protected String reservationStatus;
    protected String attachmentStatus;
    protected List<VirtualMachineFeatureRequirement> featureRequirement;

    /**
     * Gets the value of the vmDirectPathGen2Active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmDirectPathGen2Active() {
        return vmDirectPathGen2Active;
    }

    /**
     * Sets the value of the vmDirectPathGen2Active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmDirectPathGen2Active(Boolean value) {
        this.vmDirectPathGen2Active = value;
    }

    /**
     * Gets the value of the vmDirectPathGen2InactiveReasonVm property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmDirectPathGen2InactiveReasonVm property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmDirectPathGen2InactiveReasonVm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmDirectPathGen2InactiveReasonVm property.
     */
    public List<String> getVmDirectPathGen2InactiveReasonVm() {
        if (vmDirectPathGen2InactiveReasonVm == null) {
            vmDirectPathGen2InactiveReasonVm = new ArrayList<>();
        }
        return this.vmDirectPathGen2InactiveReasonVm;
    }

    /**
     * Gets the value of the vmDirectPathGen2InactiveReasonOther property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmDirectPathGen2InactiveReasonOther property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmDirectPathGen2InactiveReasonOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmDirectPathGen2InactiveReasonOther property.
     */
    public List<String> getVmDirectPathGen2InactiveReasonOther() {
        if (vmDirectPathGen2InactiveReasonOther == null) {
            vmDirectPathGen2InactiveReasonOther = new ArrayList<>();
        }
        return this.vmDirectPathGen2InactiveReasonOther;
    }

    /**
     * Gets the value of the vmDirectPathGen2InactiveReasonExtended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmDirectPathGen2InactiveReasonExtended() {
        return vmDirectPathGen2InactiveReasonExtended;
    }

    /**
     * Sets the value of the vmDirectPathGen2InactiveReasonExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmDirectPathGen2InactiveReasonExtended(String value) {
        this.vmDirectPathGen2InactiveReasonExtended = value;
    }

    /**
     * Gets the value of the uptv2Active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUptv2Active() {
        return uptv2Active;
    }

    /**
     * Sets the value of the uptv2Active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUptv2Active(Boolean value) {
        this.uptv2Active = value;
    }

    /**
     * Gets the value of the uptv2InactiveReasonVm property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uptv2InactiveReasonVm property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUptv2InactiveReasonVm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the uptv2InactiveReasonVm property.
     */
    public List<String> getUptv2InactiveReasonVm() {
        if (uptv2InactiveReasonVm == null) {
            uptv2InactiveReasonVm = new ArrayList<>();
        }
        return this.uptv2InactiveReasonVm;
    }

    /**
     * Gets the value of the uptv2InactiveReasonOther property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uptv2InactiveReasonOther property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUptv2InactiveReasonOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the uptv2InactiveReasonOther property.
     */
    public List<String> getUptv2InactiveReasonOther() {
        if (uptv2InactiveReasonOther == null) {
            uptv2InactiveReasonOther = new ArrayList<>();
        }
        return this.uptv2InactiveReasonOther;
    }

    /**
     * Gets the value of the reservationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatus() {
        return reservationStatus;
    }

    /**
     * Sets the value of the reservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationStatus(String value) {
        this.reservationStatus = value;
    }

    /**
     * Gets the value of the attachmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentStatus() {
        return attachmentStatus;
    }

    /**
     * Sets the value of the attachmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentStatus(String value) {
        this.attachmentStatus = value;
    }

    /**
     * Gets the value of the featureRequirement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureRequirement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeatureRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFeatureRequirement }
     * </p>
     * 
     * 
     * @return
     *     The value of the featureRequirement property.
     */
    public List<VirtualMachineFeatureRequirement> getFeatureRequirement() {
        if (featureRequirement == null) {
            featureRequirement = new ArrayList<>();
        }
        return this.featureRequirement;
    }

}
