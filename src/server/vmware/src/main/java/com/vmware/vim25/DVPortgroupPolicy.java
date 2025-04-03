
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVPortgroupPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVPortgroupPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="blockOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="shapingOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="vendorConfigOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="livePortMovingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="portConfigResetAtDisconnect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="networkResourcePoolOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="trafficFilterOverrideAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortgroupPolicy", propOrder = {
    "blockOverrideAllowed",
    "shapingOverrideAllowed",
    "vendorConfigOverrideAllowed",
    "livePortMovingAllowed",
    "portConfigResetAtDisconnect",
    "networkResourcePoolOverrideAllowed",
    "trafficFilterOverrideAllowed"
})
@XmlSeeAlso({
    VMwareDVSPortgroupPolicy.class
})
public class DVPortgroupPolicy
    extends DynamicData
{

    protected boolean blockOverrideAllowed;
    protected boolean shapingOverrideAllowed;
    protected boolean vendorConfigOverrideAllowed;
    protected boolean livePortMovingAllowed;
    protected boolean portConfigResetAtDisconnect;
    protected Boolean networkResourcePoolOverrideAllowed;
    protected Boolean trafficFilterOverrideAllowed;

    /**
     * Gets the value of the blockOverrideAllowed property.
     * 
     */
    public boolean isBlockOverrideAllowed() {
        return blockOverrideAllowed;
    }

    /**
     * Sets the value of the blockOverrideAllowed property.
     * 
     */
    public void setBlockOverrideAllowed(boolean value) {
        this.blockOverrideAllowed = value;
    }

    /**
     * Gets the value of the shapingOverrideAllowed property.
     * 
     */
    public boolean isShapingOverrideAllowed() {
        return shapingOverrideAllowed;
    }

    /**
     * Sets the value of the shapingOverrideAllowed property.
     * 
     */
    public void setShapingOverrideAllowed(boolean value) {
        this.shapingOverrideAllowed = value;
    }

    /**
     * Gets the value of the vendorConfigOverrideAllowed property.
     * 
     */
    public boolean isVendorConfigOverrideAllowed() {
        return vendorConfigOverrideAllowed;
    }

    /**
     * Sets the value of the vendorConfigOverrideAllowed property.
     * 
     */
    public void setVendorConfigOverrideAllowed(boolean value) {
        this.vendorConfigOverrideAllowed = value;
    }

    /**
     * Gets the value of the livePortMovingAllowed property.
     * 
     */
    public boolean isLivePortMovingAllowed() {
        return livePortMovingAllowed;
    }

    /**
     * Sets the value of the livePortMovingAllowed property.
     * 
     */
    public void setLivePortMovingAllowed(boolean value) {
        this.livePortMovingAllowed = value;
    }

    /**
     * Gets the value of the portConfigResetAtDisconnect property.
     * 
     */
    public boolean isPortConfigResetAtDisconnect() {
        return portConfigResetAtDisconnect;
    }

    /**
     * Sets the value of the portConfigResetAtDisconnect property.
     * 
     */
    public void setPortConfigResetAtDisconnect(boolean value) {
        this.portConfigResetAtDisconnect = value;
    }

    /**
     * Gets the value of the networkResourcePoolOverrideAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkResourcePoolOverrideAllowed() {
        return networkResourcePoolOverrideAllowed;
    }

    /**
     * Sets the value of the networkResourcePoolOverrideAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkResourcePoolOverrideAllowed(Boolean value) {
        this.networkResourcePoolOverrideAllowed = value;
    }

    /**
     * Gets the value of the trafficFilterOverrideAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrafficFilterOverrideAllowed() {
        return trafficFilterOverrideAllowed;
    }

    /**
     * Sets the value of the trafficFilterOverrideAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrafficFilterOverrideAllowed(Boolean value) {
        this.trafficFilterOverrideAllowed = value;
    }

}
