
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmDeployFailedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmDeployFailedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="destDatastore" type="{urn:internalvim25}EntityEventArgument"/>
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
@XmlType(name = "VmDeployFailedEvent", propOrder = {
    "destDatastore",
    "reason"
})
public class VmDeployFailedEvent
    extends VmEvent
{

    @XmlElement(required = true)
    protected EntityEventArgument destDatastore;
    @XmlElement(required = true)
    protected LocalizedMethodFault reason;

    /**
     * Gets the value of the destDatastore property.
     * 
     * @return
     *     possible object is
     *     {@link EntityEventArgument }
     *     
     */
    public EntityEventArgument getDestDatastore() {
        return destDatastore;
    }

    /**
     * Sets the value of the destDatastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityEventArgument }
     *     
     */
    public void setDestDatastore(EntityEventArgument value) {
        this.destDatastore = value;
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
