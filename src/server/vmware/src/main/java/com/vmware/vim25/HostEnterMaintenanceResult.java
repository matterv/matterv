
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostEnterMaintenanceResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostEnterMaintenanceResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vmFaults" type="{urn:internalvim25}FaultsByVM" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hostFaults" type="{urn:internalvim25}FaultsByHost" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostEnterMaintenanceResult", propOrder = {
    "vmFaults",
    "hostFaults"
})
public class HostEnterMaintenanceResult
    extends DynamicData
{

    protected List<FaultsByVM> vmFaults;
    protected List<FaultsByHost> hostFaults;

    /**
     * Gets the value of the vmFaults property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmFaults property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmFaults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultsByVM }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmFaults property.
     */
    public List<FaultsByVM> getVmFaults() {
        if (vmFaults == null) {
            vmFaults = new ArrayList<>();
        }
        return this.vmFaults;
    }

    /**
     * Gets the value of the hostFaults property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostFaults property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostFaults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultsByHost }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostFaults property.
     */
    public List<FaultsByHost> getHostFaults() {
        if (hostFaults == null) {
            hostFaults = new ArrayList<>();
        }
        return this.hostFaults;
    }

}
