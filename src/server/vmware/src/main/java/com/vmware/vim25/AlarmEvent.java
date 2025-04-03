
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AlarmEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Event">
 *       <sequence>
 *         <element name="alarm" type="{urn:internalvim25}AlarmEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmEvent", propOrder = {
    "alarm"
})
@XmlSeeAlso({
    AlarmCreatedEvent.class,
    AlarmStatusChangedEvent.class,
    AlarmActionTriggeredEvent.class,
    AlarmEmailCompletedEvent.class,
    AlarmEmailFailedEvent.class,
    AlarmSnmpCompletedEvent.class,
    AlarmSnmpFailedEvent.class,
    AlarmScriptCompleteEvent.class,
    AlarmScriptFailedEvent.class,
    AlarmRemovedEvent.class,
    AlarmReconfiguredEvent.class,
    AlarmAcknowledgedEvent.class,
    AlarmClearedEvent.class
})
public class AlarmEvent
    extends Event
{

    @XmlElement(required = true)
    protected AlarmEventArgument alarm;

    /**
     * Gets the value of the alarm property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmEventArgument }
     *     
     */
    public AlarmEventArgument getAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmEventArgument }
     *     
     */
    public void setAlarm(AlarmEventArgument value) {
        this.alarm = value;
    }

}
