
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotSupportedHost complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NotSupportedHost">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostConnectFault">
 *       <sequence>
 *         <element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="productVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotSupportedHost", propOrder = {
    "productName",
    "productVersion"
})
@XmlSeeAlso({
    NonVmwareOuiMacNotSupportedHost.class,
    NotSupportedHostForVFlash.class,
    NotSupportedHostForVmcp.class,
    NotSupportedHostForVmemFile.class,
    NotSupportedHostForVsan.class,
    NotSupportedHostInCluster.class,
    NotSupportedHostInDvs.class,
    NotSupportedHostInHACluster.class
})
public class NotSupportedHost
    extends HostConnectFault
{

    protected String productName;
    protected String productVersion;

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * Sets the value of the productVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVersion(String value) {
        this.productVersion = value;
    }

}
