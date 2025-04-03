
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageDrsVmConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageDrsVmConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vm" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="behavior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="intraVmAffinity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="intraVmAntiAffinity" type="{urn:internalvim25}VirtualDiskAntiAffinityRuleSpec" minOccurs="0"/>
 *         <element name="virtualDiskRules" type="{urn:internalvim25}VirtualDiskRuleSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsVmConfigInfo", propOrder = {
    "vm",
    "enabled",
    "behavior",
    "intraVmAffinity",
    "intraVmAntiAffinity",
    "virtualDiskRules"
})
public class StorageDrsVmConfigInfo
    extends DynamicData
{

    protected ManagedObjectReference vm;
    protected Boolean enabled;
    protected String behavior;
    protected Boolean intraVmAffinity;
    protected VirtualDiskAntiAffinityRuleSpec intraVmAntiAffinity;
    protected List<VirtualDiskRuleSpec> virtualDiskRules;

    /**
     * Gets the value of the vm property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getVm() {
        return vm;
    }

    /**
     * Sets the value of the vm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setVm(ManagedObjectReference value) {
        this.vm = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the behavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehavior() {
        return behavior;
    }

    /**
     * Sets the value of the behavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehavior(String value) {
        this.behavior = value;
    }

    /**
     * Gets the value of the intraVmAffinity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntraVmAffinity() {
        return intraVmAffinity;
    }

    /**
     * Sets the value of the intraVmAffinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntraVmAffinity(Boolean value) {
        this.intraVmAffinity = value;
    }

    /**
     * Gets the value of the intraVmAntiAffinity property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDiskAntiAffinityRuleSpec }
     *     
     */
    public VirtualDiskAntiAffinityRuleSpec getIntraVmAntiAffinity() {
        return intraVmAntiAffinity;
    }

    /**
     * Sets the value of the intraVmAntiAffinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDiskAntiAffinityRuleSpec }
     *     
     */
    public void setIntraVmAntiAffinity(VirtualDiskAntiAffinityRuleSpec value) {
        this.intraVmAntiAffinity = value;
    }

    /**
     * Gets the value of the virtualDiskRules property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualDiskRules property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualDiskRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualDiskRuleSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualDiskRules property.
     */
    public List<VirtualDiskRuleSpec> getVirtualDiskRules() {
        if (virtualDiskRules == null) {
            virtualDiskRules = new ArrayList<>();
        }
        return this.virtualDiskRules;
    }

}
