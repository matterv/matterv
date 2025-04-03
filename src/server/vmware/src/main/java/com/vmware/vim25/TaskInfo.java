
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaskInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="task" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="description" type="{urn:internalvim25}LocalizableMessage" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="descriptionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="entity" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="locked" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="state" type="{urn:internalvim25}TaskInfoState"/>
 *         <element name="cancelled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="cancelable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="error" type="{urn:internalvim25}LocalizedMethodFault" minOccurs="0"/>
 *         <element name="result" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         <element name="progress" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="progressDetails" type="{urn:internalvim25}KeyAnyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="reason" type="{urn:internalvim25}TaskReason"/>
 *         <element name="queueTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="completeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="eventChainId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="changeTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="parentTaskKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rootTaskKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="activationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskInfo", propOrder = {
    "key",
    "task",
    "description",
    "name",
    "descriptionId",
    "entity",
    "entityName",
    "locked",
    "state",
    "cancelled",
    "cancelable",
    "error",
    "result",
    "progress",
    "progressDetails",
    "reason",
    "queueTime",
    "startTime",
    "completeTime",
    "eventChainId",
    "changeTag",
    "parentTaskKey",
    "rootTaskKey",
    "activationId"
})
public class TaskInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected ManagedObjectReference task;
    protected LocalizableMessage description;
    protected String name;
    @XmlElement(required = true)
    protected String descriptionId;
    protected ManagedObjectReference entity;
    protected String entityName;
    protected List<ManagedObjectReference> locked;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TaskInfoState state;
    protected boolean cancelled;
    protected boolean cancelable;
    protected LocalizedMethodFault error;
    protected Object result;
    protected Integer progress;
    protected List<KeyAnyValue> progressDetails;
    @XmlElement(required = true)
    protected TaskReason reason;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar queueTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completeTime;
    protected int eventChainId;
    protected String changeTag;
    protected String parentTaskKey;
    protected String rootTaskKey;
    protected String activationId;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setTask(ManagedObjectReference value) {
        this.task = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizableMessage }
     *     
     */
    public LocalizableMessage getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizableMessage }
     *     
     */
    public void setDescription(LocalizableMessage value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the descriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionId() {
        return descriptionId;
    }

    /**
     * Sets the value of the descriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionId(String value) {
        this.descriptionId = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setEntity(ManagedObjectReference value) {
        this.entity = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locked property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLocked().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the locked property.
     */
    public List<ManagedObjectReference> getLocked() {
        if (locked == null) {
            locked = new ArrayList<>();
        }
        return this.locked;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoState }
     *     
     */
    public TaskInfoState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoState }
     *     
     */
    public void setState(TaskInfoState value) {
        this.state = value;
    }

    /**
     * Gets the value of the cancelled property.
     * 
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets the value of the cancelled property.
     * 
     */
    public void setCancelled(boolean value) {
        this.cancelled = value;
    }

    /**
     * Gets the value of the cancelable property.
     * 
     */
    public boolean isCancelable() {
        return cancelable;
    }

    /**
     * Sets the value of the cancelable property.
     * 
     */
    public void setCancelable(boolean value) {
        this.cancelable = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setError(LocalizedMethodFault value) {
        this.error = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResult(Object value) {
        this.result = value;
    }

    /**
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgress(Integer value) {
        this.progress = value;
    }

    /**
     * Gets the value of the progressDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progressDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProgressDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyAnyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the progressDetails property.
     */
    public List<KeyAnyValue> getProgressDetails() {
        if (progressDetails == null) {
            progressDetails = new ArrayList<>();
        }
        return this.progressDetails;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link TaskReason }
     *     
     */
    public TaskReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskReason }
     *     
     */
    public void setReason(TaskReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the queueTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQueueTime() {
        return queueTime;
    }

    /**
     * Sets the value of the queueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQueueTime(XMLGregorianCalendar value) {
        this.queueTime = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the completeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleteTime() {
        return completeTime;
    }

    /**
     * Sets the value of the completeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleteTime(XMLGregorianCalendar value) {
        this.completeTime = value;
    }

    /**
     * Gets the value of the eventChainId property.
     * 
     */
    public int getEventChainId() {
        return eventChainId;
    }

    /**
     * Sets the value of the eventChainId property.
     * 
     */
    public void setEventChainId(int value) {
        this.eventChainId = value;
    }

    /**
     * Gets the value of the changeTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeTag() {
        return changeTag;
    }

    /**
     * Sets the value of the changeTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeTag(String value) {
        this.changeTag = value;
    }

    /**
     * Gets the value of the parentTaskKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTaskKey() {
        return parentTaskKey;
    }

    /**
     * Sets the value of the parentTaskKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTaskKey(String value) {
        this.parentTaskKey = value;
    }

    /**
     * Gets the value of the rootTaskKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootTaskKey() {
        return rootTaskKey;
    }

    /**
     * Sets the value of the rootTaskKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootTaskKey(String value) {
        this.rootTaskKey = value;
    }

    /**
     * Gets the value of the activationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationId() {
        return activationId;
    }

    /**
     * Sets the value of the activationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationId(String value) {
        this.activationId = value;
    }

}
