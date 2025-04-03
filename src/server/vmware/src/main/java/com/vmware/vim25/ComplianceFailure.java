
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplianceFailure complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComplianceFailure">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="failureType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="message" type="{urn:internalvim25}LocalizableMessage"/>
 *         <element name="expressionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="failureValues" type="{urn:internalvim25}ComplianceFailureComplianceFailureValues" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceFailure", propOrder = {
    "failureType",
    "message",
    "expressionName",
    "failureValues"
})
public class ComplianceFailure
    extends DynamicData
{

    @XmlElement(required = true)
    protected String failureType;
    @XmlElement(required = true)
    protected LocalizableMessage message;
    protected String expressionName;
    protected List<ComplianceFailureComplianceFailureValues> failureValues;

    /**
     * Gets the value of the failureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureType() {
        return failureType;
    }

    /**
     * Sets the value of the failureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureType(String value) {
        this.failureType = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizableMessage }
     *     
     */
    public LocalizableMessage getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizableMessage }
     *     
     */
    public void setMessage(LocalizableMessage value) {
        this.message = value;
    }

    /**
     * Gets the value of the expressionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionName() {
        return expressionName;
    }

    /**
     * Sets the value of the expressionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionName(String value) {
        this.expressionName = value;
    }

    /**
     * Gets the value of the failureValues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failureValues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFailureValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplianceFailureComplianceFailureValues }
     * </p>
     * 
     * 
     * @return
     *     The value of the failureValues property.
     */
    public List<ComplianceFailureComplianceFailureValues> getFailureValues() {
        if (failureValues == null) {
            failureValues = new ArrayList<>();
        }
        return this.failureValues;
    }

}
