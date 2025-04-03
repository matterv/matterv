
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfConsumerFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfConsumerFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfConsumerCallbackFault">
 *       <sequence>
 *         <element name="errorKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="params" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerFault", propOrder = {
    "errorKey",
    "message",
    "params"
})
public class OvfConsumerFault
    extends OvfConsumerCallbackFault
{

    @XmlElement(required = true)
    protected String errorKey;
    @XmlElement(required = true)
    protected String message;
    protected List<KeyValue> params;

    /**
     * Gets the value of the errorKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorKey() {
        return errorKey;
    }

    /**
     * Sets the value of the errorKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorKey(String value) {
        this.errorKey = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParams().add(newItem);
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
     *     The value of the params property.
     */
    public List<KeyValue> getParams() {
        if (params == null) {
            params = new ArrayList<>();
        }
        return this.params;
    }

}
