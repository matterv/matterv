
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DistributedVirtualSwitchManagerHostDvsFilterSpec" type="{urn:internalvim25}DistributedVirtualSwitchManagerHostDvsFilterSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec", propOrder = {
    "distributedVirtualSwitchManagerHostDvsFilterSpec"
})
public class ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec {

    @XmlElement(name = "DistributedVirtualSwitchManagerHostDvsFilterSpec")
    protected List<DistributedVirtualSwitchManagerHostDvsFilterSpec> distributedVirtualSwitchManagerHostDvsFilterSpec;

    /**
     * Gets the value of the distributedVirtualSwitchManagerHostDvsFilterSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedVirtualSwitchManagerHostDvsFilterSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDistributedVirtualSwitchManagerHostDvsFilterSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchManagerHostDvsFilterSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the distributedVirtualSwitchManagerHostDvsFilterSpec property.
     */
    public List<DistributedVirtualSwitchManagerHostDvsFilterSpec> getDistributedVirtualSwitchManagerHostDvsFilterSpec() {
        if (distributedVirtualSwitchManagerHostDvsFilterSpec == null) {
            distributedVirtualSwitchManagerHostDvsFilterSpec = new ArrayList<>();
        }
        return this.distributedVirtualSwitchManagerHostDvsFilterSpec;
    }

}
