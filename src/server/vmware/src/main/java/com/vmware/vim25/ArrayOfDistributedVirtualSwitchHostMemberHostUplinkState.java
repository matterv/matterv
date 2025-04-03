
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDistributedVirtualSwitchHostMemberHostUplinkState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDistributedVirtualSwitchHostMemberHostUplinkState">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DistributedVirtualSwitchHostMemberHostUplinkState" type="{urn:internalvim25}DistributedVirtualSwitchHostMemberHostUplinkState" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchHostMemberHostUplinkState", propOrder = {
    "distributedVirtualSwitchHostMemberHostUplinkState"
})
public class ArrayOfDistributedVirtualSwitchHostMemberHostUplinkState {

    @XmlElement(name = "DistributedVirtualSwitchHostMemberHostUplinkState")
    protected List<DistributedVirtualSwitchHostMemberHostUplinkState> distributedVirtualSwitchHostMemberHostUplinkState;

    /**
     * Gets the value of the distributedVirtualSwitchHostMemberHostUplinkState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedVirtualSwitchHostMemberHostUplinkState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDistributedVirtualSwitchHostMemberHostUplinkState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchHostMemberHostUplinkState }
     * </p>
     * 
     * 
     * @return
     *     The value of the distributedVirtualSwitchHostMemberHostUplinkState property.
     */
    public List<DistributedVirtualSwitchHostMemberHostUplinkState> getDistributedVirtualSwitchHostMemberHostUplinkState() {
        if (distributedVirtualSwitchHostMemberHostUplinkState == null) {
            distributedVirtualSwitchHostMemberHostUplinkState = new ArrayList<>();
        }
        return this.distributedVirtualSwitchHostMemberHostUplinkState;
    }

}
