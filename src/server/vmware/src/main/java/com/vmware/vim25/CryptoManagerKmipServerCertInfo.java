
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoManagerKmipServerCertInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CryptoManagerKmipServerCertInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="certInfo" type="{urn:internalvim25}CryptoManagerKmipCertificateInfo" minOccurs="0"/>
 *         <element name="clientTrustServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerKmipServerCertInfo", propOrder = {
    "certificate",
    "certInfo",
    "clientTrustServer"
})
public class CryptoManagerKmipServerCertInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String certificate;
    protected CryptoManagerKmipCertificateInfo certInfo;
    protected Boolean clientTrustServer;

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(String value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the certInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoManagerKmipCertificateInfo }
     *     
     */
    public CryptoManagerKmipCertificateInfo getCertInfo() {
        return certInfo;
    }

    /**
     * Sets the value of the certInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoManagerKmipCertificateInfo }
     *     
     */
    public void setCertInfo(CryptoManagerKmipCertificateInfo value) {
        this.certInfo = value;
    }

    /**
     * Gets the value of the clientTrustServer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientTrustServer() {
        return clientTrustServer;
    }

    /**
     * Sets the value of the clientTrustServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientTrustServer(Boolean value) {
        this.clientTrustServer = value;
    }

}
