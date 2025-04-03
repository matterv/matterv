
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatchNotApplicable complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PatchNotApplicable">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="patchID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatchNotApplicable", propOrder = {
    "patchID"
})
@XmlSeeAlso({
    PatchAlreadyInstalled.class,
    PatchMissingDependencies.class,
    PatchSuperseded.class
})
public class PatchNotApplicable
    extends VimFault
{

    @XmlElement(required = true)
    protected String patchID;

    /**
     * Gets the value of the patchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatchID() {
        return patchID;
    }

    /**
     * Sets the value of the patchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatchID(String value) {
        this.patchID = value;
    }

}
