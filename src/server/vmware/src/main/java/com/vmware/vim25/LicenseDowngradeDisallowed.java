
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseDowngradeDisallowed complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseDowngradeDisallowed">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}NotEnoughLicenses">
 *       <sequence>
 *         <element name="edition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="features" type="{urn:internalvim25}KeyAnyValue" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseDowngradeDisallowed", propOrder = {
    "edition",
    "entityId",
    "features"
})
public class LicenseDowngradeDisallowed
    extends NotEnoughLicenses
{

    @XmlElement(required = true)
    protected String edition;
    @XmlElement(required = true)
    protected String entityId;
    @XmlElement(required = true)
    protected List<KeyAnyValue> features;

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

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
     * Gets the value of the features property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeatures().add(newItem);
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
     *     The value of the features property.
     */
    public List<KeyAnyValue> getFeatures() {
        if (features == null) {
            features = new ArrayList<>();
        }
        return this.features;
    }

}
