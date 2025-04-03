
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduledTaskInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScheduledTaskInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ScheduledTaskSpec">
 *       <sequence>
 *         <element name="scheduledTask" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="entity" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="lastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="lastModifiedUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nextRunTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="prevRunTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="state" type="{urn:internalvim25}TaskInfoState"/>
 *         <element name="error" type="{urn:internalvim25}LocalizedMethodFault" minOccurs="0"/>
 *         <element name="result" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         <element name="progress" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="activeTask" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="taskObject" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskInfo", propOrder = {
    "scheduledTask",
    "entity",
    "lastModifiedTime",
    "lastModifiedUser",
    "nextRunTime",
    "prevRunTime",
    "state",
    "error",
    "result",
    "progress",
    "activeTask",
    "taskObject"
})
public class ScheduledTaskInfo
    extends ScheduledTaskSpec
{

    @XmlElement(required = true)
    protected ManagedObjectReference scheduledTask;
    @XmlElement(required = true)
    protected ManagedObjectReference entity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTime;
    @XmlElement(required = true)
    protected String lastModifiedUser;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextRunTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prevRunTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TaskInfoState state;
    protected LocalizedMethodFault error;
    protected Object result;
    protected Integer progress;
    protected ManagedObjectReference activeTask;
    protected ManagedObjectReference taskObject;

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
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedTime(XMLGregorianCalendar value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the lastModifiedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    /**
     * Sets the value of the lastModifiedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedUser(String value) {
        this.lastModifiedUser = value;
    }

    /**
     * Gets the value of the nextRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextRunTime() {
        return nextRunTime;
    }

    /**
     * Sets the value of the nextRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextRunTime(XMLGregorianCalendar value) {
        this.nextRunTime = value;
    }

    /**
     * Gets the value of the prevRunTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrevRunTime() {
        return prevRunTime;
    }

    /**
     * Sets the value of the prevRunTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrevRunTime(XMLGregorianCalendar value) {
        this.prevRunTime = value;
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
     * Gets the value of the activeTask property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getActiveTask() {
        return activeTask;
    }

    /**
     * Sets the value of the activeTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setActiveTask(ManagedObjectReference value) {
        this.activeTask = value;
    }

    /**
     * Gets the value of the taskObject property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getTaskObject() {
        return taskObject;
    }

    /**
     * Sets the value of the taskObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setTaskObject(ManagedObjectReference value) {
        this.taskObject = value;
    }

}
