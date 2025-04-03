
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDateTimeSystemServiceTestResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDateTimeSystemServiceTestResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="workingNormally" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="report" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDateTimeSystemServiceTestResult", propOrder = {
    "workingNormally",
    "report"
})
public class HostDateTimeSystemServiceTestResult
    extends DynamicData
{

    protected boolean workingNormally;
    protected List<String> report;

    /**
     * Gets the value of the workingNormally property.
     * 
     */
    public boolean isWorkingNormally() {
        return workingNormally;
    }

    /**
     * Sets the value of the workingNormally property.
     * 
     */
    public void setWorkingNormally(boolean value) {
        this.workingNormally = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the report property.
     */
    public List<String> getReport() {
        if (report == null) {
            report = new ArrayList<>();
        }
        return this.report;
    }

}
