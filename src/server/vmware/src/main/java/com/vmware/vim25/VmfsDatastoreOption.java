
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmfsDatastoreOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmfsDatastoreOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="info" type="{urn:internalvim25}VmfsDatastoreBaseOption"/>
 *         <element name="spec" type="{urn:internalvim25}VmfsDatastoreSpec"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreOption", propOrder = {
    "info",
    "spec"
})
public class VmfsDatastoreOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected VmfsDatastoreBaseOption info;
    @XmlElement(required = true)
    protected VmfsDatastoreSpec spec;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link VmfsDatastoreBaseOption }
     *     
     */
    public VmfsDatastoreBaseOption getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmfsDatastoreBaseOption }
     *     
     */
    public void setInfo(VmfsDatastoreBaseOption value) {
        this.info = value;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link VmfsDatastoreSpec }
     *     
     */
    public VmfsDatastoreSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmfsDatastoreSpec }
     *     
     */
    public void setSpec(VmfsDatastoreSpec value) {
        this.spec = value;
    }

}
