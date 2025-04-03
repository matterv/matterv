
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostDecommissionMode complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostDecommissionMode">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="objectAction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostDecommissionMode", propOrder = {
    "objectAction"
})
public class VsanHostDecommissionMode
    extends DynamicData
{

    @XmlElement(required = true)
    protected String objectAction;

    /**
     * Gets the value of the objectAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectAction() {
        return objectAction;
    }

    /**
     * Sets the value of the objectAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectAction(String value) {
        this.objectAction = value;
    }

}
