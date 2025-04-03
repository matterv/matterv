
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmfsConfigOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmfsConfigOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="blockSizeOption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="unmapGranularityOption" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="unmapBandwidthFixedValue" type="{urn:internalvim25}LongOption" minOccurs="0"/>
 *         <element name="unmapBandwidthDynamicMin" type="{urn:internalvim25}LongOption" minOccurs="0"/>
 *         <element name="unmapBandwidthDynamicMax" type="{urn:internalvim25}LongOption" minOccurs="0"/>
 *         <element name="unmapBandwidthIncrement" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="unmapBandwidthUltraLow" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsConfigOption", propOrder = {
    "blockSizeOption",
    "unmapGranularityOption",
    "unmapBandwidthFixedValue",
    "unmapBandwidthDynamicMin",
    "unmapBandwidthDynamicMax",
    "unmapBandwidthIncrement",
    "unmapBandwidthUltraLow"
})
public class VmfsConfigOption
    extends DynamicData
{

    protected int blockSizeOption;
    @XmlElement(type = Integer.class)
    protected List<Integer> unmapGranularityOption;
    protected LongOption unmapBandwidthFixedValue;
    protected LongOption unmapBandwidthDynamicMin;
    protected LongOption unmapBandwidthDynamicMax;
    protected Long unmapBandwidthIncrement;
    protected Long unmapBandwidthUltraLow;

    /**
     * Gets the value of the blockSizeOption property.
     * 
     */
    public int getBlockSizeOption() {
        return blockSizeOption;
    }

    /**
     * Sets the value of the blockSizeOption property.
     * 
     */
    public void setBlockSizeOption(int value) {
        this.blockSizeOption = value;
    }

    /**
     * Gets the value of the unmapGranularityOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unmapGranularityOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUnmapGranularityOption().add(newItem);
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
     *     The value of the unmapGranularityOption property.
     */
    public List<Integer> getUnmapGranularityOption() {
        if (unmapGranularityOption == null) {
            unmapGranularityOption = new ArrayList<>();
        }
        return this.unmapGranularityOption;
    }

    /**
     * Gets the value of the unmapBandwidthFixedValue property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getUnmapBandwidthFixedValue() {
        return unmapBandwidthFixedValue;
    }

    /**
     * Sets the value of the unmapBandwidthFixedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setUnmapBandwidthFixedValue(LongOption value) {
        this.unmapBandwidthFixedValue = value;
    }

    /**
     * Gets the value of the unmapBandwidthDynamicMin property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getUnmapBandwidthDynamicMin() {
        return unmapBandwidthDynamicMin;
    }

    /**
     * Sets the value of the unmapBandwidthDynamicMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setUnmapBandwidthDynamicMin(LongOption value) {
        this.unmapBandwidthDynamicMin = value;
    }

    /**
     * Gets the value of the unmapBandwidthDynamicMax property.
     * 
     * @return
     *     possible object is
     *     {@link LongOption }
     *     
     */
    public LongOption getUnmapBandwidthDynamicMax() {
        return unmapBandwidthDynamicMax;
    }

    /**
     * Sets the value of the unmapBandwidthDynamicMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongOption }
     *     
     */
    public void setUnmapBandwidthDynamicMax(LongOption value) {
        this.unmapBandwidthDynamicMax = value;
    }

    /**
     * Gets the value of the unmapBandwidthIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnmapBandwidthIncrement() {
        return unmapBandwidthIncrement;
    }

    /**
     * Sets the value of the unmapBandwidthIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnmapBandwidthIncrement(Long value) {
        this.unmapBandwidthIncrement = value;
    }

    /**
     * Gets the value of the unmapBandwidthUltraLow property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnmapBandwidthUltraLow() {
        return unmapBandwidthUltraLow;
    }

    /**
     * Sets the value of the unmapBandwidthUltraLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnmapBandwidthUltraLow(Long value) {
        this.unmapBandwidthUltraLow = value;
    }

}
