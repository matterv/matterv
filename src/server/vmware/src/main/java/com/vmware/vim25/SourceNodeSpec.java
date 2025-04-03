
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceNodeSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SourceNodeSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="managementVc" type="{urn:internalvim25}ServiceLocator"/>
 *         <element name="activeVc" type="{urn:internalvim25}ManagedObjectReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceNodeSpec", propOrder = {
    "managementVc",
    "activeVc"
})
public class SourceNodeSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected ServiceLocator managementVc;
    @XmlElement(required = true)
    protected ManagedObjectReference activeVc;

    /**
     * Gets the value of the managementVc property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocator }
     *     
     */
    public ServiceLocator getManagementVc() {
        return managementVc;
    }

    /**
     * Sets the value of the managementVc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocator }
     *     
     */
    public void setManagementVc(ServiceLocator value) {
        this.managementVc = value;
    }

    /**
     * Gets the value of the activeVc property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getActiveVc() {
        return activeVc;
    }

    /**
     * Sets the value of the activeVc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setActiveVc(ManagedObjectReference value) {
        this.activeVc = value;
    }

}
