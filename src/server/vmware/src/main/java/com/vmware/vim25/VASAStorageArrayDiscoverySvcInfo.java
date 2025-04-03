
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VASAStorageArrayDiscoverySvcInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VASAStorageArrayDiscoverySvcInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="portType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="svcNqn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ipInfo" type="{urn:internalvim25}VASAStorageArrayDiscoveryIpTransport" minOccurs="0"/>
 *         <element name="fcInfo" type="{urn:internalvim25}VASAStorageArrayDiscoveryFcTransport" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VASAStorageArrayDiscoverySvcInfo", propOrder = {
    "portType",
    "svcNqn",
    "ipInfo",
    "fcInfo"
})
public class VASAStorageArrayDiscoverySvcInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String portType;
    @XmlElement(required = true)
    protected String svcNqn;
    protected VASAStorageArrayDiscoveryIpTransport ipInfo;
    protected VASAStorageArrayDiscoveryFcTransport fcInfo;

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortType(String value) {
        this.portType = value;
    }

    /**
     * Gets the value of the svcNqn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNqn() {
        return svcNqn;
    }

    /**
     * Sets the value of the svcNqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcNqn(String value) {
        this.svcNqn = value;
    }

    /**
     * Gets the value of the ipInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VASAStorageArrayDiscoveryIpTransport }
     *     
     */
    public VASAStorageArrayDiscoveryIpTransport getIpInfo() {
        return ipInfo;
    }

    /**
     * Sets the value of the ipInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VASAStorageArrayDiscoveryIpTransport }
     *     
     */
    public void setIpInfo(VASAStorageArrayDiscoveryIpTransport value) {
        this.ipInfo = value;
    }

    /**
     * Gets the value of the fcInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VASAStorageArrayDiscoveryFcTransport }
     *     
     */
    public VASAStorageArrayDiscoveryFcTransport getFcInfo() {
        return fcInfo;
    }

    /**
     * Sets the value of the fcInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VASAStorageArrayDiscoveryFcTransport }
     *     
     */
    public void setFcInfo(VASAStorageArrayDiscoveryFcTransport value) {
        this.fcInfo = value;
    }

}
