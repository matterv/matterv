
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthlyByWeekdayTaskScheduler complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MonthlyByWeekdayTaskScheduler">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MonthlyTaskScheduler">
 *       <sequence>
 *         <element name="offset" type="{urn:internalvim25}WeekOfMonth"/>
 *         <element name="weekday" type="{urn:internalvim25}DayOfWeek"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyByWeekdayTaskScheduler", propOrder = {
    "offset",
    "weekday"
})
public class MonthlyByWeekdayTaskScheduler
    extends MonthlyTaskScheduler
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected WeekOfMonth offset;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DayOfWeek weekday;

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link WeekOfMonth }
     *     
     */
    public WeekOfMonth getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekOfMonth }
     *     
     */
    public void setOffset(WeekOfMonth value) {
        this.offset = value;
    }

    /**
     * Gets the value of the weekday property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getWeekday() {
        return weekday;
    }

    /**
     * Sets the value of the weekday property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setWeekday(DayOfWeek value) {
        this.weekday = value;
    }

}
