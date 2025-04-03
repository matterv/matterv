
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptoManagerKmipClusterStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CryptoManagerKmipClusterStatus">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="clusterId" type="{urn:internalvim25}KeyProviderId"/>
 *         <element name="overallStatus" type="{urn:internalvim25}ManagedEntityStatus" minOccurs="0"/>
 *         <element name="managementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="servers" type="{urn:internalvim25}CryptoManagerKmipServerStatus" maxOccurs="unbounded"/>
 *         <element name="clientCertInfo" type="{urn:internalvim25}CryptoManagerKmipCertificateInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerKmipClusterStatus", propOrder = {
    "clusterId",
    "overallStatus",
    "managementType",
    "servers",
    "clientCertInfo"
})
public class CryptoManagerKmipClusterStatus
    extends DynamicData
{

    @XmlElement(required = true)
    protected KeyProviderId clusterId;
    @XmlSchemaType(name = "string")
    protected ManagedEntityStatus overallStatus;
    protected String managementType;
    @XmlElement(required = true)
    protected List<CryptoManagerKmipServerStatus> servers;
    protected CryptoManagerKmipCertificateInfo clientCertInfo;

    /**
     * Gets the value of the clusterId property.
     * 
     * @return
     *     possible object is
     *     {@link KeyProviderId }
     *     
     */
    public KeyProviderId getClusterId() {
        return clusterId;
    }

    /**
     * Sets the value of the clusterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyProviderId }
     *     
     */
    public void setClusterId(KeyProviderId value) {
        this.clusterId = value;
    }

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public void setOverallStatus(ManagedEntityStatus value) {
        this.overallStatus = value;
    }

    /**
     * Gets the value of the managementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementType() {
        return managementType;
    }

    /**
     * Sets the value of the managementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementType(String value) {
        this.managementType = value;
    }

    /**
     * Gets the value of the servers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptoManagerKmipServerStatus }
     * </p>
     * 
     * 
     * @return
     *     The value of the servers property.
     */
    public List<CryptoManagerKmipServerStatus> getServers() {
        if (servers == null) {
            servers = new ArrayList<>();
        }
        return this.servers;
    }

    /**
     * Gets the value of the clientCertInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoManagerKmipCertificateInfo }
     *     
     */
    public CryptoManagerKmipCertificateInfo getClientCertInfo() {
        return clientCertInfo;
    }

    /**
     * Sets the value of the clientCertInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoManagerKmipCertificateInfo }
     *     
     */
    public void setClientCertInfo(CryptoManagerKmipCertificateInfo value) {
        this.clientCertInfo = value;
    }

}
