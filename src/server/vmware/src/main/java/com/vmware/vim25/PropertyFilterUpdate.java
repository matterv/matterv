
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyFilterUpdate complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PropertyFilterUpdate">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="filter" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="objectSet" type="{urn:internalvim25}ObjectUpdate" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="missingSet" type="{urn:internalvim25}MissingObject" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyFilterUpdate", propOrder = {
    "filter",
    "objectSet",
    "missingSet"
})
public class PropertyFilterUpdate
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference filter;
    protected List<ObjectUpdate> objectSet;
    protected List<MissingObject> missingSet;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setFilter(ManagedObjectReference value) {
        this.filter = value;
    }

    /**
     * Gets the value of the objectSet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectSet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getObjectSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectUpdate }
     * </p>
     * 
     * 
     * @return
     *     The value of the objectSet property.
     */
    public List<ObjectUpdate> getObjectSet() {
        if (objectSet == null) {
            objectSet = new ArrayList<>();
        }
        return this.objectSet;
    }

    /**
     * Gets the value of the missingSet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingSet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMissingSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissingObject }
     * </p>
     * 
     * 
     * @return
     *     The value of the missingSet property.
     */
    public List<MissingObject> getMissingSet() {
        if (missingSet == null) {
            missingSet = new ArrayList<>();
        }
        return this.missingSet;
    }

}
