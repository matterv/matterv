
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostActiveDirectoryInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostActiveDirectoryInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostDirectoryStoreInfo">
 *       <sequence>
 *         <element name="joinedDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="trustedDomain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="domainMembershipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="smartCardAuthenticationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostActiveDirectoryInfo", propOrder = {
    "joinedDomain",
    "trustedDomain",
    "domainMembershipStatus",
    "smartCardAuthenticationEnabled"
})
public class HostActiveDirectoryInfo
    extends HostDirectoryStoreInfo
{

    protected String joinedDomain;
    protected List<String> trustedDomain;
    protected String domainMembershipStatus;
    protected Boolean smartCardAuthenticationEnabled;

    /**
     * Gets the value of the joinedDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinedDomain() {
        return joinedDomain;
    }

    /**
     * Sets the value of the joinedDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinedDomain(String value) {
        this.joinedDomain = value;
    }

    /**
     * Gets the value of the trustedDomain property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustedDomain property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTrustedDomain().add(newItem);
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
     *     The value of the trustedDomain property.
     */
    public List<String> getTrustedDomain() {
        if (trustedDomain == null) {
            trustedDomain = new ArrayList<>();
        }
        return this.trustedDomain;
    }

    /**
     * Gets the value of the domainMembershipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainMembershipStatus() {
        return domainMembershipStatus;
    }

    /**
     * Sets the value of the domainMembershipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainMembershipStatus(String value) {
        this.domainMembershipStatus = value;
    }

    /**
     * Gets the value of the smartCardAuthenticationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmartCardAuthenticationEnabled() {
        return smartCardAuthenticationEnabled;
    }

    /**
     * Sets the value of the smartCardAuthenticationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmartCardAuthenticationEnabled(Boolean value) {
        this.smartCardAuthenticationEnabled = value;
    }

}
