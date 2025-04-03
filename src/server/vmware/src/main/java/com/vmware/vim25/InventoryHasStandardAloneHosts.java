
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryHasStandardAloneHosts complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InventoryHasStandardAloneHosts">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}NotEnoughLicenses">
 *       <sequence>
 *         <element name="hosts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryHasStandardAloneHosts", propOrder = {
    "hosts"
})
public class InventoryHasStandardAloneHosts
    extends NotEnoughLicenses
{

    @XmlElement(required = true)
    protected List<String> hosts;

    /**
     * Gets the value of the hosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHosts().add(newItem);
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
     *     The value of the hosts property.
     */
    public List<String> getHosts() {
        if (hosts == null) {
            hosts = new ArrayList<>();
        }
        return this.hosts;
    }

}
