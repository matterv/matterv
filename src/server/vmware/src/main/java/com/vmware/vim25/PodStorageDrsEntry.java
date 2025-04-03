
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PodStorageDrsEntry complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PodStorageDrsEntry">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="storageDrsConfig" type="{urn:internalvim25}StorageDrsConfigInfo"/>
 *         <element name="recommendation" type="{urn:internalvim25}ClusterRecommendation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="drsFault" type="{urn:internalvim25}ClusterDrsFaults" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="actionHistory" type="{urn:internalvim25}ClusterActionHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PodStorageDrsEntry", propOrder = {
    "storageDrsConfig",
    "recommendation",
    "drsFault",
    "actionHistory"
})
public class PodStorageDrsEntry
    extends DynamicData
{

    @XmlElement(required = true)
    protected StorageDrsConfigInfo storageDrsConfig;
    protected List<ClusterRecommendation> recommendation;
    protected List<ClusterDrsFaults> drsFault;
    protected List<ClusterActionHistory> actionHistory;

    /**
     * Gets the value of the storageDrsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link StorageDrsConfigInfo }
     *     
     */
    public StorageDrsConfigInfo getStorageDrsConfig() {
        return storageDrsConfig;
    }

    /**
     * Sets the value of the storageDrsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageDrsConfigInfo }
     *     
     */
    public void setStorageDrsConfig(StorageDrsConfigInfo value) {
        this.storageDrsConfig = value;
    }

    /**
     * Gets the value of the recommendation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRecommendation }
     * </p>
     * 
     * 
     * @return
     *     The value of the recommendation property.
     */
    public List<ClusterRecommendation> getRecommendation() {
        if (recommendation == null) {
            recommendation = new ArrayList<>();
        }
        return this.recommendation;
    }

    /**
     * Gets the value of the drsFault property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drsFault property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDrsFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDrsFaults }
     * </p>
     * 
     * 
     * @return
     *     The value of the drsFault property.
     */
    public List<ClusterDrsFaults> getDrsFault() {
        if (drsFault == null) {
            drsFault = new ArrayList<>();
        }
        return this.drsFault;
    }

    /**
     * Gets the value of the actionHistory property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionHistory property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getActionHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterActionHistory }
     * </p>
     * 
     * 
     * @return
     *     The value of the actionHistory property.
     */
    public List<ClusterActionHistory> getActionHistory() {
        if (actionHistory == null) {
            actionHistory = new ArrayList<>();
        }
        return this.actionHistory;
    }

}
