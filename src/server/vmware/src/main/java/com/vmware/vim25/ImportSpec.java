
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="entityConfig" type="{urn:internalvim25}VAppEntityConfigInfo" minOccurs="0"/>
 *         <element name="instantiationOst" type="{urn:internalvim25}OvfConsumerOstNode" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportSpec", propOrder = {
    "entityConfig",
    "instantiationOst"
})
@XmlSeeAlso({
    VirtualAppImportSpec.class,
    VirtualMachineImportSpec.class
})
public class ImportSpec
    extends DynamicData
{

    protected VAppEntityConfigInfo entityConfig;
    protected OvfConsumerOstNode instantiationOst;

    /**
     * Gets the value of the entityConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VAppEntityConfigInfo }
     *     
     */
    public VAppEntityConfigInfo getEntityConfig() {
        return entityConfig;
    }

    /**
     * Sets the value of the entityConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VAppEntityConfigInfo }
     *     
     */
    public void setEntityConfig(VAppEntityConfigInfo value) {
        this.entityConfig = value;
    }

    /**
     * Gets the value of the instantiationOst property.
     * 
     * @return
     *     possible object is
     *     {@link OvfConsumerOstNode }
     *     
     */
    public OvfConsumerOstNode getInstantiationOst() {
        return instantiationOst;
    }

    /**
     * Sets the value of the instantiationOst property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvfConsumerOstNode }
     *     
     */
    public void setInstantiationOst(OvfConsumerOstNode value) {
        this.instantiationOst = value;
    }

}
