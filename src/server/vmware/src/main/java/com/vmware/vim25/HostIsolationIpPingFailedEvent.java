
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostIsolationIpPingFailedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostIsolationIpPingFailedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostDasEvent">
 *       <sequence>
 *         <element name="isolationIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIsolationIpPingFailedEvent", propOrder = {
    "isolationIp"
})
public class HostIsolationIpPingFailedEvent
    extends HostDasEvent
{

    @XmlElement(required = true)
    protected String isolationIp;

    /**
     * Gets the value of the isolationIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsolationIp() {
        return isolationIp;
    }

    /**
     * Sets the value of the isolationIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsolationIp(String value) {
        this.isolationIp = value;
    }

}
