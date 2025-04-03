
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerfEntityMetric complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PerfEntityMetric">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}PerfEntityMetricBase">
 *       <sequence>
 *         <element name="sampleInfo" type="{urn:internalvim25}PerfSampleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="value" type="{urn:internalvim25}PerfMetricSeries" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfEntityMetric", propOrder = {
    "sampleInfo",
    "value"
})
public class PerfEntityMetric
    extends PerfEntityMetricBase
{

    protected List<PerfSampleInfo> sampleInfo;
    protected List<PerfMetricSeries> value;

    /**
     * Gets the value of the sampleInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSampleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerfSampleInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the sampleInfo property.
     */
    public List<PerfSampleInfo> getSampleInfo() {
        if (sampleInfo == null) {
            sampleInfo = new ArrayList<>();
        }
        return this.sampleInfo;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerfMetricSeries }
     * </p>
     * 
     * 
     * @return
     *     The value of the value property.
     */
    public List<PerfMetricSeries> getValue() {
        if (value == null) {
            value = new ArrayList<>();
        }
        return this.value;
    }

}
