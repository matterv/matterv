
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailToEnableSPBM complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FailToEnableSPBM">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}NotEnoughLicenses">
 *       <sequence>
 *         <element name="cs" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="csName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostLicenseStates" type="{urn:internalvim25}ComputeResourceHostSPBMLicenseInfo" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailToEnableSPBM", propOrder = {
    "cs",
    "csName",
    "hostLicenseStates"
})
public class FailToEnableSPBM
    extends NotEnoughLicenses
{

    @XmlElement(required = true)
    protected ManagedObjectReference cs;
    @XmlElement(required = true)
    protected String csName;
    @XmlElement(required = true)
    protected List<ComputeResourceHostSPBMLicenseInfo> hostLicenseStates;

    /**
     * Gets the value of the cs property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCs() {
        return cs;
    }

    /**
     * Sets the value of the cs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCs(ManagedObjectReference value) {
        this.cs = value;
    }

    /**
     * Gets the value of the csName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsName() {
        return csName;
    }

    /**
     * Sets the value of the csName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsName(String value) {
        this.csName = value;
    }

    /**
     * Gets the value of the hostLicenseStates property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostLicenseStates property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostLicenseStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComputeResourceHostSPBMLicenseInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostLicenseStates property.
     */
    public List<ComputeResourceHostSPBMLicenseInfo> getHostLicenseStates() {
        if (hostLicenseStates == null) {
            hostLicenseStates = new ArrayList<>();
        }
        return this.hostLicenseStates;
    }

}
