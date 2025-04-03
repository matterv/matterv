
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dvsOperationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="dvPortGroupOperationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="dvPortOperationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="compatibleHostComponentProductInfo" type="{urn:internalvim25}DistributedVirtualSwitchHostProductSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featuresSupported" type="{urn:internalvim25}DVSFeatureCapability" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSCapability", propOrder = {
    "dvsOperationSupported",
    "dvPortGroupOperationSupported",
    "dvPortOperationSupported",
    "compatibleHostComponentProductInfo",
    "featuresSupported"
})
public class DVSCapability
    extends DynamicData
{

    protected Boolean dvsOperationSupported;
    protected Boolean dvPortGroupOperationSupported;
    protected Boolean dvPortOperationSupported;
    protected List<DistributedVirtualSwitchHostProductSpec> compatibleHostComponentProductInfo;
    protected DVSFeatureCapability featuresSupported;

    /**
     * Gets the value of the dvsOperationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDvsOperationSupported() {
        return dvsOperationSupported;
    }

    /**
     * Sets the value of the dvsOperationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDvsOperationSupported(Boolean value) {
        this.dvsOperationSupported = value;
    }

    /**
     * Gets the value of the dvPortGroupOperationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDvPortGroupOperationSupported() {
        return dvPortGroupOperationSupported;
    }

    /**
     * Sets the value of the dvPortGroupOperationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDvPortGroupOperationSupported(Boolean value) {
        this.dvPortGroupOperationSupported = value;
    }

    /**
     * Gets the value of the dvPortOperationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDvPortOperationSupported() {
        return dvPortOperationSupported;
    }

    /**
     * Sets the value of the dvPortOperationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDvPortOperationSupported(Boolean value) {
        this.dvPortOperationSupported = value;
    }

    /**
     * Gets the value of the compatibleHostComponentProductInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibleHostComponentProductInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCompatibleHostComponentProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchHostProductSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the compatibleHostComponentProductInfo property.
     */
    public List<DistributedVirtualSwitchHostProductSpec> getCompatibleHostComponentProductInfo() {
        if (compatibleHostComponentProductInfo == null) {
            compatibleHostComponentProductInfo = new ArrayList<>();
        }
        return this.compatibleHostComponentProductInfo;
    }

    /**
     * Gets the value of the featuresSupported property.
     * 
     * @return
     *     possible object is
     *     {@link DVSFeatureCapability }
     *     
     */
    public DVSFeatureCapability getFeaturesSupported() {
        return featuresSupported;
    }

    /**
     * Sets the value of the featuresSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVSFeatureCapability }
     *     
     */
    public void setFeaturesSupported(DVSFeatureCapability value) {
        this.featuresSupported = value;
    }

}
