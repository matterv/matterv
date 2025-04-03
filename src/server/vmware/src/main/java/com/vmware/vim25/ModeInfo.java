
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ModeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="browse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="read" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="modify" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="use" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="full" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeInfo", propOrder = {
    "browse",
    "read",
    "modify",
    "use",
    "admin",
    "full"
})
public class ModeInfo
    extends DynamicData
{

    protected String browse;
    @XmlElement(required = true)
    protected String read;
    @XmlElement(required = true)
    protected String modify;
    @XmlElement(required = true)
    protected String use;
    protected String admin;
    @XmlElement(required = true)
    protected String full;

    /**
     * Gets the value of the browse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowse() {
        return browse;
    }

    /**
     * Sets the value of the browse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowse(String value) {
        this.browse = value;
    }

    /**
     * Gets the value of the read property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRead(String value) {
        this.read = value;
    }

    /**
     * Gets the value of the modify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModify() {
        return modify;
    }

    /**
     * Sets the value of the modify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModify(String value) {
        this.modify = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUse(String value) {
        this.use = value;
    }

    /**
     * Gets the value of the admin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmin(String value) {
        this.admin = value;
    }

    /**
     * Gets the value of the full property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFull() {
        return full;
    }

    /**
     * Sets the value of the full property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFull(String value) {
        this.full = value;
    }

}
