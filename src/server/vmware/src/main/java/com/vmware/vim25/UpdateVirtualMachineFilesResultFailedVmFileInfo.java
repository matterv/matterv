
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateVirtualMachineFilesResultFailedVmFileInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdateVirtualMachineFilesResultFailedVmFileInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vmFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fault" type="{urn:internalvim25}LocalizedMethodFault"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVirtualMachineFilesResultFailedVmFileInfo", propOrder = {
    "vmFile",
    "fault"
})
public class UpdateVirtualMachineFilesResultFailedVmFileInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String vmFile;
    @XmlElement(required = true)
    protected LocalizedMethodFault fault;

    /**
     * Gets the value of the vmFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmFile() {
        return vmFile;
    }

    /**
     * Sets the value of the vmFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmFile(String value) {
        this.vmFile = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setFault(LocalizedMethodFault value) {
        this.fault = value;
    }

}
