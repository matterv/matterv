
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmSetting complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AlarmSetting">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="toleranceRange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="reportingFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmSetting", propOrder = {
    "toleranceRange",
    "reportingFrequency"
})
public class AlarmSetting
    extends DynamicData
{

    protected int toleranceRange;
    protected int reportingFrequency;

    /**
     * Gets the value of the toleranceRange property.
     * 
     */
    public int getToleranceRange() {
        return toleranceRange;
    }

    /**
     * Sets the value of the toleranceRange property.
     * 
     */
    public void setToleranceRange(int value) {
        this.toleranceRange = value;
    }

    /**
     * Gets the value of the reportingFrequency property.
     * 
     */
    public int getReportingFrequency() {
        return reportingFrequency;
    }

    /**
     * Sets the value of the reportingFrequency property.
     * 
     */
    public void setReportingFrequency(int value) {
        this.reportingFrequency = value;
    }

}
