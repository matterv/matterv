
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineTicket complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineTicket">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cfgFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="host" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="sslThumbprint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="certThumbprintList" type="{urn:internalvim25}VirtualMachineCertThumbprint" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineTicket", propOrder = {
    "ticket",
    "cfgFile",
    "host",
    "port",
    "sslThumbprint",
    "certThumbprintList",
    "url"
})
public class VirtualMachineTicket
    extends DynamicData
{

    @XmlElement(required = true)
    protected String ticket;
    @XmlElement(required = true)
    protected String cfgFile;
    protected String host;
    protected Integer port;
    protected String sslThumbprint;
    protected List<VirtualMachineCertThumbprint> certThumbprintList;
    protected String url;

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the cfgFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgFile() {
        return cfgFile;
    }

    /**
     * Sets the value of the cfgFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgFile(String value) {
        this.cfgFile = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPort(Integer value) {
        this.port = value;
    }

    /**
     * Gets the value of the sslThumbprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSslThumbprint() {
        return sslThumbprint;
    }

    /**
     * Sets the value of the sslThumbprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSslThumbprint(String value) {
        this.sslThumbprint = value;
    }

    /**
     * Gets the value of the certThumbprintList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certThumbprintList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCertThumbprintList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineCertThumbprint }
     * </p>
     * 
     * 
     * @return
     *     The value of the certThumbprintList property.
     */
    public List<VirtualMachineCertThumbprint> getCertThumbprintList() {
        if (certThumbprintList == null) {
            certThumbprintList = new ArrayList<>();
        }
        return this.certThumbprintList;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
