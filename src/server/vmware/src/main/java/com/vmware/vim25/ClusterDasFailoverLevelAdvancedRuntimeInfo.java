
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasFailoverLevelAdvancedRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasFailoverLevelAdvancedRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterDasAdvancedRuntimeInfo">
 *       <sequence>
 *         <element name="slotInfo" type="{urn:internalvim25}ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo"/>
 *         <element name="totalSlots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="usedSlots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="unreservedSlots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="totalVms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="totalHosts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="totalGoodHosts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="hostSlots" type="{urn:internalvim25}ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vmsRequiringMultipleSlots" type="{urn:internalvim25}ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasFailoverLevelAdvancedRuntimeInfo", propOrder = {
    "slotInfo",
    "totalSlots",
    "usedSlots",
    "unreservedSlots",
    "totalVms",
    "totalHosts",
    "totalGoodHosts",
    "hostSlots",
    "vmsRequiringMultipleSlots"
})
public class ClusterDasFailoverLevelAdvancedRuntimeInfo
    extends ClusterDasAdvancedRuntimeInfo
{

    @XmlElement(required = true)
    protected ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo slotInfo;
    protected int totalSlots;
    protected int usedSlots;
    protected int unreservedSlots;
    protected int totalVms;
    protected int totalHosts;
    protected int totalGoodHosts;
    protected List<ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots> hostSlots;
    protected List<ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots> vmsRequiringMultipleSlots;

    /**
     * Gets the value of the slotInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo }
     *     
     */
    public ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo getSlotInfo() {
        return slotInfo;
    }

    /**
     * Sets the value of the slotInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo }
     *     
     */
    public void setSlotInfo(ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo value) {
        this.slotInfo = value;
    }

    /**
     * Gets the value of the totalSlots property.
     * 
     */
    public int getTotalSlots() {
        return totalSlots;
    }

    /**
     * Sets the value of the totalSlots property.
     * 
     */
    public void setTotalSlots(int value) {
        this.totalSlots = value;
    }

    /**
     * Gets the value of the usedSlots property.
     * 
     */
    public int getUsedSlots() {
        return usedSlots;
    }

    /**
     * Sets the value of the usedSlots property.
     * 
     */
    public void setUsedSlots(int value) {
        this.usedSlots = value;
    }

    /**
     * Gets the value of the unreservedSlots property.
     * 
     */
    public int getUnreservedSlots() {
        return unreservedSlots;
    }

    /**
     * Sets the value of the unreservedSlots property.
     * 
     */
    public void setUnreservedSlots(int value) {
        this.unreservedSlots = value;
    }

    /**
     * Gets the value of the totalVms property.
     * 
     */
    public int getTotalVms() {
        return totalVms;
    }

    /**
     * Sets the value of the totalVms property.
     * 
     */
    public void setTotalVms(int value) {
        this.totalVms = value;
    }

    /**
     * Gets the value of the totalHosts property.
     * 
     */
    public int getTotalHosts() {
        return totalHosts;
    }

    /**
     * Sets the value of the totalHosts property.
     * 
     */
    public void setTotalHosts(int value) {
        this.totalHosts = value;
    }

    /**
     * Gets the value of the totalGoodHosts property.
     * 
     */
    public int getTotalGoodHosts() {
        return totalGoodHosts;
    }

    /**
     * Sets the value of the totalGoodHosts property.
     * 
     */
    public void setTotalGoodHosts(int value) {
        this.totalGoodHosts = value;
    }

    /**
     * Gets the value of the hostSlots property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostSlots property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostSlots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostSlots property.
     */
    public List<ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots> getHostSlots() {
        if (hostSlots == null) {
            hostSlots = new ArrayList<>();
        }
        return this.hostSlots;
    }

    /**
     * Gets the value of the vmsRequiringMultipleSlots property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsRequiringMultipleSlots property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmsRequiringMultipleSlots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmsRequiringMultipleSlots property.
     */
    public List<ClusterDasFailoverLevelAdvancedRuntimeInfoVmSlots> getVmsRequiringMultipleSlots() {
        if (vmsRequiringMultipleSlots == null) {
            vmsRequiringMultipleSlots = new ArrayList<>();
        }
        return this.vmsRequiringMultipleSlots;
    }

}
