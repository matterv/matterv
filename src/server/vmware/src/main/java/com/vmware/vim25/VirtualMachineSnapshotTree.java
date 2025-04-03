
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
 * <p>Java class for VirtualMachineSnapshotTree complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineSnapshotTree">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="snapshot" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="state" type="{urn:internalvim25}VirtualMachinePowerState"/>
 *         <element name="quiesced" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="backupManifest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="childSnapshotList" type="{urn:internalvim25}VirtualMachineSnapshotTree" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="replaySupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSnapshotTree", propOrder = {
    "snapshot",
    "vm",
    "name",
    "description",
    "id",
    "createTime",
    "state",
    "quiesced",
    "backupManifest",
    "childSnapshotList",
    "replaySupported"
})
public class VirtualMachineSnapshotTree
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference snapshot;
    @XmlElement(required = true)
    protected ManagedObjectReference vm;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    protected Integer id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VirtualMachinePowerState state;
    protected boolean quiesced;
    protected String backupManifest;
    protected List<VirtualMachineSnapshotTree> childSnapshotList;
    protected Boolean replaySupported;

    /**
     * Gets the value of the snapshot property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSnapshot() {
        return snapshot;
    }

    /**
     * Sets the value of the snapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSnapshot(ManagedObjectReference value) {
        this.snapshot = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachinePowerState }
     *     
     */
    public VirtualMachinePowerState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachinePowerState }
     *     
     */
    public void setState(VirtualMachinePowerState value) {
        this.state = value;
    }

    /**
     * Gets the value of the quiesced property.
     * 
     */
    public boolean isQuiesced() {
        return quiesced;
    }

    /**
     * Sets the value of the quiesced property.
     * 
     */
    public void setQuiesced(boolean value) {
        this.quiesced = value;
    }

    /**
     * Gets the value of the backupManifest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupManifest() {
        return backupManifest;
    }

    /**
     * Sets the value of the backupManifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupManifest(String value) {
        this.backupManifest = value;
    }

    /**
     * Gets the value of the childSnapshotList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childSnapshotList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChildSnapshotList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineSnapshotTree }
     * </p>
     * 
     * 
     * @return
     *     The value of the childSnapshotList property.
     */
    public List<VirtualMachineSnapshotTree> getChildSnapshotList() {
        if (childSnapshotList == null) {
            childSnapshotList = new ArrayList<>();
        }
        return this.childSnapshotList;
    }

    /**
     * Gets the value of the replaySupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaySupported() {
        return replaySupported;
    }

    /**
     * Sets the value of the replaySupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaySupported(Boolean value) {
        this.replaySupported = value;
    }

}
