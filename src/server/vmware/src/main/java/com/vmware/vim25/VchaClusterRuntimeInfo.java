
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VchaClusterRuntimeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VchaClusterRuntimeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="clusterState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nodeInfo" type="{urn:internalvim25}VchaNodeRuntimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="clusterMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaClusterRuntimeInfo", propOrder = {
    "clusterState",
    "nodeInfo",
    "clusterMode"
})
public class VchaClusterRuntimeInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String clusterState;
    protected List<VchaNodeRuntimeInfo> nodeInfo;
    @XmlElement(required = true)
    protected String clusterMode;

    /**
     * Gets the value of the clusterState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterState() {
        return clusterState;
    }

    /**
     * Sets the value of the clusterState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterState(String value) {
        this.clusterState = value;
    }

    /**
     * Gets the value of the nodeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VchaNodeRuntimeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the nodeInfo property.
     */
    public List<VchaNodeRuntimeInfo> getNodeInfo() {
        if (nodeInfo == null) {
            nodeInfo = new ArrayList<>();
        }
        return this.nodeInfo;
    }

    /**
     * Gets the value of the clusterMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterMode() {
        return clusterMode;
    }

    /**
     * Sets the value of the clusterMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterMode(String value) {
        this.clusterMode = value;
    }

}
