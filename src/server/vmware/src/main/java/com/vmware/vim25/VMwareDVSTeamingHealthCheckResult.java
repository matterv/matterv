
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSTeamingHealthCheckResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSTeamingHealthCheckResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostMemberHealthCheckResult">
 *       <sequence>
 *         <element name="teamingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSTeamingHealthCheckResult", propOrder = {
    "teamingStatus"
})
public class VMwareDVSTeamingHealthCheckResult
    extends HostMemberHealthCheckResult
{

    @XmlElement(required = true)
    protected String teamingStatus;

    /**
     * Gets the value of the teamingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamingStatus() {
        return teamingStatus;
    }

    /**
     * Sets the value of the teamingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamingStatus(String value) {
        this.teamingStatus = value;
    }

}
