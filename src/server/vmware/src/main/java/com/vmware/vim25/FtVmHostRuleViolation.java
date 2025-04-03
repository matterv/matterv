
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FtVmHostRuleViolation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FtVmHostRuleViolation">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmConfigFault">
 *       <sequence>
 *         <element name="vmName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FtVmHostRuleViolation", propOrder = {
    "vmName",
    "hostName",
    "hostGroup"
})
public class FtVmHostRuleViolation
    extends VmConfigFault
{

    @XmlElement(required = true)
    protected String vmName;
    @XmlElement(required = true)
    protected String hostName;
    @XmlElement(required = true)
    protected String hostGroup;

    /**
     * Gets the value of the vmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmName() {
        return vmName;
    }

    /**
     * Sets the value of the vmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmName(String value) {
        this.vmName = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the hostGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostGroup() {
        return hostGroup;
    }

    /**
     * Sets the value of the hostGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostGroup(String value) {
        this.hostGroup = value;
    }

}
