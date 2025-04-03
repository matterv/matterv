
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRdmaHba complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostRdmaHba">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostHostBusAdapter">
 *       <sequence>
 *         <element name="associatedRdmaDevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaHba", propOrder = {
    "associatedRdmaDevice"
})
public class HostRdmaHba
    extends HostHostBusAdapter
{

    protected String associatedRdmaDevice;

    /**
     * Gets the value of the associatedRdmaDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedRdmaDevice() {
        return associatedRdmaDevice;
    }

    /**
     * Sets the value of the associatedRdmaDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedRdmaDevice(String value) {
        this.associatedRdmaDevice = value;
    }

}
