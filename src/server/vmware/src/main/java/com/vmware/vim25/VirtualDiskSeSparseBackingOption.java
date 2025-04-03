
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskSeSparseBackingOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskSeSparseBackingOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceFileBackingOption">
 *       <sequence>
 *         <element name="diskMode" type="{urn:internalvim25}ChoiceOption"/>
 *         <element name="writeThrough" type="{urn:internalvim25}BoolOption"/>
 *         <element name="growable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hotGrowable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="uuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="deltaDiskFormatsSupported" type="{urn:internalvim25}VirtualDiskDeltaDiskFormatsSupported" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskSeSparseBackingOption", propOrder = {
    "diskMode",
    "writeThrough",
    "growable",
    "hotGrowable",
    "uuid",
    "deltaDiskFormatsSupported"
})
public class VirtualDiskSeSparseBackingOption
    extends VirtualDeviceFileBackingOption
{

    @XmlElement(required = true)
    protected ChoiceOption diskMode;
    @XmlElement(required = true)
    protected BoolOption writeThrough;
    protected boolean growable;
    protected boolean hotGrowable;
    protected boolean uuid;
    @XmlElement(required = true)
    protected List<VirtualDiskDeltaDiskFormatsSupported> deltaDiskFormatsSupported;

    /**
     * Gets the value of the diskMode property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getDiskMode() {
        return diskMode;
    }

    /**
     * Sets the value of the diskMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setDiskMode(ChoiceOption value) {
        this.diskMode = value;
    }

    /**
     * Gets the value of the writeThrough property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getWriteThrough() {
        return writeThrough;
    }

    /**
     * Sets the value of the writeThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setWriteThrough(BoolOption value) {
        this.writeThrough = value;
    }

    /**
     * Gets the value of the growable property.
     * 
     */
    public boolean isGrowable() {
        return growable;
    }

    /**
     * Sets the value of the growable property.
     * 
     */
    public void setGrowable(boolean value) {
        this.growable = value;
    }

    /**
     * Gets the value of the hotGrowable property.
     * 
     */
    public boolean isHotGrowable() {
        return hotGrowable;
    }

    /**
     * Sets the value of the hotGrowable property.
     * 
     */
    public void setHotGrowable(boolean value) {
        this.hotGrowable = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     */
    public boolean isUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     */
    public void setUuid(boolean value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the deltaDiskFormatsSupported property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deltaDiskFormatsSupported property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeltaDiskFormatsSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualDiskDeltaDiskFormatsSupported }
     * </p>
     * 
     * 
     * @return
     *     The value of the deltaDiskFormatsSupported property.
     */
    public List<VirtualDiskDeltaDiskFormatsSupported> getDeltaDiskFormatsSupported() {
        if (deltaDiskFormatsSupported == null) {
            deltaDiskFormatsSupported = new ArrayList<>();
        }
        return this.deltaDiskFormatsSupported;
    }

}
