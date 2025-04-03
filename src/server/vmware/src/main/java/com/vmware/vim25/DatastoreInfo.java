
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatastoreInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatastoreInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="freeSpace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="maxFileSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="maxVirtualDiskCapacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="maxMemoryFileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="containerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="aliasOf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreInfo", propOrder = {
    "name",
    "url",
    "freeSpace",
    "maxFileSize",
    "maxVirtualDiskCapacity",
    "maxMemoryFileSize",
    "timestamp",
    "containerId",
    "aliasOf"
})
@XmlSeeAlso({
    VmfsDatastoreInfo.class,
    NasDatastoreInfo.class,
    LocalDatastoreInfo.class,
    VvolDatastoreInfo.class,
    PMemDatastoreInfo.class,
    VsanDatastoreInfo.class
})
public class DatastoreInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String url;
    protected long freeSpace;
    protected long maxFileSize;
    protected Long maxVirtualDiskCapacity;
    protected Long maxMemoryFileSize;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    protected String containerId;
    protected String aliasOf;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the freeSpace property.
     * 
     */
    public long getFreeSpace() {
        return freeSpace;
    }

    /**
     * Sets the value of the freeSpace property.
     * 
     */
    public void setFreeSpace(long value) {
        this.freeSpace = value;
    }

    /**
     * Gets the value of the maxFileSize property.
     * 
     */
    public long getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * Sets the value of the maxFileSize property.
     * 
     */
    public void setMaxFileSize(long value) {
        this.maxFileSize = value;
    }

    /**
     * Gets the value of the maxVirtualDiskCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxVirtualDiskCapacity() {
        return maxVirtualDiskCapacity;
    }

    /**
     * Sets the value of the maxVirtualDiskCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxVirtualDiskCapacity(Long value) {
        this.maxVirtualDiskCapacity = value;
    }

    /**
     * Gets the value of the maxMemoryFileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxMemoryFileSize() {
        return maxMemoryFileSize;
    }

    /**
     * Sets the value of the maxMemoryFileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxMemoryFileSize(Long value) {
        this.maxMemoryFileSize = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the containerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerId() {
        return containerId;
    }

    /**
     * Sets the value of the containerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerId(String value) {
        this.containerId = value;
    }

    /**
     * Gets the value of the aliasOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasOf() {
        return aliasOf;
    }

    /**
     * Sets the value of the aliasOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasOf(String value) {
        this.aliasOf = value;
    }

}
