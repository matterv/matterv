
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasAdvancedRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasAdvancedRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dasHostInfo" type="{urn:internalvim25}ClusterDasHostInfo" minOccurs="0"/>
 *         <element name="vmcpSupported" type="{urn:internalvim25}ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo" minOccurs="0"/>
 *         <element name="heartbeatDatastoreInfo" type="{urn:internalvim25}DasHeartbeatDatastoreInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasAdvancedRuntimeInfo", propOrder = {
    "dasHostInfo",
    "vmcpSupported",
    "heartbeatDatastoreInfo"
})
@XmlSeeAlso({
    ClusterDasFailoverLevelAdvancedRuntimeInfo.class
})
public class ClusterDasAdvancedRuntimeInfo
    extends DynamicData
{

    protected ClusterDasHostInfo dasHostInfo;
    protected ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo vmcpSupported;
    protected List<DasHeartbeatDatastoreInfo> heartbeatDatastoreInfo;

    /**
     * Gets the value of the dasHostInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasHostInfo }
     *     
     */
    public ClusterDasHostInfo getDasHostInfo() {
        return dasHostInfo;
    }

    /**
     * Sets the value of the dasHostInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasHostInfo }
     *     
     */
    public void setDasHostInfo(ClusterDasHostInfo value) {
        this.dasHostInfo = value;
    }

    /**
     * Gets the value of the vmcpSupported property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo }
     *     
     */
    public ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo getVmcpSupported() {
        return vmcpSupported;
    }

    /**
     * Sets the value of the vmcpSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo }
     *     
     */
    public void setVmcpSupported(ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo value) {
        this.vmcpSupported = value;
    }

    /**
     * Gets the value of the heartbeatDatastoreInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heartbeatDatastoreInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHeartbeatDatastoreInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DasHeartbeatDatastoreInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the heartbeatDatastoreInfo property.
     */
    public List<DasHeartbeatDatastoreInfo> getHeartbeatDatastoreInfo() {
        if (heartbeatDatastoreInfo == null) {
            heartbeatDatastoreInfo = new ArrayList<>();
        }
        return this.heartbeatDatastoreInfo;
    }

}
