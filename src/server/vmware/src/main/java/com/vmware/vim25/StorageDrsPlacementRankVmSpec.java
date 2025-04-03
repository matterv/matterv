
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageDrsPlacementRankVmSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageDrsPlacementRankVmSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vmPlacementSpec" type="{urn:internalvim25}PlacementSpec"/>
 *         <element name="vmClusters" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsPlacementRankVmSpec", propOrder = {
    "vmPlacementSpec",
    "vmClusters"
})
public class StorageDrsPlacementRankVmSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected PlacementSpec vmPlacementSpec;
    @XmlElement(required = true)
    protected List<ManagedObjectReference> vmClusters;

    /**
     * Gets the value of the vmPlacementSpec property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementSpec }
     *     
     */
    public PlacementSpec getVmPlacementSpec() {
        return vmPlacementSpec;
    }

    /**
     * Sets the value of the vmPlacementSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementSpec }
     *     
     */
    public void setVmPlacementSpec(PlacementSpec value) {
        this.vmPlacementSpec = value;
    }

    /**
     * Gets the value of the vmClusters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmClusters property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmClusters().add(newItem);
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
     *     The value of the vmClusters property.
     */
    public List<ManagedObjectReference> getVmClusters() {
        if (vmClusters == null) {
            vmClusters = new ArrayList<>();
        }
        return this.vmClusters;
    }

}
