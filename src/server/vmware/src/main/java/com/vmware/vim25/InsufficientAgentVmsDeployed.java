
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsufficientAgentVmsDeployed complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InsufficientAgentVmsDeployed">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InsufficientResourcesFault">
 *       <sequence>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="requiredNumAgentVms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="currentNumAgentVms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientAgentVmsDeployed", propOrder = {
    "hostName",
    "requiredNumAgentVms",
    "currentNumAgentVms"
})
public class InsufficientAgentVmsDeployed
    extends InsufficientResourcesFault
{

    @XmlElement(required = true)
    protected String hostName;
    protected int requiredNumAgentVms;
    protected int currentNumAgentVms;

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
     * Gets the value of the requiredNumAgentVms property.
     * 
     */
    public int getRequiredNumAgentVms() {
        return requiredNumAgentVms;
    }

    /**
     * Sets the value of the requiredNumAgentVms property.
     * 
     */
    public void setRequiredNumAgentVms(int value) {
        this.requiredNumAgentVms = value;
    }

    /**
     * Gets the value of the currentNumAgentVms property.
     * 
     */
    public int getCurrentNumAgentVms() {
        return currentNumAgentVms;
    }

    /**
     * Sets the value of the currentNumAgentVms property.
     * 
     */
    public void setCurrentNumAgentVms(int value) {
        this.currentNumAgentVms = value;
    }

}
