
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskPartitionedRawDiskVer2BackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskPartitionedRawDiskVer2BackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDiskRawDiskVer2BackingInfo">
 *       <sequence>
 *         <element name="partition" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskPartitionedRawDiskVer2BackingInfo", propOrder = {
    "partition"
})
public class VirtualDiskPartitionedRawDiskVer2BackingInfo
    extends VirtualDiskRawDiskVer2BackingInfo
{

    @XmlElement(type = Integer.class)
    protected List<Integer> partition;

    /**
     * Gets the value of the partition property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partition property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPartition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the partition property.
     */
    public List<Integer> getPartition() {
        if (partition == null) {
            partition = new ArrayList<>();
        }
        return this.partition;
    }

}
