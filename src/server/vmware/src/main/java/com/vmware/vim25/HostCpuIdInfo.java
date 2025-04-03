
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostCpuIdInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostCpuIdInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ebx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ecx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="edx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCpuIdInfo", propOrder = {
    "level",
    "vendor",
    "eax",
    "ebx",
    "ecx",
    "edx"
})
public class HostCpuIdInfo
    extends DynamicData
{

    protected int level;
    protected String vendor;
    protected String eax;
    protected String ebx;
    protected String ecx;
    protected String edx;

    /**
     * Gets the value of the level property.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the eax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEax() {
        return eax;
    }

    /**
     * Sets the value of the eax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEax(String value) {
        this.eax = value;
    }

    /**
     * Gets the value of the ebx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbx() {
        return ebx;
    }

    /**
     * Sets the value of the ebx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbx(String value) {
        this.ebx = value;
    }

    /**
     * Gets the value of the ecx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcx() {
        return ecx;
    }

    /**
     * Sets the value of the ecx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcx(String value) {
        this.ecx = value;
    }

    /**
     * Gets the value of the edx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdx() {
        return edx;
    }

    /**
     * Sets the value of the edx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdx(String value) {
        this.edx = value;
    }

}
