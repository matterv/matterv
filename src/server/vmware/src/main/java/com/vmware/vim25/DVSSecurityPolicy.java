
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSSecurityPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSSecurityPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InheritablePolicy">
 *       <sequence>
 *         <element name="allowPromiscuous" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *         <element name="macChanges" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *         <element name="forgedTransmits" type="{urn:internalvim25}BoolPolicy" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSSecurityPolicy", propOrder = {
    "allowPromiscuous",
    "macChanges",
    "forgedTransmits"
})
public class DVSSecurityPolicy
    extends InheritablePolicy
{

    protected BoolPolicy allowPromiscuous;
    protected BoolPolicy macChanges;
    protected BoolPolicy forgedTransmits;

    /**
     * Gets the value of the allowPromiscuous property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getAllowPromiscuous() {
        return allowPromiscuous;
    }

    /**
     * Sets the value of the allowPromiscuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setAllowPromiscuous(BoolPolicy value) {
        this.allowPromiscuous = value;
    }

    /**
     * Gets the value of the macChanges property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getMacChanges() {
        return macChanges;
    }

    /**
     * Sets the value of the macChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setMacChanges(BoolPolicy value) {
        this.macChanges = value;
    }

    /**
     * Gets the value of the forgedTransmits property.
     * 
     * @return
     *     possible object is
     *     {@link BoolPolicy }
     *     
     */
    public BoolPolicy getForgedTransmits() {
        return forgedTransmits;
    }

    /**
     * Sets the value of the forgedTransmits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolPolicy }
     *     
     */
    public void setForgedTransmits(BoolPolicy value) {
        this.forgedTransmits = value;
    }

}
