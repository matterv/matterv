
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VimVasaProvider complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VimVasaProvider">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="selfSignedCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vhostConfig" type="{urn:internalvim25}VimVasaProviderVirtualHostConfig" minOccurs="0"/>
 *         <element name="versionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VimVasaProvider", propOrder = {
    "uid",
    "url",
    "name",
    "selfSignedCertificate",
    "vhostConfig",
    "versionId"
})
public class VimVasaProvider
    extends DynamicData
{

    protected String uid;
    @XmlElement(required = true)
    protected String url;
    protected String name;
    protected String selfSignedCertificate;
    protected VimVasaProviderVirtualHostConfig vhostConfig;
    protected Integer versionId;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

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
     * Gets the value of the selfSignedCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfSignedCertificate() {
        return selfSignedCertificate;
    }

    /**
     * Sets the value of the selfSignedCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfSignedCertificate(String value) {
        this.selfSignedCertificate = value;
    }

    /**
     * Gets the value of the vhostConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VimVasaProviderVirtualHostConfig }
     *     
     */
    public VimVasaProviderVirtualHostConfig getVhostConfig() {
        return vhostConfig;
    }

    /**
     * Sets the value of the vhostConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VimVasaProviderVirtualHostConfig }
     *     
     */
    public void setVhostConfig(VimVasaProviderVirtualHostConfig value) {
        this.vhostConfig = value;
    }

    /**
     * Gets the value of the versionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * Sets the value of the versionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionId(Integer value) {
        this.versionId = value;
    }

}
