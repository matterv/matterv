
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCryptoManagerKmipServerStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCryptoManagerKmipServerStatus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CryptoManagerKmipServerStatus" type="{urn:internalvim25}CryptoManagerKmipServerStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCryptoManagerKmipServerStatus", propOrder = {
    "cryptoManagerKmipServerStatus"
})
public class ArrayOfCryptoManagerKmipServerStatus {

    @XmlElement(name = "CryptoManagerKmipServerStatus")
    protected List<CryptoManagerKmipServerStatus> cryptoManagerKmipServerStatus;

    /**
     * Gets the value of the cryptoManagerKmipServerStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cryptoManagerKmipServerStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCryptoManagerKmipServerStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptoManagerKmipServerStatus }
     * </p>
     * 
     * 
     * @return
     *     The value of the cryptoManagerKmipServerStatus property.
     */
    public List<CryptoManagerKmipServerStatus> getCryptoManagerKmipServerStatus() {
        if (cryptoManagerKmipServerStatus == null) {
            cryptoManagerKmipServerStatus = new ArrayList<>();
        }
        return this.cryptoManagerKmipServerStatus;
    }

}
