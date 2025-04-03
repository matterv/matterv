
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalizedMethodFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LocalizedMethodFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="fault" type="{urn:internalvim25}MethodFault"/>
 *         <element name="localizedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizedMethodFault", propOrder = {
    "fault",
    "localizedMessage"
})
public class LocalizedMethodFault
    extends DynamicData
{

    @XmlElement(required = true)
    protected MethodFault fault;
    protected String localizedMessage;

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link MethodFault }
     *     
     */
    public MethodFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodFault }
     *     
     */
    public void setFault(MethodFault value) {
        this.fault = value;
    }

    /**
     * Gets the value of the localizedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizedMessage() {
        return localizedMessage;
    }

    /**
     * Sets the value of the localizedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizedMessage(String value) {
        this.localizedMessage = value;
    }

}
