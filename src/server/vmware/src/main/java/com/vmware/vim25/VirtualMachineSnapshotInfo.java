
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineSnapshotInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineSnapshotInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="currentSnapshot" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="rootSnapshotList" type="{urn:internalvim25}VirtualMachineSnapshotTree" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSnapshotInfo", propOrder = {
    "currentSnapshot",
    "rootSnapshotList"
})
public class VirtualMachineSnapshotInfo
    extends DynamicData
{

    protected ManagedObjectReference currentSnapshot;
    @XmlElement(required = true)
    protected List<VirtualMachineSnapshotTree> rootSnapshotList;

    /**
     * Gets the value of the currentSnapshot property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCurrentSnapshot() {
        return currentSnapshot;
    }

    /**
     * Sets the value of the currentSnapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCurrentSnapshot(ManagedObjectReference value) {
        this.currentSnapshot = value;
    }

    /**
     * Gets the value of the rootSnapshotList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootSnapshotList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRootSnapshotList().add(newItem);
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
     *     The value of the rootSnapshotList property.
     */
    public List<VirtualMachineSnapshotTree> getRootSnapshotList() {
        if (rootSnapshotList == null) {
            rootSnapshotList = new ArrayList<>();
        }
        return this.rootSnapshotList;
    }

}
