
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostAccessControlEntry complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostAccessControlEntry">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="principal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="group" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="accessMode" type="{urn:internalvim25}HostAccessMode"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAccessControlEntry", propOrder = {
    "principal",
    "group",
    "accessMode"
})
public class HostAccessControlEntry
    extends DynamicData
{

    @XmlElement(required = true)
    protected String principal;
    protected boolean group;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HostAccessMode accessMode;

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipal(String value) {
        this.principal = value;
    }

    /**
     * Gets the value of the group property.
     * 
     */
    public boolean isGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     */
    public void setGroup(boolean value) {
        this.group = value;
    }

    /**
     * Gets the value of the accessMode property.
     * 
     * @return
     *     possible object is
     *     {@link HostAccessMode }
     *     
     */
    public HostAccessMode getAccessMode() {
        return accessMode;
    }

    /**
     * Sets the value of the accessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostAccessMode }
     *     
     */
    public void setAccessMode(HostAccessMode value) {
        this.accessMode = value;
    }

}
