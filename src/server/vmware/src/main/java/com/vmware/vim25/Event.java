
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Event complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Event">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="chainId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="createdTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datacenter" type="{urn:internalvim25}DatacenterEventArgument" minOccurs="0"/>
 *         <element name="computeResource" type="{urn:internalvim25}ComputeResourceEventArgument" minOccurs="0"/>
 *         <element name="host" type="{urn:internalvim25}HostEventArgument" minOccurs="0"/>
 *         <element name="vm" type="{urn:internalvim25}VmEventArgument" minOccurs="0"/>
 *         <element name="ds" type="{urn:internalvim25}DatastoreEventArgument" minOccurs="0"/>
 *         <element name="net" type="{urn:internalvim25}NetworkEventArgument" minOccurs="0"/>
 *         <element name="dvs" type="{urn:internalvim25}DvsEventArgument" minOccurs="0"/>
 *         <element name="fullFormattedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="changeTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "key",
    "chainId",
    "createdTime",
    "userName",
    "datacenter",
    "computeResource",
    "host",
    "vm",
    "ds",
    "net",
    "dvs",
    "fullFormattedMessage",
    "changeTag"
})
@XmlSeeAlso({
    HealthStatusChangedEvent.class,
    HostInventoryUnreadableEvent.class,
    DatacenterEvent.class,
    SessionEvent.class,
    UpgradeEvent.class,
    ProfileEvent.class,
    ScheduledTaskEvent.class,
    AlarmEvent.class,
    CustomFieldEvent.class,
    AuthorizationEvent.class,
    DatastoreEvent.class,
    TaskEvent.class,
    LicenseExpiredEvent.class,
    LicenseEvent.class,
    ResourcePoolEvent.class,
    TemplateUpgradeEvent.class,
    LockerMisconfiguredEvent.class,
    LockerReconfiguredEvent.class,
    NetworkRollbackEvent.class,
    HostEvent.class,
    DvsEvent.class,
    DVPortgroupEvent.class,
    ClusterEvent.class,
    VmEvent.class,
    EventEx.class,
    GeneralEvent.class
})
public class Event
    extends DynamicData
{

    protected int key;
    protected int chainId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElement(required = true)
    protected String userName;
    protected DatacenterEventArgument datacenter;
    protected ComputeResourceEventArgument computeResource;
    protected HostEventArgument host;
    protected VmEventArgument vm;
    protected DatastoreEventArgument ds;
    protected NetworkEventArgument net;
    protected DvsEventArgument dvs;
    protected String fullFormattedMessage;
    protected String changeTag;

    /**
     * Gets the value of the key property.
     * 
     */
    public int getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     */
    public void setKey(int value) {
        this.key = value;
    }

    /**
     * Gets the value of the chainId property.
     * 
     */
    public int getChainId() {
        return chainId;
    }

    /**
     * Sets the value of the chainId property.
     * 
     */
    public void setChainId(int value) {
        this.chainId = value;
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the datacenter property.
     * 
     * @return
     *     possible object is
     *     {@link DatacenterEventArgument }
     *     
     */
    public DatacenterEventArgument getDatacenter() {
        return datacenter;
    }

    /**
     * Sets the value of the datacenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatacenterEventArgument }
     *     
     */
    public void setDatacenter(DatacenterEventArgument value) {
        this.datacenter = value;
    }

    /**
     * Gets the value of the computeResource property.
     * 
     * @return
     *     possible object is
     *     {@link ComputeResourceEventArgument }
     *     
     */
    public ComputeResourceEventArgument getComputeResource() {
        return computeResource;
    }

    /**
     * Sets the value of the computeResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputeResourceEventArgument }
     *     
     */
    public void setComputeResource(ComputeResourceEventArgument value) {
        this.computeResource = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setHost(HostEventArgument value) {
        this.host = value;
    }

    /**
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link VmEventArgument }
     *     
     */
    public VmEventArgument getVm() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmEventArgument }
     *     
     */
    public void setVm(VmEventArgument value) {
        this.vm = value;
    }

    /**
     * Gets the value of the ds property.
     * 
     * @return
     *     possible object is
     *     {@link DatastoreEventArgument }
     *     
     */
    public DatastoreEventArgument getDs() {
        return ds;
    }

    /**
     * Sets the value of the ds property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatastoreEventArgument }
     *     
     */
    public void setDs(DatastoreEventArgument value) {
        this.ds = value;
    }

    /**
     * Gets the value of the net property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkEventArgument }
     *     
     */
    public NetworkEventArgument getNet() {
        return net;
    }

    /**
     * Sets the value of the net property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkEventArgument }
     *     
     */
    public void setNet(NetworkEventArgument value) {
        this.net = value;
    }

    /**
     * Gets the value of the dvs property.
     * 
     * @return
     *     possible object is
     *     {@link DvsEventArgument }
     *     
     */
    public DvsEventArgument getDvs() {
        return dvs;
    }

    /**
     * Sets the value of the dvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvsEventArgument }
     *     
     */
    public void setDvs(DvsEventArgument value) {
        this.dvs = value;
    }

    /**
     * Gets the value of the fullFormattedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullFormattedMessage() {
        return fullFormattedMessage;
    }

    /**
     * Sets the value of the fullFormattedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullFormattedMessage(String value) {
        this.fullFormattedMessage = value;
    }

    /**
     * Gets the value of the changeTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeTag() {
        return changeTag;
    }

    /**
     * Sets the value of the changeTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeTag(String value) {
        this.changeTag = value;
    }

}
