
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseExpiredEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseExpiredEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Event">
 *       <sequence>
 *         <element name="feature" type="{urn:internalvim25}LicenseFeatureInfo"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseExpiredEvent", propOrder = {
    "feature"
})
public class LicenseExpiredEvent
    extends Event
{

    @XmlElement(required = true)
    protected LicenseFeatureInfo feature;

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

}
