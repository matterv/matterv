
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterProfileConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterProfileConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ProfileConfigInfo">
 *       <sequence>
 *         <element name="complyProfile" type="{urn:internalvim25}ComplianceProfile" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterProfileConfigInfo", propOrder = {
    "complyProfile"
})
public class ClusterProfileConfigInfo
    extends ProfileConfigInfo
{

    protected ComplianceProfile complyProfile;

    /**
     * Gets the value of the complyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceProfile }
     *     
     */
    public ComplianceProfile getComplyProfile() {
        return complyProfile;
    }

    /**
     * Sets the value of the complyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceProfile }
     *     
     */
    public void setComplyProfile(ComplianceProfile value) {
        this.complyProfile = value;
    }

}
