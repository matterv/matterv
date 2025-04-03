
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileLockInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FileLockInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="worldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ownerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lockMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="acquired" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="heartbeat" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="refCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileLockInfo", propOrder = {
    "filePath",
    "host",
    "mac",
    "id",
    "worldName",
    "ownerId",
    "lockMode",
    "acquired",
    "heartbeat",
    "refCount"
})
public class FileLockInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String filePath;
    @XmlElement(required = true)
    protected String host;
    @XmlElement(required = true)
    protected String mac;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String worldName;
    protected String ownerId;
    @XmlElement(required = true)
    protected String lockMode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acquired;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar heartbeat;
    protected Integer refCount;

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the worldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorldName() {
        return worldName;
    }

    /**
     * Sets the value of the worldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorldName(String value) {
        this.worldName = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the lockMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockMode() {
        return lockMode;
    }

    /**
     * Sets the value of the lockMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockMode(String value) {
        this.lockMode = value;
    }

    /**
     * Gets the value of the acquired property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquired() {
        return acquired;
    }

    /**
     * Sets the value of the acquired property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquired(XMLGregorianCalendar value) {
        this.acquired = value;
    }

    /**
     * Gets the value of the heartbeat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHeartbeat() {
        return heartbeat;
    }

    /**
     * Sets the value of the heartbeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHeartbeat(XMLGregorianCalendar value) {
        this.heartbeat = value;
    }

    /**
     * Gets the value of the refCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefCount() {
        return refCount;
    }

    /**
     * Sets the value of the refCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefCount(Integer value) {
        this.refCount = value;
    }

}
