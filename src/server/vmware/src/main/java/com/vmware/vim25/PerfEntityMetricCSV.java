
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerfEntityMetricCSV complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PerfEntityMetricCSV">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}PerfEntityMetricBase">
 *       <sequence>
 *         <element name="sampleInfoCSV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="value" type="{urn:internalvim25}PerfMetricSeriesCSV" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfEntityMetricCSV", propOrder = {
    "sampleInfoCSV",
    "value"
})
public class PerfEntityMetricCSV
    extends PerfEntityMetricBase
{

    @XmlElement(required = true)
    protected String sampleInfoCSV;
    protected List<PerfMetricSeriesCSV> value;

    /**
     * Gets the value of the sampleInfoCSV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleInfoCSV() {
        return sampleInfoCSV;
    }

    /**
     * Sets the value of the sampleInfoCSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleInfoCSV(String value) {
        this.sampleInfoCSV = value;
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
     * {@link PerfMetricSeriesCSV }
     * </p>
     * 
     * 
     * @return
     *     The value of the value property.
     */
    public List<PerfMetricSeriesCSV> getValue() {
        if (value == null) {
            value = new ArrayList<>();
        }
        return this.value;
    }

}
