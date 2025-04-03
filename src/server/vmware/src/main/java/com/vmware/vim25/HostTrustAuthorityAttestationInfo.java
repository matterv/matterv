
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTrustAuthorityAttestationInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTrustAuthorityAttestationInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="attestationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="attestedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="attestedUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="messages" type="{urn:internalvim25}LocalizableMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTrustAuthorityAttestationInfo", propOrder = {
    "attestationStatus",
    "serviceId",
    "attestedAt",
    "attestedUntil",
    "messages"
})
public class HostTrustAuthorityAttestationInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String attestationStatus;
    protected String serviceId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attestedAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar attestedUntil;
    protected List<LocalizableMessage> messages;

    /**
     * Gets the value of the attestationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttestationStatus() {
        return attestationStatus;
    }

    /**
     * Sets the value of the attestationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttestationStatus(String value) {
        this.attestationStatus = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the attestedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAttestedAt() {
        return attestedAt;
    }

    /**
     * Sets the value of the attestedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAttestedAt(XMLGregorianCalendar value) {
        this.attestedAt = value;
    }

    /**
     * Gets the value of the attestedUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAttestedUntil() {
        return attestedUntil;
    }

    /**
     * Sets the value of the attestedUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAttestedUntil(XMLGregorianCalendar value) {
        this.attestedUntil = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizableMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the messages property.
     */
    public List<LocalizableMessage> getMessages() {
        if (messages == null) {
            messages = new ArrayList<>();
        }
        return this.messages;
    }

}
