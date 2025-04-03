
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineMetadataManagerVmMetadataInput complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineMetadataManagerVmMetadataInput">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vmMetadata" type="{urn:internalvim25}VirtualMachineMetadataManagerVmMetadata"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineMetadataManagerVmMetadataInput", propOrder = {
    "operation",
    "vmMetadata"
})
public class VirtualMachineMetadataManagerVmMetadataInput
    extends DynamicData
{

    @XmlElement(required = true)
    protected String operation;
    @XmlElement(required = true)
    protected VirtualMachineMetadataManagerVmMetadata vmMetadata;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

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

}
