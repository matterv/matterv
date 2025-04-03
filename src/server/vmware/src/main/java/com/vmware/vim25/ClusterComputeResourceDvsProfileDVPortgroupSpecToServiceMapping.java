
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dvPortgroupSpec" type="{urn:internalvim25}DVPortgroupConfigSpec" minOccurs="0"/>
 *         <element name="dvPortgroup" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping", propOrder = {
    "dvPortgroupSpec",
    "dvPortgroup",
    "service"
})
public class ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping
    extends DynamicData
{

    protected DVPortgroupConfigSpec dvPortgroupSpec;
    protected ManagedObjectReference dvPortgroup;
    @XmlElement(required = true)
    protected String service;

    /**
     * Gets the value of the dvPortgroupSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DVPortgroupConfigSpec }
     *     
     */
    public DVPortgroupConfigSpec getDvPortgroupSpec() {
        return dvPortgroupSpec;
    }

    /**
     * Sets the value of the dvPortgroupSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPortgroupConfigSpec }
     *     
     */
    public void setDvPortgroupSpec(DVPortgroupConfigSpec value) {
        this.dvPortgroupSpec = value;
    }

    /**
     * Gets the value of the dvPortgroup property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDvPortgroup() {
        return dvPortgroup;
    }

    /**
     * Sets the value of the dvPortgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDvPortgroup(ManagedObjectReference value) {
        this.dvPortgroup = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

}
