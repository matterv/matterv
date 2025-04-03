
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDistributedVirtualSwitchProductSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDistributedVirtualSwitchProductSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DistributedVirtualSwitchProductSpec" type="{urn:internalvim25}DistributedVirtualSwitchProductSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchProductSpec", propOrder = {
    "distributedVirtualSwitchProductSpec"
})
public class ArrayOfDistributedVirtualSwitchProductSpec {

    @XmlElement(name = "DistributedVirtualSwitchProductSpec")
    protected List<DistributedVirtualSwitchProductSpec> distributedVirtualSwitchProductSpec;

    /**
     * Gets the value of the distributedVirtualSwitchProductSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedVirtualSwitchProductSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDistributedVirtualSwitchProductSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualSwitchProductSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the distributedVirtualSwitchProductSpec property.
     */
    public List<DistributedVirtualSwitchProductSpec> getDistributedVirtualSwitchProductSpec() {
        if (distributedVirtualSwitchProductSpec == null) {
            distributedVirtualSwitchProductSpec = new ArrayList<>();
        }
        return this.distributedVirtualSwitchProductSpec;
    }

}
