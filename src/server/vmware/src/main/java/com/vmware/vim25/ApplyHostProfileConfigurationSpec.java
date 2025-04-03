
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplyHostProfileConfigurationSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApplyHostProfileConfigurationSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ProfileExecuteResult">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="taskListRequirement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="taskDescription" type="{urn:internalvim25}LocalizableMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="rebootStateless" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="rebootHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="faultData" type="{urn:internalvim25}LocalizedMethodFault" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyHostProfileConfigurationSpec", propOrder = {
    "host",
    "taskListRequirement",
    "taskDescription",
    "rebootStateless",
    "rebootHost",
    "faultData"
})
public class ApplyHostProfileConfigurationSpec
    extends ProfileExecuteResult
{

    @XmlElement(required = true)
    protected ManagedObjectReference host;
    protected List<String> taskListRequirement;
    protected List<LocalizableMessage> taskDescription;
    protected Boolean rebootStateless;
    protected Boolean rebootHost;
    protected LocalizedMethodFault faultData;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the taskListRequirement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskListRequirement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaskListRequirement().add(newItem);
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
     *     The value of the taskListRequirement property.
     */
    public List<String> getTaskListRequirement() {
        if (taskListRequirement == null) {
            taskListRequirement = new ArrayList<>();
        }
        return this.taskListRequirement;
    }

    /**
     * Gets the value of the taskDescription property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskDescription property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaskDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizableMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the taskDescription property.
     */
    public List<LocalizableMessage> getTaskDescription() {
        if (taskDescription == null) {
            taskDescription = new ArrayList<>();
        }
        return this.taskDescription;
    }

    /**
     * Gets the value of the rebootStateless property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRebootStateless() {
        return rebootStateless;
    }

    /**
     * Sets the value of the rebootStateless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRebootStateless(Boolean value) {
        this.rebootStateless = value;
    }

    /**
     * Gets the value of the rebootHost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRebootHost() {
        return rebootHost;
    }

    /**
     * Sets the value of the rebootHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRebootHost(Boolean value) {
        this.rebootHost = value;
    }

    /**
     * Gets the value of the faultData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getFaultData() {
        return faultData;
    }

    /**
     * Sets the value of the faultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setFaultData(LocalizedMethodFault value) {
        this.faultData = value;
    }

}
