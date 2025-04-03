
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanUpgradeSystemHostsDisconnectedIssue complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanUpgradeSystemHostsDisconnectedIssue">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VsanUpgradeSystemPreflightCheckIssue">
 *       <sequence>
 *         <element name="hosts" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemHostsDisconnectedIssue", propOrder = {
    "hosts"
})
public class VsanUpgradeSystemHostsDisconnectedIssue
    extends VsanUpgradeSystemPreflightCheckIssue
{

    @XmlElement(required = true)
    protected List<ManagedObjectReference> hosts;

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
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the hosts property.
     */
    public List<ManagedObjectReference> getHosts() {
        if (hosts == null) {
            hosts = new ArrayList<>();
        }
        return this.hosts;
    }

}
