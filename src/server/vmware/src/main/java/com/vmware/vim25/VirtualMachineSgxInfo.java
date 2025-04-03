
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineSgxInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineSgxInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="epcSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="flcMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lePubKeyHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="requireAttestation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSgxInfo", propOrder = {
    "epcSize",
    "flcMode",
    "lePubKeyHash",
    "requireAttestation"
})
public class VirtualMachineSgxInfo
    extends DynamicData
{

    protected long epcSize;
    protected String flcMode;
    protected String lePubKeyHash;
    protected Boolean requireAttestation;

    /**
     * Gets the value of the epcSize property.
     * 
     */
    public long getEpcSize() {
        return epcSize;
    }

    /**
     * Sets the value of the epcSize property.
     * 
     */
    public void setEpcSize(long value) {
        this.epcSize = value;
    }

    /**
     * Gets the value of the flcMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlcMode() {
        return flcMode;
    }

    /**
     * Sets the value of the flcMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlcMode(String value) {
        this.flcMode = value;
    }

    /**
     * Gets the value of the lePubKeyHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLePubKeyHash() {
        return lePubKeyHash;
    }

    /**
     * Sets the value of the lePubKeyHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLePubKeyHash(String value) {
        this.lePubKeyHash = value;
    }

    /**
     * Gets the value of the requireAttestation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireAttestation() {
        return requireAttestation;
    }

    /**
     * Sets the value of the requireAttestation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireAttestation(Boolean value) {
        this.requireAttestation = value;
    }

}
