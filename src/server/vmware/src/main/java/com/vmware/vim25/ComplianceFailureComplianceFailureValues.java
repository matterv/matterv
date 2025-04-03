
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplianceFailureComplianceFailureValues complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComplianceFailureComplianceFailureValues">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="comparisonIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="profileInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hostValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         <element name="profileValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceFailureComplianceFailureValues", propOrder = {
    "comparisonIdentifier",
    "profileInstance",
    "hostValue",
    "profileValue"
})
public class ComplianceFailureComplianceFailureValues
    extends DynamicData
{

    @XmlElement(required = true)
    protected String comparisonIdentifier;
    protected String profileInstance;
    protected Object hostValue;
    protected Object profileValue;

    /**
     * Gets the value of the comparisonIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparisonIdentifier() {
        return comparisonIdentifier;
    }

    /**
     * Sets the value of the comparisonIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparisonIdentifier(String value) {
        this.comparisonIdentifier = value;
    }

    /**
     * Gets the value of the profileInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileInstance() {
        return profileInstance;
    }

    /**
     * Sets the value of the profileInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileInstance(String value) {
        this.profileInstance = value;
    }

    /**
     * Gets the value of the hostValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHostValue() {
        return hostValue;
    }

    /**
     * Sets the value of the hostValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHostValue(Object value) {
        this.hostValue = value;
    }

    /**
     * Gets the value of the profileValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProfileValue() {
        return profileValue;
    }

    /**
     * Sets the value of the profileValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProfileValue(Object value) {
        this.profileValue = value;
    }

}
