
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostScsiDiskPartition complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostScsiDiskPartition">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="diskName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="partition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostScsiDiskPartition", propOrder = {
    "diskName",
    "partition"
})
public class HostScsiDiskPartition
    extends DynamicData
{

    @XmlElement(required = true)
    protected String diskName;
    protected int partition;

    /**
     * Gets the value of the diskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskName() {
        return diskName;
    }

    /**
     * Sets the value of the diskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskName(String value) {
        this.diskName = value;
    }

    /**
     * Gets the value of the partition property.
     * 
     */
    public int getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     */
    public void setPartition(int value) {
        this.partition = value;
    }

}
