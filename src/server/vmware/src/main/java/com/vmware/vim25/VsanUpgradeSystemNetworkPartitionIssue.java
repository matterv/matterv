
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanUpgradeSystemNetworkPartitionIssue complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanUpgradeSystemNetworkPartitionIssue">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VsanUpgradeSystemPreflightCheckIssue">
 *       <sequence>
 *         <element name="partitions" type="{urn:internalvim25}VsanUpgradeSystemNetworkPartitionInfo" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemNetworkPartitionIssue", propOrder = {
    "partitions"
})
public class VsanUpgradeSystemNetworkPartitionIssue
    extends VsanUpgradeSystemPreflightCheckIssue
{

    @XmlElement(required = true)
    protected List<VsanUpgradeSystemNetworkPartitionInfo> partitions;

    /**
     * Gets the value of the partitions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partitions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPartitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VsanUpgradeSystemNetworkPartitionInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the partitions property.
     */
    public List<VsanUpgradeSystemNetworkPartitionInfo> getPartitions() {
        if (partitions == null) {
            partitions = new ArrayList<>();
        }
        return this.partitions;
    }

}
