
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineConfigOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineConfigOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="guestOSDescriptor" type="{urn:internalvim25}GuestOsDescriptor" maxOccurs="unbounded"/>
 *         <element name="guestOSDefaultIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="hardwareOptions" type="{urn:internalvim25}VirtualHardwareOption"/>
 *         <element name="capabilities" type="{urn:internalvim25}VirtualMachineCapability"/>
 *         <element name="datastore" type="{urn:internalvim25}DatastoreOption"/>
 *         <element name="defaultDevice" type="{urn:internalvim25}VirtualDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="supportedMonitorType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="supportedOvfEnvironmentTransport" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="supportedOvfInstallTransport" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="propertyRelations" type="{urn:internalvim25}VirtualMachinePropertyRelation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConfigOption", propOrder = {
    "version",
    "description",
    "guestOSDescriptor",
    "guestOSDefaultIndex",
    "hardwareOptions",
    "capabilities",
    "datastore",
    "defaultDevice",
    "supportedMonitorType",
    "supportedOvfEnvironmentTransport",
    "supportedOvfInstallTransport",
    "propertyRelations"
})
public class VirtualMachineConfigOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected List<GuestOsDescriptor> guestOSDescriptor;
    protected int guestOSDefaultIndex;
    @XmlElement(required = true)
    protected VirtualHardwareOption hardwareOptions;
    @XmlElement(required = true)
    protected VirtualMachineCapability capabilities;
    @XmlElement(required = true)
    protected DatastoreOption datastore;
    protected List<VirtualDevice> defaultDevice;
    @XmlElement(required = true)
    protected List<String> supportedMonitorType;
    protected List<String> supportedOvfEnvironmentTransport;
    protected List<String> supportedOvfInstallTransport;
    protected List<VirtualMachinePropertyRelation> propertyRelations;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the guestOSDescriptor property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestOSDescriptor property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGuestOSDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestOsDescriptor }
     * </p>
     * 
     * 
     * @return
     *     The value of the guestOSDescriptor property.
     */
    public List<GuestOsDescriptor> getGuestOSDescriptor() {
        if (guestOSDescriptor == null) {
            guestOSDescriptor = new ArrayList<>();
        }
        return this.guestOSDescriptor;
    }

    /**
     * Gets the value of the guestOSDefaultIndex property.
     * 
     */
    public int getGuestOSDefaultIndex() {
        return guestOSDefaultIndex;
    }

    /**
     * Sets the value of the guestOSDefaultIndex property.
     * 
     */
    public void setGuestOSDefaultIndex(int value) {
        this.guestOSDefaultIndex = value;
    }

    /**
     * Gets the value of the hardwareOptions property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualHardwareOption }
     *     
     */
    public VirtualHardwareOption getHardwareOptions() {
        return hardwareOptions;
    }

    /**
     * Sets the value of the hardwareOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualHardwareOption }
     *     
     */
    public void setHardwareOptions(VirtualHardwareOption value) {
        this.hardwareOptions = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineCapability }
     *     
     */
    public VirtualMachineCapability getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineCapability }
     *     
     */
    public void setCapabilities(VirtualMachineCapability value) {
        this.capabilities = value;
    }

    /**
     * Gets the value of the datastore property.
     * 
     * @return
     *     possible object is
     *     {@link DatastoreOption }
     *     
     */
    public DatastoreOption getDatastore() {
        return datastore;
    }

    /**
     * Sets the value of the datastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatastoreOption }
     *     
     */
    public void setDatastore(DatastoreOption value) {
        this.datastore = value;
    }

    /**
     * Gets the value of the defaultDevice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultDevice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDefaultDevice().add(newItem);
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
     *     The value of the defaultDevice property.
     */
    public List<VirtualDevice> getDefaultDevice() {
        if (defaultDevice == null) {
            defaultDevice = new ArrayList<>();
        }
        return this.defaultDevice;
    }

    /**
     * Gets the value of the supportedMonitorType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedMonitorType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedMonitorType().add(newItem);
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
     *     The value of the supportedMonitorType property.
     */
    public List<String> getSupportedMonitorType() {
        if (supportedMonitorType == null) {
            supportedMonitorType = new ArrayList<>();
        }
        return this.supportedMonitorType;
    }

    /**
     * Gets the value of the supportedOvfEnvironmentTransport property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedOvfEnvironmentTransport property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedOvfEnvironmentTransport().add(newItem);
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
     *     The value of the supportedOvfEnvironmentTransport property.
     */
    public List<String> getSupportedOvfEnvironmentTransport() {
        if (supportedOvfEnvironmentTransport == null) {
            supportedOvfEnvironmentTransport = new ArrayList<>();
        }
        return this.supportedOvfEnvironmentTransport;
    }

    /**
     * Gets the value of the supportedOvfInstallTransport property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedOvfInstallTransport property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedOvfInstallTransport().add(newItem);
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
     *     The value of the supportedOvfInstallTransport property.
     */
    public List<String> getSupportedOvfInstallTransport() {
        if (supportedOvfInstallTransport == null) {
            supportedOvfInstallTransport = new ArrayList<>();
        }
        return this.supportedOvfInstallTransport;
    }

    /**
     * Gets the value of the propertyRelations property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyRelations property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPropertyRelations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachinePropertyRelation }
     * </p>
     * 
     * 
     * @return
     *     The value of the propertyRelations property.
     */
    public List<VirtualMachinePropertyRelation> getPropertyRelations() {
        if (propertyRelations == null) {
            propertyRelations = new ArrayList<>();
        }
        return this.propertyRelations;
    }

}
