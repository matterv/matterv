
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSgxInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSgxInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="sgxState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="totalEpcMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="flcMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lePubKeyHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="registrationInfo" type="{urn:internalvim25}HostSgxRegistrationInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSgxInfo", propOrder = {
    "sgxState",
    "totalEpcMemory",
    "flcMode",
    "lePubKeyHash",
    "registrationInfo"
})
public class HostSgxInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String sgxState;
    protected long totalEpcMemory;
    @XmlElement(required = true)
    protected String flcMode;
    protected String lePubKeyHash;
    protected HostSgxRegistrationInfo registrationInfo;

    /**
     * Gets the value of the sgxState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgxState() {
        return sgxState;
    }

    /**
     * Sets the value of the sgxState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgxState(String value) {
        this.sgxState = value;
    }

    /**
     * Gets the value of the totalEpcMemory property.
     * 
     */
    public long getTotalEpcMemory() {
        return totalEpcMemory;
    }

    /**
     * Sets the value of the totalEpcMemory property.
     * 
     */
    public void setTotalEpcMemory(long value) {
        this.totalEpcMemory = value;
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
     * Gets the value of the registrationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostSgxRegistrationInfo }
     *     
     */
    public HostSgxRegistrationInfo getRegistrationInfo() {
        return registrationInfo;
    }

    /**
     * Sets the value of the registrationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSgxRegistrationInfo }
     *     
     */
    public void setRegistrationInfo(HostSgxRegistrationInfo value) {
        this.registrationInfo = value;
    }

}
