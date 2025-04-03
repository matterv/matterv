
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CpuIncompatible1ECX complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CpuIncompatible1ECX">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CpuIncompatible">
 *       <sequence>
 *         <element name="sse3" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="pclmulqdq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ssse3" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sse41" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sse42" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="aes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="other" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="otherOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpuIncompatible1ECX", propOrder = {
    "sse3",
    "pclmulqdq",
    "ssse3",
    "sse41",
    "sse42",
    "aes",
    "other",
    "otherOnly"
})
public class CpuIncompatible1ECX
    extends CpuIncompatible
{

    protected boolean sse3;
    protected Boolean pclmulqdq;
    protected boolean ssse3;
    protected boolean sse41;
    protected boolean sse42;
    protected Boolean aes;
    protected boolean other;
    protected boolean otherOnly;

    /**
     * Gets the value of the sse3 property.
     * 
     */
    public boolean isSse3() {
        return sse3;
    }

    /**
     * Sets the value of the sse3 property.
     * 
     */
    public void setSse3(boolean value) {
        this.sse3 = value;
    }

    /**
     * Gets the value of the pclmulqdq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPclmulqdq() {
        return pclmulqdq;
    }

    /**
     * Sets the value of the pclmulqdq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPclmulqdq(Boolean value) {
        this.pclmulqdq = value;
    }

    /**
     * Gets the value of the ssse3 property.
     * 
     */
    public boolean isSsse3() {
        return ssse3;
    }

    /**
     * Sets the value of the ssse3 property.
     * 
     */
    public void setSsse3(boolean value) {
        this.ssse3 = value;
    }

    /**
     * Gets the value of the sse41 property.
     * 
     */
    public boolean isSse41() {
        return sse41;
    }

    /**
     * Sets the value of the sse41 property.
     * 
     */
    public void setSse41(boolean value) {
        this.sse41 = value;
    }

    /**
     * Gets the value of the sse42 property.
     * 
     */
    public boolean isSse42() {
        return sse42;
    }

    /**
     * Sets the value of the sse42 property.
     * 
     */
    public void setSse42(boolean value) {
        this.sse42 = value;
    }

    /**
     * Gets the value of the aes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAes() {
        return aes;
    }

    /**
     * Sets the value of the aes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAes(Boolean value) {
        this.aes = value;
    }

    /**
     * Gets the value of the other property.
     * 
     */
    public boolean isOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     */
    public void setOther(boolean value) {
        this.other = value;
    }

    /**
     * Gets the value of the otherOnly property.
     * 
     */
    public boolean isOtherOnly() {
        return otherOnly;
    }

    /**
     * Sets the value of the otherOnly property.
     * 
     */
    public void setOtherOnly(boolean value) {
        this.otherOnly = value;
    }

}
