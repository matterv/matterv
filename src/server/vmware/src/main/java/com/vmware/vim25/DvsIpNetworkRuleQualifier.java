
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsIpNetworkRuleQualifier complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsIpNetworkRuleQualifier">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsNetworkRuleQualifier">
 *       <sequence>
 *         <element name="sourceAddress" type="{urn:internalvim25}IpAddress" minOccurs="0"/>
 *         <element name="destinationAddress" type="{urn:internalvim25}IpAddress" minOccurs="0"/>
 *         <element name="protocol" type="{urn:internalvim25}IntExpression" minOccurs="0"/>
 *         <element name="sourceIpPort" type="{urn:internalvim25}DvsIpPort" minOccurs="0"/>
 *         <element name="destinationIpPort" type="{urn:internalvim25}DvsIpPort" minOccurs="0"/>
 *         <element name="tcpFlags" type="{urn:internalvim25}IntExpression" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsIpNetworkRuleQualifier", propOrder = {
    "sourceAddress",
    "destinationAddress",
    "protocol",
    "sourceIpPort",
    "destinationIpPort",
    "tcpFlags"
})
public class DvsIpNetworkRuleQualifier
    extends DvsNetworkRuleQualifier
{

    protected IpAddress sourceAddress;
    protected IpAddress destinationAddress;
    protected IntExpression protocol;
    protected DvsIpPort sourceIpPort;
    protected DvsIpPort destinationIpPort;
    protected IntExpression tcpFlags;

    /**
     * Gets the value of the sourceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link IpAddress }
     *     
     */
    public IpAddress getSourceAddress() {
        return sourceAddress;
    }

    /**
     * Sets the value of the sourceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpAddress }
     *     
     */
    public void setSourceAddress(IpAddress value) {
        this.sourceAddress = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link IpAddress }
     *     
     */
    public IpAddress getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpAddress }
     *     
     */
    public void setDestinationAddress(IpAddress value) {
        this.destinationAddress = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link IntExpression }
     *     
     */
    public IntExpression getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntExpression }
     *     
     */
    public void setProtocol(IntExpression value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the sourceIpPort property.
     * 
     * @return
     *     possible object is
     *     {@link DvsIpPort }
     *     
     */
    public DvsIpPort getSourceIpPort() {
        return sourceIpPort;
    }

    /**
     * Sets the value of the sourceIpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvsIpPort }
     *     
     */
    public void setSourceIpPort(DvsIpPort value) {
        this.sourceIpPort = value;
    }

    /**
     * Gets the value of the destinationIpPort property.
     * 
     * @return
     *     possible object is
     *     {@link DvsIpPort }
     *     
     */
    public DvsIpPort getDestinationIpPort() {
        return destinationIpPort;
    }

    /**
     * Sets the value of the destinationIpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvsIpPort }
     *     
     */
    public void setDestinationIpPort(DvsIpPort value) {
        this.destinationIpPort = value;
    }

    /**
     * Gets the value of the tcpFlags property.
     * 
     * @return
     *     possible object is
     *     {@link IntExpression }
     *     
     */
    public IntExpression getTcpFlags() {
        return tcpFlags;
    }

    /**
     * Sets the value of the tcpFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntExpression }
     *     
     */
    public void setTcpFlags(IntExpression value) {
        this.tcpFlags = value;
    }

}
