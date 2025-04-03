
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineFileLayoutEx complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineFileLayoutEx">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="file" type="{urn:internalvim25}VirtualMachineFileLayoutExFileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="disk" type="{urn:internalvim25}VirtualMachineFileLayoutExDiskLayout" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="snapshot" type="{urn:internalvim25}VirtualMachineFileLayoutExSnapshotLayout" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayoutEx", propOrder = {
    "file",
    "disk",
    "snapshot",
    "timestamp"
})
public class VirtualMachineFileLayoutEx
    extends DynamicData
{

    protected List<VirtualMachineFileLayoutExFileInfo> file;
    protected List<VirtualMachineFileLayoutExDiskLayout> disk;
    protected List<VirtualMachineFileLayoutExSnapshotLayout> snapshot;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the file property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFileLayoutExFileInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the file property.
     */
    public List<VirtualMachineFileLayoutExFileInfo> getFile() {
        if (file == null) {
            file = new ArrayList<>();
        }
        return this.file;
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

    /**
     * Gets the value of the snapshot property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snapshot property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSnapshot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFileLayoutExSnapshotLayout }
     * </p>
     * 
     * 
     * @return
     *     The value of the snapshot property.
     */
    public List<VirtualMachineFileLayoutExSnapshotLayout> getSnapshot() {
        if (snapshot == null) {
            snapshot = new ArrayList<>();
        }
        return this.snapshot;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
