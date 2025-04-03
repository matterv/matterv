
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerfMetricSeries complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PerfMetricSeries">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{urn:internalvim25}PerfMetricId"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfMetricSeries", propOrder = {
    "id"
})
@XmlSeeAlso({
    PerfMetricIntSeries.class,
    PerfMetricSeriesCSV.class
})
public class PerfMetricSeries
    extends DynamicData
{

    @XmlElement(required = true)
    protected PerfMetricId id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PerfMetricId }
     *     
     */
    public PerfMetricId getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfMetricId }
     *     
     */
    public void setId(PerfMetricId value) {
        this.id = value;
    }

}
