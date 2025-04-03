
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VAppCloneSpecResourceMap complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VAppCloneSpecResourceMap">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="source" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="parent" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="resourceSpec" type="{urn:internalvim25}ResourceConfigSpec" minOccurs="0"/>
 *         <element name="location" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppCloneSpecResourceMap", propOrder = {
    "source",
    "parent",
    "resourceSpec",
    "location"
})
public class VAppCloneSpecResourceMap
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference source;
    protected ManagedObjectReference parent;
    protected ResourceConfigSpec resourceSpec;
    protected ManagedObjectReference location;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setSource(ManagedObjectReference value) {
        this.source = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setParent(ManagedObjectReference value) {
        this.parent = value;
    }

    /**
     * Gets the value of the resourceSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceConfigSpec }
     *     
     */
    public ResourceConfigSpec getResourceSpec() {
        return resourceSpec;
    }

    /**
     * Sets the value of the resourceSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceConfigSpec }
     *     
     */
    public void setResourceSpec(ResourceConfigSpec value) {
        this.resourceSpec = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setLocation(ManagedObjectReference value) {
        this.location = value;
    }

}
