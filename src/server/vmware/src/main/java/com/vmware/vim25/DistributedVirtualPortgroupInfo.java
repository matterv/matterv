
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualPortgroupInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualPortgroupInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="switchName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="switchUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="portgroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="portgroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="portgroupType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="uplinkPortgroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="portgroup" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="networkReservationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="backingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="logicalSwitchUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="segmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualPortgroupInfo", propOrder = {
    "switchName",
    "switchUuid",
    "portgroupName",
    "portgroupKey",
    "portgroupType",
    "uplinkPortgroup",
    "portgroup",
    "networkReservationSupported",
    "backingType",
    "logicalSwitchUuid",
    "segmentId"
})
public class DistributedVirtualPortgroupInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String switchName;
    @XmlElement(required = true)
    protected String switchUuid;
    @XmlElement(required = true)
    protected String portgroupName;
    @XmlElement(required = true)
    protected String portgroupKey;
    @XmlElement(required = true)
    protected String portgroupType;
    protected boolean uplinkPortgroup;
    @XmlElement(required = true)
    protected ManagedObjectReference portgroup;
    protected Boolean networkReservationSupported;
    protected String backingType;
    protected String logicalSwitchUuid;
    protected String segmentId;

    /**
     * Gets the value of the switchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchName() {
        return switchName;
    }

    /**
     * Sets the value of the switchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchName(String value) {
        this.switchName = value;
    }

    /**
     * Gets the value of the switchUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchUuid() {
        return switchUuid;
    }

    /**
     * Sets the value of the switchUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchUuid(String value) {
        this.switchUuid = value;
    }

    /**
     * Gets the value of the portgroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortgroupName() {
        return portgroupName;
    }

    /**
     * Sets the value of the portgroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortgroupName(String value) {
        this.portgroupName = value;
    }

    /**
     * Gets the value of the portgroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortgroupKey() {
        return portgroupKey;
    }

    /**
     * Sets the value of the portgroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortgroupKey(String value) {
        this.portgroupKey = value;
    }

    /**
     * Gets the value of the portgroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortgroupType() {
        return portgroupType;
    }

    /**
     * Sets the value of the portgroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortgroupType(String value) {
        this.portgroupType = value;
    }

    /**
     * Gets the value of the uplinkPortgroup property.
     * 
     */
    public boolean isUplinkPortgroup() {
        return uplinkPortgroup;
    }

    /**
     * Sets the value of the uplinkPortgroup property.
     * 
     */
    public void setUplinkPortgroup(boolean value) {
        this.uplinkPortgroup = value;
    }

    /**
     * Gets the value of the portgroup property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPortgroup() {
        return portgroup;
    }

    /**
     * Sets the value of the portgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPortgroup(ManagedObjectReference value) {
        this.portgroup = value;
    }

    /**
     * Gets the value of the networkReservationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkReservationSupported() {
        return networkReservationSupported;
    }

    /**
     * Sets the value of the networkReservationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkReservationSupported(Boolean value) {
        this.networkReservationSupported = value;
    }

    /**
     * Gets the value of the backingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackingType() {
        return backingType;
    }

    /**
     * Sets the value of the backingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackingType(String value) {
        this.backingType = value;
    }

    /**
     * Gets the value of the logicalSwitchUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalSwitchUuid() {
        return logicalSwitchUuid;
    }

    /**
     * Sets the value of the logicalSwitchUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalSwitchUuid(String value) {
        this.logicalSwitchUuid = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

}
