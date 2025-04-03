
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualSCSIController complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualSCSIController">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualController">
 *       <sequence>
 *         <element name="hotAddRemove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="sharedBus" type="{urn:internalvim25}VirtualSCSISharing"/>
 *         <element name="scsiCtlrUnitNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSCSIController", propOrder = {
    "hotAddRemove",
    "sharedBus",
    "scsiCtlrUnitNumber"
})
@XmlSeeAlso({
    ParaVirtualSCSIController.class,
    VirtualBusLogicController.class,
    VirtualLsiLogicController.class,
    VirtualLsiLogicSASController.class
})
public class VirtualSCSIController
    extends VirtualController
{

    protected Boolean hotAddRemove;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VirtualSCSISharing sharedBus;
    protected Integer scsiCtlrUnitNumber;

    /**
     * Gets the value of the hotAddRemove property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHotAddRemove() {
        return hotAddRemove;
    }

    /**
     * Sets the value of the hotAddRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotAddRemove(Boolean value) {
        this.hotAddRemove = value;
    }

    /**
     * Gets the value of the sharedBus property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualSCSISharing }
     *     
     */
    public VirtualSCSISharing getSharedBus() {
        return sharedBus;
    }

    /**
     * Sets the value of the sharedBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualSCSISharing }
     *     
     */
    public void setSharedBus(VirtualSCSISharing value) {
        this.sharedBus = value;
    }

    /**
     * Gets the value of the scsiCtlrUnitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScsiCtlrUnitNumber() {
        return scsiCtlrUnitNumber;
    }

    /**
     * Sets the value of the scsiCtlrUnitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScsiCtlrUnitNumber(Integer value) {
        this.scsiCtlrUnitNumber = value;
    }

}
