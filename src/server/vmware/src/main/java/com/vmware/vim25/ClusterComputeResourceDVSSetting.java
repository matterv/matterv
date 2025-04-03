
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceDVSSetting complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceDVSSetting">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dvSwitch" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="pnicDevices" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dvPortgroupSetting" type="{urn:internalvim25}ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceDVSSetting", propOrder = {
    "dvSwitch",
    "pnicDevices",
    "dvPortgroupSetting"
})
public class ClusterComputeResourceDVSSetting
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference dvSwitch;
    protected List<String> pnicDevices;
    protected List<ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping> dvPortgroupSetting;

    /**
     * Gets the value of the dvSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDvSwitch() {
        return dvSwitch;
    }

    /**
     * Sets the value of the dvSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDvSwitch(ManagedObjectReference value) {
        this.dvSwitch = value;
    }

    /**
     * Gets the value of the pnicDevices property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnicDevices property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPnicDevices().add(newItem);
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
     *     The value of the pnicDevices property.
     */
    public List<String> getPnicDevices() {
        if (pnicDevices == null) {
            pnicDevices = new ArrayList<>();
        }
        return this.pnicDevices;
    }

    /**
     * Gets the value of the dvPortgroupSetting property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvPortgroupSetting property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDvPortgroupSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping }
     * </p>
     * 
     * 
     * @return
     *     The value of the dvPortgroupSetting property.
     */
    public List<ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping> getDvPortgroupSetting() {
        if (dvPortgroupSetting == null) {
            dvPortgroupSetting = new ArrayList<>();
        }
        return this.dvPortgroupSetting;
    }

}
