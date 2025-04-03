
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPerfMetricSeriesCSV complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfPerfMetricSeriesCSV">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PerfMetricSeriesCSV" type="{urn:internalvim25}PerfMetricSeriesCSV" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerfMetricSeriesCSV", propOrder = {
    "perfMetricSeriesCSV"
})
public class ArrayOfPerfMetricSeriesCSV {

    @XmlElement(name = "PerfMetricSeriesCSV")
    protected List<PerfMetricSeriesCSV> perfMetricSeriesCSV;

    /**
     * Gets the value of the perfMetricSeriesCSV property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perfMetricSeriesCSV property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPerfMetricSeriesCSV().add(newItem);
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
     *     The value of the perfMetricSeriesCSV property.
     */
    public List<PerfMetricSeriesCSV> getPerfMetricSeriesCSV() {
        if (perfMetricSeriesCSV == null) {
            perfMetricSeriesCSV = new ArrayList<>();
        }
        return this.perfMetricSeriesCSV;
    }

}
