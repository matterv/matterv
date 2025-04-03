
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterVmHostRuleInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterVmHostRuleInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterRuleInfo">
 *       <sequence>
 *         <element name="vmGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="affineHostGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="antiAffineHostGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVmHostRuleInfo", propOrder = {
    "vmGroupName",
    "affineHostGroupName",
    "antiAffineHostGroupName"
})
public class ClusterVmHostRuleInfo
    extends ClusterRuleInfo
{

    protected String vmGroupName;
    protected String affineHostGroupName;
    protected String antiAffineHostGroupName;

    /**
     * Gets the value of the vmGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmGroupName() {
        return vmGroupName;
    }

    /**
     * Sets the value of the vmGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmGroupName(String value) {
        this.vmGroupName = value;
    }

    /**
     * Gets the value of the affineHostGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffineHostGroupName() {
        return affineHostGroupName;
    }

    /**
     * Sets the value of the affineHostGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffineHostGroupName(String value) {
        this.affineHostGroupName = value;
    }

    /**
     * Gets the value of the antiAffineHostGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiAffineHostGroupName() {
        return antiAffineHostGroupName;
    }

    /**
     * Sets the value of the antiAffineHostGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiAffineHostGroupName(String value) {
        this.antiAffineHostGroupName = value;
    }

}
