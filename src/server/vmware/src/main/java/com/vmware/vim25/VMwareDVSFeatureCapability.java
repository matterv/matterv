
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSFeatureCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSFeatureCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVSFeatureCapability">
 *       <sequence>
 *         <element name="vspanSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="lldpSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipfixSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ipfixCapability" type="{urn:internalvim25}VMwareDvsIpfixCapability" minOccurs="0"/>
 *         <element name="multicastSnoopingSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vspanCapability" type="{urn:internalvim25}VMwareDVSVspanCapability" minOccurs="0"/>
 *         <element name="lacpCapability" type="{urn:internalvim25}VMwareDvsLacpCapability" minOccurs="0"/>
 *         <element name="dpuCapability" type="{urn:internalvim25}VMwareDvsDpuCapability" minOccurs="0"/>
 *         <element name="nsxSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="mtuCapability" type="{urn:internalvim25}VMwareDvsMtuCapability" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSFeatureCapability", propOrder = {
    "vspanSupported",
    "lldpSupported",
    "ipfixSupported",
    "ipfixCapability",
    "multicastSnoopingSupported",
    "vspanCapability",
    "lacpCapability",
    "dpuCapability",
    "nsxSupported",
    "mtuCapability"
})
public class VMwareDVSFeatureCapability
    extends DVSFeatureCapability
{

    protected Boolean vspanSupported;
    protected Boolean lldpSupported;
    protected Boolean ipfixSupported;
    protected VMwareDvsIpfixCapability ipfixCapability;
    protected Boolean multicastSnoopingSupported;
    protected VMwareDVSVspanCapability vspanCapability;
    protected VMwareDvsLacpCapability lacpCapability;
    protected VMwareDvsDpuCapability dpuCapability;
    protected Boolean nsxSupported;
    protected VMwareDvsMtuCapability mtuCapability;

    /**
     * Gets the value of the vspanSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVspanSupported() {
        return vspanSupported;
    }

    /**
     * Sets the value of the vspanSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVspanSupported(Boolean value) {
        this.vspanSupported = value;
    }

    /**
     * Gets the value of the lldpSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLldpSupported() {
        return lldpSupported;
    }

    /**
     * Sets the value of the lldpSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLldpSupported(Boolean value) {
        this.lldpSupported = value;
    }

    /**
     * Gets the value of the ipfixSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpfixSupported() {
        return ipfixSupported;
    }

    /**
     * Sets the value of the ipfixSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpfixSupported(Boolean value) {
        this.ipfixSupported = value;
    }

    /**
     * Gets the value of the ipfixCapability property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareDvsIpfixCapability }
     *     
     */
    public VMwareDvsIpfixCapability getIpfixCapability() {
        return ipfixCapability;
    }

    /**
     * Sets the value of the ipfixCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareDvsIpfixCapability }
     *     
     */
    public void setIpfixCapability(VMwareDvsIpfixCapability value) {
        this.ipfixCapability = value;
    }

    /**
     * Gets the value of the multicastSnoopingSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMulticastSnoopingSupported() {
        return multicastSnoopingSupported;
    }

    /**
     * Sets the value of the multicastSnoopingSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMulticastSnoopingSupported(Boolean value) {
        this.multicastSnoopingSupported = value;
    }

    /**
     * Gets the value of the vspanCapability property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareDVSVspanCapability }
     *     
     */
    public VMwareDVSVspanCapability getVspanCapability() {
        return vspanCapability;
    }

    /**
     * Sets the value of the vspanCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareDVSVspanCapability }
     *     
     */
    public void setVspanCapability(VMwareDVSVspanCapability value) {
        this.vspanCapability = value;
    }

    /**
     * Gets the value of the lacpCapability property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareDvsLacpCapability }
     *     
     */
    public VMwareDvsLacpCapability getLacpCapability() {
        return lacpCapability;
    }

    /**
     * Sets the value of the lacpCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareDvsLacpCapability }
     *     
     */
    public void setLacpCapability(VMwareDvsLacpCapability value) {
        this.lacpCapability = value;
    }

    /**
     * Gets the value of the dpuCapability property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareDvsDpuCapability }
     *     
     */
    public VMwareDvsDpuCapability getDpuCapability() {
        return dpuCapability;
    }

    /**
     * Sets the value of the dpuCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareDvsDpuCapability }
     *     
     */
    public void setDpuCapability(VMwareDvsDpuCapability value) {
        this.dpuCapability = value;
    }

    /**
     * Gets the value of the nsxSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNsxSupported() {
        return nsxSupported;
    }

    /**
     * Sets the value of the nsxSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNsxSupported(Boolean value) {
        this.nsxSupported = value;
    }

    /**
     * Gets the value of the mtuCapability property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareDvsMtuCapability }
     *     
     */
    public VMwareDvsMtuCapability getMtuCapability() {
        return mtuCapability;
    }

    /**
     * Sets the value of the mtuCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareDvsMtuCapability }
     *     
     */
    public void setMtuCapability(VMwareDvsMtuCapability value) {
        this.mtuCapability = value;
    }

}
