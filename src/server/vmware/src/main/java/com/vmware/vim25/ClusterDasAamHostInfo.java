
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasAamHostInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasAamHostInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterDasHostInfo">
 *       <sequence>
 *         <element name="hostDasState" type="{urn:internalvim25}ClusterDasAamNodeState" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="primaryHosts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasAamHostInfo", propOrder = {
    "hostDasState",
    "primaryHosts"
})
public class ClusterDasAamHostInfo
    extends ClusterDasHostInfo
{

    protected List<ClusterDasAamNodeState> hostDasState;
    protected List<String> primaryHosts;

    /**
     * Gets the value of the hostDasState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostDasState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostDasState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDasAamNodeState }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostDasState property.
     */
    public List<ClusterDasAamNodeState> getHostDasState() {
        if (hostDasState == null) {
            hostDasState = new ArrayList<>();
        }
        return this.hostDasState;
    }

    /**
     * Gets the value of the primaryHosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryHosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrimaryHosts().add(newItem);
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
     *     The value of the primaryHosts property.
     */
    public List<String> getPrimaryHosts() {
        if (primaryHosts == null) {
            primaryHosts = new ArrayList<>();
        }
        return this.primaryHosts;
    }

}
