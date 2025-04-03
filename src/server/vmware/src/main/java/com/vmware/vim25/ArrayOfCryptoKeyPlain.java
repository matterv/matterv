
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCryptoKeyPlain complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCryptoKeyPlain">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CryptoKeyPlain" type="{urn:internalvim25}CryptoKeyPlain" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCryptoKeyPlain", propOrder = {
    "cryptoKeyPlain"
})
public class ArrayOfCryptoKeyPlain {

    @XmlElement(name = "CryptoKeyPlain")
    protected List<CryptoKeyPlain> cryptoKeyPlain;

    /**
     * Gets the value of the cryptoKeyPlain property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cryptoKeyPlain property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCryptoKeyPlain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptoKeyPlain }
     * </p>
     * 
     * 
     * @return
     *     The value of the cryptoKeyPlain property.
     */
    public List<CryptoKeyPlain> getCryptoKeyPlain() {
        if (cryptoKeyPlain == null) {
            cryptoKeyPlain = new ArrayList<>();
        }
        return this.cryptoKeyPlain;
    }

}
