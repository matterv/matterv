
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDvsLacpCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDvsLacpCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="lacpSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="multiLacpGroupSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="lacpFastModeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDvsLacpCapability", propOrder = {
    "lacpSupported",
    "multiLacpGroupSupported",
    "lacpFastModeSupported"
})
public class VMwareDvsLacpCapability
    extends DynamicData
{

    protected Boolean lacpSupported;
    protected Boolean multiLacpGroupSupported;
    protected Boolean lacpFastModeSupported;

    /**
     * Gets the value of the lacpSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLacpSupported() {
        return lacpSupported;
    }

    /**
     * Sets the value of the lacpSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLacpSupported(Boolean value) {
        this.lacpSupported = value;
    }

    /**
     * Gets the value of the multiLacpGroupSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiLacpGroupSupported() {
        return multiLacpGroupSupported;
    }

    /**
     * Sets the value of the multiLacpGroupSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiLacpGroupSupported(Boolean value) {
        this.multiLacpGroupSupported = value;
    }

    /**
     * Gets the value of the lacpFastModeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLacpFastModeSupported() {
        return lacpFastModeSupported;
    }

    /**
     * Sets the value of the lacpFastModeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLacpFastModeSupported(Boolean value) {
        this.lacpFastModeSupported = value;
    }

}
