
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmRegionInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NvdimmRegionInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="regionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="setId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="rangeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="startAddr" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="size" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="offset" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmRegionInfo", propOrder = {
    "regionId",
    "setId",
    "rangeType",
    "startAddr",
    "size",
    "offset"
})
public class NvdimmRegionInfo
    extends DynamicData
{

    protected int regionId;
    protected int setId;
    @XmlElement(required = true)
    protected String rangeType;
    protected long startAddr;
    protected long size;
    protected long offset;

    /**
     * Gets the value of the regionId property.
     * 
     */
    public int getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     */
    public void setRegionId(int value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the setId property.
     * 
     */
    public int getSetId() {
        return setId;
    }

    /**
     * Sets the value of the setId property.
     * 
     */
    public void setSetId(int value) {
        this.setId = value;
    }

    /**
     * Gets the value of the rangeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeType() {
        return rangeType;
    }

    /**
     * Sets the value of the rangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeType(String value) {
        this.rangeType = value;
    }

    /**
     * Gets the value of the startAddr property.
     * 
     */
    public long getStartAddr() {
        return startAddr;
    }

    /**
     * Sets the value of the startAddr property.
     * 
     */
    public void setStartAddr(long value) {
        this.startAddr = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public long getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(long value) {
        this.offset = value;
    }

}
