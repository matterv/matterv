
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiTargetTransport complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostInternetScsiTargetTransport">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostTargetTransport">
 *       <sequence>
 *         <element name="iScsiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="iScsiAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="address" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiTargetTransport", propOrder = {
    "iScsiName",
    "iScsiAlias",
    "address"
})
public class HostInternetScsiTargetTransport
    extends HostTargetTransport
{

    @XmlElement(required = true)
    protected String iScsiName;
    @XmlElement(required = true)
    protected String iScsiAlias;
    protected List<String> address;

    /**
     * Gets the value of the iScsiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIScsiName() {
        return iScsiName;
    }

    /**
     * Sets the value of the iScsiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIScsiName(String value) {
        this.iScsiName = value;
    }

    /**
     * Gets the value of the iScsiAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIScsiAlias() {
        return iScsiAlias;
    }

    /**
     * Sets the value of the iScsiAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIScsiAlias(String value) {
        this.iScsiAlias = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the address property.
     */
    public List<String> getAddress() {
        if (address == null) {
            address = new ArrayList<>();
        }
        return this.address;
    }

}
