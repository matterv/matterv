
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDatastoreExistsConnectInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDatastoreExistsConnectInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostDatastoreConnectInfo">
 *       <sequence>
 *         <element name="newDatastoreName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDatastoreExistsConnectInfo", propOrder = {
    "newDatastoreName"
})
public class HostDatastoreExistsConnectInfo
    extends HostDatastoreConnectInfo
{

    @XmlElement(required = true)
    protected String newDatastoreName;

    /**
     * Gets the value of the newDatastoreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDatastoreName() {
        return newDatastoreName;
    }

    /**
     * Sets the value of the newDatastoreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDatastoreName(String value) {
        this.newDatastoreName = value;
    }

}
