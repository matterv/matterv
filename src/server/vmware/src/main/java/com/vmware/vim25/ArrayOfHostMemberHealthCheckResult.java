
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostMemberHealthCheckResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostMemberHealthCheckResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostMemberHealthCheckResult" type="{urn:internalvim25}HostMemberHealthCheckResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostMemberHealthCheckResult", propOrder = {
    "hostMemberHealthCheckResult"
})
public class ArrayOfHostMemberHealthCheckResult {

    @XmlElement(name = "HostMemberHealthCheckResult")
    protected List<HostMemberHealthCheckResult> hostMemberHealthCheckResult;

    /**
     * Gets the value of the hostMemberHealthCheckResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostMemberHealthCheckResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostMemberHealthCheckResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostMemberHealthCheckResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostMemberHealthCheckResult property.
     */
    public List<HostMemberHealthCheckResult> getHostMemberHealthCheckResult() {
        if (hostMemberHealthCheckResult == null) {
            hostMemberHealthCheckResult = new ArrayList<>();
        }
        return this.hostMemberHealthCheckResult;
    }

}
