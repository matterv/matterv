
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmDiskFailedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmDiskFailedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="disk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="reason" type="{urn:internalvim25}LocalizedMethodFault"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDiskFailedEvent", propOrder = {
    "disk",
    "reason"
})
public class VmDiskFailedEvent
    extends VmEvent
{

    @XmlElement(required = true)
    protected String disk;
    @XmlElement(required = true)
    protected LocalizedMethodFault reason;

    /**
     * Gets the value of the disk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisk() {
        return disk;
    }

    /**
     * Sets the value of the disk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisk(String value) {
        this.disk = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setReason(LocalizedMethodFault value) {
        this.reason = value;
    }

}
