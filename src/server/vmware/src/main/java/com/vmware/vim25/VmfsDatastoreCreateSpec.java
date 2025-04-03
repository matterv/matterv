
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmfsDatastoreCreateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmfsDatastoreCreateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmfsDatastoreSpec">
 *       <sequence>
 *         <element name="partition" type="{urn:internalvim25}HostDiskPartitionSpec"/>
 *         <element name="vmfs" type="{urn:internalvim25}HostVmfsSpec"/>
 *         <element name="extent" type="{urn:internalvim25}HostScsiDiskPartition" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreCreateSpec", propOrder = {
    "partition",
    "vmfs",
    "extent"
})
public class VmfsDatastoreCreateSpec
    extends VmfsDatastoreSpec
{

    @XmlElement(required = true)
    protected HostDiskPartitionSpec partition;
    @XmlElement(required = true)
    protected HostVmfsSpec vmfs;
    protected List<HostScsiDiskPartition> extent;

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
     * Gets the value of the vmfs property.
     * 
     * @return
     *     possible object is
     *     {@link HostVmfsSpec }
     *     
     */
    public HostVmfsSpec getVmfs() {
        return vmfs;
    }

    /**
     * Sets the value of the vmfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVmfsSpec }
     *     
     */
    public void setVmfs(HostVmfsSpec value) {
        this.vmfs = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extent property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostScsiDiskPartition }
     * </p>
     * 
     * 
     * @return
     *     The value of the extent property.
     */
    public List<HostScsiDiskPartition> getExtent() {
        if (extent == null) {
            extent = new ArrayList<>();
        }
        return this.extent;
    }

}
