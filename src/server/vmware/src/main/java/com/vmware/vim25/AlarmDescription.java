
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AlarmDescription">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="expr" type="{urn:internalvim25}TypeDescription" maxOccurs="unbounded"/>
 *         <element name="stateOperator" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="metricOperator" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="hostSystemConnectionState" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="virtualMachinePowerState" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="datastoreConnectionState" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hostSystemPowerState" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="virtualMachineGuestHeartbeatStatus" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="entityStatus" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="action" type="{urn:internalvim25}TypeDescription" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmDescription", propOrder = {
    "expr",
    "stateOperator",
    "metricOperator",
    "hostSystemConnectionState",
    "virtualMachinePowerState",
    "datastoreConnectionState",
    "hostSystemPowerState",
    "virtualMachineGuestHeartbeatStatus",
    "entityStatus",
    "action"
})
public class AlarmDescription
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<TypeDescription> expr;
    @XmlElement(required = true)
    protected List<ElementDescription> stateOperator;
    @XmlElement(required = true)
    protected List<ElementDescription> metricOperator;
    @XmlElement(required = true)
    protected List<ElementDescription> hostSystemConnectionState;
    @XmlElement(required = true)
    protected List<ElementDescription> virtualMachinePowerState;
    protected List<ElementDescription> datastoreConnectionState;
    protected List<ElementDescription> hostSystemPowerState;
    protected List<ElementDescription> virtualMachineGuestHeartbeatStatus;
    @XmlElement(required = true)
    protected List<ElementDescription> entityStatus;
    @XmlElement(required = true)
    protected List<TypeDescription> action;

    /**
     * Gets the value of the expr property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expr property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the expr property.
     */
    public List<TypeDescription> getExpr() {
        if (expr == null) {
            expr = new ArrayList<>();
        }
        return this.expr;
    }

    /**
     * Gets the value of the stateOperator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateOperator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStateOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the stateOperator property.
     */
    public List<ElementDescription> getStateOperator() {
        if (stateOperator == null) {
            stateOperator = new ArrayList<>();
        }
        return this.stateOperator;
    }

    /**
     * Gets the value of the metricOperator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metricOperator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMetricOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the metricOperator property.
     */
    public List<ElementDescription> getMetricOperator() {
        if (metricOperator == null) {
            metricOperator = new ArrayList<>();
        }
        return this.metricOperator;
    }

    /**
     * Gets the value of the hostSystemConnectionState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostSystemConnectionState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostSystemConnectionState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostSystemConnectionState property.
     */
    public List<ElementDescription> getHostSystemConnectionState() {
        if (hostSystemConnectionState == null) {
            hostSystemConnectionState = new ArrayList<>();
        }
        return this.hostSystemConnectionState;
    }

    /**
     * Gets the value of the virtualMachinePowerState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachinePowerState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachinePowerState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachinePowerState property.
     */
    public List<ElementDescription> getVirtualMachinePowerState() {
        if (virtualMachinePowerState == null) {
            virtualMachinePowerState = new ArrayList<>();
        }
        return this.virtualMachinePowerState;
    }

    /**
     * Gets the value of the datastoreConnectionState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datastoreConnectionState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatastoreConnectionState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the datastoreConnectionState property.
     */
    public List<ElementDescription> getDatastoreConnectionState() {
        if (datastoreConnectionState == null) {
            datastoreConnectionState = new ArrayList<>();
        }
        return this.datastoreConnectionState;
    }

    /**
     * Gets the value of the hostSystemPowerState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostSystemPowerState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostSystemPowerState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostSystemPowerState property.
     */
    public List<ElementDescription> getHostSystemPowerState() {
        if (hostSystemPowerState == null) {
            hostSystemPowerState = new ArrayList<>();
        }
        return this.hostSystemPowerState;
    }

    /**
     * Gets the value of the virtualMachineGuestHeartbeatStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualMachineGuestHeartbeatStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualMachineGuestHeartbeatStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualMachineGuestHeartbeatStatus property.
     */
    public List<ElementDescription> getVirtualMachineGuestHeartbeatStatus() {
        if (virtualMachineGuestHeartbeatStatus == null) {
            virtualMachineGuestHeartbeatStatus = new ArrayList<>();
        }
        return this.virtualMachineGuestHeartbeatStatus;
    }

    /**
     * Gets the value of the entityStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the entityStatus property.
     */
    public List<ElementDescription> getEntityStatus() {
        if (entityStatus == null) {
            entityStatus = new ArrayList<>();
        }
        return this.entityStatus;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the action property.
     */
    public List<TypeDescription> getAction() {
        if (action == null) {
            action = new ArrayList<>();
        }
        return this.action;
    }

}
