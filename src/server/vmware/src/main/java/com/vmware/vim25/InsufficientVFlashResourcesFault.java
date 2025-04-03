
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsufficientVFlashResourcesFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InsufficientVFlashResourcesFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InsufficientResourcesFault">
 *       <sequence>
 *         <element name="freeSpaceInMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="freeSpace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="requestedSpaceInMB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="requestedSpace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientVFlashResourcesFault", propOrder = {
    "freeSpaceInMB",
    "freeSpace",
    "requestedSpaceInMB",
    "requestedSpace"
})
public class InsufficientVFlashResourcesFault
    extends InsufficientResourcesFault
{

    protected Long freeSpaceInMB;
    protected long freeSpace;
    protected Long requestedSpaceInMB;
    protected long requestedSpace;

    /**
     * Gets the value of the freeSpaceInMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeSpaceInMB() {
        return freeSpaceInMB;
    }

    /**
     * Sets the value of the freeSpaceInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeSpaceInMB(Long value) {
        this.freeSpaceInMB = value;
    }

    /**
     * Gets the value of the freeSpace property.
     * 
     */
    public long getFreeSpace() {
        return freeSpace;
    }

    /**
     * Sets the value of the freeSpace property.
     * 
     */
    public void setFreeSpace(long value) {
        this.freeSpace = value;
    }

    /**
     * Gets the value of the requestedSpaceInMB property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestedSpaceInMB() {
        return requestedSpaceInMB;
    }

    /**
     * Sets the value of the requestedSpaceInMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestedSpaceInMB(Long value) {
        this.requestedSpaceInMB = value;
    }

    /**
     * Gets the value of the requestedSpace property.
     * 
     */
    public long getRequestedSpace() {
        return requestedSpace;
    }

    /**
     * Sets the value of the requestedSpace property.
     * 
     */
    public void setRequestedSpace(long value) {
        this.requestedSpace = value;
    }

}
