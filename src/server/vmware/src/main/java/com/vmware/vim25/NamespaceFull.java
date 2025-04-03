
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamespaceFull complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NamespaceFull">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="currentMaxSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="requiredSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamespaceFull", propOrder = {
    "name",
    "currentMaxSize",
    "requiredSize"
})
public class NamespaceFull
    extends VimFault
{

    @XmlElement(required = true)
    protected String name;
    protected long currentMaxSize;
    protected Long requiredSize;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the currentMaxSize property.
     * 
     */
    public long getCurrentMaxSize() {
        return currentMaxSize;
    }

    /**
     * Sets the value of the currentMaxSize property.
     * 
     */
    public void setCurrentMaxSize(long value) {
        this.currentMaxSize = value;
    }

    /**
     * Gets the value of the requiredSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequiredSize() {
        return requiredSize;
    }

    /**
     * Sets the value of the requiredSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequiredSize(Long value) {
        this.requiredSize = value;
    }

}
