
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualSwitchHostMember complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualSwitchHostMember">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="runtimeState" type="{urn:internalvim25}DistributedVirtualSwitchHostMemberRuntimeState" minOccurs="0"/>
 *         <element name="config" type="{urn:internalvim25}DistributedVirtualSwitchHostMemberConfigInfo"/>
 *         <element name="productInfo" type="{urn:internalvim25}DistributedVirtualSwitchProductSpec" minOccurs="0"/>
 *         <element name="uplinkPortKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="statusDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMember", propOrder = {
    "runtimeState",
    "config",
    "productInfo",
    "uplinkPortKey",
    "status",
    "statusDetail"
})
public class DistributedVirtualSwitchHostMember
    extends DynamicData
{

    protected DistributedVirtualSwitchHostMemberRuntimeState runtimeState;
    @XmlElement(required = true)
    protected DistributedVirtualSwitchHostMemberConfigInfo config;
    protected DistributedVirtualSwitchProductSpec productInfo;
    protected List<String> uplinkPortKey;
    @XmlElement(required = true)
    protected String status;
    protected String statusDetail;

    /**
     * Gets the value of the runtimeState property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchHostMemberRuntimeState }
     *     
     */
    public DistributedVirtualSwitchHostMemberRuntimeState getRuntimeState() {
        return runtimeState;
    }

    /**
     * Sets the value of the runtimeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchHostMemberRuntimeState }
     *     
     */
    public void setRuntimeState(DistributedVirtualSwitchHostMemberRuntimeState value) {
        this.runtimeState = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchHostMemberConfigInfo }
     *     
     */
    public DistributedVirtualSwitchHostMemberConfigInfo getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchHostMemberConfigInfo }
     *     
     */
    public void setConfig(DistributedVirtualSwitchHostMemberConfigInfo value) {
        this.config = value;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public DistributedVirtualSwitchProductSpec getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributedVirtualSwitchProductSpec }
     *     
     */
    public void setProductInfo(DistributedVirtualSwitchProductSpec value) {
        this.productInfo = value;
    }

    /**
     * Gets the value of the uplinkPortKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uplinkPortKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUplinkPortKey().add(newItem);
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
     *     The value of the uplinkPortKey property.
     */
    public List<String> getUplinkPortKey() {
        if (uplinkPortKey == null) {
            uplinkPortKey = new ArrayList<>();
        }
        return this.uplinkPortKey;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDetail(String value) {
        this.statusDetail = value;
    }

}
