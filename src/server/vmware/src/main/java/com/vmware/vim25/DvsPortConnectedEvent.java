
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsPortConnectedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsPortConnectedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsEvent">
 *       <sequence>
 *         <element name="portKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="connectee" type="{urn:internalvim25}DistributedVirtualSwitchPortConnectee" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortConnectedEvent", propOrder = {
    "portKey",
    "connectee"
})
public class DvsPortConnectedEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected String portKey;
    protected DistributedVirtualSwitchPortConnectee connectee;

    /**
     * Gets the value of the portKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortKey() {
        return portKey;
    }

    /**
     * Sets the value of the portKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortKey(String value) {
        this.portKey = value;
    }

    /**
     * Gets the value of the connectee property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchPortConnectee }
     *     
     */
    public DistributedVirtualSwitchPortConnectee getConnectee() {
        return connectee;
    }

    /**
     * Sets the value of the connectee property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchPortConnectee }
     *     
     */
    public void setConnectee(DistributedVirtualSwitchPortConnectee value) {
        this.connectee = value;
    }

}
