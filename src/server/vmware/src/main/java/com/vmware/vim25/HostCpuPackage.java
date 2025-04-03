
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostCpuPackage complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostCpuPackage">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="index" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hz" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="busHz" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="threadId" type="{http://www.w3.org/2001/XMLSchema}short" maxOccurs="unbounded"/>
 *         <element name="cpuFeature" type="{urn:internalvim25}HostCpuIdInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="family" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         <element name="stepping" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCpuPackage", propOrder = {
    "index",
    "vendor",
    "hz",
    "busHz",
    "description",
    "threadId",
    "cpuFeature",
    "family",
    "model",
    "stepping"
})
public class HostCpuPackage
    extends DynamicData
{

    protected short index;
    @XmlElement(required = true)
    protected String vendor;
    protected long hz;
    protected long busHz;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(type = Short.class)
    protected List<Short> threadId;
    protected List<HostCpuIdInfo> cpuFeature;
    protected Short family;
    protected Short model;
    protected Short stepping;

    /**
     * Gets the value of the index property.
     * 
     */
    public short getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(short value) {
        this.index = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the hz property.
     * 
     */
    public long getHz() {
        return hz;
    }

    /**
     * Sets the value of the hz property.
     * 
     */
    public void setHz(long value) {
        this.hz = value;
    }

    /**
     * Gets the value of the busHz property.
     * 
     */
    public long getBusHz() {
        return busHz;
    }

    /**
     * Sets the value of the busHz property.
     * 
     */
    public void setBusHz(long value) {
        this.busHz = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the threadId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threadId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getThreadId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Short }
     * </p>
     * 
     * 
     * @return
     *     The value of the threadId property.
     */
    public List<Short> getThreadId() {
        if (threadId == null) {
            threadId = new ArrayList<>();
        }
        return this.threadId;
    }

    /**
     * Gets the value of the cpuFeature property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpuFeature property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCpuFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostCpuIdInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the cpuFeature property.
     */
    public List<HostCpuIdInfo> getCpuFeature() {
        if (cpuFeature == null) {
            cpuFeature = new ArrayList<>();
        }
        return this.cpuFeature;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFamily(Short value) {
        this.family = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setModel(Short value) {
        this.model = value;
    }

    /**
     * Gets the value of the stepping property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStepping() {
        return stepping;
    }

    /**
     * Sets the value of the stepping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStepping(Short value) {
        this.stepping = value;
    }

}
