
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmfsDatastoreBaseOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmfsDatastoreBaseOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="layout" type="{urn:internalvim25}HostDiskPartitionLayout"/>
 *         <element name="partitionFormatChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreBaseOption", propOrder = {
    "layout",
    "partitionFormatChange"
})
@XmlSeeAlso({
    VmfsDatastoreSingleExtentOption.class,
    VmfsDatastoreMultipleExtentOption.class
})
public class VmfsDatastoreBaseOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected HostDiskPartitionLayout layout;
    protected Boolean partitionFormatChange;

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link HostDiskPartitionLayout }
     *     
     */
    public HostDiskPartitionLayout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDiskPartitionLayout }
     *     
     */
    public void setLayout(HostDiskPartitionLayout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the partitionFormatChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartitionFormatChange() {
        return partitionFormatChange;
    }

    /**
     * Sets the value of the partitionFormatChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartitionFormatChange(Boolean value) {
        this.partitionFormatChange = value;
    }

}
