
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChoiceOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ChoiceOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OptionType">
 *       <sequence>
 *         <element name="choiceInfo" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="defaultIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChoiceOption", propOrder = {
    "choiceInfo",
    "defaultIndex"
})
public class ChoiceOption
    extends OptionType
{

    @XmlElement(required = true)
    protected List<ElementDescription> choiceInfo;
    protected Integer defaultIndex;

    /**
     * Gets the value of the choiceInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choiceInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChoiceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the choiceInfo property.
     */
    public List<ElementDescription> getChoiceInfo() {
        if (choiceInfo == null) {
            choiceInfo = new ArrayList<>();
        }
        return this.choiceInfo;
    }

    /**
     * Gets the value of the defaultIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultIndex() {
        return defaultIndex;
    }

    /**
     * Sets the value of the defaultIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultIndex(Integer value) {
        this.defaultIndex = value;
    }

}
