
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MethodFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MethodFault">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="faultCause" type="{urn:internalvim25}LocalizedMethodFault" minOccurs="0"/>
 *         <element name="faultMessage" type="{urn:internalvim25}LocalizableMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodFault", propOrder = {
    "faultCause",
    "faultMessage"
})
@XmlSeeAlso({
    InvalidCollectorVersion.class,
    InvalidProperty.class,
    RuntimeFault.class,
    VimFault.class
})
public class MethodFault {

    protected LocalizedMethodFault faultCause;
    protected List<LocalizableMessage> faultMessage;

    /**
     * Gets the value of the faultCause property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getFaultCause() {
        return faultCause;
    }

    /**
     * Sets the value of the faultCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setFaultCause(LocalizedMethodFault value) {
        this.faultCause = value;
    }

    /**
     * Gets the value of the faultMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFaultMessage().add(newItem);
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
     *     The value of the faultMessage property.
     */
    public List<LocalizableMessage> getFaultMessage() {
        if (faultMessage == null) {
            faultMessage = new ArrayList<>();
        }
        return this.faultMessage;
    }

}
