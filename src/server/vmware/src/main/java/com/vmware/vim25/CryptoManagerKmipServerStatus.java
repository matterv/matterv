
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoManagerKmipServerStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CryptoManagerKmipServerStatus">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="status" type="{urn:internalvim25}ManagedEntityStatus"/>
 *         <element name="connectionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="certInfo" type="{urn:internalvim25}CryptoManagerKmipCertificateInfo" minOccurs="0"/>
 *         <element name="clientTrustServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="serverTrustClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerKmipServerStatus", propOrder = {
    "name",
    "status",
    "connectionStatus",
    "certInfo",
    "clientTrustServer",
    "serverTrustClient"
})
public class CryptoManagerKmipServerStatus
    extends DynamicData
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ManagedEntityStatus status;
    @XmlElement(required = true)
    protected String connectionStatus;
    protected CryptoManagerKmipCertificateInfo certInfo;
    protected Boolean clientTrustServer;
    protected Boolean serverTrustClient;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public ManagedEntityStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public void setStatus(ManagedEntityStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the connectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * Sets the value of the connectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionStatus(String value) {
        this.connectionStatus = value;
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

    /**
     * Gets the value of the serverTrustClient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServerTrustClient() {
        return serverTrustClient;
    }

    /**
     * Sets the value of the serverTrustClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServerTrustClient(Boolean value) {
        this.serverTrustClient = value;
    }

}
