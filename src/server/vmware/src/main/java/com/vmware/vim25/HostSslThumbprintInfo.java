
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSslThumbprintInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSslThumbprintInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="principal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ownerTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sslThumbprints" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSslThumbprintInfo", propOrder = {
    "principal",
    "ownerTag",
    "sslThumbprints"
})
public class HostSslThumbprintInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String principal;
    protected String ownerTag;
    protected List<String> sslThumbprints;

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipal(String value) {
        this.principal = value;
    }

    /**
     * Gets the value of the ownerTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerTag() {
        return ownerTag;
    }

    /**
     * Sets the value of the ownerTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerTag(String value) {
        this.ownerTag = value;
    }

    /**
     * Gets the value of the sslThumbprints property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sslThumbprints property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSslThumbprints().add(newItem);
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
     *     The value of the sslThumbprints property.
     */
    public List<String> getSslThumbprints() {
        if (sslThumbprints == null) {
            sslThumbprints = new ArrayList<>();
        }
        return this.sslThumbprints;
    }

}
