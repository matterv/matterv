
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDvsLacpGroupSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDvsLacpGroupSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="lacpGroupConfig" type="{urn:internalvim25}VMwareDvsLacpGroupConfig"/>
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
@XmlType(name = "VMwareDvsLacpGroupSpec", propOrder = {
    "lacpGroupConfig",
    "operation"
})
public class VMwareDvsLacpGroupSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected VMwareDvsLacpGroupConfig lacpGroupConfig;
    @XmlElement(required = true)
    protected String operation;

    /**
     * Gets the value of the lacpGroupConfig property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareDvsLacpGroupConfig }
     *     
     */
    public VMwareDvsLacpGroupConfig getLacpGroupConfig() {
        return lacpGroupConfig;
    }

    /**
     * Sets the value of the lacpGroupConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareDvsLacpGroupConfig }
     *     
     */
    public void setLacpGroupConfig(VMwareDvsLacpGroupConfig value) {
        this.lacpGroupConfig = value;
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
