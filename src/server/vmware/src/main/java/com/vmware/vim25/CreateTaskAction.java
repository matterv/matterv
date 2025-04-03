
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateTaskAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateTaskAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Action">
 *       <sequence>
 *         <element name="taskTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cancelable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTaskAction", propOrder = {
    "taskTypeId",
    "cancelable"
})
public class CreateTaskAction
    extends Action
{

    @XmlElement(required = true)
    protected String taskTypeId;
    protected boolean cancelable;

    /**
     * Gets the value of the taskTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskTypeId() {
        return taskTypeId;
    }

    /**
     * Sets the value of the taskTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskTypeId(String value) {
        this.taskTypeId = value;
    }

    /**
     * Gets the value of the cancelable property.
     * 
     */
    public boolean isCancelable() {
        return cancelable;
    }

    /**
     * Sets the value of the cancelable property.
     * 
     */
    public void setCancelable(boolean value) {
        this.cancelable = value;
    }

}
