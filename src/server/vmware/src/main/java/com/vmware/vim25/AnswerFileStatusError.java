
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerFileStatusError complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AnswerFileStatusError">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="userInputPath" type="{urn:internalvim25}ProfilePropertyPath"/>
 *         <element name="errMsg" type="{urn:internalvim25}LocalizableMessage"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerFileStatusError", propOrder = {
    "userInputPath",
    "errMsg"
})
public class AnswerFileStatusError
    extends DynamicData
{

    @XmlElement(required = true)
    protected ProfilePropertyPath userInputPath;
    @XmlElement(required = true)
    protected LocalizableMessage errMsg;

    /**
     * Gets the value of the userInputPath property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilePropertyPath }
     *     
     */
    public ProfilePropertyPath getUserInputPath() {
        return userInputPath;
    }

    /**
     * Sets the value of the userInputPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilePropertyPath }
     *     
     */
    public void setUserInputPath(ProfilePropertyPath value) {
        this.userInputPath = value;
    }

    /**
     * Gets the value of the errMsg property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizableMessage }
     *     
     */
    public LocalizableMessage getErrMsg() {
        return errMsg;
    }

    /**
     * Sets the value of the errMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizableMessage }
     *     
     */
    public void setErrMsg(LocalizableMessage value) {
        this.errMsg = value;
    }

}
