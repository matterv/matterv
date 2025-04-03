
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DailyTaskScheduler complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DailyTaskScheduler">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HourlyTaskScheduler">
 *       <sequence>
 *         <element name="hour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyTaskScheduler", propOrder = {
    "hour"
})
@XmlSeeAlso({
    WeeklyTaskScheduler.class,
    MonthlyTaskScheduler.class
})
public class DailyTaskScheduler
    extends HourlyTaskScheduler
{

    protected int hour;

    /**
     * Gets the value of the hour property.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

}
