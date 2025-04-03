
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GatewayConnectFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GatewayConnectFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostConnectFault">
 *       <sequence>
 *         <element name="gatewayType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="gatewayId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="gatewayInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="details" type="{urn:internalvim25}LocalizableMessage" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayConnectFault", propOrder = {
    "gatewayType",
    "gatewayId",
    "gatewayInfo",
    "details"
})
@XmlSeeAlso({
    GatewayNotFound.class,
    GatewayNotReachable.class,
    GatewayOperationRefused.class,
    GatewayToHostConnectFault.class
})
public class GatewayConnectFault
    extends HostConnectFault
{

    @XmlElement(required = true)
    protected String gatewayType;
    @XmlElement(required = true)
    protected String gatewayId;
    @XmlElement(required = true)
    protected String gatewayInfo;
    protected LocalizableMessage details;

    /**
     * Gets the value of the gatewayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayType() {
        return gatewayType;
    }

    /**
     * Sets the value of the gatewayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayType(String value) {
        this.gatewayType = value;
    }

    /**
     * Gets the value of the gatewayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * Sets the value of the gatewayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayId(String value) {
        this.gatewayId = value;
    }

    /**
     * Gets the value of the gatewayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGatewayInfo() {
        return gatewayInfo;
    }

    /**
     * Sets the value of the gatewayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGatewayInfo(String value) {
        this.gatewayInfo = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizableMessage }
     *     
     */
    public LocalizableMessage getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizableMessage }
     *     
     */
    public void setDetails(LocalizableMessage value) {
        this.details = value;
    }

}
