
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationIPSettings complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationIPSettings">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ip" type="{urn:internalvim25}CustomizationIpGenerator"/>
 *         <element name="subnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gateway" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipV6Spec" type="{urn:internalvim25}CustomizationIPSettingsIpV6AddressSpec" minOccurs="0"/>
 *         <element name="dnsServerList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dnsDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="primaryWINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="secondaryWINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="netBIOS" type="{urn:internalvim25}CustomizationNetBIOSMode" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationIPSettings", propOrder = {
    "ip",
    "subnetMask",
    "gateway",
    "ipV6Spec",
    "dnsServerList",
    "dnsDomain",
    "primaryWINS",
    "secondaryWINS",
    "netBIOS"
})
public class CustomizationIPSettings
    extends DynamicData
{

    @XmlElement(required = true)
    protected CustomizationIpGenerator ip;
    protected String subnetMask;
    protected List<String> gateway;
    protected CustomizationIPSettingsIpV6AddressSpec ipV6Spec;
    protected List<String> dnsServerList;
    protected String dnsDomain;
    protected String primaryWINS;
    protected String secondaryWINS;
    @XmlSchemaType(name = "string")
    protected CustomizationNetBIOSMode netBIOS;

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationIpGenerator }
     *     
     */
    public CustomizationIpGenerator getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationIpGenerator }
     *     
     */
    public void setIp(CustomizationIpGenerator value) {
        this.ip = value;
    }

    /**
     * Gets the value of the subnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetMask() {
        return subnetMask;
    }

    /**
     * Sets the value of the subnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetMask(String value) {
        this.subnetMask = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gateway property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGateway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the gateway property.
     */
    public List<String> getGateway() {
        if (gateway == null) {
            gateway = new ArrayList<>();
        }
        return this.gateway;
    }

    /**
     * Gets the value of the ipV6Spec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationIPSettingsIpV6AddressSpec }
     *     
     */
    public CustomizationIPSettingsIpV6AddressSpec getIpV6Spec() {
        return ipV6Spec;
    }

    /**
     * Sets the value of the ipV6Spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationIPSettingsIpV6AddressSpec }
     *     
     */
    public void setIpV6Spec(CustomizationIPSettingsIpV6AddressSpec value) {
        this.ipV6Spec = value;
    }

    /**
     * Gets the value of the dnsServerList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnsServerList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDnsServerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the dnsServerList property.
     */
    public List<String> getDnsServerList() {
        if (dnsServerList == null) {
            dnsServerList = new ArrayList<>();
        }
        return this.dnsServerList;
    }

    /**
     * Gets the value of the dnsDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnsDomain() {
        return dnsDomain;
    }

    /**
     * Sets the value of the dnsDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnsDomain(String value) {
        this.dnsDomain = value;
    }

    /**
     * Gets the value of the primaryWINS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWINS() {
        return primaryWINS;
    }

    /**
     * Sets the value of the primaryWINS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWINS(String value) {
        this.primaryWINS = value;
    }

    /**
     * Gets the value of the secondaryWINS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryWINS() {
        return secondaryWINS;
    }

    /**
     * Sets the value of the secondaryWINS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryWINS(String value) {
        this.secondaryWINS = value;
    }

    /**
     * Gets the value of the netBIOS property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationNetBIOSMode }
     *     
     */
    public CustomizationNetBIOSMode getNetBIOS() {
        return netBIOS;
    }

    /**
     * Sets the value of the netBIOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationNetBIOSMode }
     *     
     */
    public void setNetBIOS(CustomizationNetBIOSMode value) {
        this.netBIOS = value;
    }

}
