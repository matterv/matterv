
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskFilterSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaskFilterSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="entity" type="{urn:internalvim25}TaskFilterSpecByEntity" minOccurs="0"/>
 *         <element name="time" type="{urn:internalvim25}TaskFilterSpecByTime" minOccurs="0"/>
 *         <element name="userName" type="{urn:internalvim25}TaskFilterSpecByUsername" minOccurs="0"/>
 *         <element name="activationId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="state" type="{urn:internalvim25}TaskInfoState" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="alarm" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="scheduledTask" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="eventChainId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="parentTaskKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="rootTaskKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskFilterSpec", propOrder = {
    "entity",
    "time",
    "userName",
    "activationId",
    "state",
    "alarm",
    "scheduledTask",
    "eventChainId",
    "tag",
    "parentTaskKey",
    "rootTaskKey"
})
public class TaskFilterSpec
    extends DynamicData
{

    protected TaskFilterSpecByEntity entity;
    protected TaskFilterSpecByTime time;
    protected TaskFilterSpecByUsername userName;
    protected List<String> activationId;
    @XmlSchemaType(name = "string")
    protected List<TaskInfoState> state;
    protected ManagedObjectReference alarm;
    protected ManagedObjectReference scheduledTask;
    @XmlElement(type = Integer.class)
    protected List<Integer> eventChainId;
    protected List<String> tag;
    protected List<String> parentTaskKey;
    protected List<String> rootTaskKey;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link TaskFilterSpecByEntity }
     *     
     */
    public TaskFilterSpecByEntity getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskFilterSpecByEntity }
     *     
     */
    public void setEntity(TaskFilterSpecByEntity value) {
        this.entity = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link TaskFilterSpecByTime }
     *     
     */
    public TaskFilterSpecByTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskFilterSpecByTime }
     *     
     */
    public void setTime(TaskFilterSpecByTime value) {
        this.time = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link TaskFilterSpecByUsername }
     *     
     */
    public TaskFilterSpecByUsername getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskFilterSpecByUsername }
     *     
     */
    public void setUserName(TaskFilterSpecByUsername value) {
        this.userName = value;
    }

    /**
     * Gets the value of the activationId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activationId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getActivationId().add(newItem);
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
     *     The value of the activationId property.
     */
    public List<String> getActivationId() {
        if (activationId == null) {
            activationId = new ArrayList<>();
        }
        return this.activationId;
    }

    /**
     * Gets the value of the state property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskInfoState }
     * </p>
     * 
     * 
     * @return
     *     The value of the state property.
     */
    public List<TaskInfoState> getState() {
        if (state == null) {
            state = new ArrayList<>();
        }
        return this.state;
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
     * Gets the value of the eventChainId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventChainId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEventChainId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the eventChainId property.
     */
    public List<Integer> getEventChainId() {
        if (eventChainId == null) {
            eventChainId = new ArrayList<>();
        }
        return this.eventChainId;
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
     * Gets the value of the parentTaskKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentTaskKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParentTaskKey().add(newItem);
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
     *     The value of the parentTaskKey property.
     */
    public List<String> getParentTaskKey() {
        if (parentTaskKey == null) {
            parentTaskKey = new ArrayList<>();
        }
        return this.parentTaskKey;
    }

    /**
     * Gets the value of the rootTaskKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootTaskKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRootTaskKey().add(newItem);
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
     *     The value of the rootTaskKey property.
     */
    public List<String> getRootTaskKey() {
        if (rootTaskKey == null) {
            rootTaskKey = new ArrayList<>();
        }
        return this.rootTaskKey;
    }

}
