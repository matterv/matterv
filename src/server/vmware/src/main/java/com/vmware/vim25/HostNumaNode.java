
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNumaNode complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNumaNode">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="typeId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         <element name="cpuID" type="{http://www.w3.org/2001/XMLSchema}short" maxOccurs="unbounded"/>
 *         <element name="memorySize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="memoryRangeBegin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="memoryRangeLength" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pciId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNumaNode", propOrder = {
    "typeId",
    "cpuID",
    "memorySize",
    "memoryRangeBegin",
    "memoryRangeLength",
    "pciId"
})
public class HostNumaNode
    extends DynamicData
{

    protected byte typeId;
    @XmlElement(type = Short.class)
    protected List<Short> cpuID;
    protected Long memorySize;
    protected long memoryRangeBegin;
    protected long memoryRangeLength;
    protected List<String> pciId;

    /**
     * Gets the value of the typeId property.
     * 
     */
    public byte getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(byte value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the cpuID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpuID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCpuID().add(newItem);
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
     *     The value of the cpuID property.
     */
    public List<Short> getCpuID() {
        if (cpuID == null) {
            cpuID = new ArrayList<>();
        }
        return this.cpuID;
    }

    /**
     * Gets the value of the memorySize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemorySize() {
        return memorySize;
    }

    /**
     * Sets the value of the memorySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemorySize(Long value) {
        this.memorySize = value;
    }

    /**
     * Gets the value of the memoryRangeBegin property.
     * 
     */
    public long getMemoryRangeBegin() {
        return memoryRangeBegin;
    }

    /**
     * Sets the value of the memoryRangeBegin property.
     * 
     */
    public void setMemoryRangeBegin(long value) {
        this.memoryRangeBegin = value;
    }

    /**
     * Gets the value of the memoryRangeLength property.
     * 
     */
    public long getMemoryRangeLength() {
        return memoryRangeLength;
    }

    /**
     * Sets the value of the memoryRangeLength property.
     * 
     */
    public void setMemoryRangeLength(long value) {
        this.memoryRangeLength = value;
    }

    /**
     * Gets the value of the pciId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pciId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPciId().add(newItem);
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
     *     The value of the pciId property.
     */
    public List<String> getPciId() {
        if (pciId == null) {
            pciId = new ArrayList<>();
        }
        return this.pciId;
    }

}
