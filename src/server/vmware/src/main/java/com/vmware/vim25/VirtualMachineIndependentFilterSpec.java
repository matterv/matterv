
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineIndependentFilterSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineIndependentFilterSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineBaseIndependentFilterSpec">
 *       <sequence>
 *         <element name="filterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="filterClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="filterCapabilities" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineIndependentFilterSpec", propOrder = {
    "filterName",
    "filterClass",
    "filterCapabilities"
})
public class VirtualMachineIndependentFilterSpec
    extends VirtualMachineBaseIndependentFilterSpec
{

    @XmlElement(required = true)
    protected String filterName;
    protected String filterClass;
    protected List<KeyValue> filterCapabilities;

    /**
     * Gets the value of the filterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * Sets the value of the filterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName(String value) {
        this.filterName = value;
    }

    /**
     * Gets the value of the filterClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterClass() {
        return filterClass;
    }

    /**
     * Sets the value of the filterClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterClass(String value) {
        this.filterClass = value;
    }

    /**
     * Gets the value of the filterCapabilities property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterCapabilities property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFilterCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the filterCapabilities property.
     */
    public List<KeyValue> getFilterCapabilities() {
        if (filterCapabilities == null) {
            filterCapabilities = new ArrayList<>();
        }
        return this.filterCapabilities;
    }

}
