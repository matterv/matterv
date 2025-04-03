
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSManagerDvsConfigTarget complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSManagerDvsConfigTarget">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="distributedVirtualPortgroup" type="{urn:internalvim25}DistributedVirtualPortgroupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="distributedVirtualSwitch" type="{urn:internalvim25}DistributedVirtualSwitchInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSManagerDvsConfigTarget", propOrder = {
    "distributedVirtualPortgroup",
    "distributedVirtualSwitch"
})
public class DVSManagerDvsConfigTarget
    extends DynamicData
{

    protected List<DistributedVirtualPortgroupInfo> distributedVirtualPortgroup;
    protected List<DistributedVirtualSwitchInfo> distributedVirtualSwitch;

    /**
     * Gets the value of the distributedVirtualPortgroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedVirtualPortgroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDistributedVirtualPortgroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualPortgroupInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the distributedVirtualPortgroup property.
     */
    public List<DistributedVirtualPortgroupInfo> getDistributedVirtualPortgroup() {
        if (distributedVirtualPortgroup == null) {
            distributedVirtualPortgroup = new ArrayList<>();
        }
        return this.distributedVirtualPortgroup;
    }

    /**
     * Gets the value of the distributedVirtualSwitch property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedVirtualSwitch property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDistributedVirtualSwitch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the distributedVirtualSwitch property.
     */
    public List<DistributedVirtualSwitchInfo> getDistributedVirtualSwitch() {
        if (distributedVirtualSwitch == null) {
            distributedVirtualSwitch = new ArrayList<>();
        }
        return this.distributedVirtualSwitch;
    }

}
