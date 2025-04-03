
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNvmeSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="hbaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="transportParameters" type="{urn:internalvim25}HostNvmeTransportParameters"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeSpec", propOrder = {
    "hbaName",
    "transportParameters"
})
@XmlSeeAlso({
    HostNvmeDiscoverSpec.class,
    HostNvmeConnectSpec.class
})
public class HostNvmeSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String hbaName;
    @XmlElement(required = true)
    protected HostNvmeTransportParameters transportParameters;

    /**
     * Gets the value of the hbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHbaName() {
        return hbaName;
    }

    /**
     * Sets the value of the hbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHbaName(String value) {
        this.hbaName = value;
    }

    /**
     * Gets the value of the transportParameters property.
     * 
     * @return
     *     possible object is
     *     {@link HostNvmeTransportParameters }
     *     
     */
    public HostNvmeTransportParameters getTransportParameters() {
        return transportParameters;
    }

    /**
     * Sets the value of the transportParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNvmeTransportParameters }
     *     
     */
    public void setTransportParameters(HostNvmeTransportParameters value) {
        this.transportParameters = value;
    }

}
