
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplianceProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComplianceProfile">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="expression" type="{urn:internalvim25}ProfileExpression" maxOccurs="unbounded"/>
 *         <element name="rootExpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceProfile", propOrder = {
    "expression",
    "rootExpression"
})
public class ComplianceProfile
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<ProfileExpression> expression;
    @XmlElement(required = true)
    protected String rootExpression;

    /**
     * Gets the value of the expression property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expression property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileExpression }
     * </p>
     * 
     * 
     * @return
     *     The value of the expression property.
     */
    public List<ProfileExpression> getExpression() {
        if (expression == null) {
            expression = new ArrayList<>();
        }
        return this.expression;
    }

    /**
     * Gets the value of the rootExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootExpression() {
        return rootExpression;
    }

    /**
     * Sets the value of the rootExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootExpression(String value) {
        this.rootExpression = value;
    }

}
