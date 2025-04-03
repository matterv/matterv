
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskDeltaDiskFormatsSupported complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskDeltaDiskFormatsSupported">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="datastoreType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deltaDiskFormat" type="{urn:internalvim25}ChoiceOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskDeltaDiskFormatsSupported", propOrder = {
    "datastoreType",
    "deltaDiskFormat"
})
public class VirtualDiskDeltaDiskFormatsSupported
    extends DynamicData
{

    @XmlElement(required = true)
    protected String datastoreType;
    @XmlElement(required = true)
    protected ChoiceOption deltaDiskFormat;

    /**
     * Gets the value of the datastoreType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    /**
     * Sets the value of the datastoreType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatastoreType(String value) {
        this.datastoreType = value;
    }

    /**
     * Gets the value of the deltaDiskFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ChoiceOption }
     *     
     */
    public ChoiceOption getDeltaDiskFormat() {
        return deltaDiskFormat;
    }

    /**
     * Sets the value of the deltaDiskFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoiceOption }
     *     
     */
    public void setDeltaDiskFormat(ChoiceOption value) {
        this.deltaDiskFormat = value;
    }

}
