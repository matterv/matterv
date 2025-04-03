
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VimVasaProviderStatePerArray complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VimVasaProviderStatePerArray">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="priority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="arrayId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VimVasaProviderStatePerArray", propOrder = {
    "priority",
    "arrayId",
    "active"
})
public class VimVasaProviderStatePerArray
    extends DynamicData
{

    protected int priority;
    @XmlElement(required = true)
    protected String arrayId;
    protected boolean active;

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the arrayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrayId() {
        return arrayId;
    }

    /**
     * Sets the value of the arrayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrayId(String value) {
        this.arrayId = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

}
