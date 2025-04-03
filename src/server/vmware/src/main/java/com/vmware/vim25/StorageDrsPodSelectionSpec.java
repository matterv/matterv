
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageDrsPodSelectionSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageDrsPodSelectionSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="initialVmConfig" type="{urn:internalvim25}VmPodConfigForPlacement" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="storagePod" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsPodSelectionSpec", propOrder = {
    "initialVmConfig",
    "storagePod"
})
public class StorageDrsPodSelectionSpec
    extends DynamicData
{

    protected List<VmPodConfigForPlacement> initialVmConfig;
    protected ManagedObjectReference storagePod;

    /**
     * Gets the value of the initialVmConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initialVmConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInitialVmConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmPodConfigForPlacement }
     * </p>
     * 
     * 
     * @return
     *     The value of the initialVmConfig property.
     */
    public List<VmPodConfigForPlacement> getInitialVmConfig() {
        if (initialVmConfig == null) {
            initialVmConfig = new ArrayList<>();
        }
        return this.initialVmConfig;
    }

    /**
     * Gets the value of the storagePod property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getStoragePod() {
        return storagePod;
    }

    /**
     * Sets the value of the storagePod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setStoragePod(ManagedObjectReference value) {
        this.storagePod = value;
    }

}
