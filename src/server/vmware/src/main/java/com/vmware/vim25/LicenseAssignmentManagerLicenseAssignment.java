
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseAssignmentManagerLicenseAssignment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseAssignmentManagerLicenseAssignment">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="entityDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="assignedLicense" type="{urn:internalvim25}LicenseManagerLicenseInfo"/>
 *         <element name="properties" type="{urn:internalvim25}KeyAnyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseAssignmentManagerLicenseAssignment", propOrder = {
    "entityId",
    "scope",
    "entityDisplayName",
    "assignedLicense",
    "properties"
})
public class LicenseAssignmentManagerLicenseAssignment
    extends DynamicData
{

    @XmlElement(required = true)
    protected String entityId;
    protected String scope;
    protected String entityDisplayName;
    @XmlElement(required = true)
    protected LicenseManagerLicenseInfo assignedLicense;
    protected List<KeyAnyValue> properties;

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the entityDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityDisplayName() {
        return entityDisplayName;
    }

    /**
     * Sets the value of the entityDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityDisplayName(String value) {
        this.entityDisplayName = value;
    }

    /**
     * Gets the value of the assignedLicense property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseManagerLicenseInfo }
     *     
     */
    public LicenseManagerLicenseInfo getAssignedLicense() {
        return assignedLicense;
    }

    /**
     * Sets the value of the assignedLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseManagerLicenseInfo }
     *     
     */
    public void setAssignedLicense(LicenseManagerLicenseInfo value) {
        this.assignedLicense = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyAnyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the properties property.
     */
    public List<KeyAnyValue> getProperties() {
        if (properties == null) {
            properties = new ArrayList<>();
        }
        return this.properties;
    }

}
