
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IscsiDependencyEntity complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IscsiDependencyEntity">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="pnicDevice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vnicDevice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vmhbaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscsiDependencyEntity", propOrder = {
    "pnicDevice",
    "vnicDevice",
    "vmhbaName"
})
public class IscsiDependencyEntity
    extends DynamicData
{

    @XmlElement(required = true)
    protected String pnicDevice;
    @XmlElement(required = true)
    protected String vnicDevice;
    @XmlElement(required = true)
    protected String vmhbaName;

    /**
     * Gets the value of the pnicDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnicDevice() {
        return pnicDevice;
    }

    /**
     * Sets the value of the pnicDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnicDevice(String value) {
        this.pnicDevice = value;
    }

    /**
     * Gets the value of the vnicDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVnicDevice() {
        return vnicDevice;
    }

    /**
     * Sets the value of the vnicDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVnicDevice(String value) {
        this.vnicDevice = value;
    }

    /**
     * Gets the value of the vmhbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmhbaName() {
        return vmhbaName;
    }

    /**
     * Sets the value of the vmhbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmhbaName(String value) {
        this.vmhbaName = value;
    }

}
