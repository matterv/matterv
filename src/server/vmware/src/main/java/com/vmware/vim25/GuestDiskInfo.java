
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestDiskInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestDiskInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="diskPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="capacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="freeSpace" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="filesystemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mappings" type="{urn:internalvim25}GuestInfoVirtualDiskMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestDiskInfo", propOrder = {
    "diskPath",
    "capacity",
    "freeSpace",
    "filesystemType",
    "mappings"
})
public class GuestDiskInfo
    extends DynamicData
{

    protected String diskPath;
    protected Long capacity;
    protected Long freeSpace;
    protected String filesystemType;
    protected List<GuestInfoVirtualDiskMapping> mappings;

    /**
     * Gets the value of the diskPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskPath() {
        return diskPath;
    }

    /**
     * Sets the value of the diskPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskPath(String value) {
        this.diskPath = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacity(Long value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the freeSpace property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeSpace() {
        return freeSpace;
    }

    /**
     * Sets the value of the freeSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeSpace(Long value) {
        this.freeSpace = value;
    }

    /**
     * Gets the value of the filesystemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilesystemType() {
        return filesystemType;
    }

    /**
     * Sets the value of the filesystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilesystemType(String value) {
        this.filesystemType = value;
    }

    /**
     * Gets the value of the mappings property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappings property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestInfoVirtualDiskMapping }
     * </p>
     * 
     * 
     * @return
     *     The value of the mappings property.
     */
    public List<GuestInfoVirtualDiskMapping> getMappings() {
        if (mappings == null) {
            mappings = new ArrayList<>();
        }
        return this.mappings;
    }

}
