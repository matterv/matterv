
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualAppImportSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualAppImportSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ImportSpec">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vAppConfigSpec" type="{urn:internalvim25}VAppConfigSpec"/>
 *         <element name="resourcePoolSpec" type="{urn:internalvim25}ResourceConfigSpec"/>
 *         <element name="child" type="{urn:internalvim25}ImportSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualAppImportSpec", propOrder = {
    "name",
    "vAppConfigSpec",
    "resourcePoolSpec",
    "child"
})
public class VirtualAppImportSpec
    extends ImportSpec
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected VAppConfigSpec vAppConfigSpec;
    @XmlElement(required = true)
    protected ResourceConfigSpec resourcePoolSpec;
    protected List<ImportSpec> child;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the vAppConfigSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VAppConfigSpec }
     *     
     */
    public VAppConfigSpec getVAppConfigSpec() {
        return vAppConfigSpec;
    }

    /**
     * Sets the value of the vAppConfigSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VAppConfigSpec }
     *     
     */
    public void setVAppConfigSpec(VAppConfigSpec value) {
        this.vAppConfigSpec = value;
    }

    /**
     * Gets the value of the resourcePoolSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceConfigSpec }
     *     
     */
    public ResourceConfigSpec getResourcePoolSpec() {
        return resourcePoolSpec;
    }

    /**
     * Sets the value of the resourcePoolSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceConfigSpec }
     *     
     */
    public void setResourcePoolSpec(ResourceConfigSpec value) {
        this.resourcePoolSpec = value;
    }

    /**
     * Gets the value of the child property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the child property.
     */
    public List<ImportSpec> getChild() {
        if (child == null) {
            child = new ArrayList<>();
        }
        return this.child;
    }

}
