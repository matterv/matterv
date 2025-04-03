
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HbrDiskMigrationAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HbrDiskMigrationAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterAction">
 *       <sequence>
 *         <element name="collectionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="collectionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="diskIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="source" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="destination" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="sizeTransferred" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="spaceUtilSrcBefore" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="spaceUtilDstBefore" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="spaceUtilSrcAfter" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="spaceUtilDstAfter" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="ioLatencySrcBefore" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         <element name="ioLatencyDstBefore" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HbrDiskMigrationAction", propOrder = {
    "collectionId",
    "collectionName",
    "diskIds",
    "source",
    "destination",
    "sizeTransferred",
    "spaceUtilSrcBefore",
    "spaceUtilDstBefore",
    "spaceUtilSrcAfter",
    "spaceUtilDstAfter",
    "ioLatencySrcBefore",
    "ioLatencyDstBefore"
})
public class HbrDiskMigrationAction
    extends ClusterAction
{

    @XmlElement(required = true)
    protected String collectionId;
    @XmlElement(required = true)
    protected String collectionName;
    @XmlElement(required = true)
    protected List<String> diskIds;
    @XmlElement(required = true)
    protected ManagedObjectReference source;
    @XmlElement(required = true)
    protected ManagedObjectReference destination;
    protected long sizeTransferred;
    protected Float spaceUtilSrcBefore;
    protected Float spaceUtilDstBefore;
    protected Float spaceUtilSrcAfter;
    protected Float spaceUtilDstAfter;
    protected Float ioLatencySrcBefore;
    protected Float ioLatencyDstBefore;

    /**
     * Gets the value of the collectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * Sets the value of the collectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionId(String value) {
        this.collectionId = value;
    }

    /**
     * Gets the value of the collectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * Sets the value of the collectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionName(String value) {
        this.collectionName = value;
    }

    /**
     * Gets the value of the diskIds property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diskIds property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiskIds().add(newItem);
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
     *     The value of the diskIds property.
     */
    public List<String> getDiskIds() {
        if (diskIds == null) {
            diskIds = new ArrayList<>();
        }
        return this.diskIds;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSource(ManagedObjectReference value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDestination(ManagedObjectReference value) {
        this.destination = value;
    }

    /**
     * Gets the value of the sizeTransferred property.
     * 
     */
    public long getSizeTransferred() {
        return sizeTransferred;
    }

    /**
     * Sets the value of the sizeTransferred property.
     * 
     */
    public void setSizeTransferred(long value) {
        this.sizeTransferred = value;
    }

    /**
     * Gets the value of the spaceUtilSrcBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpaceUtilSrcBefore() {
        return spaceUtilSrcBefore;
    }

    /**
     * Sets the value of the spaceUtilSrcBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpaceUtilSrcBefore(Float value) {
        this.spaceUtilSrcBefore = value;
    }

    /**
     * Gets the value of the spaceUtilDstBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpaceUtilDstBefore() {
        return spaceUtilDstBefore;
    }

    /**
     * Sets the value of the spaceUtilDstBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpaceUtilDstBefore(Float value) {
        this.spaceUtilDstBefore = value;
    }

    /**
     * Gets the value of the spaceUtilSrcAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpaceUtilSrcAfter() {
        return spaceUtilSrcAfter;
    }

    /**
     * Sets the value of the spaceUtilSrcAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpaceUtilSrcAfter(Float value) {
        this.spaceUtilSrcAfter = value;
    }

    /**
     * Gets the value of the spaceUtilDstAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpaceUtilDstAfter() {
        return spaceUtilDstAfter;
    }

    /**
     * Sets the value of the spaceUtilDstAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpaceUtilDstAfter(Float value) {
        this.spaceUtilDstAfter = value;
    }

    /**
     * Gets the value of the ioLatencySrcBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIoLatencySrcBefore() {
        return ioLatencySrcBefore;
    }

    /**
     * Sets the value of the ioLatencySrcBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIoLatencySrcBefore(Float value) {
        this.ioLatencySrcBefore = value;
    }

    /**
     * Gets the value of the ioLatencyDstBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIoLatencyDstBefore() {
        return ioLatencyDstBefore;
    }

    /**
     * Sets the value of the ioLatencyDstBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIoLatencyDstBefore(Float value) {
        this.ioLatencyDstBefore = value;
    }

}
