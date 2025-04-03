
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VStorageObjectAssociationsVmDiskAssociations complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VStorageObjectAssociationsVmDiskAssociations">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vmId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="diskKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectAssociationsVmDiskAssociations", propOrder = {
    "vmId",
    "diskKey"
})
public class VStorageObjectAssociationsVmDiskAssociations
    extends DynamicData
{

    @XmlElement(required = true)
    protected String vmId;
    protected int diskKey;

    /**
     * Gets the value of the vmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmId() {
        return vmId;
    }

    /**
     * Sets the value of the vmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmId(String value) {
        this.vmId = value;
    }

    /**
     * Gets the value of the diskKey property.
     * 
     */
    public int getDiskKey() {
        return diskKey;
    }

    /**
     * Sets the value of the diskKey property.
     * 
     */
    public void setDiskKey(int value) {
        this.diskKey = value;
    }

}
