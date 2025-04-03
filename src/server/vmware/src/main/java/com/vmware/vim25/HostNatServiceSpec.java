
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNatServiceSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNatServiceSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="virtualSwitch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="activeFtp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="allowAnyOui" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="configPort" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ipGatewayAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="udpTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="portForward" type="{urn:internalvim25}HostNatServicePortForwardSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="nameService" type="{urn:internalvim25}HostNatServiceNameServiceSpec" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNatServiceSpec", propOrder = {
    "virtualSwitch",
    "activeFtp",
    "allowAnyOui",
    "configPort",
    "ipGatewayAddress",
    "udpTimeout",
    "portForward",
    "nameService"
})
public class HostNatServiceSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String virtualSwitch;
    protected boolean activeFtp;
    protected boolean allowAnyOui;
    protected boolean configPort;
    @XmlElement(required = true)
    protected String ipGatewayAddress;
    protected int udpTimeout;
    protected List<HostNatServicePortForwardSpec> portForward;
    protected HostNatServiceNameServiceSpec nameService;

    /**
     * Gets the value of the virtualSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualSwitch() {
        return virtualSwitch;
    }

    /**
     * Sets the value of the virtualSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualSwitch(String value) {
        this.virtualSwitch = value;
    }

    /**
     * Gets the value of the activeFtp property.
     * 
     */
    public boolean isActiveFtp() {
        return activeFtp;
    }

    /**
     * Sets the value of the activeFtp property.
     * 
     */
    public void setActiveFtp(boolean value) {
        this.activeFtp = value;
    }

    /**
     * Gets the value of the allowAnyOui property.
     * 
     */
    public boolean isAllowAnyOui() {
        return allowAnyOui;
    }

    /**
     * Sets the value of the allowAnyOui property.
     * 
     */
    public void setAllowAnyOui(boolean value) {
        this.allowAnyOui = value;
    }

    /**
     * Gets the value of the configPort property.
     * 
     */
    public boolean isConfigPort() {
        return configPort;
    }

    /**
     * Sets the value of the configPort property.
     * 
     */
    public void setConfigPort(boolean value) {
        this.configPort = value;
    }

    /**
     * Gets the value of the ipGatewayAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpGatewayAddress() {
        return ipGatewayAddress;
    }

    /**
     * Sets the value of the ipGatewayAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpGatewayAddress(String value) {
        this.ipGatewayAddress = value;
    }

    /**
     * Gets the value of the udpTimeout property.
     * 
     */
    public int getUdpTimeout() {
        return udpTimeout;
    }

    /**
     * Sets the value of the udpTimeout property.
     * 
     */
    public void setUdpTimeout(int value) {
        this.udpTimeout = value;
    }

    /**
     * Gets the value of the portForward property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portForward property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPortForward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNatServicePortForwardSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the portForward property.
     */
    public List<HostNatServicePortForwardSpec> getPortForward() {
        if (portForward == null) {
            portForward = new ArrayList<>();
        }
        return this.portForward;
    }

    /**
     * Gets the value of the nameService property.
     * 
     * @return
     *     possible object is
     *     {@link HostNatServiceNameServiceSpec }
     *     
     */
    public HostNatServiceNameServiceSpec getNameService() {
        return nameService;
    }

    /**
     * Sets the value of the nameService property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNatServiceNameServiceSpec }
     *     
     */
    public void setNameService(HostNatServiceNameServiceSpec value) {
        this.nameService = value;
    }

}
