
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduledTaskEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScheduledTaskEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Event">
 *       <sequence>
 *         <element name="scheduledTask" type="{urn:internalvim25}ScheduledTaskEventArgument"/>
 *         <element name="entity" type="{urn:internalvim25}ManagedEntityEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskEvent", propOrder = {
    "scheduledTask",
    "entity"
})
@XmlSeeAlso({
    ScheduledTaskCreatedEvent.class,
    ScheduledTaskStartedEvent.class,
    ScheduledTaskRemovedEvent.class,
    ScheduledTaskReconfiguredEvent.class,
    ScheduledTaskCompletedEvent.class,
    ScheduledTaskFailedEvent.class,
    ScheduledTaskEmailCompletedEvent.class,
    ScheduledTaskEmailFailedEvent.class
})
public class ScheduledTaskEvent
    extends Event
{

    @XmlElement(required = true)
    protected ScheduledTaskEventArgument scheduledTask;
    @XmlElement(required = true)
    protected ManagedEntityEventArgument entity;

    /**
     * Gets the value of the scheduledTask property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledTaskEventArgument }
     *     
     */
    public ScheduledTaskEventArgument getScheduledTask() {
        return scheduledTask;
    }

    /**
     * Sets the value of the scheduledTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledTaskEventArgument }
     *     
     */
    public void setScheduledTask(ScheduledTaskEventArgument value) {
        this.scheduledTask = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityEventArgument }
     *     
     */
    public ManagedEntityEventArgument getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityEventArgument }
     *     
     */
    public void setEntity(ManagedEntityEventArgument value) {
        this.entity = value;
    }

}
