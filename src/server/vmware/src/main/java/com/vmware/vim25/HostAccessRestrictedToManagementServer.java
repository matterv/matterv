
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostAccessRestrictedToManagementServer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostAccessRestrictedToManagementServer">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}NotSupported">
 *       <sequence>
 *         <element name="managementServer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAccessRestrictedToManagementServer", propOrder = {
    "managementServer"
})
public class HostAccessRestrictedToManagementServer
    extends NotSupported
{

    @XmlElement(required = true)
    protected String managementServer;

    /**
     * Gets the value of the managementServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementServer() {
        return managementServer;
    }

    /**
     * Sets the value of the managementServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementServer(String value) {
        this.managementServer = value;
    }

}
