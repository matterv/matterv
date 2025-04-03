
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputeResourceHostSeedSpecSingleHostSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComputeResourceHostSeedSpecSingleHostSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="newHostCnxSpec" type="{urn:internalvim25}HostConnectSpec" minOccurs="0"/>
 *         <element name="existingHost" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceHostSeedSpecSingleHostSpec", propOrder = {
    "newHostCnxSpec",
    "existingHost"
})
public class ComputeResourceHostSeedSpecSingleHostSpec
    extends DynamicData
{

    protected HostConnectSpec newHostCnxSpec;
    protected ManagedObjectReference existingHost;

    /**
     * Gets the value of the newHostCnxSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostConnectSpec }
     *     
     */
    public HostConnectSpec getNewHostCnxSpec() {
        return newHostCnxSpec;
    }

    /**
     * Sets the value of the newHostCnxSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostConnectSpec }
     *     
     */
    public void setNewHostCnxSpec(HostConnectSpec value) {
        this.newHostCnxSpec = value;
    }

    /**
     * Gets the value of the existingHost property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getExistingHost() {
        return existingHost;
    }

    /**
     * Sets the value of the existingHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setExistingHost(ManagedObjectReference value) {
        this.existingHost = value;
    }

}
