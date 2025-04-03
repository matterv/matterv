
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementRankSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PlacementRankSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="specs" type="{urn:internalvim25}PlacementSpec" maxOccurs="unbounded"/>
 *         <element name="clusters" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded"/>
 *         <element name="rules" type="{urn:internalvim25}PlacementAffinityRule" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="placementRankByVm" type="{urn:internalvim25}StorageDrsPlacementRankVmSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementRankSpec", propOrder = {
    "specs",
    "clusters",
    "rules",
    "placementRankByVm"
})
public class PlacementRankSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<PlacementSpec> specs;
    @XmlElement(required = true)
    protected List<ManagedObjectReference> clusters;
    protected List<PlacementAffinityRule> rules;
    protected List<StorageDrsPlacementRankVmSpec> placementRankByVm;

    /**
     * Gets the value of the specs property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specs property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSpecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacementSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the specs property.
     */
    public List<PlacementSpec> getSpecs() {
        if (specs == null) {
            specs = new ArrayList<>();
        }
        return this.specs;
    }

    /**
     * Gets the value of the clusters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusters property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClusters().add(newItem);
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
     *     The value of the clusters property.
     */
    public List<ManagedObjectReference> getClusters() {
        if (clusters == null) {
            clusters = new ArrayList<>();
        }
        return this.clusters;
    }

    /**
     * Gets the value of the rules property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacementAffinityRule }
     * </p>
     * 
     * 
     * @return
     *     The value of the rules property.
     */
    public List<PlacementAffinityRule> getRules() {
        if (rules == null) {
            rules = new ArrayList<>();
        }
        return this.rules;
    }

    /**
     * Gets the value of the placementRankByVm property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placementRankByVm property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPlacementRankByVm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StorageDrsPlacementRankVmSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the placementRankByVm property.
     */
    public List<StorageDrsPlacementRankVmSpec> getPlacementRankByVm() {
        if (placementRankByVm == null) {
            placementRankByVm = new ArrayList<>();
        }
        return this.placementRankByVm;
    }

}
