
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfMappedOsId complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfMappedOsId">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfImport">
 *       <sequence>
 *         <element name="ovfId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ovfDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="targetDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfMappedOsId", propOrder = {
    "ovfId",
    "ovfDescription",
    "targetDescription"
})
public class OvfMappedOsId
    extends OvfImport
{

    protected int ovfId;
    @XmlElement(required = true)
    protected String ovfDescription;
    @XmlElement(required = true)
    protected String targetDescription;

    /**
     * Gets the value of the ovfId property.
     * 
     */
    public int getOvfId() {
        return ovfId;
    }

    /**
     * Sets the value of the ovfId property.
     * 
     */
    public void setOvfId(int value) {
        this.ovfId = value;
    }

    /**
     * Gets the value of the ovfDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvfDescription() {
        return ovfDescription;
    }

    /**
     * Sets the value of the ovfDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvfDescription(String value) {
        this.ovfDescription = value;
    }

    /**
     * Gets the value of the targetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDescription() {
        return targetDescription;
    }

    /**
     * Sets the value of the targetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDescription(String value) {
        this.targetDescription = value;
    }

}
