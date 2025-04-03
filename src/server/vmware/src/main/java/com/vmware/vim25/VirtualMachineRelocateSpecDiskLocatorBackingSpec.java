
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineRelocateSpecDiskLocatorBackingSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineRelocateSpecDiskLocatorBackingSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="parent" type="{urn:internalvim25}VirtualMachineRelocateSpecDiskLocatorBackingSpec" minOccurs="0"/>
 *         <element name="crypto" type="{urn:internalvim25}CryptoSpec" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRelocateSpecDiskLocatorBackingSpec", propOrder = {
    "parent",
    "crypto"
})
public class VirtualMachineRelocateSpecDiskLocatorBackingSpec
    extends DynamicData
{

    protected VirtualMachineRelocateSpecDiskLocatorBackingSpec parent;
    protected CryptoSpec crypto;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineRelocateSpecDiskLocatorBackingSpec }
     *     
     */
    public VirtualMachineRelocateSpecDiskLocatorBackingSpec getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineRelocateSpecDiskLocatorBackingSpec }
     *     
     */
    public void setParent(VirtualMachineRelocateSpecDiskLocatorBackingSpec value) {
        this.parent = value;
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

}
