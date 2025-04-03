
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateAlarmExpression complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StateAlarmExpression">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}AlarmExpression">
 *       <sequence>
 *         <element name="operator" type="{urn:internalvim25}StateAlarmOperator"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="statePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="yellow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="red" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateAlarmExpression", propOrder = {
    "operator",
    "type",
    "statePath",
    "yellow",
    "red"
})
public class StateAlarmExpression
    extends AlarmExpression
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StateAlarmOperator operator;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String statePath;
    protected String yellow;
    protected String red;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link StateAlarmOperator }
     *     
     */
    public StateAlarmOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateAlarmOperator }
     *     
     */
    public void setOperator(StateAlarmOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the statePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatePath() {
        return statePath;
    }

    /**
     * Sets the value of the statePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatePath(String value) {
        this.statePath = value;
    }

    /**
     * Gets the value of the yellow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYellow() {
        return yellow;
    }

    /**
     * Sets the value of the yellow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYellow(String value) {
        this.yellow = value;
    }

    /**
     * Gets the value of the red property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRed() {
        return red;
    }

    /**
     * Sets the value of the red property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRed(String value) {
        this.red = value;
    }

}
