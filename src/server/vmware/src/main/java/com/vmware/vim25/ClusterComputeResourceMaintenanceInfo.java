
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceMaintenanceInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceMaintenanceInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="partialMMId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hostEvacInfo" type="{urn:internalvim25}ClusterComputeResourceHostEvacuationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceMaintenanceInfo", propOrder = {
    "partialMMId",
    "hostEvacInfo"
})
public class ClusterComputeResourceMaintenanceInfo
    extends DynamicData
{

    protected String partialMMId;
    protected List<ClusterComputeResourceHostEvacuationInfo> hostEvacInfo;

    /**
     * Gets the value of the partialMMId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialMMId() {
        return partialMMId;
    }

    /**
     * Sets the value of the partialMMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialMMId(String value) {
        this.partialMMId = value;
    }

    /**
     * Gets the value of the hostEvacInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostEvacInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostEvacInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterComputeResourceHostEvacuationInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostEvacInfo property.
     */
    public List<ClusterComputeResourceHostEvacuationInfo> getHostEvacInfo() {
        if (hostEvacInfo == null) {
            hostEvacInfo = new ArrayList<>();
        }
        return this.hostEvacInfo;
    }

}
