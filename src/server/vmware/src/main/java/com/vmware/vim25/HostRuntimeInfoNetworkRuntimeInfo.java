
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostRuntimeInfoNetworkRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostRuntimeInfoNetworkRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="netStackInstanceRuntimeInfo" type="{urn:internalvim25}HostRuntimeInfoNetStackInstanceRuntimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="networkResourceRuntime" type="{urn:internalvim25}HostNetworkResourceRuntime" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRuntimeInfoNetworkRuntimeInfo", propOrder = {
    "netStackInstanceRuntimeInfo",
    "networkResourceRuntime"
})
public class HostRuntimeInfoNetworkRuntimeInfo
    extends DynamicData
{

    protected List<HostRuntimeInfoNetStackInstanceRuntimeInfo> netStackInstanceRuntimeInfo;
    protected HostNetworkResourceRuntime networkResourceRuntime;

    /**
     * Gets the value of the netStackInstanceRuntimeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netStackInstanceRuntimeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetStackInstanceRuntimeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostRuntimeInfoNetStackInstanceRuntimeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the netStackInstanceRuntimeInfo property.
     */
    public List<HostRuntimeInfoNetStackInstanceRuntimeInfo> getNetStackInstanceRuntimeInfo() {
        if (netStackInstanceRuntimeInfo == null) {
            netStackInstanceRuntimeInfo = new ArrayList<>();
        }
        return this.netStackInstanceRuntimeInfo;
    }

    /**
     * Gets the value of the networkResourceRuntime property.
     * 
     * @return
     *     possible object is
     *     {@link HostNetworkResourceRuntime }
     *     
     */
    public HostNetworkResourceRuntime getNetworkResourceRuntime() {
        return networkResourceRuntime;
    }

    /**
     * Sets the value of the networkResourceRuntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNetworkResourceRuntime }
     *     
     */
    public void setNetworkResourceRuntime(HostNetworkResourceRuntime value) {
        this.networkResourceRuntime = value;
    }

}
