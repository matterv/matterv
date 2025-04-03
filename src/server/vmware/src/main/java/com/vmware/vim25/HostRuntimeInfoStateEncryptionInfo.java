
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRuntimeInfoStateEncryptionInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostRuntimeInfoStateEncryptionInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="protectionMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="requireSecureBoot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="requireExecInstalledOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRuntimeInfoStateEncryptionInfo", propOrder = {
    "protectionMode",
    "requireSecureBoot",
    "requireExecInstalledOnly"
})
public class HostRuntimeInfoStateEncryptionInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String protectionMode;
    protected Boolean requireSecureBoot;
    protected Boolean requireExecInstalledOnly;

    /**
     * Gets the value of the protectionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionMode() {
        return protectionMode;
    }

    /**
     * Sets the value of the protectionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionMode(String value) {
        this.protectionMode = value;
    }

    /**
     * Gets the value of the requireSecureBoot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireSecureBoot() {
        return requireSecureBoot;
    }

    /**
     * Sets the value of the requireSecureBoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireSecureBoot(Boolean value) {
        this.requireSecureBoot = value;
    }

    /**
     * Gets the value of the requireExecInstalledOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireExecInstalledOnly() {
        return requireExecInstalledOnly;
    }

    /**
     * Sets the value of the requireExecInstalledOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireExecInstalledOnly(Boolean value) {
        this.requireExecInstalledOnly = value;
    }

}
