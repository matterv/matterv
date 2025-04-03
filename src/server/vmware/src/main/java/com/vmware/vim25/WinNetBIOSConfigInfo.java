
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WinNetBIOSConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WinNetBIOSConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}NetBIOSConfigInfo">
 *       <sequence>
 *         <element name="primaryWINS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="secondaryWINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WinNetBIOSConfigInfo", propOrder = {
    "primaryWINS",
    "secondaryWINS"
})
public class WinNetBIOSConfigInfo
    extends NetBIOSConfigInfo
{

    @XmlElement(required = true)
    protected String primaryWINS;
    protected String secondaryWINS;

    /**
     * Gets the value of the primaryWINS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWINS() {
        return primaryWINS;
    }

    /**
     * Sets the value of the primaryWINS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWINS(String value) {
        this.primaryWINS = value;
    }

    /**
     * Gets the value of the secondaryWINS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryWINS() {
        return secondaryWINS;
    }

    /**
     * Sets the value of the secondaryWINS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryWINS(String value) {
        this.secondaryWINS = value;
    }

}
