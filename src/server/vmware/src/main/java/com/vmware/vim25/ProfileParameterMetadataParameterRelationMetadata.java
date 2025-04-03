
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileParameterMetadataParameterRelationMetadata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProfileParameterMetadataParameterRelationMetadata">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="relationTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="values" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="path" type="{urn:internalvim25}ProfilePropertyPath" minOccurs="0"/>
 *         <element name="minCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileParameterMetadataParameterRelationMetadata", propOrder = {
    "relationTypes",
    "values",
    "path",
    "minCount",
    "maxCount"
})
public class ProfileParameterMetadataParameterRelationMetadata
    extends DynamicData
{

    protected List<String> relationTypes;
    protected List<Object> values;
    protected ProfilePropertyPath path;
    protected int minCount;
    protected int maxCount;

    /**
     * Gets the value of the relationTypes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationTypes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRelationTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the relationTypes property.
     */
    public List<String> getRelationTypes() {
        if (relationTypes == null) {
            relationTypes = new ArrayList<>();
        }
        return this.relationTypes;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * </p>
     * 
     * 
     * @return
     *     The value of the values property.
     */
    public List<Object> getValues() {
        if (values == null) {
            values = new ArrayList<>();
        }
        return this.values;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilePropertyPath }
     *     
     */
    public ProfilePropertyPath getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilePropertyPath }
     *     
     */
    public void setPath(ProfilePropertyPath value) {
        this.path = value;
    }

    /**
     * Gets the value of the minCount property.
     * 
     */
    public int getMinCount() {
        return minCount;
    }

    /**
     * Sets the value of the minCount property.
     * 
     */
    public void setMinCount(int value) {
        this.minCount = value;
    }

    /**
     * Gets the value of the maxCount property.
     * 
     */
    public int getMaxCount() {
        return maxCount;
    }

    /**
     * Sets the value of the maxCount property.
     * 
     */
    public void setMaxCount(int value) {
        this.maxCount = value;
    }

}
