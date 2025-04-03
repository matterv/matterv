
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmInterleaveSetInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NvdimmInterleaveSetInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="setId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="rangeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="baseAddress" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="size" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="availableSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="deviceList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmInterleaveSetInfo", propOrder = {
    "setId",
    "rangeType",
    "baseAddress",
    "size",
    "availableSize",
    "deviceList",
    "state"
})
public class NvdimmInterleaveSetInfo
    extends DynamicData
{

    protected int setId;
    @XmlElement(required = true)
    protected String rangeType;
    protected long baseAddress;
    protected long size;
    protected long availableSize;
    @XmlElement(type = Integer.class)
    protected List<Integer> deviceList;
    @XmlElement(required = true)
    protected String state;

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
     * Gets the value of the baseAddress property.
     * 
     */
    public long getBaseAddress() {
        return baseAddress;
    }

    /**
     * Sets the value of the baseAddress property.
     * 
     */
    public void setBaseAddress(long value) {
        this.baseAddress = value;
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
     * Gets the value of the availableSize property.
     * 
     */
    public long getAvailableSize() {
        return availableSize;
    }

    /**
     * Sets the value of the availableSize property.
     * 
     */
    public void setAvailableSize(long value) {
        this.availableSize = value;
    }

    /**
     * Gets the value of the deviceList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeviceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the deviceList property.
     */
    public List<Integer> getDeviceList() {
        if (deviceList == null) {
            deviceList = new ArrayList<>();
        }
        return this.deviceList;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
