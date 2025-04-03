
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostMemberUplinkHealthCheckResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostMemberUplinkHealthCheckResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostMemberHealthCheckResult">
 *       <sequence>
 *         <element name="uplinkPortKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMemberUplinkHealthCheckResult", propOrder = {
    "uplinkPortKey"
})
@XmlSeeAlso({
    VMwareDVSVlanHealthCheckResult.class,
    VMwareDVSMtuHealthCheckResult.class
})
public class HostMemberUplinkHealthCheckResult
    extends HostMemberHealthCheckResult
{

    @XmlElement(required = true)
    protected String uplinkPortKey;

    /**
     * Gets the value of the uplinkPortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUplinkPortKey() {
        return uplinkPortKey;
    }

    /**
     * Sets the value of the uplinkPortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUplinkPortKey(String value) {
        this.uplinkPortKey = value;
    }

}
