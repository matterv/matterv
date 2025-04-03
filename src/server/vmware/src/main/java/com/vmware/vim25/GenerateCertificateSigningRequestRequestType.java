
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenerateCertificateSigningRequestRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GenerateCertificateSigningRequestRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="useIpAddressAsCommonName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="spec" type="{urn:internalvim25}HostCertificateManagerCertificateSpec" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateCertificateSigningRequestRequestType", propOrder = {
    "_this",
    "useIpAddressAsCommonName",
    "spec"
})
public class GenerateCertificateSigningRequestRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected boolean useIpAddressAsCommonName;
    protected HostCertificateManagerCertificateSpec spec;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the useIpAddressAsCommonName property.
     * 
     */
    public boolean isUseIpAddressAsCommonName() {
        return useIpAddressAsCommonName;
    }

    /**
     * Sets the value of the useIpAddressAsCommonName property.
     * 
     */
    public void setUseIpAddressAsCommonName(boolean value) {
        this.useIpAddressAsCommonName = value;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link HostCertificateManagerCertificateSpec }
     *     
     */
    public HostCertificateManagerCertificateSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostCertificateManagerCertificateSpec }
     *     
     */
    public void setSpec(HostCertificateManagerCertificateSpec value) {
        this.spec = value;
    }

}
