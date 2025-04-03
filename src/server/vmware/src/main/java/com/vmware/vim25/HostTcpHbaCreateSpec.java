
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTcpHbaCreateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTcpHbaCreateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostHbaCreateSpec">
 *       <sequence>
 *         <element name="pnic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTcpHbaCreateSpec", propOrder = {
    "pnic"
})
public class HostTcpHbaCreateSpec
    extends HostHbaCreateSpec
{

    @XmlElement(required = true)
    protected String pnic;

    /**
     * Gets the value of the pnic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnic() {
        return pnic;
    }

    /**
     * Sets the value of the pnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnic(String value) {
        this.pnic = value;
    }

}
