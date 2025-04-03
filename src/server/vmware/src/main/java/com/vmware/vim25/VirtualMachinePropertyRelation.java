
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachinePropertyRelation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachinePropertyRelation">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{urn:internalvim25}DynamicProperty"/>
 *         <element name="relations" type="{urn:internalvim25}DynamicProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachinePropertyRelation", propOrder = {
    "key",
    "relations"
})
public class VirtualMachinePropertyRelation
    extends DynamicData
{

    @XmlElement(required = true)
    protected DynamicProperty key;
    protected List<DynamicProperty> relations;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicProperty }
     *     
     */
    public DynamicProperty getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicProperty }
     *     
     */
    public void setKey(DynamicProperty value) {
        this.key = value;
    }

    /**
     * Gets the value of the relations property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relations property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRelations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicProperty }
     * </p>
     * 
     * 
     * @return
     *     The value of the relations property.
     */
    public List<DynamicProperty> getRelations() {
        if (relations == null) {
            relations = new ArrayList<>();
        }
        return this.relations;
    }

}
