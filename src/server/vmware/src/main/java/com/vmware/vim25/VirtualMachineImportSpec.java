
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineImportSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineImportSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ImportSpec">
 *       <sequence>
 *         <element name="configSpec" type="{urn:internalvim25}VirtualMachineConfigSpec"/>
 *         <element name="resPoolEntity" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineImportSpec", propOrder = {
    "configSpec",
    "resPoolEntity"
})
public class VirtualMachineImportSpec
    extends ImportSpec
{

    @XmlElement(required = true)
    protected VirtualMachineConfigSpec configSpec;
    protected ManagedObjectReference resPoolEntity;

    /**
     * Gets the value of the configSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineConfigSpec }
     *     
     */
    public VirtualMachineConfigSpec getConfigSpec() {
        return configSpec;
    }

    /**
     * Sets the value of the configSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineConfigSpec }
     *     
     */
    public void setConfigSpec(VirtualMachineConfigSpec value) {
        this.configSpec = value;
    }

    /**
     * Gets the value of the resPoolEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getResPoolEntity() {
        return resPoolEntity;
    }

    /**
     * Sets the value of the resPoolEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setResPoolEntity(ManagedObjectReference value) {
        this.resPoolEntity = value;
    }

}
