
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtendedDescription">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Description">
 *       <sequence>
 *         <element name="messageCatalogKeyPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="messageArg" type="{urn:internalvim25}KeyAnyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedDescription", propOrder = {
    "messageCatalogKeyPrefix",
    "messageArg"
})
public class ExtendedDescription
    extends Description
{

    @XmlElement(required = true)
    protected String messageCatalogKeyPrefix;
    protected List<KeyAnyValue> messageArg;

    /**
     * Gets the value of the messageCatalogKeyPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCatalogKeyPrefix() {
        return messageCatalogKeyPrefix;
    }

    /**
     * Sets the value of the messageCatalogKeyPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCatalogKeyPrefix(String value) {
        this.messageCatalogKeyPrefix = value;
    }

    /**
     * Gets the value of the messageArg property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageArg property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMessageArg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyAnyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the messageArg property.
     */
    public List<KeyAnyValue> getMessageArg() {
        if (messageArg == null) {
            messageArg = new ArrayList<>();
        }
        return this.messageArg;
    }

}
