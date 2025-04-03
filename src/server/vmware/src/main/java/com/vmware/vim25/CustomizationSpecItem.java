
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationSpecItem complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationSpecItem">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="info" type="{urn:internalvim25}CustomizationSpecInfo"/>
 *         <element name="spec" type="{urn:internalvim25}CustomizationSpec"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSpecItem", propOrder = {
    "info",
    "spec"
})
public class CustomizationSpecItem
    extends DynamicData
{

    @XmlElement(required = true)
    protected CustomizationSpecInfo info;
    @XmlElement(required = true)
    protected CustomizationSpec spec;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationSpecInfo }
     *     
     */
    public CustomizationSpecInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationSpecInfo }
     *     
     */
    public void setInfo(CustomizationSpecInfo value) {
        this.info = value;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationSpec }
     *     
     */
    public CustomizationSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationSpec }
     *     
     */
    public void setSpec(CustomizationSpec value) {
        this.spec = value;
    }

}
