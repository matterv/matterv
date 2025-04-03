
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VStorageObjectSnapshotInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VStorageObjectSnapshotInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="snapshots" type="{urn:internalvim25}VStorageObjectSnapshotInfoVStorageObjectSnapshot" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectSnapshotInfo", propOrder = {
    "snapshots"
})
public class VStorageObjectSnapshotInfo
    extends DynamicData
{

    protected List<VStorageObjectSnapshotInfoVStorageObjectSnapshot> snapshots;

    /**
     * Gets the value of the snapshots property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snapshots property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSnapshots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VStorageObjectSnapshotInfoVStorageObjectSnapshot }
     * </p>
     * 
     * 
     * @return
     *     The value of the snapshots property.
     */
    public List<VStorageObjectSnapshotInfoVStorageObjectSnapshot> getSnapshots() {
        if (snapshots == null) {
            snapshots = new ArrayList<>();
        }
        return this.snapshots;
    }

}
