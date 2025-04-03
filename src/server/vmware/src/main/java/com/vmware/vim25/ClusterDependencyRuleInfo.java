
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDependencyRuleInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDependencyRuleInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterRuleInfo">
 *       <sequence>
 *         <element name="vmGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dependsOnVmGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDependencyRuleInfo", propOrder = {
    "vmGroup",
    "dependsOnVmGroup"
})
public class ClusterDependencyRuleInfo
    extends ClusterRuleInfo
{

    @XmlElement(required = true)
    protected String vmGroup;
    @XmlElement(required = true)
    protected String dependsOnVmGroup;

    /**
     * Gets the value of the vmGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmGroup() {
        return vmGroup;
    }

    /**
     * Sets the value of the vmGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmGroup(String value) {
        this.vmGroup = value;
    }

    /**
     * Gets the value of the dependsOnVmGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependsOnVmGroup() {
        return dependsOnVmGroup;
    }

    /**
     * Sets the value of the dependsOnVmGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependsOnVmGroup(String value) {
        this.dependsOnVmGroup = value;
    }

}
