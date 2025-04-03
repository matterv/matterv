
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerFileSerializedCreateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AnswerFileSerializedCreateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}AnswerFileCreateSpec">
 *       <sequence>
 *         <element name="answerFileConfigString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerFileSerializedCreateSpec", propOrder = {
    "answerFileConfigString"
})
public class AnswerFileSerializedCreateSpec
    extends AnswerFileCreateSpec
{

    @XmlElement(required = true)
    protected String answerFileConfigString;

    /**
     * Gets the value of the answerFileConfigString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerFileConfigString() {
        return answerFileConfigString;
    }

    /**
     * Sets the value of the answerFileConfigString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerFileConfigString(String value) {
        this.answerFileConfigString = value;
    }

}
