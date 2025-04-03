
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSPvlanMapEntry complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSPvlanMapEntry">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="primaryVlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="secondaryVlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="pvlanType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSPvlanMapEntry", propOrder = {
    "primaryVlanId",
    "secondaryVlanId",
    "pvlanType"
})
public class VMwareDVSPvlanMapEntry
    extends DynamicData
{

    protected int primaryVlanId;
    protected int secondaryVlanId;
    @XmlElement(required = true)
    protected String pvlanType;

    /**
     * Gets the value of the primaryVlanId property.
     * 
     */
    public int getPrimaryVlanId() {
        return primaryVlanId;
    }

    /**
     * Sets the value of the primaryVlanId property.
     * 
     */
    public void setPrimaryVlanId(int value) {
        this.primaryVlanId = value;
    }

    /**
     * Gets the value of the secondaryVlanId property.
     * 
     */
    public int getSecondaryVlanId() {
        return secondaryVlanId;
    }

    /**
     * Sets the value of the secondaryVlanId property.
     * 
     */
    public void setSecondaryVlanId(int value) {
        this.secondaryVlanId = value;
    }

    /**
     * Gets the value of the pvlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPvlanType() {
        return pvlanType;
    }

    /**
     * Sets the value of the pvlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPvlanType(String value) {
        this.pvlanType = value;
    }

}
