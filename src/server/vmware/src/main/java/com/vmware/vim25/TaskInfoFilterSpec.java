
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskInfoFilterSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaskInfoFilterSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="filterTaskResults" type="{urn:internalvim25}TaskInfoFilterSpecFilterTaskResults" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskInfoFilterSpec", propOrder = {
    "filterTaskResults"
})
public class TaskInfoFilterSpec
    extends DynamicData
{

    protected TaskInfoFilterSpecFilterTaskResults filterTaskResults;

    /**
     * Gets the value of the filterTaskResults property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoFilterSpecFilterTaskResults }
     *     
     */
    public TaskInfoFilterSpecFilterTaskResults getFilterTaskResults() {
        return filterTaskResults;
    }

    /**
     * Sets the value of the filterTaskResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoFilterSpecFilterTaskResults }
     *     
     */
    public void setFilterTaskResults(TaskInfoFilterSpecFilterTaskResults value) {
        this.filterTaskResults = value;
    }

}
