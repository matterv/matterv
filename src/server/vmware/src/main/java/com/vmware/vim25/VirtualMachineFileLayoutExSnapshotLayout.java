
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineFileLayoutExSnapshotLayout complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineFileLayoutExSnapshotLayout">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="dataKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="memoryKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="disk" type="{urn:internalvim25}VirtualMachineFileLayoutExDiskLayout" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayoutExSnapshotLayout", propOrder = {
    "key",
    "dataKey",
    "memoryKey",
    "disk"
})
public class VirtualMachineFileLayoutExSnapshotLayout
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference key;
    protected int dataKey;
    protected Integer memoryKey;
    protected List<VirtualMachineFileLayoutExDiskLayout> disk;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setKey(ManagedObjectReference value) {
        this.key = value;
    }

    /**
     * Gets the value of the dataKey property.
     * 
     */
    public int getDataKey() {
        return dataKey;
    }

    /**
     * Sets the value of the dataKey property.
     * 
     */
    public void setDataKey(int value) {
        this.dataKey = value;
    }

    /**
     * Gets the value of the memoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemoryKey() {
        return memoryKey;
    }

    /**
     * Sets the value of the memoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemoryKey(Integer value) {
        this.memoryKey = value;
    }

    /**
     * Gets the value of the disk property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disk property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFileLayoutExDiskLayout }
     * </p>
     * 
     * 
     * @return
     *     The value of the disk property.
     */
    public List<VirtualMachineFileLayoutExDiskLayout> getDisk() {
        if (disk == null) {
            disk = new ArrayList<>();
        }
        return this.disk;
    }

}
