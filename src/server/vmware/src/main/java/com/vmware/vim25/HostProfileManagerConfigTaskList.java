
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProfileManagerConfigTaskList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostProfileManagerConfigTaskList">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="configSpec" type="{urn:internalvim25}HostConfigSpec" minOccurs="0"/>
 *         <element name="taskDescription" type="{urn:internalvim25}LocalizableMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="taskListRequirement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileManagerConfigTaskList", propOrder = {
    "configSpec",
    "taskDescription",
    "taskListRequirement"
})
public class HostProfileManagerConfigTaskList
    extends DynamicData
{

    protected HostConfigSpec configSpec;
    protected List<LocalizableMessage> taskDescription;
    protected List<String> taskListRequirement;

    /**
     * Gets the value of the configSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostConfigSpec }
     *     
     */
    public HostConfigSpec getConfigSpec() {
        return configSpec;
    }

    /**
     * Sets the value of the configSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostConfigSpec }
     *     
     */
    public void setConfigSpec(HostConfigSpec value) {
        this.configSpec = value;
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

}
