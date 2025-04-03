
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDVSNetworkResourcePoolConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDVSNetworkResourcePoolConfigSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DVSNetworkResourcePoolConfigSpec" type="{urn:internalvim25}DVSNetworkResourcePoolConfigSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDVSNetworkResourcePoolConfigSpec", propOrder = {
    "dvsNetworkResourcePoolConfigSpec"
})
public class ArrayOfDVSNetworkResourcePoolConfigSpec {

    @XmlElement(name = "DVSNetworkResourcePoolConfigSpec")
    protected List<DVSNetworkResourcePoolConfigSpec> dvsNetworkResourcePoolConfigSpec;

    /**
     * Gets the value of the dvsNetworkResourcePoolConfigSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvsNetworkResourcePoolConfigSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDVSNetworkResourcePoolConfigSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DVSNetworkResourcePoolConfigSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the dvsNetworkResourcePoolConfigSpec property.
     */
    public List<DVSNetworkResourcePoolConfigSpec> getDVSNetworkResourcePoolConfigSpec() {
        if (dvsNetworkResourcePoolConfigSpec == null) {
            dvsNetworkResourcePoolConfigSpec = new ArrayList<>();
        }
        return this.dvsNetworkResourcePoolConfigSpec;
    }

}
