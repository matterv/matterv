
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileExpressionMetadata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProfileExpressionMetadata">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="expressionId" type="{urn:internalvim25}ExtendedElementDescription"/>
 *         <element name="parameter" type="{urn:internalvim25}ProfileParameterMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileExpressionMetadata", propOrder = {
    "expressionId",
    "parameter"
})
public class ProfileExpressionMetadata
    extends DynamicData
{

    @XmlElement(required = true)
    protected ExtendedElementDescription expressionId;
    protected List<ProfileParameterMetadata> parameter;

    /**
     * Gets the value of the expressionId property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedElementDescription }
     *     
     */
    public ExtendedElementDescription getExpressionId() {
        return expressionId;
    }

    /**
     * Sets the value of the expressionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedElementDescription }
     *     
     */
    public void setExpressionId(ExtendedElementDescription value) {
        this.expressionId = value;
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
     * {@link ProfileParameterMetadata }
     * </p>
     * 
     * 
     * @return
     *     The value of the parameter property.
     */
    public List<ProfileParameterMetadata> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<>();
        }
        return this.parameter;
    }

}
