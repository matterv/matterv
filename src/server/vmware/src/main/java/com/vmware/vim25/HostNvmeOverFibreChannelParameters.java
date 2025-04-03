
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeOverFibreChannelParameters complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNvmeOverFibreChannelParameters">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostNvmeTransportParameters">
 *       <sequence>
 *         <element name="nodeWorldWideName" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="portWorldWideName" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeOverFibreChannelParameters", propOrder = {
    "nodeWorldWideName",
    "portWorldWideName"
})
public class HostNvmeOverFibreChannelParameters
    extends HostNvmeTransportParameters
{

    protected long nodeWorldWideName;
    protected long portWorldWideName;

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

}
