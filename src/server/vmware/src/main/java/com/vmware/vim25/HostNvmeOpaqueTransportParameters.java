
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeOpaqueTransportParameters complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNvmeOpaqueTransportParameters">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostNvmeTransportParameters">
 *       <sequence>
 *         <element name="trtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="traddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="adrfam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="trsvcid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="tsas" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeOpaqueTransportParameters", propOrder = {
    "trtype",
    "traddr",
    "adrfam",
    "trsvcid",
    "tsas"
})
public class HostNvmeOpaqueTransportParameters
    extends HostNvmeTransportParameters
{

    @XmlElement(required = true)
    protected String trtype;
    @XmlElement(required = true)
    protected String traddr;
    @XmlElement(required = true)
    protected String adrfam;
    @XmlElement(required = true)
    protected String trsvcid;
    @XmlElement(required = true)
    protected byte[] tsas;

    /**
     * Gets the value of the trtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrtype() {
        return trtype;
    }

    /**
     * Sets the value of the trtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrtype(String value) {
        this.trtype = value;
    }

    /**
     * Gets the value of the traddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraddr() {
        return traddr;
    }

    /**
     * Sets the value of the traddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraddr(String value) {
        this.traddr = value;
    }

    /**
     * Gets the value of the adrfam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrfam() {
        return adrfam;
    }

    /**
     * Sets the value of the adrfam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrfam(String value) {
        this.adrfam = value;
    }

    /**
     * Gets the value of the trsvcid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrsvcid() {
        return trsvcid;
    }

    /**
     * Sets the value of the trsvcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrsvcid(String value) {
        this.trsvcid = value;
    }

    /**
     * Gets the value of the tsas property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTsas() {
        return tsas;
    }

    /**
     * Sets the value of the tsas property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTsas(byte[] value) {
        this.tsas = value;
    }

}
