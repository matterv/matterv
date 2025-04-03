
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GatewayToHostTrustVerifyFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GatewayToHostTrustVerifyFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}GatewayToHostConnectFault">
 *       <sequence>
 *         <element name="verificationToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="propertiesToVerify" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayToHostTrustVerifyFault", propOrder = {
    "verificationToken",
    "propertiesToVerify"
})
public class GatewayToHostTrustVerifyFault
    extends GatewayToHostConnectFault
{

    @XmlElement(required = true)
    protected String verificationToken;
    @XmlElement(required = true)
    protected List<KeyValue> propertiesToVerify;

    /**
     * Gets the value of the verificationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationToken() {
        return verificationToken;
    }

    /**
     * Sets the value of the verificationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationToken(String value) {
        this.verificationToken = value;
    }

    /**
     * Gets the value of the propertiesToVerify property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertiesToVerify property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPropertiesToVerify().add(newItem);
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
     *     The value of the propertiesToVerify property.
     */
    public List<KeyValue> getPropertiesToVerify() {
        if (propertiesToVerify == null) {
            propertiesToVerify = new ArrayList<>();
        }
        return this.propertiesToVerify;
    }

}
