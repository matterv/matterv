
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmfsDatastoreExpandSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmfsDatastoreExpandSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmfsDatastoreSpec">
 *       <sequence>
 *         <element name="partition" type="{urn:internalvim25}HostDiskPartitionSpec"/>
 *         <element name="extent" type="{urn:internalvim25}HostScsiDiskPartition"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreExpandSpec", propOrder = {
    "partition",
    "extent"
})
public class VmfsDatastoreExpandSpec
    extends VmfsDatastoreSpec
{

    @XmlElement(required = true)
    protected HostDiskPartitionSpec partition;
    @XmlElement(required = true)
    protected HostScsiDiskPartition extent;

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link HostDiskPartitionSpec }
     *     
     */
    public HostDiskPartitionSpec getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDiskPartitionSpec }
     *     
     */
    public void setPartition(HostDiskPartitionSpec value) {
        this.partition = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link HostScsiDiskPartition }
     *     
     */
    public HostScsiDiskPartition getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostScsiDiskPartition }
     *     
     */
    public void setExtent(HostScsiDiskPartition value) {
        this.extent = value;
    }

}
