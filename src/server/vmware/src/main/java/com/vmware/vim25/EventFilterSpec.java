
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFilterSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EventFilterSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="entity" type="{urn:internalvim25}EventFilterSpecByEntity" minOccurs="0"/>
 *         <element name="time" type="{urn:internalvim25}EventFilterSpecByTime" minOccurs="0"/>
 *         <element name="userName" type="{urn:internalvim25}EventFilterSpecByUsername" minOccurs="0"/>
 *         <element name="eventChainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="alarm" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="scheduledTask" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="disableFullMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="category" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="eventTypeId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="maxCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="delayedInit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventFilterSpec", propOrder = {
    "entity",
    "time",
    "userName",
    "eventChainId",
    "alarm",
    "scheduledTask",
    "disableFullMessage",
    "category",
    "type",
    "tag",
    "eventTypeId",
    "maxCount",
    "delayedInit"
})
public class EventFilterSpec
    extends DynamicData
{

    protected EventFilterSpecByEntity entity;
    protected EventFilterSpecByTime time;
    protected EventFilterSpecByUsername userName;
    protected Integer eventChainId;
    protected ManagedObjectReference alarm;
    protected ManagedObjectReference scheduledTask;
    protected Boolean disableFullMessage;
    protected List<String> category;
    protected List<String> type;
    protected List<String> tag;
    protected List<String> eventTypeId;
    protected Integer maxCount;
    protected Boolean delayedInit;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link EventFilterSpecByEntity }
     *     
     */
    public EventFilterSpecByEntity getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFilterSpecByEntity }
     *     
     */
    public void setEntity(EventFilterSpecByEntity value) {
        this.entity = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link EventFilterSpecByTime }
     *     
     */
    public EventFilterSpecByTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFilterSpecByTime }
     *     
     */
    public void setTime(EventFilterSpecByTime value) {
        this.time = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link EventFilterSpecByUsername }
     *     
     */
    public EventFilterSpecByUsername getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFilterSpecByUsername }
     *     
     */
    public void setUserName(EventFilterSpecByUsername value) {
        this.userName = value;
    }

    /**
     * Gets the value of the eventChainId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventChainId() {
        return eventChainId;
    }

    /**
     * Sets the value of the eventChainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventChainId(Integer value) {
        this.eventChainId = value;
    }

    /**
     * Gets the value of the alarm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setAlarm(ManagedObjectReference value) {
        this.alarm = value;
    }

    /**
     * Gets the value of the scheduledTask property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getScheduledTask() {
        return scheduledTask;
    }

    /**
     * Sets the value of the scheduledTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setScheduledTask(ManagedObjectReference value) {
        this.scheduledTask = value;
    }

    /**
     * Gets the value of the disableFullMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableFullMessage() {
        return disableFullMessage;
    }

    /**
     * Sets the value of the disableFullMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableFullMessage(Boolean value) {
        this.disableFullMessage = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the category property.
     */
    public List<String> getCategory() {
        if (category == null) {
            category = new ArrayList<>();
        }
        return this.category;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the type property.
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<>();
        }
        return this.type;
    }

    /**
     * Gets the value of the tag property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the tag property.
     */
    public List<String> getTag() {
        if (tag == null) {
            tag = new ArrayList<>();
        }
        return this.tag;
    }

    /**
     * Gets the value of the eventTypeId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTypeId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEventTypeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the eventTypeId property.
     */
    public List<String> getEventTypeId() {
        if (eventTypeId == null) {
            eventTypeId = new ArrayList<>();
        }
        return this.eventTypeId;
    }

    /**
     * Gets the value of the maxCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * Sets the value of the maxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCount(Integer value) {
        this.maxCount = value;
    }

    /**
     * Gets the value of the delayedInit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelayedInit() {
        return delayedInit;
    }

    /**
     * Sets the value of the delayedInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelayedInit(Boolean value) {
        this.delayedInit = value;
    }

}
