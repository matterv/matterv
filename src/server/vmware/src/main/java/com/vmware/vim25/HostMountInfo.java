
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostMountInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostMountInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="accessMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mounted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="accessible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="inaccessibleReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vmknicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vmknicActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mountFailedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numTcpConnections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMountInfo", propOrder = {
    "path",
    "accessMode",
    "mounted",
    "accessible",
    "inaccessibleReason",
    "vmknicName",
    "vmknicActive",
    "mountFailedReason",
    "numTcpConnections"
})
public class HostMountInfo
    extends DynamicData
{

    protected String path;
    @XmlElement(required = true)
    protected String accessMode;
    protected Boolean mounted;
    protected Boolean accessible;
    protected String inaccessibleReason;
    protected String vmknicName;
    protected Boolean vmknicActive;
    protected String mountFailedReason;
    protected Integer numTcpConnections;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the accessMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessMode() {
        return accessMode;
    }

    /**
     * Sets the value of the accessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessMode(String value) {
        this.accessMode = value;
    }

    /**
     * Gets the value of the mounted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMounted() {
        return mounted;
    }

    /**
     * Sets the value of the mounted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMounted(Boolean value) {
        this.mounted = value;
    }

    /**
     * Gets the value of the accessible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessible() {
        return accessible;
    }

    /**
     * Sets the value of the accessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessible(Boolean value) {
        this.accessible = value;
    }

    /**
     * Gets the value of the inaccessibleReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInaccessibleReason() {
        return inaccessibleReason;
    }

    /**
     * Sets the value of the inaccessibleReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInaccessibleReason(String value) {
        this.inaccessibleReason = value;
    }

    /**
     * Gets the value of the vmknicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmknicName() {
        return vmknicName;
    }

    /**
     * Sets the value of the vmknicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmknicName(String value) {
        this.vmknicName = value;
    }

    /**
     * Gets the value of the vmknicActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVmknicActive() {
        return vmknicActive;
    }

    /**
     * Sets the value of the vmknicActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVmknicActive(Boolean value) {
        this.vmknicActive = value;
    }

    /**
     * Gets the value of the mountFailedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountFailedReason() {
        return mountFailedReason;
    }

    /**
     * Sets the value of the mountFailedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountFailedReason(String value) {
        this.mountFailedReason = value;
    }

    /**
     * Gets the value of the numTcpConnections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumTcpConnections() {
        return numTcpConnections;
    }

    /**
     * Sets the value of the numTcpConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumTcpConnections(Integer value) {
        this.numTcpConnections = value;
    }

}
