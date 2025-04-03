
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dasConfig" type="{urn:internalvim25}ClusterDasConfigInfo"/>
 *         <element name="dasVmConfig" type="{urn:internalvim25}ClusterDasVmConfigInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="drsConfig" type="{urn:internalvim25}ClusterDrsConfigInfo"/>
 *         <element name="drsVmConfig" type="{urn:internalvim25}ClusterDrsVmConfigInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="rule" type="{urn:internalvim25}ClusterRuleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterConfigInfo", propOrder = {
    "dasConfig",
    "dasVmConfig",
    "drsConfig",
    "drsVmConfig",
    "rule"
})
public class ClusterConfigInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected ClusterDasConfigInfo dasConfig;
    protected List<ClusterDasVmConfigInfo> dasVmConfig;
    @XmlElement(required = true)
    protected ClusterDrsConfigInfo drsConfig;
    protected List<ClusterDrsVmConfigInfo> drsVmConfig;
    protected List<ClusterRuleInfo> rule;

    /**
     * Gets the value of the dasConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDasConfigInfo }
     *     
     */
    public ClusterDasConfigInfo getDasConfig() {
        return dasConfig;
    }

    /**
     * Sets the value of the dasConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDasConfigInfo }
     *     
     */
    public void setDasConfig(ClusterDasConfigInfo value) {
        this.dasConfig = value;
    }

    /**
     * Gets the value of the dasVmConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dasVmConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDasVmConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDasVmConfigInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the dasVmConfig property.
     */
    public List<ClusterDasVmConfigInfo> getDasVmConfig() {
        if (dasVmConfig == null) {
            dasVmConfig = new ArrayList<>();
        }
        return this.dasVmConfig;
    }

    /**
     * Gets the value of the drsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterDrsConfigInfo }
     *     
     */
    public ClusterDrsConfigInfo getDrsConfig() {
        return drsConfig;
    }

    /**
     * Sets the value of the drsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterDrsConfigInfo }
     *     
     */
    public void setDrsConfig(ClusterDrsConfigInfo value) {
        this.drsConfig = value;
    }

    /**
     * Gets the value of the drsVmConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drsVmConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDrsVmConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDrsVmConfigInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the drsVmConfig property.
     */
    public List<ClusterDrsVmConfigInfo> getDrsVmConfig() {
        if (drsVmConfig == null) {
            drsVmConfig = new ArrayList<>();
        }
        return this.drsVmConfig;
    }

    /**
     * Gets the value of the rule property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rule property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRuleInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the rule property.
     */
    public List<ClusterRuleInfo> getRule() {
        if (rule == null) {
            rule = new ArrayList<>();
        }
        return this.rule;
    }

}
