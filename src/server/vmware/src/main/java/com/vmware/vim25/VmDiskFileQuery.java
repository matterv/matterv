
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmDiskFileQuery complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmDiskFileQuery">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}FileQuery">
 *       <sequence>
 *         <element name="filter" type="{urn:internalvim25}VmDiskFileQueryFilter" minOccurs="0"/>
 *         <element name="details" type="{urn:internalvim25}VmDiskFileQueryFlags" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDiskFileQuery", propOrder = {
    "filter",
    "details"
})
public class VmDiskFileQuery
    extends FileQuery
{

    protected VmDiskFileQueryFilter filter;
    protected VmDiskFileQueryFlags details;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link VmDiskFileQueryFilter }
     *     
     */
    public VmDiskFileQueryFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmDiskFileQueryFilter }
     *     
     */
    public void setFilter(VmDiskFileQueryFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link VmDiskFileQueryFlags }
     *     
     */
    public VmDiskFileQueryFlags getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmDiskFileQueryFlags }
     *     
     */
    public void setDetails(VmDiskFileQueryFlags value) {
        this.details = value;
    }

}
