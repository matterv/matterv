
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsufficientCpuResourcesFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InsufficientCpuResourcesFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InsufficientResourcesFault">
 *       <sequence>
 *         <element name="unreserved" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="requested" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientCpuResourcesFault", propOrder = {
    "unreserved",
    "requested"
})
public class InsufficientCpuResourcesFault
    extends InsufficientResourcesFault
{

    protected long unreserved;
    protected long requested;

    /**
     * Gets the value of the unreserved property.
     * 
     */
    public long getUnreserved() {
        return unreserved;
    }

    /**
     * Sets the value of the unreserved property.
     * 
     */
    public void setUnreserved(long value) {
        this.unreserved = value;
    }

    /**
     * Gets the value of the requested property.
     * 
     */
    public long getRequested() {
        return requested;
    }

    /**
     * Sets the value of the requested property.
     * 
     */
    public void setRequested(long value) {
        this.requested = value;
    }

}
