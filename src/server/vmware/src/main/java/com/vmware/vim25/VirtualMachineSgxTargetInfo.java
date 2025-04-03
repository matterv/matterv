
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineSgxTargetInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineSgxTargetInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="maxEpcSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="flcModes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="lePubKeyHashes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="requireAttestationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSgxTargetInfo", propOrder = {
    "maxEpcSize",
    "flcModes",
    "lePubKeyHashes",
    "requireAttestationSupported"
})
public class VirtualMachineSgxTargetInfo
    extends VirtualMachineTargetInfo
{

    protected long maxEpcSize;
    protected List<String> flcModes;
    protected List<String> lePubKeyHashes;
    protected Boolean requireAttestationSupported;

    /**
     * Gets the value of the maxEpcSize property.
     * 
     */
    public long getMaxEpcSize() {
        return maxEpcSize;
    }

    /**
     * Sets the value of the maxEpcSize property.
     * 
     */
    public void setMaxEpcSize(long value) {
        this.maxEpcSize = value;
    }

    /**
     * Gets the value of the flcModes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flcModes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFlcModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the flcModes property.
     */
    public List<String> getFlcModes() {
        if (flcModes == null) {
            flcModes = new ArrayList<>();
        }
        return this.flcModes;
    }

    /**
     * Gets the value of the lePubKeyHashes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lePubKeyHashes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLePubKeyHashes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the lePubKeyHashes property.
     */
    public List<String> getLePubKeyHashes() {
        if (lePubKeyHashes == null) {
            lePubKeyHashes = new ArrayList<>();
        }
        return this.lePubKeyHashes;
    }

    /**
     * Gets the value of the requireAttestationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireAttestationSupported() {
        return requireAttestationSupported;
    }

    /**
     * Sets the value of the requireAttestationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireAttestationSupported(Boolean value) {
        this.requireAttestationSupported = value;
    }

}
