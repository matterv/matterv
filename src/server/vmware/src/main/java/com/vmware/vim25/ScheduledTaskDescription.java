
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduledTaskDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScheduledTaskDescription">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="action" type="{urn:internalvim25}TypeDescription" maxOccurs="unbounded"/>
 *         <element name="schedulerInfo" type="{urn:internalvim25}ScheduledTaskDetail" maxOccurs="unbounded"/>
 *         <element name="state" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="dayOfWeek" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="weekOfMonth" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskDescription", propOrder = {
    "action",
    "schedulerInfo",
    "state",
    "dayOfWeek",
    "weekOfMonth"
})
public class ScheduledTaskDescription
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<TypeDescription> action;
    @XmlElement(required = true)
    protected List<ScheduledTaskDetail> schedulerInfo;
    @XmlElement(required = true)
    protected List<ElementDescription> state;
    @XmlElement(required = true)
    protected List<ElementDescription> dayOfWeek;
    @XmlElement(required = true)
    protected List<ElementDescription> weekOfMonth;

    /**
     * Gets the value of the action property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the action property.
     */
    public List<TypeDescription> getAction() {
        if (action == null) {
            action = new ArrayList<>();
        }
        return this.action;
    }

    /**
     * Gets the value of the schedulerInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedulerInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSchedulerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduledTaskDetail }
     * </p>
     * 
     * 
     * @return
     *     The value of the schedulerInfo property.
     */
    public List<ScheduledTaskDetail> getSchedulerInfo() {
        if (schedulerInfo == null) {
            schedulerInfo = new ArrayList<>();
        }
        return this.schedulerInfo;
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
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the state property.
     */
    public List<ElementDescription> getState() {
        if (state == null) {
            state = new ArrayList<>();
        }
        return this.state;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayOfWeek property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDayOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the dayOfWeek property.
     */
    public List<ElementDescription> getDayOfWeek() {
        if (dayOfWeek == null) {
            dayOfWeek = new ArrayList<>();
        }
        return this.dayOfWeek;
    }

    /**
     * Gets the value of the weekOfMonth property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weekOfMonth property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWeekOfMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the weekOfMonth property.
     */
    public List<ElementDescription> getWeekOfMonth() {
        if (weekOfMonth == null) {
            weekOfMonth = new ArrayList<>();
        }
        return this.weekOfMonth;
    }

}
