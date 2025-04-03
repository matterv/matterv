
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineMetadataManagerVmMetadataResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineMetadataManagerVmMetadataResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vmMetadata" type="{urn:internalvim25}VirtualMachineMetadataManagerVmMetadata"/>
 *         <element name="error" type="{urn:internalvim25}LocalizedMethodFault" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineMetadataManagerVmMetadataResult", propOrder = {
    "vmMetadata",
    "error"
})
public class VirtualMachineMetadataManagerVmMetadataResult
    extends DynamicData
{

    @XmlElement(required = true)
    protected VirtualMachineMetadataManagerVmMetadata vmMetadata;
    protected LocalizedMethodFault error;

    /**
     * Gets the value of the vmMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineMetadataManagerVmMetadata }
     *     
     */
    public VirtualMachineMetadataManagerVmMetadata getVmMetadata() {
        return vmMetadata;
    }

    /**
     * Sets the value of the vmMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineMetadataManagerVmMetadata }
     *     
     */
    public void setVmMetadata(VirtualMachineMetadataManagerVmMetadata value) {
        this.vmMetadata = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setError(LocalizedMethodFault value) {
        this.error = value;
    }

}
