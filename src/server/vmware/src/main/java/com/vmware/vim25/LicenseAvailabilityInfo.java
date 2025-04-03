
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseAvailabilityInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseAvailabilityInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="feature" type="{urn:internalvim25}LicenseFeatureInfo"/>
 *         <element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="available" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseAvailabilityInfo", propOrder = {
    "feature",
    "total",
    "available"
})
public class LicenseAvailabilityInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected LicenseFeatureInfo feature;
    protected int total;
    protected int available;

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseFeatureInfo }
     *     
     */
    public LicenseFeatureInfo getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseFeatureInfo }
     *     
     */
    public void setFeature(LicenseFeatureInfo value) {
        this.feature = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Gets the value of the available property.
     * 
     */
    public int getAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(int value) {
        this.available = value;
    }

}
