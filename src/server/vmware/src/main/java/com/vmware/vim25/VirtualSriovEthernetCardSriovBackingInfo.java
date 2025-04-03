
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualSriovEthernetCardSriovBackingInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualSriovEthernetCardSriovBackingInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceBackingInfo">
 *       <sequence>
 *         <element name="physicalFunctionBacking" type="{urn:internalvim25}VirtualPCIPassthroughDeviceBackingInfo" minOccurs="0"/>
 *         <element name="virtualFunctionBacking" type="{urn:internalvim25}VirtualPCIPassthroughDeviceBackingInfo" minOccurs="0"/>
 *         <element name="virtualFunctionIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSriovEthernetCardSriovBackingInfo", propOrder = {
    "physicalFunctionBacking",
    "virtualFunctionBacking",
    "virtualFunctionIndex"
})
public class VirtualSriovEthernetCardSriovBackingInfo
    extends VirtualDeviceBackingInfo
{

    protected VirtualPCIPassthroughDeviceBackingInfo physicalFunctionBacking;
    protected VirtualPCIPassthroughDeviceBackingInfo virtualFunctionBacking;
    protected Integer virtualFunctionIndex;

    /**
     * Gets the value of the physicalFunctionBacking property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualPCIPassthroughDeviceBackingInfo }
     *     
     */
    public VirtualPCIPassthroughDeviceBackingInfo getPhysicalFunctionBacking() {
        return physicalFunctionBacking;
    }

    /**
     * Sets the value of the physicalFunctionBacking property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualPCIPassthroughDeviceBackingInfo }
     *     
     */
    public void setPhysicalFunctionBacking(VirtualPCIPassthroughDeviceBackingInfo value) {
        this.physicalFunctionBacking = value;
    }

    /**
     * Gets the value of the virtualFunctionBacking property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualPCIPassthroughDeviceBackingInfo }
     *     
     */
    public VirtualPCIPassthroughDeviceBackingInfo getVirtualFunctionBacking() {
        return virtualFunctionBacking;
    }

    /**
     * Sets the value of the virtualFunctionBacking property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualPCIPassthroughDeviceBackingInfo }
     *     
     */
    public void setVirtualFunctionBacking(VirtualPCIPassthroughDeviceBackingInfo value) {
        this.virtualFunctionBacking = value;
    }

    /**
     * Gets the value of the virtualFunctionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVirtualFunctionIndex() {
        return virtualFunctionIndex;
    }

    /**
     * Sets the value of the virtualFunctionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVirtualFunctionIndex(Integer value) {
        this.virtualFunctionIndex = value;
    }

}
