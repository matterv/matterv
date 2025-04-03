
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskInfoFilterSpecFilterTaskResults complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaskInfoFilterSpecFilterTaskResults">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="removeAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="descriptionIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="filterIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskInfoFilterSpecFilterTaskResults", propOrder = {
    "removeAll",
    "descriptionIds",
    "filterIn"
})
public class TaskInfoFilterSpecFilterTaskResults
    extends DynamicData
{

    protected Boolean removeAll;
    protected List<String> descriptionIds;
    protected Boolean filterIn;

    /**
     * Gets the value of the removeAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveAll() {
        return removeAll;
    }

    /**
     * Sets the value of the removeAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveAll(Boolean value) {
        this.removeAll = value;
    }

    /**
     * Gets the value of the descriptionIds property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionIds property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescriptionIds().add(newItem);
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
     *     The value of the descriptionIds property.
     */
    public List<String> getDescriptionIds() {
        if (descriptionIds == null) {
            descriptionIds = new ArrayList<>();
        }
        return this.descriptionIds;
    }

    /**
     * Gets the value of the filterIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterIn() {
        return filterIn;
    }

    /**
     * Sets the value of the filterIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterIn(Boolean value) {
        this.filterIn = value;
    }

}
