
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GhostDvsProxySwitchDetectedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GhostDvsProxySwitchDetectedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
 *       <sequence>
 *         <element name="switchUuid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GhostDvsProxySwitchDetectedEvent", propOrder = {
    "switchUuid"
})
public class GhostDvsProxySwitchDetectedEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected List<String> switchUuid;

    /**
     * Gets the value of the switchUuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchUuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSwitchUuid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the switchUuid property.
     */
    public List<String> getSwitchUuid() {
        if (switchUuid == null) {
            switchUuid = new ArrayList<>();
        }
        return this.switchUuid;
    }

}
