
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VslmMigrateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VslmMigrateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="backingSpec" type="{urn:internalvim25}VslmCreateSpecBackingSpec"/>
 *         <element name="profile" type="{urn:internalvim25}VirtualMachineProfileSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="consolidate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="disksCrypto" type="{urn:internalvim25}DiskCryptoSpec" minOccurs="0"/>
 *         <element name="service" type="{urn:internalvim25}ServiceLocator" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmMigrateSpec", propOrder = {
    "backingSpec",
    "profile",
    "consolidate",
    "disksCrypto",
    "service"
})
@XmlSeeAlso({
    VslmCloneSpec.class,
    VslmRelocateSpec.class
})
public class VslmMigrateSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected VslmCreateSpecBackingSpec backingSpec;
    protected List<VirtualMachineProfileSpec> profile;
    protected Boolean consolidate;
    protected DiskCryptoSpec disksCrypto;
    protected ServiceLocator service;

    /**
     * Gets the value of the backingSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VslmCreateSpecBackingSpec }
     *     
     */
    public VslmCreateSpecBackingSpec getBackingSpec() {
        return backingSpec;
    }

    /**
     * Sets the value of the backingSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VslmCreateSpecBackingSpec }
     *     
     */
    public void setBackingSpec(VslmCreateSpecBackingSpec value) {
        this.backingSpec = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineProfileSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the profile property.
     */
    public List<VirtualMachineProfileSpec> getProfile() {
        if (profile == null) {
            profile = new ArrayList<>();
        }
        return this.profile;
    }

    /**
     * Gets the value of the consolidate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidate() {
        return consolidate;
    }

    /**
     * Sets the value of the consolidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidate(Boolean value) {
        this.consolidate = value;
    }

    /**
     * Gets the value of the disksCrypto property.
     * 
     * @return
     *     possible object is
     *     {@link DiskCryptoSpec }
     *     
     */
    public DiskCryptoSpec getDisksCrypto() {
        return disksCrypto;
    }

    /**
     * Sets the value of the disksCrypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiskCryptoSpec }
     *     
     */
    public void setDisksCrypto(DiskCryptoSpec value) {
        this.disksCrypto = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocator }
     *     
     */
    public ServiceLocator getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocator }
     *     
     */
    public void setService(ServiceLocator value) {
        this.service = value;
    }

}
