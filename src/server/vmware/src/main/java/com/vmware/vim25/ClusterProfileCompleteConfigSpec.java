
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterProfileCompleteConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterProfileCompleteConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterProfileConfigSpec">
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
@XmlType(name = "ClusterProfileCompleteConfigSpec", propOrder = {
    "complyProfile"
})
public class ClusterProfileCompleteConfigSpec
    extends ClusterProfileConfigSpec
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
