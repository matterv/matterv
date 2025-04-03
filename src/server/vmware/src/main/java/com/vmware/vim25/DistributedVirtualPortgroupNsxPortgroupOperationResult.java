
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributedVirtualPortgroupNsxPortgroupOperationResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DistributedVirtualPortgroupNsxPortgroupOperationResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="portgroups" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="problems" type="{urn:internalvim25}DistributedVirtualPortgroupProblem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualPortgroupNsxPortgroupOperationResult", propOrder = {
    "portgroups",
    "problems"
})
public class DistributedVirtualPortgroupNsxPortgroupOperationResult
    extends DynamicData
{

    protected List<ManagedObjectReference> portgroups;
    protected List<DistributedVirtualPortgroupProblem> problems;

    /**
     * Gets the value of the portgroups property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portgroups property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPortgroups().add(newItem);
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
     *     The value of the portgroups property.
     */
    public List<ManagedObjectReference> getPortgroups() {
        if (portgroups == null) {
            portgroups = new ArrayList<>();
        }
        return this.portgroups;
    }

    /**
     * Gets the value of the problems property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the problems property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProblems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributedVirtualPortgroupProblem }
     * </p>
     * 
     * 
     * @return
     *     The value of the problems property.
     */
    public List<DistributedVirtualPortgroupProblem> getProblems() {
        if (problems == null) {
            problems = new ArrayList<>();
        }
        return this.problems;
    }

}
