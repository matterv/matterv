
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectUpdate complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObjectUpdate">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="kind" type="{urn:internalvim25}ObjectUpdateKind"/>
 *         <element name="obj" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="changeSet" type="{urn:internalvim25}PropertyChange" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="missingSet" type="{urn:internalvim25}MissingProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectUpdate", propOrder = {
    "kind",
    "obj",
    "changeSet",
    "missingSet"
})
public class ObjectUpdate
    extends DynamicData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ObjectUpdateKind kind;
    @XmlElement(required = true)
    protected ManagedObjectReference obj;
    protected List<PropertyChange> changeSet;
    protected List<MissingProperty> missingSet;

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectUpdateKind }
     *     
     */
    public ObjectUpdateKind getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectUpdateKind }
     *     
     */
    public void setKind(ObjectUpdateKind value) {
        this.kind = value;
    }

    /**
     * Gets the value of the obj property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getObj() {
        return obj;
    }

    /**
     * Sets the value of the obj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setObj(ManagedObjectReference value) {
        this.obj = value;
    }

    /**
     * Gets the value of the changeSet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeSet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChangeSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyChange }
     * </p>
     * 
     * 
     * @return
     *     The value of the changeSet property.
     */
    public List<PropertyChange> getChangeSet() {
        if (changeSet == null) {
            changeSet = new ArrayList<>();
        }
        return this.changeSet;
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
     * {@link MissingProperty }
     * </p>
     * 
     * 
     * @return
     *     The value of the missingSet property.
     */
    public List<MissingProperty> getMissingSet() {
        if (missingSet == null) {
            missingSet = new ArrayList<>();
        }
        return this.missingSet;
    }

}
