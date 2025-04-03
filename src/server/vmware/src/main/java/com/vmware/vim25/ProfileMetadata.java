
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileMetadata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProfileMetadata">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="profileTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="description" type="{urn:internalvim25}ExtendedDescription" minOccurs="0"/>
 *         <element name="sortSpec" type="{urn:internalvim25}ProfileMetadataProfileSortSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="profileCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profileComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="operationMessages" type="{urn:internalvim25}ProfileMetadataProfileOperationMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileMetadata", propOrder = {
    "key",
    "profileTypeName",
    "description",
    "sortSpec",
    "profileCategory",
    "profileComponent",
    "operationMessages"
})
public class ProfileMetadata
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    protected String profileTypeName;
    protected ExtendedDescription description;
    protected List<ProfileMetadataProfileSortSpec> sortSpec;
    protected String profileCategory;
    protected String profileComponent;
    protected List<ProfileMetadataProfileOperationMessage> operationMessages;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the profileTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileTypeName() {
        return profileTypeName;
    }

    /**
     * Sets the value of the profileTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileTypeName(String value) {
        this.profileTypeName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedDescription }
     *     
     */
    public ExtendedDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedDescription }
     *     
     */
    public void setDescription(ExtendedDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the sortSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSortSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileMetadataProfileSortSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the sortSpec property.
     */
    public List<ProfileMetadataProfileSortSpec> getSortSpec() {
        if (sortSpec == null) {
            sortSpec = new ArrayList<>();
        }
        return this.sortSpec;
    }

    /**
     * Gets the value of the profileCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileCategory() {
        return profileCategory;
    }

    /**
     * Sets the value of the profileCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileCategory(String value) {
        this.profileCategory = value;
    }

    /**
     * Gets the value of the profileComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileComponent() {
        return profileComponent;
    }

    /**
     * Sets the value of the profileComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileComponent(String value) {
        this.profileComponent = value;
    }

    /**
     * Gets the value of the operationMessages property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationMessages property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOperationMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileMetadataProfileOperationMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the operationMessages property.
     */
    public List<ProfileMetadataProfileOperationMessage> getOperationMessages() {
        if (operationMessages == null) {
            operationMessages = new ArrayList<>();
        }
        return this.operationMessages;
    }

}
