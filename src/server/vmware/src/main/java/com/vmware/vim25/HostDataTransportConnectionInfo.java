
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDataTransportConnectionInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDataTransportConnectionInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="staticMemoryConsumed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDataTransportConnectionInfo", propOrder = {
    "staticMemoryConsumed"
})
@XmlSeeAlso({
    HostNfcConnectionInfo.class
})
public class HostDataTransportConnectionInfo
    extends DynamicData
{

    protected long staticMemoryConsumed;

    /**
     * Gets the value of the staticMemoryConsumed property.
     * 
     */
    public long getStaticMemoryConsumed() {
        return staticMemoryConsumed;
    }

    /**
     * Sets the value of the staticMemoryConsumed property.
     * 
     */
    public void setStaticMemoryConsumed(long value) {
        this.staticMemoryConsumed = value;
    }

}
