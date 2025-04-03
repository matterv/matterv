
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmPoweringOnWithCustomizedDVPortEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmPoweringOnWithCustomizedDVPortEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="vnic" type="{urn:internalvim25}VnicPortArgument" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmPoweringOnWithCustomizedDVPortEvent", propOrder = {
    "vnic"
})
public class VmPoweringOnWithCustomizedDVPortEvent
    extends VmEvent
{

    @XmlElement(required = true)
    protected List<VnicPortArgument> vnic;

    /**
     * Gets the value of the vnic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vnic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVnic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VnicPortArgument }
     * </p>
     * 
     * 
     * @return
     *     The value of the vnic property.
     */
    public List<VnicPortArgument> getVnic() {
        if (vnic == null) {
            vnic = new ArrayList<>();
        }
        return this.vnic;
    }

}
