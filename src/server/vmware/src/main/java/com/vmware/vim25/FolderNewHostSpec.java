
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FolderNewHostSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FolderNewHostSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="hostCnxSpec" type="{urn:internalvim25}HostConnectSpec"/>
 *         <element name="esxLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderNewHostSpec", propOrder = {
    "hostCnxSpec",
    "esxLicense"
})
public class FolderNewHostSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected HostConnectSpec hostCnxSpec;
    protected String esxLicense;

    /**
     * Gets the value of the hostCnxSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostConnectSpec }
     *     
     */
    public HostConnectSpec getHostCnxSpec() {
        return hostCnxSpec;
    }

    /**
     * Sets the value of the hostCnxSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostConnectSpec }
     *     
     */
    public void setHostCnxSpec(HostConnectSpec value) {
        this.hostCnxSpec = value;
    }

    /**
     * Gets the value of the esxLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsxLicense() {
        return esxLicense;
    }

    /**
     * Sets the value of the esxLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsxLicense(String value) {
        this.esxLicense = value;
    }

}
