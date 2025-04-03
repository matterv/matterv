
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchHostMemberPnicSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchHostMemberPnicSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="pnicDevice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="uplinkPortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="uplinkPortgroupKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="connectionCookie" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberPnicSpec", propOrder = {
    "pnicDevice",
    "uplinkPortKey",
    "uplinkPortgroupKey",
    "connectionCookie"
})
public class DistributedVirtualSwitchHostMemberPnicSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String pnicDevice;
    protected String uplinkPortKey;
    protected String uplinkPortgroupKey;
    protected Integer connectionCookie;

    /**
     * Gets the value of the pnicDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnicDevice() {
        return pnicDevice;
    }

    /**
     * Sets the value of the pnicDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnicDevice(String value) {
        this.pnicDevice = value;
    }

    /**
     * Gets the value of the uplinkPortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUplinkPortKey() {
        return uplinkPortKey;
    }

    /**
     * Sets the value of the uplinkPortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUplinkPortKey(String value) {
        this.uplinkPortKey = value;
    }

    /**
     * Gets the value of the uplinkPortgroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUplinkPortgroupKey() {
        return uplinkPortgroupKey;
    }

    /**
     * Sets the value of the uplinkPortgroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUplinkPortgroupKey(String value) {
        this.uplinkPortgroupKey = value;
    }

    /**
     * Gets the value of the connectionCookie property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectionCookie() {
        return connectionCookie;
    }

    /**
     * Sets the value of the connectionCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectionCookie(Integer value) {
        this.connectionCookie = value;
    }

}
