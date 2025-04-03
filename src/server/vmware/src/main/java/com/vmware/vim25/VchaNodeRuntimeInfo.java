
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VchaNodeRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VchaNodeRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="nodeState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nodeRole" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nodeIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaNodeRuntimeInfo", propOrder = {
    "nodeState",
    "nodeRole",
    "nodeIp"
})
public class VchaNodeRuntimeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String nodeState;
    @XmlElement(required = true)
    protected String nodeRole;
    @XmlElement(required = true)
    protected String nodeIp;

    /**
     * Gets the value of the nodeState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeState() {
        return nodeState;
    }

    /**
     * Sets the value of the nodeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeState(String value) {
        this.nodeState = value;
    }

    /**
     * Gets the value of the nodeRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeRole() {
        return nodeRole;
    }

    /**
     * Sets the value of the nodeRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeRole(String value) {
        this.nodeRole = value;
    }

    /**
     * Gets the value of the nodeIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeIp() {
        return nodeIp;
    }

    /**
     * Sets the value of the nodeIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeIp(String value) {
        this.nodeIp = value;
    }

}
