
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostStorageDeviceInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostStorageDeviceInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="hostBusAdapter" type="{urn:internalvim25}HostHostBusAdapter" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="scsiLun" type="{urn:internalvim25}ScsiLun" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="scsiTopology" type="{urn:internalvim25}HostScsiTopology" minOccurs="0"/>
 *         <element name="nvmeTopology" type="{urn:internalvim25}HostNvmeTopology" minOccurs="0"/>
 *         <element name="multipathInfo" type="{urn:internalvim25}HostMultipathInfo" minOccurs="0"/>
 *         <element name="plugStoreTopology" type="{urn:internalvim25}HostPlugStoreTopology" minOccurs="0"/>
 *         <element name="softwareInternetScsiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostStorageDeviceInfo", propOrder = {
    "hostBusAdapter",
    "scsiLun",
    "scsiTopology",
    "nvmeTopology",
    "multipathInfo",
    "plugStoreTopology",
    "softwareInternetScsiEnabled"
})
public class HostStorageDeviceInfo
    extends DynamicData
{

    protected List<HostHostBusAdapter> hostBusAdapter;
    protected List<ScsiLun> scsiLun;
    protected HostScsiTopology scsiTopology;
    protected HostNvmeTopology nvmeTopology;
    protected HostMultipathInfo multipathInfo;
    protected HostPlugStoreTopology plugStoreTopology;
    protected boolean softwareInternetScsiEnabled;

    /**
     * Gets the value of the hostBusAdapter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostBusAdapter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostBusAdapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostHostBusAdapter }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostBusAdapter property.
     */
    public List<HostHostBusAdapter> getHostBusAdapter() {
        if (hostBusAdapter == null) {
            hostBusAdapter = new ArrayList<>();
        }
        return this.hostBusAdapter;
    }

    /**
     * Gets the value of the scsiLun property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scsiLun property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getScsiLun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScsiLun }
     * </p>
     * 
     * 
     * @return
     *     The value of the scsiLun property.
     */
    public List<ScsiLun> getScsiLun() {
        if (scsiLun == null) {
            scsiLun = new ArrayList<>();
        }
        return this.scsiLun;
    }

    /**
     * Gets the value of the scsiTopology property.
     * 
     * @return
     *     possible object is
     *     {@link HostScsiTopology }
     *     
     */
    public HostScsiTopology getScsiTopology() {
        return scsiTopology;
    }

    /**
     * Sets the value of the scsiTopology property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostScsiTopology }
     *     
     */
    public void setScsiTopology(HostScsiTopology value) {
        this.scsiTopology = value;
    }

    /**
     * Gets the value of the nvmeTopology property.
     * 
     * @return
     *     possible object is
     *     {@link HostNvmeTopology }
     *     
     */
    public HostNvmeTopology getNvmeTopology() {
        return nvmeTopology;
    }

    /**
     * Sets the value of the nvmeTopology property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNvmeTopology }
     *     
     */
    public void setNvmeTopology(HostNvmeTopology value) {
        this.nvmeTopology = value;
    }

    /**
     * Gets the value of the multipathInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostMultipathInfo }
     *     
     */
    public HostMultipathInfo getMultipathInfo() {
        return multipathInfo;
    }

    /**
     * Sets the value of the multipathInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostMultipathInfo }
     *     
     */
    public void setMultipathInfo(HostMultipathInfo value) {
        this.multipathInfo = value;
    }

    /**
     * Gets the value of the plugStoreTopology property.
     * 
     * @return
     *     possible object is
     *     {@link HostPlugStoreTopology }
     *     
     */
    public HostPlugStoreTopology getPlugStoreTopology() {
        return plugStoreTopology;
    }

    /**
     * Sets the value of the plugStoreTopology property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostPlugStoreTopology }
     *     
     */
    public void setPlugStoreTopology(HostPlugStoreTopology value) {
        this.plugStoreTopology = value;
    }

    /**
     * Gets the value of the softwareInternetScsiEnabled property.
     * 
     */
    public boolean isSoftwareInternetScsiEnabled() {
        return softwareInternetScsiEnabled;
    }

    /**
     * Sets the value of the softwareInternetScsiEnabled property.
     * 
     */
    public void setSoftwareInternetScsiEnabled(boolean value) {
        this.softwareInternetScsiEnabled = value;
    }

}
