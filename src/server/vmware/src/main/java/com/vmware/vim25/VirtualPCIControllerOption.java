
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPCIControllerOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPCIControllerOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualControllerOption">
 *       <sequence>
 *         <element name="numSCSIControllers" type="{urn:internalvim25}IntOption"/>
 *         <element name="numEthernetCards" type="{urn:internalvim25}IntOption"/>
 *         <element name="numVideoCards" type="{urn:internalvim25}IntOption"/>
 *         <element name="numSoundCards" type="{urn:internalvim25}IntOption"/>
 *         <element name="numVmiRoms" type="{urn:internalvim25}IntOption"/>
 *         <element name="numVmciDevices" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numPCIPassthroughDevices" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numSasSCSIControllers" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numVmxnet3EthernetCards" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numParaVirtualSCSIControllers" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numSATAControllers" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numNVMEControllers" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *         <element name="numVmxnet3VrdmaEthernetCards" type="{urn:internalvim25}IntOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIControllerOption", propOrder = {
    "numSCSIControllers",
    "numEthernetCards",
    "numVideoCards",
    "numSoundCards",
    "numVmiRoms",
    "numVmciDevices",
    "numPCIPassthroughDevices",
    "numSasSCSIControllers",
    "numVmxnet3EthernetCards",
    "numParaVirtualSCSIControllers",
    "numSATAControllers",
    "numNVMEControllers",
    "numVmxnet3VrdmaEthernetCards"
})
public class VirtualPCIControllerOption
    extends VirtualControllerOption
{

    @XmlElement(required = true)
    protected IntOption numSCSIControllers;
    @XmlElement(required = true)
    protected IntOption numEthernetCards;
    @XmlElement(required = true)
    protected IntOption numVideoCards;
    @XmlElement(required = true)
    protected IntOption numSoundCards;
    @XmlElement(required = true)
    protected IntOption numVmiRoms;
    protected IntOption numVmciDevices;
    protected IntOption numPCIPassthroughDevices;
    protected IntOption numSasSCSIControllers;
    protected IntOption numVmxnet3EthernetCards;
    protected IntOption numParaVirtualSCSIControllers;
    protected IntOption numSATAControllers;
    protected IntOption numNVMEControllers;
    protected IntOption numVmxnet3VrdmaEthernetCards;

    /**
     * Gets the value of the numSCSIControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumSCSIControllers() {
        return numSCSIControllers;
    }

    /**
     * Sets the value of the numSCSIControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumSCSIControllers(IntOption value) {
        this.numSCSIControllers = value;
    }

    /**
     * Gets the value of the numEthernetCards property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumEthernetCards() {
        return numEthernetCards;
    }

    /**
     * Sets the value of the numEthernetCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumEthernetCards(IntOption value) {
        this.numEthernetCards = value;
    }

    /**
     * Gets the value of the numVideoCards property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumVideoCards() {
        return numVideoCards;
    }

    /**
     * Sets the value of the numVideoCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumVideoCards(IntOption value) {
        this.numVideoCards = value;
    }

    /**
     * Gets the value of the numSoundCards property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumSoundCards() {
        return numSoundCards;
    }

    /**
     * Sets the value of the numSoundCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumSoundCards(IntOption value) {
        this.numSoundCards = value;
    }

    /**
     * Gets the value of the numVmiRoms property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumVmiRoms() {
        return numVmiRoms;
    }

    /**
     * Sets the value of the numVmiRoms property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumVmiRoms(IntOption value) {
        this.numVmiRoms = value;
    }

    /**
     * Gets the value of the numVmciDevices property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumVmciDevices() {
        return numVmciDevices;
    }

    /**
     * Sets the value of the numVmciDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumVmciDevices(IntOption value) {
        this.numVmciDevices = value;
    }

    /**
     * Gets the value of the numPCIPassthroughDevices property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumPCIPassthroughDevices() {
        return numPCIPassthroughDevices;
    }

    /**
     * Sets the value of the numPCIPassthroughDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumPCIPassthroughDevices(IntOption value) {
        this.numPCIPassthroughDevices = value;
    }

    /**
     * Gets the value of the numSasSCSIControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumSasSCSIControllers() {
        return numSasSCSIControllers;
    }

    /**
     * Sets the value of the numSasSCSIControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumSasSCSIControllers(IntOption value) {
        this.numSasSCSIControllers = value;
    }

    /**
     * Gets the value of the numVmxnet3EthernetCards property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumVmxnet3EthernetCards() {
        return numVmxnet3EthernetCards;
    }

    /**
     * Sets the value of the numVmxnet3EthernetCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumVmxnet3EthernetCards(IntOption value) {
        this.numVmxnet3EthernetCards = value;
    }

    /**
     * Gets the value of the numParaVirtualSCSIControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumParaVirtualSCSIControllers() {
        return numParaVirtualSCSIControllers;
    }

    /**
     * Sets the value of the numParaVirtualSCSIControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumParaVirtualSCSIControllers(IntOption value) {
        this.numParaVirtualSCSIControllers = value;
    }

    /**
     * Gets the value of the numSATAControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumSATAControllers() {
        return numSATAControllers;
    }

    /**
     * Sets the value of the numSATAControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumSATAControllers(IntOption value) {
        this.numSATAControllers = value;
    }

    /**
     * Gets the value of the numNVMEControllers property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumNVMEControllers() {
        return numNVMEControllers;
    }

    /**
     * Sets the value of the numNVMEControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumNVMEControllers(IntOption value) {
        this.numNVMEControllers = value;
    }

    /**
     * Gets the value of the numVmxnet3VrdmaEthernetCards property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumVmxnet3VrdmaEthernetCards() {
        return numVmxnet3VrdmaEthernetCards;
    }

    /**
     * Sets the value of the numVmxnet3VrdmaEthernetCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumVmxnet3VrdmaEthernetCards(IntOption value) {
        this.numVmxnet3VrdmaEthernetCards = value;
    }

}
