
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dasConfig" type="{urn:internalvim25}ClusterDasConfigInfo" minOccurs="0"/>
 *         <element name="dasVmConfigSpec" type="{urn:internalvim25}ClusterDasVmConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="drsConfig" type="{urn:internalvim25}ClusterDrsConfigInfo" minOccurs="0"/>
 *         <element name="drsVmConfigSpec" type="{urn:internalvim25}ClusterDrsVmConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="rulesSpec" type="{urn:internalvim25}ClusterRuleSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterConfigSpec", propOrder = {
    "dasConfig",
    "dasVmConfigSpec",
    "drsConfig",
    "drsVmConfigSpec",
    "rulesSpec"
})
public class ClusterConfigSpec
    extends DynamicData
{

    protected ClusterDasConfigInfo dasConfig;
    protected List<ClusterDasVmConfigSpec> dasVmConfigSpec;
    protected ClusterDrsConfigInfo drsConfig;
    protected List<ClusterDrsVmConfigSpec> drsVmConfigSpec;
    protected List<ClusterRuleSpec> rulesSpec;

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
     * Gets the value of the dasVmConfigSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dasVmConfigSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDasVmConfigSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDasVmConfigSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the dasVmConfigSpec property.
     */
    public List<ClusterDasVmConfigSpec> getDasVmConfigSpec() {
        if (dasVmConfigSpec == null) {
            dasVmConfigSpec = new ArrayList<>();
        }
        return this.dasVmConfigSpec;
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
     * Gets the value of the drsVmConfigSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drsVmConfigSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDrsVmConfigSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDrsVmConfigSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the drsVmConfigSpec property.
     */
    public List<ClusterDrsVmConfigSpec> getDrsVmConfigSpec() {
        if (drsVmConfigSpec == null) {
            drsVmConfigSpec = new ArrayList<>();
        }
        return this.drsVmConfigSpec;
    }

    /**
     * Gets the value of the rulesSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rulesSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRulesSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRuleSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the rulesSpec property.
     */
    public List<ClusterRuleSpec> getRulesSpec() {
        if (rulesSpec == null) {
            rulesSpec = new ArrayList<>();
        }
        return this.rulesSpec;
    }

}
