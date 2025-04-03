
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchPortStatistics complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchPortStatistics">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="packetsInMulticast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="packetsOutMulticast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="bytesInMulticast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="bytesOutMulticast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="packetsInUnicast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="packetsOutUnicast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="bytesInUnicast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="bytesOutUnicast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="packetsInBroadcast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="packetsOutBroadcast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="bytesInBroadcast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="bytesOutBroadcast" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="packetsInDropped" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="packetsOutDropped" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="packetsInException" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="packetsOutException" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="bytesInFromPnic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="bytesOutToPnic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchPortStatistics", propOrder = {
    "packetsInMulticast",
    "packetsOutMulticast",
    "bytesInMulticast",
    "bytesOutMulticast",
    "packetsInUnicast",
    "packetsOutUnicast",
    "bytesInUnicast",
    "bytesOutUnicast",
    "packetsInBroadcast",
    "packetsOutBroadcast",
    "bytesInBroadcast",
    "bytesOutBroadcast",
    "packetsInDropped",
    "packetsOutDropped",
    "packetsInException",
    "packetsOutException",
    "bytesInFromPnic",
    "bytesOutToPnic"
})
public class DistributedVirtualSwitchPortStatistics
    extends DynamicData
{

    protected long packetsInMulticast;
    protected long packetsOutMulticast;
    protected long bytesInMulticast;
    protected long bytesOutMulticast;
    protected long packetsInUnicast;
    protected long packetsOutUnicast;
    protected long bytesInUnicast;
    protected long bytesOutUnicast;
    protected long packetsInBroadcast;
    protected long packetsOutBroadcast;
    protected long bytesInBroadcast;
    protected long bytesOutBroadcast;
    protected long packetsInDropped;
    protected long packetsOutDropped;
    protected long packetsInException;
    protected long packetsOutException;
    protected Long bytesInFromPnic;
    protected Long bytesOutToPnic;

    /**
     * Gets the value of the packetsInMulticast property.
     * 
     */
    public long getPacketsInMulticast() {
        return packetsInMulticast;
    }

    /**
     * Sets the value of the packetsInMulticast property.
     * 
     */
    public void setPacketsInMulticast(long value) {
        this.packetsInMulticast = value;
    }

    /**
     * Gets the value of the packetsOutMulticast property.
     * 
     */
    public long getPacketsOutMulticast() {
        return packetsOutMulticast;
    }

    /**
     * Sets the value of the packetsOutMulticast property.
     * 
     */
    public void setPacketsOutMulticast(long value) {
        this.packetsOutMulticast = value;
    }

    /**
     * Gets the value of the bytesInMulticast property.
     * 
     */
    public long getBytesInMulticast() {
        return bytesInMulticast;
    }

    /**
     * Sets the value of the bytesInMulticast property.
     * 
     */
    public void setBytesInMulticast(long value) {
        this.bytesInMulticast = value;
    }

    /**
     * Gets the value of the bytesOutMulticast property.
     * 
     */
    public long getBytesOutMulticast() {
        return bytesOutMulticast;
    }

    /**
     * Sets the value of the bytesOutMulticast property.
     * 
     */
    public void setBytesOutMulticast(long value) {
        this.bytesOutMulticast = value;
    }

    /**
     * Gets the value of the packetsInUnicast property.
     * 
     */
    public long getPacketsInUnicast() {
        return packetsInUnicast;
    }

    /**
     * Sets the value of the packetsInUnicast property.
     * 
     */
    public void setPacketsInUnicast(long value) {
        this.packetsInUnicast = value;
    }

    /**
     * Gets the value of the packetsOutUnicast property.
     * 
     */
    public long getPacketsOutUnicast() {
        return packetsOutUnicast;
    }

    /**
     * Sets the value of the packetsOutUnicast property.
     * 
     */
    public void setPacketsOutUnicast(long value) {
        this.packetsOutUnicast = value;
    }

    /**
     * Gets the value of the bytesInUnicast property.
     * 
     */
    public long getBytesInUnicast() {
        return bytesInUnicast;
    }

    /**
     * Sets the value of the bytesInUnicast property.
     * 
     */
    public void setBytesInUnicast(long value) {
        this.bytesInUnicast = value;
    }

    /**
     * Gets the value of the bytesOutUnicast property.
     * 
     */
    public long getBytesOutUnicast() {
        return bytesOutUnicast;
    }

    /**
     * Sets the value of the bytesOutUnicast property.
     * 
     */
    public void setBytesOutUnicast(long value) {
        this.bytesOutUnicast = value;
    }

    /**
     * Gets the value of the packetsInBroadcast property.
     * 
     */
    public long getPacketsInBroadcast() {
        return packetsInBroadcast;
    }

    /**
     * Sets the value of the packetsInBroadcast property.
     * 
     */
    public void setPacketsInBroadcast(long value) {
        this.packetsInBroadcast = value;
    }

    /**
     * Gets the value of the packetsOutBroadcast property.
     * 
     */
    public long getPacketsOutBroadcast() {
        return packetsOutBroadcast;
    }

    /**
     * Sets the value of the packetsOutBroadcast property.
     * 
     */
    public void setPacketsOutBroadcast(long value) {
        this.packetsOutBroadcast = value;
    }

    /**
     * Gets the value of the bytesInBroadcast property.
     * 
     */
    public long getBytesInBroadcast() {
        return bytesInBroadcast;
    }

    /**
     * Sets the value of the bytesInBroadcast property.
     * 
     */
    public void setBytesInBroadcast(long value) {
        this.bytesInBroadcast = value;
    }

    /**
     * Gets the value of the bytesOutBroadcast property.
     * 
     */
    public long getBytesOutBroadcast() {
        return bytesOutBroadcast;
    }

    /**
     * Sets the value of the bytesOutBroadcast property.
     * 
     */
    public void setBytesOutBroadcast(long value) {
        this.bytesOutBroadcast = value;
    }

    /**
     * Gets the value of the packetsInDropped property.
     * 
     */
    public long getPacketsInDropped() {
        return packetsInDropped;
    }

    /**
     * Sets the value of the packetsInDropped property.
     * 
     */
    public void setPacketsInDropped(long value) {
        this.packetsInDropped = value;
    }

    /**
     * Gets the value of the packetsOutDropped property.
     * 
     */
    public long getPacketsOutDropped() {
        return packetsOutDropped;
    }

    /**
     * Sets the value of the packetsOutDropped property.
     * 
     */
    public void setPacketsOutDropped(long value) {
        this.packetsOutDropped = value;
    }

    /**
     * Gets the value of the packetsInException property.
     * 
     */
    public long getPacketsInException() {
        return packetsInException;
    }

    /**
     * Sets the value of the packetsInException property.
     * 
     */
    public void setPacketsInException(long value) {
        this.packetsInException = value;
    }

    /**
     * Gets the value of the packetsOutException property.
     * 
     */
    public long getPacketsOutException() {
        return packetsOutException;
    }

    /**
     * Sets the value of the packetsOutException property.
     * 
     */
    public void setPacketsOutException(long value) {
        this.packetsOutException = value;
    }

    /**
     * Gets the value of the bytesInFromPnic property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBytesInFromPnic() {
        return bytesInFromPnic;
    }

    /**
     * Sets the value of the bytesInFromPnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBytesInFromPnic(Long value) {
        this.bytesInFromPnic = value;
    }

    /**
     * Gets the value of the bytesOutToPnic property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBytesOutToPnic() {
        return bytesOutToPnic;
    }

    /**
     * Sets the value of the bytesOutToPnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBytesOutToPnic(Long value) {
        this.bytesOutToPnic = value;
    }

}
