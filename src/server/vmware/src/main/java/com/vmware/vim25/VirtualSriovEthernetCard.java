
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualSriovEthernetCard complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualSriovEthernetCard">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualEthernetCard">
 *       <sequence>
 *         <element name="allowGuestOSMtuChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="sriovBacking" type="{urn:internalvim25}VirtualSriovEthernetCardSriovBackingInfo" minOccurs="0"/>
 *         <element name="dvxBackingInfo" type="{urn:internalvim25}VirtualPCIPassthroughDvxBackingInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSriovEthernetCard", propOrder = {
    "allowGuestOSMtuChange",
    "sriovBacking",
    "dvxBackingInfo"
})
public class VirtualSriovEthernetCard
    extends VirtualEthernetCard
{

    protected Boolean allowGuestOSMtuChange;
    protected VirtualSriovEthernetCardSriovBackingInfo sriovBacking;
    protected VirtualPCIPassthroughDvxBackingInfo dvxBackingInfo;

    /**
     * Gets the value of the allowGuestOSMtuChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowGuestOSMtuChange() {
        return allowGuestOSMtuChange;
    }

    /**
     * Sets the value of the allowGuestOSMtuChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowGuestOSMtuChange(Boolean value) {
        this.allowGuestOSMtuChange = value;
    }

    /**
     * Gets the value of the sriovBacking property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualSriovEthernetCardSriovBackingInfo }
     *     
     */
    public VirtualSriovEthernetCardSriovBackingInfo getSriovBacking() {
        return sriovBacking;
    }

    /**
     * Sets the value of the sriovBacking property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualSriovEthernetCardSriovBackingInfo }
     *     
     */
    public void setSriovBacking(VirtualSriovEthernetCardSriovBackingInfo value) {
        this.sriovBacking = value;
    }

    /**
     * Gets the value of the dvxBackingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualPCIPassthroughDvxBackingInfo }
     *     
     */
    public VirtualPCIPassthroughDvxBackingInfo getDvxBackingInfo() {
        return dvxBackingInfo;
    }

    /**
     * Sets the value of the dvxBackingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualPCIPassthroughDvxBackingInfo }
     *     
     */
    public void setDvxBackingInfo(VirtualPCIPassthroughDvxBackingInfo value) {
        this.dvxBackingInfo = value;
    }

}
