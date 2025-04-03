
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatacenterBasicConnectInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatacenterBasicConnectInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="error" type="{urn:internalvim25}LocalizedMethodFault" minOccurs="0"/>
 *         <element name="serverIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="numVm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numPoweredOnVm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="hostProductInfo" type="{urn:internalvim25}AboutInfo" minOccurs="0"/>
 *         <element name="hardwareVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hardwareModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterBasicConnectInfo", propOrder = {
    "hostname",
    "error",
    "serverIp",
    "numVm",
    "numPoweredOnVm",
    "hostProductInfo",
    "hardwareVendor",
    "hardwareModel"
})
public class DatacenterBasicConnectInfo
    extends DynamicData
{

    protected String hostname;
    protected LocalizedMethodFault error;
    protected String serverIp;
    protected Integer numVm;
    protected Integer numPoweredOnVm;
    protected AboutInfo hostProductInfo;
    protected String hardwareVendor;
    protected String hardwareModel;

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setError(LocalizedMethodFault value) {
        this.error = value;
    }

    /**
     * Gets the value of the serverIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * Sets the value of the serverIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerIp(String value) {
        this.serverIp = value;
    }

    /**
     * Gets the value of the numVm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumVm() {
        return numVm;
    }

    /**
     * Sets the value of the numVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumVm(Integer value) {
        this.numVm = value;
    }

    /**
     * Gets the value of the numPoweredOnVm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPoweredOnVm() {
        return numPoweredOnVm;
    }

    /**
     * Sets the value of the numPoweredOnVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPoweredOnVm(Integer value) {
        this.numPoweredOnVm = value;
    }

    /**
     * Gets the value of the hostProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AboutInfo }
     *     
     */
    public AboutInfo getHostProductInfo() {
        return hostProductInfo;
    }

    /**
     * Sets the value of the hostProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AboutInfo }
     *     
     */
    public void setHostProductInfo(AboutInfo value) {
        this.hostProductInfo = value;
    }

    /**
     * Gets the value of the hardwareVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareVendor() {
        return hardwareVendor;
    }

    /**
     * Sets the value of the hardwareVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareVendor(String value) {
        this.hardwareVendor = value;
    }

    /**
     * Gets the value of the hardwareModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareModel() {
        return hardwareModel;
    }

    /**
     * Sets the value of the hardwareModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareModel(String value) {
        this.hardwareModel = value;
    }

}
