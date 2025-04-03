
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostIpConfigIpV6Address complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostIpConfigIpV6Address">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prefixLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dadState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lifetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpConfigIpV6Address", propOrder = {
    "ipAddress",
    "prefixLength",
    "origin",
    "dadState",
    "lifetime",
    "operation"
})
public class HostIpConfigIpV6Address
    extends DynamicData
{

    @XmlElement(required = true)
    protected String ipAddress;
    protected int prefixLength;
    protected String origin;
    protected String dadState;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lifetime;
    protected String operation;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the prefixLength property.
     * 
     */
    public int getPrefixLength() {
        return prefixLength;
    }

    /**
     * Sets the value of the prefixLength property.
     * 
     */
    public void setPrefixLength(int value) {
        this.prefixLength = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the dadState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDadState() {
        return dadState;
    }

    /**
     * Sets the value of the dadState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDadState(String value) {
        this.dadState = value;
    }

    /**
     * Gets the value of the lifetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLifetime() {
        return lifetime;
    }

    /**
     * Sets the value of the lifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLifetime(XMLGregorianCalendar value) {
        this.lifetime = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
