
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNfcConnectionInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNfcConnectionInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostDataTransportConnectionInfo">
 *       <sequence>
 *         <element name="streamingMemoryConsumed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNfcConnectionInfo", propOrder = {
    "streamingMemoryConsumed"
})
public class HostNfcConnectionInfo
    extends HostDataTransportConnectionInfo
{

    protected Long streamingMemoryConsumed;

    /**
     * Gets the value of the streamingMemoryConsumed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStreamingMemoryConsumed() {
        return streamingMemoryConsumed;
    }

    /**
     * Sets the value of the streamingMemoryConsumed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStreamingMemoryConsumed(Long value) {
        this.streamingMemoryConsumed = value;
    }

}
