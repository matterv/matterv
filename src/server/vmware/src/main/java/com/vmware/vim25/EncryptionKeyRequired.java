
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionKeyRequired complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EncryptionKeyRequired">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InvalidState">
 *       <sequence>
 *         <element name="requiredKey" type="{urn:internalvim25}CryptoKeyId" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionKeyRequired", propOrder = {
    "requiredKey"
})
public class EncryptionKeyRequired
    extends InvalidState
{

    protected List<CryptoKeyId> requiredKey;

    /**
     * Gets the value of the requiredKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequiredKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptoKeyId }
     * </p>
     * 
     * 
     * @return
     *     The value of the requiredKey property.
     */
    public List<CryptoKeyId> getRequiredKey() {
        if (requiredKey == null) {
            requiredKey = new ArrayList<>();
        }
        return this.requiredKey;
    }

}
