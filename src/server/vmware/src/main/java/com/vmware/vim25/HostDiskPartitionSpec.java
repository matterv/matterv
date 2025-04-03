
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDiskPartitionSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDiskPartitionSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="partitionFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="chs" type="{urn:internalvim25}HostDiskDimensionsChs" minOccurs="0"/>
 *         <element name="totalSectors" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="partition" type="{urn:internalvim25}HostDiskPartitionAttributes" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDiskPartitionSpec", propOrder = {
    "partitionFormat",
    "chs",
    "totalSectors",
    "partition"
})
public class HostDiskPartitionSpec
    extends DynamicData
{

    protected String partitionFormat;
    protected HostDiskDimensionsChs chs;
    protected Long totalSectors;
    protected List<HostDiskPartitionAttributes> partition;

    /**
     * Gets the value of the partitionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionFormat() {
        return partitionFormat;
    }

    /**
     * Sets the value of the partitionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionFormat(String value) {
        this.partitionFormat = value;
    }

    /**
     * Gets the value of the chs property.
     * 
     * @return
     *     possible object is
     *     {@link HostDiskDimensionsChs }
     *     
     */
    public HostDiskDimensionsChs getChs() {
        return chs;
    }

    /**
     * Sets the value of the chs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDiskDimensionsChs }
     *     
     */
    public void setChs(HostDiskDimensionsChs value) {
        this.chs = value;
    }

    /**
     * Gets the value of the totalSectors property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalSectors() {
        return totalSectors;
    }

    /**
     * Sets the value of the totalSectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalSectors(Long value) {
        this.totalSectors = value;
    }

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
     * {@link HostDiskPartitionAttributes }
     * </p>
     * 
     * 
     * @return
     *     The value of the partition property.
     */
    public List<HostDiskPartitionAttributes> getPartition() {
        if (partition == null) {
            partition = new ArrayList<>();
        }
        return this.partition;
    }

}
