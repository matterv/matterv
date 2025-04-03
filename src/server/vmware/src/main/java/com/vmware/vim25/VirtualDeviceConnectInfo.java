
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceConnectInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceConnectInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="migrateConnect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="startConnected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="allowGuestControl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="connected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceConnectInfo", propOrder = {
    "migrateConnect",
    "startConnected",
    "allowGuestControl",
    "connected",
    "status"
})
public class VirtualDeviceConnectInfo
    extends DynamicData
{

    protected String migrateConnect;
    protected boolean startConnected;
    protected boolean allowGuestControl;
    protected boolean connected;
    protected String status;

    /**
     * Gets the value of the migrateConnect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMigrateConnect() {
        return migrateConnect;
    }

    /**
     * Sets the value of the migrateConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMigrateConnect(String value) {
        this.migrateConnect = value;
    }

    /**
     * Gets the value of the startConnected property.
     * 
     */
    public boolean isStartConnected() {
        return startConnected;
    }

    /**
     * Sets the value of the startConnected property.
     * 
     */
    public void setStartConnected(boolean value) {
        this.startConnected = value;
    }

    /**
     * Gets the value of the allowGuestControl property.
     * 
     */
    public boolean isAllowGuestControl() {
        return allowGuestControl;
    }

    /**
     * Sets the value of the allowGuestControl property.
     * 
     */
    public void setAllowGuestControl(boolean value) {
        this.allowGuestControl = value;
    }

    /**
     * Gets the value of the connected property.
     * 
     */
    public boolean isConnected() {
        return connected;
    }

    /**
     * Sets the value of the connected property.
     * 
     */
    public void setConnected(boolean value) {
        this.connected = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
