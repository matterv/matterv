
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNatServiceNameServiceSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNatServiceNameServiceSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dnsAutoDetect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="dnsPolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dnsRetries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="dnsTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="dnsNameServer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="nbdsTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="nbnsRetries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="nbnsTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNatServiceNameServiceSpec", propOrder = {
    "dnsAutoDetect",
    "dnsPolicy",
    "dnsRetries",
    "dnsTimeout",
    "dnsNameServer",
    "nbdsTimeout",
    "nbnsRetries",
    "nbnsTimeout"
})
public class HostNatServiceNameServiceSpec
    extends DynamicData
{

    protected boolean dnsAutoDetect;
    @XmlElement(required = true)
    protected String dnsPolicy;
    protected int dnsRetries;
    protected int dnsTimeout;
    protected List<String> dnsNameServer;
    protected int nbdsTimeout;
    protected int nbnsRetries;
    protected int nbnsTimeout;

    /**
     * Gets the value of the dnsAutoDetect property.
     * 
     */
    public boolean isDnsAutoDetect() {
        return dnsAutoDetect;
    }

    /**
     * Sets the value of the dnsAutoDetect property.
     * 
     */
    public void setDnsAutoDetect(boolean value) {
        this.dnsAutoDetect = value;
    }

    /**
     * Gets the value of the dnsPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnsPolicy() {
        return dnsPolicy;
    }

    /**
     * Sets the value of the dnsPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnsPolicy(String value) {
        this.dnsPolicy = value;
    }

    /**
     * Gets the value of the dnsRetries property.
     * 
     */
    public int getDnsRetries() {
        return dnsRetries;
    }

    /**
     * Sets the value of the dnsRetries property.
     * 
     */
    public void setDnsRetries(int value) {
        this.dnsRetries = value;
    }

    /**
     * Gets the value of the dnsTimeout property.
     * 
     */
    public int getDnsTimeout() {
        return dnsTimeout;
    }

    /**
     * Sets the value of the dnsTimeout property.
     * 
     */
    public void setDnsTimeout(int value) {
        this.dnsTimeout = value;
    }

    /**
     * Gets the value of the dnsNameServer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnsNameServer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDnsNameServer().add(newItem);
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
     *     The value of the dnsNameServer property.
     */
    public List<String> getDnsNameServer() {
        if (dnsNameServer == null) {
            dnsNameServer = new ArrayList<>();
        }
        return this.dnsNameServer;
    }

    /**
     * Gets the value of the nbdsTimeout property.
     * 
     */
    public int getNbdsTimeout() {
        return nbdsTimeout;
    }

    /**
     * Sets the value of the nbdsTimeout property.
     * 
     */
    public void setNbdsTimeout(int value) {
        this.nbdsTimeout = value;
    }

    /**
     * Gets the value of the nbnsRetries property.
     * 
     */
    public int getNbnsRetries() {
        return nbnsRetries;
    }

    /**
     * Sets the value of the nbnsRetries property.
     * 
     */
    public void setNbnsRetries(int value) {
        this.nbnsRetries = value;
    }

    /**
     * Gets the value of the nbnsTimeout property.
     * 
     */
    public int getNbnsTimeout() {
        return nbnsTimeout;
    }

    /**
     * Sets the value of the nbnsTimeout property.
     * 
     */
    public void setNbnsTimeout(int value) {
        this.nbnsTimeout = value;
    }

}
