
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCollectorWithInfoFilterForTasksRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateCollectorWithInfoFilterForTasksRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="filter" type="{urn:internalvim25}TaskFilterSpec"/>
 *         <element name="infoFilter" type="{urn:internalvim25}TaskInfoFilterSpec" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCollectorWithInfoFilterForTasksRequestType", propOrder = {
    "_this",
    "filter",
    "infoFilter"
})
public class CreateCollectorWithInfoFilterForTasksRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected TaskFilterSpec filter;
    protected TaskInfoFilterSpec infoFilter;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link TaskFilterSpec }
     *     
     */
    public TaskFilterSpec getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskFilterSpec }
     *     
     */
    public void setFilter(TaskFilterSpec value) {
        this.filter = value;
    }

    /**
     * Gets the value of the infoFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoFilterSpec }
     *     
     */
    public TaskInfoFilterSpec getInfoFilter() {
        return infoFilter;
    }

    /**
     * Sets the value of the infoFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoFilterSpec }
     *     
     */
    public void setInfoFilter(TaskInfoFilterSpec value) {
        this.infoFilter = value;
    }

}
