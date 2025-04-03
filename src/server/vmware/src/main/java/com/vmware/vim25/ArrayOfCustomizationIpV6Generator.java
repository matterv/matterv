
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCustomizationIpV6Generator complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCustomizationIpV6Generator">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomizationIpV6Generator" type="{urn:internalvim25}CustomizationIpV6Generator" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomizationIpV6Generator", propOrder = {
    "customizationIpV6Generator"
})
public class ArrayOfCustomizationIpV6Generator {

    @XmlElement(name = "CustomizationIpV6Generator")
    protected List<CustomizationIpV6Generator> customizationIpV6Generator;

    /**
     * Gets the value of the customizationIpV6Generator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customizationIpV6Generator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCustomizationIpV6Generator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomizationIpV6Generator }
     * </p>
     * 
     * 
     * @return
     *     The value of the customizationIpV6Generator property.
     */
    public List<CustomizationIpV6Generator> getCustomizationIpV6Generator() {
        if (customizationIpV6Generator == null) {
            customizationIpV6Generator = new ArrayList<>();
        }
        return this.customizationIpV6Generator;
    }

}
