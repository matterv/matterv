
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDistributedVirtualSwitchHostMemberPnicSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDistributedVirtualSwitchHostMemberPnicSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DistributedVirtualSwitchHostMemberPnicSpec" type="{urn:internalvim25}DistributedVirtualSwitchHostMemberPnicSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchHostMemberPnicSpec", propOrder = {
    "distributedVirtualSwitchHostMemberPnicSpec"
})
public class ArrayOfDistributedVirtualSwitchHostMemberPnicSpec {

    @XmlElement(name = "DistributedVirtualSwitchHostMemberPnicSpec")
    protected List<DistributedVirtualSwitchHostMemberPnicSpec> distributedVirtualSwitchHostMemberPnicSpec;

    /**
     * Gets the value of the distributedVirtualSwitchHostMemberPnicSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedVirtualSwitchHostMemberPnicSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDistributedVirtualSwitchHostMemberPnicSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchHostMemberPnicSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the distributedVirtualSwitchHostMemberPnicSpec property.
     */
    public List<DistributedVirtualSwitchHostMemberPnicSpec> getDistributedVirtualSwitchHostMemberPnicSpec() {
        if (distributedVirtualSwitchHostMemberPnicSpec == null) {
            distributedVirtualSwitchHostMemberPnicSpec = new ArrayList<>();
        }
        return this.distributedVirtualSwitchHostMemberPnicSpec;
    }

}
