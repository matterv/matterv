
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileSimpleExpression complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProfileSimpleExpression">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ProfileExpression">
 *       <sequence>
 *         <element name="expressionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="parameter" type="{urn:internalvim25}KeyAnyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileSimpleExpression", propOrder = {
    "expressionType",
    "parameter"
})
public class ProfileSimpleExpression
    extends ProfileExpression
{

    @XmlElement(required = true)
    protected String expressionType;
    protected List<KeyAnyValue> parameter;

    /**
     * Gets the value of the expressionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionType() {
        return expressionType;
    }

    /**
     * Sets the value of the expressionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionType(String value) {
        this.expressionType = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParameter().add(newItem);
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
     *     The value of the parameter property.
     */
    public List<KeyAnyValue> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<>();
        }
        return this.parameter;
    }

}
