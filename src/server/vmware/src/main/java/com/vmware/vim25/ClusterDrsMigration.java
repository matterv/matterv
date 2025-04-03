
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDrsMigration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDrsMigration">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="cpuLoad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="memoryLoad" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="source" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="sourceCpuLoad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="sourceMemoryLoad" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="destination" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="destinationCpuLoad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="destinationMemoryLoad" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDrsMigration", propOrder = {
    "key",
    "time",
    "vm",
    "cpuLoad",
    "memoryLoad",
    "source",
    "sourceCpuLoad",
    "sourceMemoryLoad",
    "destination",
    "destinationCpuLoad",
    "destinationMemoryLoad"
})
public class ClusterDrsMigration
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(required = true)
    protected ManagedObjectReference vm;
    protected Integer cpuLoad;
    protected Long memoryLoad;
    @XmlElement(required = true)
    protected ManagedObjectReference source;
    protected Integer sourceCpuLoad;
    protected Long sourceMemoryLoad;
    @XmlElement(required = true)
    protected ManagedObjectReference destination;
    protected Integer destinationCpuLoad;
    protected Long destinationMemoryLoad;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVm() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVm(ManagedObjectReference value) {
        this.vm = value;
    }

    /**
     * Gets the value of the cpuLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCpuLoad() {
        return cpuLoad;
    }

    /**
     * Sets the value of the cpuLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCpuLoad(Integer value) {
        this.cpuLoad = value;
    }

    /**
     * Gets the value of the memoryLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemoryLoad() {
        return memoryLoad;
    }

    /**
     * Sets the value of the memoryLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemoryLoad(Long value) {
        this.memoryLoad = value;
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
     * Gets the value of the sourceCpuLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceCpuLoad() {
        return sourceCpuLoad;
    }

    /**
     * Sets the value of the sourceCpuLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceCpuLoad(Integer value) {
        this.sourceCpuLoad = value;
    }

    /**
     * Gets the value of the sourceMemoryLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceMemoryLoad() {
        return sourceMemoryLoad;
    }

    /**
     * Sets the value of the sourceMemoryLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceMemoryLoad(Long value) {
        this.sourceMemoryLoad = value;
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
     * Gets the value of the destinationCpuLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationCpuLoad() {
        return destinationCpuLoad;
    }

    /**
     * Sets the value of the destinationCpuLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationCpuLoad(Integer value) {
        this.destinationCpuLoad = value;
    }

    /**
     * Gets the value of the destinationMemoryLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestinationMemoryLoad() {
        return destinationMemoryLoad;
    }

    /**
     * Sets the value of the destinationMemoryLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestinationMemoryLoad(Long value) {
        this.destinationMemoryLoad = value;
    }

}
