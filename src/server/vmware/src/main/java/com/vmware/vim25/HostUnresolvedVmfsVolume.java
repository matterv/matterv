
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostUnresolvedVmfsVolume complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostUnresolvedVmfsVolume">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="extent" type="{urn:internalvim25}HostUnresolvedVmfsExtent" maxOccurs="unbounded"/>
 *         <element name="vmfsLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vmfsUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="totalBlocks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="resolveStatus" type="{urn:internalvim25}HostUnresolvedVmfsVolumeResolveStatus"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostUnresolvedVmfsVolume", propOrder = {
    "extent",
    "vmfsLabel",
    "vmfsUuid",
    "totalBlocks",
    "resolveStatus"
})
public class HostUnresolvedVmfsVolume
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<HostUnresolvedVmfsExtent> extent;
    @XmlElement(required = true)
    protected String vmfsLabel;
    @XmlElement(required = true)
    protected String vmfsUuid;
    protected int totalBlocks;
    @XmlElement(required = true)
    protected HostUnresolvedVmfsVolumeResolveStatus resolveStatus;

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
     * {@link HostUnresolvedVmfsExtent }
     * </p>
     * 
     * 
     * @return
     *     The value of the extent property.
     */
    public List<HostUnresolvedVmfsExtent> getExtent() {
        if (extent == null) {
            extent = new ArrayList<>();
        }
        return this.extent;
    }

    /**
     * Gets the value of the vmfsLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmfsLabel() {
        return vmfsLabel;
    }

    /**
     * Sets the value of the vmfsLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmfsLabel(String value) {
        this.vmfsLabel = value;
    }

    /**
     * Gets the value of the vmfsUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmfsUuid() {
        return vmfsUuid;
    }

    /**
     * Sets the value of the vmfsUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmfsUuid(String value) {
        this.vmfsUuid = value;
    }

    /**
     * Gets the value of the totalBlocks property.
     * 
     */
    public int getTotalBlocks() {
        return totalBlocks;
    }

    /**
     * Sets the value of the totalBlocks property.
     * 
     */
    public void setTotalBlocks(int value) {
        this.totalBlocks = value;
    }

    /**
     * Gets the value of the resolveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HostUnresolvedVmfsVolumeResolveStatus }
     *     
     */
    public HostUnresolvedVmfsVolumeResolveStatus getResolveStatus() {
        return resolveStatus;
    }

    /**
     * Sets the value of the resolveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostUnresolvedVmfsVolumeResolveStatus }
     *     
     */
    public void setResolveStatus(HostUnresolvedVmfsVolumeResolveStatus value) {
        this.resolveStatus = value;
    }

}
