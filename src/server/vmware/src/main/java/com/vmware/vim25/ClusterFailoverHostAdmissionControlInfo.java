
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterFailoverHostAdmissionControlInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterFailoverHostAdmissionControlInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterDasAdmissionControlInfo">
 *       <sequence>
 *         <element name="hostStatus" type="{urn:internalvim25}ClusterFailoverHostAdmissionControlInfoHostStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverHostAdmissionControlInfo", propOrder = {
    "hostStatus"
})
public class ClusterFailoverHostAdmissionControlInfo
    extends ClusterDasAdmissionControlInfo
{

    protected List<ClusterFailoverHostAdmissionControlInfoHostStatus> hostStatus;

    /**
     * Gets the value of the hostStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterFailoverHostAdmissionControlInfoHostStatus }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostStatus property.
     */
    public List<ClusterFailoverHostAdmissionControlInfoHostStatus> getHostStatus() {
        if (hostStatus == null) {
            hostStatus = new ArrayList<>();
        }
        return this.hostStatus;
    }

}
