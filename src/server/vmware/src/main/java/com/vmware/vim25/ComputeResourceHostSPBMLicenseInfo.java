
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputeResourceHostSPBMLicenseInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComputeResourceHostSPBMLicenseInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="licenseState" type="{urn:internalvim25}ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceHostSPBMLicenseInfo", propOrder = {
    "host",
    "licenseState"
})
public class ComputeResourceHostSPBMLicenseInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference host;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState licenseState;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the licenseState property.
     * 
     * @return
     *     possible object is
     *     {@link ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState }
     *     
     */
    public ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState getLicenseState() {
        return licenseState;
    }

    /**
     * Sets the value of the licenseState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState }
     *     
     */
    public void setLicenseState(ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState value) {
        this.licenseState = value;
    }

}
