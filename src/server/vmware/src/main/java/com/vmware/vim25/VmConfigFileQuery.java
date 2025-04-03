
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmConfigFileQuery complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmConfigFileQuery">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}FileQuery">
 *       <sequence>
 *         <element name="filter" type="{urn:internalvim25}VmConfigFileQueryFilter" minOccurs="0"/>
 *         <element name="details" type="{urn:internalvim25}VmConfigFileQueryFlags" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmConfigFileQuery", propOrder = {
    "filter",
    "details"
})
@XmlSeeAlso({
    TemplateConfigFileQuery.class
})
public class VmConfigFileQuery
    extends FileQuery
{

    protected VmConfigFileQueryFilter filter;
    protected VmConfigFileQueryFlags details;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link VmConfigFileQueryFilter }
     *     
     */
    public VmConfigFileQueryFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmConfigFileQueryFilter }
     *     
     */
    public void setFilter(VmConfigFileQueryFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link VmConfigFileQueryFlags }
     *     
     */
    public VmConfigFileQueryFlags getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmConfigFileQueryFlags }
     *     
     */
    public void setDetails(VmConfigFileQueryFlags value) {
        this.details = value;
    }

}
