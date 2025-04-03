
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VslmCreateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VslmCreateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="keepAfterDeleteVm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="backingSpec" type="{urn:internalvim25}VslmCreateSpecBackingSpec"/>
 *         <element name="capacityInMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="profile" type="{urn:internalvim25}VirtualMachineProfileSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="crypto" type="{urn:internalvim25}CryptoSpec" minOccurs="0"/>
 *         <element name="metadata" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmCreateSpec", propOrder = {
    "name",
    "keepAfterDeleteVm",
    "backingSpec",
    "capacityInMB",
    "profile",
    "crypto",
    "metadata"
})
public class VslmCreateSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String name;
    protected Boolean keepAfterDeleteVm;
    @XmlElement(required = true)
    protected VslmCreateSpecBackingSpec backingSpec;
    protected long capacityInMB;
    protected List<VirtualMachineProfileSpec> profile;
    protected CryptoSpec crypto;
    protected List<KeyValue> metadata;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the keepAfterDeleteVm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepAfterDeleteVm() {
        return keepAfterDeleteVm;
    }

    /**
     * Sets the value of the keepAfterDeleteVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepAfterDeleteVm(Boolean value) {
        this.keepAfterDeleteVm = value;
    }

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
     * Gets the value of the capacityInMB property.
     * 
     */
    public long getCapacityInMB() {
        return capacityInMB;
    }

    /**
     * Sets the value of the capacityInMB property.
     * 
     */
    public void setCapacityInMB(long value) {
        this.capacityInMB = value;
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
     * Gets the value of the crypto property.
     * 
     * @return
     *     possible object is
     *     {@link CryptoSpec }
     *     
     */
    public CryptoSpec getCrypto() {
        return crypto;
    }

    /**
     * Sets the value of the crypto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptoSpec }
     *     
     */
    public void setCrypto(CryptoSpec value) {
        this.crypto = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the metadata property.
     */
    public List<KeyValue> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<>();
        }
        return this.metadata;
    }

}
