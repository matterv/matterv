
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesiredSoftwareSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DesiredSoftwareSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="baseImageSpec" type="{urn:internalvim25}DesiredSoftwareSpecBaseImageSpec"/>
 *         <element name="vendorAddOnSpec" type="{urn:internalvim25}DesiredSoftwareSpecVendorAddOnSpec" minOccurs="0"/>
 *         <element name="components" type="{urn:internalvim25}DesiredSoftwareSpecComponentSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="removedComponents" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesiredSoftwareSpec", propOrder = {
    "baseImageSpec",
    "vendorAddOnSpec",
    "components",
    "removedComponents"
})
public class DesiredSoftwareSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected DesiredSoftwareSpecBaseImageSpec baseImageSpec;
    protected DesiredSoftwareSpecVendorAddOnSpec vendorAddOnSpec;
    protected List<DesiredSoftwareSpecComponentSpec> components;
    protected List<String> removedComponents;

    /**
     * Gets the value of the baseImageSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DesiredSoftwareSpecBaseImageSpec }
     *     
     */
    public DesiredSoftwareSpecBaseImageSpec getBaseImageSpec() {
        return baseImageSpec;
    }

    /**
     * Sets the value of the baseImageSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesiredSoftwareSpecBaseImageSpec }
     *     
     */
    public void setBaseImageSpec(DesiredSoftwareSpecBaseImageSpec value) {
        this.baseImageSpec = value;
    }

    /**
     * Gets the value of the vendorAddOnSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DesiredSoftwareSpecVendorAddOnSpec }
     *     
     */
    public DesiredSoftwareSpecVendorAddOnSpec getVendorAddOnSpec() {
        return vendorAddOnSpec;
    }

    /**
     * Sets the value of the vendorAddOnSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesiredSoftwareSpecVendorAddOnSpec }
     *     
     */
    public void setVendorAddOnSpec(DesiredSoftwareSpecVendorAddOnSpec value) {
        this.vendorAddOnSpec = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesiredSoftwareSpecComponentSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the components property.
     */
    public List<DesiredSoftwareSpecComponentSpec> getComponents() {
        if (components == null) {
            components = new ArrayList<>();
        }
        return this.components;
    }

    /**
     * Gets the value of the removedComponents property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedComponents property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemovedComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the removedComponents property.
     */
    public List<String> getRemovedComponents() {
        if (removedComponents == null) {
            removedComponents = new ArrayList<>();
        }
        return this.removedComponents;
    }

}
