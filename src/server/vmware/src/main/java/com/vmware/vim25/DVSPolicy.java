
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="autoPreInstallAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="autoUpgradeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="partialUpgradeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSPolicy", propOrder = {
    "autoPreInstallAllowed",
    "autoUpgradeAllowed",
    "partialUpgradeAllowed"
})
public class DVSPolicy
    extends DynamicData
{

    protected Boolean autoPreInstallAllowed;
    protected Boolean autoUpgradeAllowed;
    protected Boolean partialUpgradeAllowed;

    /**
     * Gets the value of the autoPreInstallAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPreInstallAllowed() {
        return autoPreInstallAllowed;
    }

    /**
     * Sets the value of the autoPreInstallAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPreInstallAllowed(Boolean value) {
        this.autoPreInstallAllowed = value;
    }

    /**
     * Gets the value of the autoUpgradeAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoUpgradeAllowed() {
        return autoUpgradeAllowed;
    }

    /**
     * Sets the value of the autoUpgradeAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoUpgradeAllowed(Boolean value) {
        this.autoUpgradeAllowed = value;
    }

    /**
     * Gets the value of the partialUpgradeAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialUpgradeAllowed() {
        return partialUpgradeAllowed;
    }

    /**
     * Sets the value of the partialUpgradeAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialUpgradeAllowed(Boolean value) {
        this.partialUpgradeAllowed = value;
    }

}
