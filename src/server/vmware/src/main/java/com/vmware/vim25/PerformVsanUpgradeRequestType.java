
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformVsanUpgradeRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PerformVsanUpgradeRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="cluster" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="performObjectUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="downgradeFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="allowReducedRedundancy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="excludeHosts" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformVsanUpgradeRequestType", propOrder = {
    "_this",
    "cluster",
    "performObjectUpgrade",
    "downgradeFormat",
    "allowReducedRedundancy",
    "excludeHosts"
})
public class PerformVsanUpgradeRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected ManagedObjectReference cluster;
    protected Boolean performObjectUpgrade;
    protected Boolean downgradeFormat;
    protected Boolean allowReducedRedundancy;
    protected List<ManagedObjectReference> excludeHosts;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the cluster property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCluster() {
        return cluster;
    }

    /**
     * Sets the value of the cluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCluster(ManagedObjectReference value) {
        this.cluster = value;
    }

    /**
     * Gets the value of the performObjectUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerformObjectUpgrade() {
        return performObjectUpgrade;
    }

    /**
     * Sets the value of the performObjectUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerformObjectUpgrade(Boolean value) {
        this.performObjectUpgrade = value;
    }

    /**
     * Gets the value of the downgradeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDowngradeFormat() {
        return downgradeFormat;
    }

    /**
     * Sets the value of the downgradeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDowngradeFormat(Boolean value) {
        this.downgradeFormat = value;
    }

    /**
     * Gets the value of the allowReducedRedundancy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowReducedRedundancy() {
        return allowReducedRedundancy;
    }

    /**
     * Sets the value of the allowReducedRedundancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowReducedRedundancy(Boolean value) {
        this.allowReducedRedundancy = value;
    }

    /**
     * Gets the value of the excludeHosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeHosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExcludeHosts().add(newItem);
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
     *     The value of the excludeHosts property.
     */
    public List<ManagedObjectReference> getExcludeHosts() {
        if (excludeHosts == null) {
            excludeHosts = new ArrayList<>();
        }
        return this.excludeHosts;
    }

}
