
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFibreChannelHba complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostFibreChannelHba">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostHostBusAdapter">
 *       <sequence>
 *         <element name="portWorldWideName" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="nodeWorldWideName" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="portType" type="{urn:internalvim25}FibreChannelPortType"/>
 *         <element name="speed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFibreChannelHba", propOrder = {
    "portWorldWideName",
    "nodeWorldWideName",
    "portType",
    "speed"
})
@XmlSeeAlso({
    HostFibreChannelOverEthernetHba.class
})
public class HostFibreChannelHba
    extends HostHostBusAdapter
{

    protected long portWorldWideName;
    protected long nodeWorldWideName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FibreChannelPortType portType;
    protected long speed;

    /**
     * Gets the value of the portWorldWideName property.
     * 
     */
    public long getPortWorldWideName() {
        return portWorldWideName;
    }

    /**
     * Sets the value of the portWorldWideName property.
     * 
     */
    public void setPortWorldWideName(long value) {
        this.portWorldWideName = value;
    }

    /**
     * Gets the value of the nodeWorldWideName property.
     * 
     */
    public long getNodeWorldWideName() {
        return nodeWorldWideName;
    }

    /**
     * Sets the value of the nodeWorldWideName property.
     * 
     */
    public void setNodeWorldWideName(long value) {
        this.nodeWorldWideName = value;
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link FibreChannelPortType }
     *     
     */
    public FibreChannelPortType getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FibreChannelPortType }
     *     
     */
    public void setPortType(FibreChannelPortType value) {
        this.portType = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public long getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(long value) {
        this.speed = value;
    }

}
