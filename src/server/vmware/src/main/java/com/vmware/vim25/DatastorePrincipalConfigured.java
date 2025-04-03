
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatastorePrincipalConfigured complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatastorePrincipalConfigured">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
 *       <sequence>
 *         <element name="datastorePrincipal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastorePrincipalConfigured", propOrder = {
    "datastorePrincipal"
})
public class DatastorePrincipalConfigured
    extends HostEvent
{

    @XmlElement(required = true)
    protected String datastorePrincipal;

    /**
     * Gets the value of the datastorePrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatastorePrincipal() {
        return datastorePrincipal;
    }

    /**
     * Sets the value of the datastorePrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatastorePrincipal(String value) {
        this.datastorePrincipal = value;
    }

}
