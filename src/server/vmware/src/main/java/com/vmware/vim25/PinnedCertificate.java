
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinnedCertificate complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PinnedCertificate">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}IoFilterManagerSslTrust">
 *       <sequence>
 *         <element name="sslCertificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinnedCertificate", propOrder = {
    "sslCertificate"
})
public class PinnedCertificate
    extends IoFilterManagerSslTrust
{

    @XmlElement(required = true)
    protected String sslCertificate;

    /**
     * Gets the value of the sslCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSslCertificate() {
        return sslCertificate;
    }

    /**
     * Sets the value of the sslCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSslCertificate(String value) {
        this.sslCertificate = value;
    }

}
