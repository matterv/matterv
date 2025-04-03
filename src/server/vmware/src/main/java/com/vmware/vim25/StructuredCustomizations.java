
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredCustomizations complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StructuredCustomizations">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostProfilesEntityCustomizations">
 *       <sequence>
 *         <element name="entity" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="customizations" type="{urn:internalvim25}AnswerFile" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredCustomizations", propOrder = {
    "entity",
    "customizations"
})
public class StructuredCustomizations
    extends HostProfilesEntityCustomizations
{

    @XmlElement(required = true)
    protected ManagedObjectReference entity;
    protected AnswerFile customizations;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setEntity(ManagedObjectReference value) {
        this.entity = value;
    }

    /**
     * Gets the value of the customizations property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerFile }
     *     
     */
    public AnswerFile getCustomizations() {
        return customizations;
    }

    /**
     * Sets the value of the customizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerFile }
     *     
     */
    public void setCustomizations(AnswerFile value) {
        this.customizations = value;
    }

}
