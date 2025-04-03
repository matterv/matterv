
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmfsDatastoreSingleExtentOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmfsDatastoreSingleExtentOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmfsDatastoreBaseOption">
 *       <sequence>
 *         <element name="vmfsExtent" type="{urn:internalvim25}HostDiskPartitionBlockRange"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreSingleExtentOption", propOrder = {
    "vmfsExtent"
})
@XmlSeeAlso({
    VmfsDatastoreAllExtentOption.class
})
public class VmfsDatastoreSingleExtentOption
    extends VmfsDatastoreBaseOption
{

    @XmlElement(required = true)
    protected HostDiskPartitionBlockRange vmfsExtent;

    /**
     * Gets the value of the vmfsExtent property.
     * 
     * @return
     *     possible object is
     *     {@link HostDiskPartitionBlockRange }
     *     
     */
    public HostDiskPartitionBlockRange getVmfsExtent() {
        return vmfsExtent;
    }

    /**
     * Sets the value of the vmfsExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDiskPartitionBlockRange }
     *     
     */
    public void setVmfsExtent(HostDiskPartitionBlockRange value) {
        this.vmfsExtent = value;
    }

}
