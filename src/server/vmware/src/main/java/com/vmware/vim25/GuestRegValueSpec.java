
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestRegValueSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestRegValueSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="name" type="{urn:internalvim25}GuestRegValueNameSpec"/>
 *         <element name="data" type="{urn:internalvim25}GuestRegValueDataSpec"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueSpec", propOrder = {
    "name",
    "data"
})
public class GuestRegValueSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected GuestRegValueNameSpec name;
    @XmlElement(required = true)
    protected GuestRegValueDataSpec data;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link GuestRegValueNameSpec }
     *     
     */
    public GuestRegValueNameSpec getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRegValueNameSpec }
     *     
     */
    public void setName(GuestRegValueNameSpec value) {
        this.name = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link GuestRegValueDataSpec }
     *     
     */
    public GuestRegValueDataSpec getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRegValueDataSpec }
     *     
     */
    public void setData(GuestRegValueDataSpec value) {
        this.data = value;
    }

}
