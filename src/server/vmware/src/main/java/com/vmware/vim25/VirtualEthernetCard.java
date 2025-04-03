
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualEthernetCard complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualEthernetCard">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDevice">
 *       <sequence>
 *         <element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="macAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="wakeOnLanEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="resourceAllocation" type="{urn:internalvim25}VirtualEthernetCardResourceAllocation" minOccurs="0"/>
 *         <element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="uptCompatibilityEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualEthernetCard", propOrder = {
    "addressType",
    "macAddress",
    "wakeOnLanEnabled",
    "resourceAllocation",
    "externalId",
    "uptCompatibilityEnabled"
})
@XmlSeeAlso({
    VirtualE1000 .class,
    VirtualE1000E.class,
    VirtualPCNet32 .class,
    VirtualSriovEthernetCard.class,
    VirtualVmxnet.class
})
public class VirtualEthernetCard
    extends VirtualDevice
{

    protected String addressType;
    protected String macAddress;
    protected Boolean wakeOnLanEnabled;
    protected VirtualEthernetCardResourceAllocation resourceAllocation;
    protected String externalId;
    protected Boolean uptCompatibilityEnabled;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the wakeOnLanEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWakeOnLanEnabled() {
        return wakeOnLanEnabled;
    }

    /**
     * Sets the value of the wakeOnLanEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWakeOnLanEnabled(Boolean value) {
        this.wakeOnLanEnabled = value;
    }

    /**
     * Gets the value of the resourceAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualEthernetCardResourceAllocation }
     *     
     */
    public VirtualEthernetCardResourceAllocation getResourceAllocation() {
        return resourceAllocation;
    }

    /**
     * Sets the value of the resourceAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualEthernetCardResourceAllocation }
     *     
     */
    public void setResourceAllocation(VirtualEthernetCardResourceAllocation value) {
        this.resourceAllocation = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the uptCompatibilityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUptCompatibilityEnabled() {
        return uptCompatibilityEnabled;
    }

    /**
     * Sets the value of the uptCompatibilityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUptCompatibilityEnabled(Boolean value) {
        this.uptCompatibilityEnabled = value;
    }

}
