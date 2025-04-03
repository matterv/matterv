
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="diskType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="adapterType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskSpec", propOrder = {
    "diskType",
    "adapterType"
})
@XmlSeeAlso({
    FileBackedVirtualDiskSpec.class,
    DeviceBackedVirtualDiskSpec.class
})
public class VirtualDiskSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String diskType;
    @XmlElement(required = true)
    protected String adapterType;

    /**
     * Gets the value of the diskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskType() {
        return diskType;
    }

    /**
     * Sets the value of the diskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskType(String value) {
        this.diskType = value;
    }

    /**
     * Gets the value of the adapterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdapterType() {
        return adapterType;
    }

    /**
     * Sets the value of the adapterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdapterType(String value) {
        this.adapterType = value;
    }

}
