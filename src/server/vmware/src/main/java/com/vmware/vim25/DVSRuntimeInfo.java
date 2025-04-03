
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="hostMemberRuntime" type="{urn:internalvim25}HostMemberRuntimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="resourceRuntimeInfo" type="{urn:internalvim25}DvsResourceRuntimeInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSRuntimeInfo", propOrder = {
    "hostMemberRuntime",
    "resourceRuntimeInfo"
})
public class DVSRuntimeInfo
    extends DynamicData
{

    protected List<HostMemberRuntimeInfo> hostMemberRuntime;
    protected DvsResourceRuntimeInfo resourceRuntimeInfo;

    /**
     * Gets the value of the hostMemberRuntime property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostMemberRuntime property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostMemberRuntime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostMemberRuntimeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostMemberRuntime property.
     */
    public List<HostMemberRuntimeInfo> getHostMemberRuntime() {
        if (hostMemberRuntime == null) {
            hostMemberRuntime = new ArrayList<>();
        }
        return this.hostMemberRuntime;
    }

    /**
     * Gets the value of the resourceRuntimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DvsResourceRuntimeInfo }
     *     
     */
    public DvsResourceRuntimeInfo getResourceRuntimeInfo() {
        return resourceRuntimeInfo;
    }

    /**
     * Sets the value of the resourceRuntimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvsResourceRuntimeInfo }
     *     
     */
    public void setResourceRuntimeInfo(DvsResourceRuntimeInfo value) {
        this.resourceRuntimeInfo = value;
    }

}
