
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FcoeConfigFcoeSpecification complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FcoeConfigFcoeSpecification">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="underlyingPnic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="priorityClass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="sourceMac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vlanRange" type="{urn:internalvim25}FcoeConfigVlanRange" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FcoeConfigFcoeSpecification", propOrder = {
    "underlyingPnic",
    "priorityClass",
    "sourceMac",
    "vlanRange"
})
public class FcoeConfigFcoeSpecification
    extends DynamicData
{

    @XmlElement(required = true)
    protected String underlyingPnic;
    protected Integer priorityClass;
    protected String sourceMac;
    protected List<FcoeConfigVlanRange> vlanRange;

    /**
     * Gets the value of the underlyingPnic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderlyingPnic() {
        return underlyingPnic;
    }

    /**
     * Sets the value of the underlyingPnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderlyingPnic(String value) {
        this.underlyingPnic = value;
    }

    /**
     * Gets the value of the priorityClass property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriorityClass() {
        return priorityClass;
    }

    /**
     * Sets the value of the priorityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriorityClass(Integer value) {
        this.priorityClass = value;
    }

    /**
     * Gets the value of the sourceMac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceMac() {
        return sourceMac;
    }

    /**
     * Sets the value of the sourceMac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceMac(String value) {
        this.sourceMac = value;
    }

    /**
     * Gets the value of the vlanRange property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vlanRange property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVlanRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FcoeConfigVlanRange }
     * </p>
     * 
     * 
     * @return
     *     The value of the vlanRange property.
     */
    public List<FcoeConfigVlanRange> getVlanRange() {
        if (vlanRange == null) {
            vlanRange = new ArrayList<>();
        }
        return this.vlanRange;
    }

}
