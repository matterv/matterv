
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostEsxAgentHostManagerConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostEsxAgentHostManagerConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="agentVmDatastore" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="agentVmNetwork" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostEsxAgentHostManagerConfigInfo", propOrder = {
    "agentVmDatastore",
    "agentVmNetwork"
})
public class HostEsxAgentHostManagerConfigInfo
    extends DynamicData
{

    protected ManagedObjectReference agentVmDatastore;
    protected ManagedObjectReference agentVmNetwork;

    /**
     * Gets the value of the agentVmDatastore property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getAgentVmDatastore() {
        return agentVmDatastore;
    }

    /**
     * Sets the value of the agentVmDatastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setAgentVmDatastore(ManagedObjectReference value) {
        this.agentVmDatastore = value;
    }

    /**
     * Gets the value of the agentVmNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getAgentVmNetwork() {
        return agentVmNetwork;
    }

    /**
     * Sets the value of the agentVmNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setAgentVmNetwork(ManagedObjectReference value) {
        this.agentVmNetwork = value;
    }

}
