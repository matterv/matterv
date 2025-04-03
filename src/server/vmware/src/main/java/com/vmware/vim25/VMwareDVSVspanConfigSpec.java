
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSVspanConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSVspanConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vspanSession" type="{urn:internalvim25}VMwareVspanSession"/>
 *         <element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSVspanConfigSpec", propOrder = {
    "vspanSession",
    "operation"
})
public class VMwareDVSVspanConfigSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected VMwareVspanSession vspanSession;
    @XmlElement(required = true)
    protected String operation;

    /**
     * Gets the value of the vspanSession property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareVspanSession }
     *     
     */
    public VMwareVspanSession getVspanSession() {
        return vspanSession;
    }

    /**
     * Sets the value of the vspanSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareVspanSession }
     *     
     */
    public void setVspanSession(VMwareVspanSession value) {
        this.vspanSession = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
