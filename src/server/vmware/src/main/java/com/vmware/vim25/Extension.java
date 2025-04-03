
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Extension complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Extension">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="description" type="{urn:internalvim25}Description"/>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="subjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="server" type="{urn:internalvim25}ExtensionServerInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="client" type="{urn:internalvim25}ExtensionClientInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="taskList" type="{urn:internalvim25}ExtensionTaskTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="eventList" type="{urn:internalvim25}ExtensionEventTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="faultList" type="{urn:internalvim25}ExtensionFaultTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="privilegeList" type="{urn:internalvim25}ExtensionPrivilegeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="resourceList" type="{urn:internalvim25}ExtensionResourceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="lastHeartbeatTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="healthInfo" type="{urn:internalvim25}ExtensionHealthInfo" minOccurs="0"/>
 *         <element name="ovfConsumerInfo" type="{urn:internalvim25}ExtensionOvfConsumerInfo" minOccurs="0"/>
 *         <element name="extendedProductInfo" type="{urn:internalvim25}ExtExtendedProductInfo" minOccurs="0"/>
 *         <element name="managedEntityInfo" type="{urn:internalvim25}ExtManagedEntityInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="shownInSolutionManager" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="solutionManagerInfo" type="{urn:internalvim25}ExtSolutionManagerInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extension", propOrder = {
    "description",
    "key",
    "company",
    "type",
    "version",
    "subjectName",
    "server",
    "client",
    "taskList",
    "eventList",
    "faultList",
    "privilegeList",
    "resourceList",
    "lastHeartbeatTime",
    "healthInfo",
    "ovfConsumerInfo",
    "extendedProductInfo",
    "managedEntityInfo",
    "shownInSolutionManager",
    "solutionManagerInfo"
})
public class Extension
    extends DynamicData
{

    @XmlElement(required = true)
    protected Description description;
    @XmlElement(required = true)
    protected String key;
    protected String company;
    protected String type;
    @XmlElement(required = true)
    protected String version;
    protected String subjectName;
    protected List<ExtensionServerInfo> server;
    protected List<ExtensionClientInfo> client;
    protected List<ExtensionTaskTypeInfo> taskList;
    protected List<ExtensionEventTypeInfo> eventList;
    protected List<ExtensionFaultTypeInfo> faultList;
    protected List<ExtensionPrivilegeInfo> privilegeList;
    protected List<ExtensionResourceInfo> resourceList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastHeartbeatTime;
    protected ExtensionHealthInfo healthInfo;
    protected ExtensionOvfConsumerInfo ovfConsumerInfo;
    protected ExtExtendedProductInfo extendedProductInfo;
    protected List<ExtManagedEntityInfo> managedEntityInfo;
    protected Boolean shownInSolutionManager;
    protected ExtSolutionManagerInfo solutionManagerInfo;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the server property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionServerInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the server property.
     */
    public List<ExtensionServerInfo> getServer() {
        if (server == null) {
            server = new ArrayList<>();
        }
        return this.server;
    }

    /**
     * Gets the value of the client property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the client property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionClientInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the client property.
     */
    public List<ExtensionClientInfo> getClient() {
        if (client == null) {
            client = new ArrayList<>();
        }
        return this.client;
    }

    /**
     * Gets the value of the taskList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaskList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionTaskTypeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the taskList property.
     */
    public List<ExtensionTaskTypeInfo> getTaskList() {
        if (taskList == null) {
            taskList = new ArrayList<>();
        }
        return this.taskList;
    }

    /**
     * Gets the value of the eventList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEventList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionEventTypeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the eventList property.
     */
    public List<ExtensionEventTypeInfo> getEventList() {
        if (eventList == null) {
            eventList = new ArrayList<>();
        }
        return this.eventList;
    }

    /**
     * Gets the value of the faultList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFaultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionFaultTypeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the faultList property.
     */
    public List<ExtensionFaultTypeInfo> getFaultList() {
        if (faultList == null) {
            faultList = new ArrayList<>();
        }
        return this.faultList;
    }

    /**
     * Gets the value of the privilegeList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privilegeList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrivilegeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionPrivilegeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the privilegeList property.
     */
    public List<ExtensionPrivilegeInfo> getPrivilegeList() {
        if (privilegeList == null) {
            privilegeList = new ArrayList<>();
        }
        return this.privilegeList;
    }

    /**
     * Gets the value of the resourceList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResourceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionResourceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the resourceList property.
     */
    public List<ExtensionResourceInfo> getResourceList() {
        if (resourceList == null) {
            resourceList = new ArrayList<>();
        }
        return this.resourceList;
    }

    /**
     * Gets the value of the lastHeartbeatTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastHeartbeatTime() {
        return lastHeartbeatTime;
    }

    /**
     * Sets the value of the lastHeartbeatTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastHeartbeatTime(XMLGregorianCalendar value) {
        this.lastHeartbeatTime = value;
    }

    /**
     * Gets the value of the healthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionHealthInfo }
     *     
     */
    public ExtensionHealthInfo getHealthInfo() {
        return healthInfo;
    }

    /**
     * Sets the value of the healthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionHealthInfo }
     *     
     */
    public void setHealthInfo(ExtensionHealthInfo value) {
        this.healthInfo = value;
    }

    /**
     * Gets the value of the ovfConsumerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOvfConsumerInfo }
     *     
     */
    public ExtensionOvfConsumerInfo getOvfConsumerInfo() {
        return ovfConsumerInfo;
    }

    /**
     * Sets the value of the ovfConsumerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOvfConsumerInfo }
     *     
     */
    public void setOvfConsumerInfo(ExtensionOvfConsumerInfo value) {
        this.ovfConsumerInfo = value;
    }

    /**
     * Gets the value of the extendedProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtExtendedProductInfo }
     *     
     */
    public ExtExtendedProductInfo getExtendedProductInfo() {
        return extendedProductInfo;
    }

    /**
     * Sets the value of the extendedProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtExtendedProductInfo }
     *     
     */
    public void setExtendedProductInfo(ExtExtendedProductInfo value) {
        this.extendedProductInfo = value;
    }

    /**
     * Gets the value of the managedEntityInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managedEntityInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getManagedEntityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtManagedEntityInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the managedEntityInfo property.
     */
    public List<ExtManagedEntityInfo> getManagedEntityInfo() {
        if (managedEntityInfo == null) {
            managedEntityInfo = new ArrayList<>();
        }
        return this.managedEntityInfo;
    }

    /**
     * Gets the value of the shownInSolutionManager property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShownInSolutionManager() {
        return shownInSolutionManager;
    }

    /**
     * Sets the value of the shownInSolutionManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShownInSolutionManager(Boolean value) {
        this.shownInSolutionManager = value;
    }

    /**
     * Gets the value of the solutionManagerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtSolutionManagerInfo }
     *     
     */
    public ExtSolutionManagerInfo getSolutionManagerInfo() {
        return solutionManagerInfo;
    }

    /**
     * Sets the value of the solutionManagerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSolutionManagerInfo }
     *     
     */
    public void setSolutionManagerInfo(ExtSolutionManagerInfo value) {
        this.solutionManagerInfo = value;
    }

}
