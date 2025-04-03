
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VFlashModuleVersionIncompatible complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VFlashModuleVersionIncompatible">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vmRequestModuleVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostMinSupportedVerson" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostModuleVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VFlashModuleVersionIncompatible", propOrder = {
    "moduleName",
    "vmRequestModuleVersion",
    "hostMinSupportedVerson",
    "hostModuleVersion"
})
public class VFlashModuleVersionIncompatible
    extends VimFault
{

    @XmlElement(required = true)
    protected String moduleName;
    @XmlElement(required = true)
    protected String vmRequestModuleVersion;
    @XmlElement(required = true)
    protected String hostMinSupportedVerson;
    @XmlElement(required = true)
    protected String hostModuleVersion;

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the vmRequestModuleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmRequestModuleVersion() {
        return vmRequestModuleVersion;
    }

    /**
     * Sets the value of the vmRequestModuleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmRequestModuleVersion(String value) {
        this.vmRequestModuleVersion = value;
    }

    /**
     * Gets the value of the hostMinSupportedVerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMinSupportedVerson() {
        return hostMinSupportedVerson;
    }

    /**
     * Sets the value of the hostMinSupportedVerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMinSupportedVerson(String value) {
        this.hostMinSupportedVerson = value;
    }

    /**
     * Gets the value of the hostModuleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostModuleVersion() {
        return hostModuleVersion;
    }

    /**
     * Sets the value of the hostModuleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostModuleVersion(String value) {
        this.hostModuleVersion = value;
    }

}
