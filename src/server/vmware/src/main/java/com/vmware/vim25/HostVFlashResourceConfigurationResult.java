
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVFlashResourceConfigurationResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVFlashResourceConfigurationResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="devicePath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vffs" type="{urn:internalvim25}HostVffsVolume" minOccurs="0"/>
 *         <element name="diskConfigurationResult" type="{urn:internalvim25}HostDiskConfigurationResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVFlashResourceConfigurationResult", propOrder = {
    "devicePath",
    "vffs",
    "diskConfigurationResult"
})
public class HostVFlashResourceConfigurationResult
    extends DynamicData
{

    protected List<String> devicePath;
    protected HostVffsVolume vffs;
    protected List<HostDiskConfigurationResult> diskConfigurationResult;

    /**
     * Gets the value of the devicePath property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devicePath property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDevicePath().add(newItem);
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
     *     The value of the devicePath property.
     */
    public List<String> getDevicePath() {
        if (devicePath == null) {
            devicePath = new ArrayList<>();
        }
        return this.devicePath;
    }

    /**
     * Gets the value of the vffs property.
     * 
     * @return
     *     possible object is
     *     {@link HostVffsVolume }
     *     
     */
    public HostVffsVolume getVffs() {
        return vffs;
    }

    /**
     * Sets the value of the vffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVffsVolume }
     *     
     */
    public void setVffs(HostVffsVolume value) {
        this.vffs = value;
    }

    /**
     * Gets the value of the diskConfigurationResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diskConfigurationResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiskConfigurationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostDiskConfigurationResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the diskConfigurationResult property.
     */
    public List<HostDiskConfigurationResult> getDiskConfigurationResult() {
        if (diskConfigurationResult == null) {
            diskConfigurationResult = new ArrayList<>();
        }
        return this.diskConfigurationResult;
    }

}
