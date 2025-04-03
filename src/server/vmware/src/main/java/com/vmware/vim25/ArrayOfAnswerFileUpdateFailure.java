
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAnswerFileUpdateFailure complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAnswerFileUpdateFailure">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AnswerFileUpdateFailure" type="{urn:internalvim25}AnswerFileUpdateFailure" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAnswerFileUpdateFailure", propOrder = {
    "answerFileUpdateFailure"
})
public class ArrayOfAnswerFileUpdateFailure {

    @XmlElement(name = "AnswerFileUpdateFailure")
    protected List<AnswerFileUpdateFailure> answerFileUpdateFailure;

    /**
     * Gets the value of the answerFileUpdateFailure property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answerFileUpdateFailure property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAnswerFileUpdateFailure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnswerFileUpdateFailure }
     * </p>
     * 
     * 
     * @return
     *     The value of the answerFileUpdateFailure property.
     */
    public List<AnswerFileUpdateFailure> getAnswerFileUpdateFailure() {
        if (answerFileUpdateFailure == null) {
            answerFileUpdateFailure = new ArrayList<>();
        }
        return this.answerFileUpdateFailure;
    }

}
