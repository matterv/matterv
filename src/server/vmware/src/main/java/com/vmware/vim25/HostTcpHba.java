
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTcpHba complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTcpHba">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostHostBusAdapter">
 *       <sequence>
 *         <element name="associatedPnic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTcpHba", propOrder = {
    "associatedPnic"
})
public class HostTcpHba
    extends HostHostBusAdapter
{

    protected String associatedPnic;

    /**
     * Gets the value of the associatedPnic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedPnic() {
        return associatedPnic;
    }

    /**
     * Sets the value of the associatedPnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedPnic(String value) {
        this.associatedPnic = value;
    }

}
