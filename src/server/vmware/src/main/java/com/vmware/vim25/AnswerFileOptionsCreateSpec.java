
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerFileOptionsCreateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AnswerFileOptionsCreateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}AnswerFileCreateSpec">
 *       <sequence>
 *         <element name="userInput" type="{urn:internalvim25}ProfileDeferredPolicyOptionParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerFileOptionsCreateSpec", propOrder = {
    "userInput"
})
public class AnswerFileOptionsCreateSpec
    extends AnswerFileCreateSpec
{

    protected List<ProfileDeferredPolicyOptionParameter> userInput;

    /**
     * Gets the value of the userInput property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInput property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUserInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileDeferredPolicyOptionParameter }
     * </p>
     * 
     * 
     * @return
     *     The value of the userInput property.
     */
    public List<ProfileDeferredPolicyOptionParameter> getUserInput() {
        if (userInput == null) {
            userInput = new ArrayList<>();
        }
        return this.userInput;
    }

}
