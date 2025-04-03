
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HourlyTaskScheduler complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HourlyTaskScheduler">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}RecurrentTaskScheduler">
 *       <sequence>
 *         <element name="minute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HourlyTaskScheduler", propOrder = {
    "minute"
})
@XmlSeeAlso({
    DailyTaskScheduler.class
})
public class HourlyTaskScheduler
    extends RecurrentTaskScheduler
{

    protected int minute;

    /**
     * Gets the value of the minute property.
     * 
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     */
    public void setMinute(int value) {
        this.minute = value;
    }

}
