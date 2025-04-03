
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerSystemCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PowerSystemCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="availablePolicy" type="{urn:internalvim25}HostPowerPolicy" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSystemCapability", propOrder = {
    "availablePolicy"
})
public class PowerSystemCapability
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<HostPowerPolicy> availablePolicy;

    /**
     * Gets the value of the availablePolicy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availablePolicy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAvailablePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPowerPolicy }
     * </p>
     * 
     * 
     * @return
     *     The value of the availablePolicy property.
     */
    public List<HostPowerPolicy> getAvailablePolicy() {
        if (availablePolicy == null) {
            availablePolicy = new ArrayList<>();
        }
        return this.availablePolicy;
    }

}
