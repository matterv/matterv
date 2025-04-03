
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FolderBatchAddStandaloneHostsResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FolderBatchAddStandaloneHostsResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="addedHosts" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hostsFailedInventoryAdd" type="{urn:internalvim25}FolderFailedHostResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderBatchAddStandaloneHostsResult", propOrder = {
    "addedHosts",
    "hostsFailedInventoryAdd"
})
public class FolderBatchAddStandaloneHostsResult
    extends DynamicData
{

    protected List<ManagedObjectReference> addedHosts;
    protected List<FolderFailedHostResult> hostsFailedInventoryAdd;

    /**
     * Gets the value of the addedHosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addedHosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddedHosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the addedHosts property.
     */
    public List<ManagedObjectReference> getAddedHosts() {
        if (addedHosts == null) {
            addedHosts = new ArrayList<>();
        }
        return this.addedHosts;
    }

    /**
     * Gets the value of the hostsFailedInventoryAdd property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostsFailedInventoryAdd property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostsFailedInventoryAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderFailedHostResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostsFailedInventoryAdd property.
     */
    public List<FolderFailedHostResult> getHostsFailedInventoryAdd() {
        if (hostsFailedInventoryAdd == null) {
            hostsFailedInventoryAdd = new ArrayList<>();
        }
        return this.hostsFailedInventoryAdd;
    }

}
