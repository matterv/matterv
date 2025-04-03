
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNvmeDisconnectSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNvmeDisconnectSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="hbaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="subnqn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="controllerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeDisconnectSpec", propOrder = {
    "hbaName",
    "subnqn",
    "controllerNumber"
})
public class HostNvmeDisconnectSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String hbaName;
    protected String subnqn;
    protected Integer controllerNumber;

    /**
     * Gets the value of the hbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHbaName() {
        return hbaName;
    }

    /**
     * Sets the value of the hbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHbaName(String value) {
        this.hbaName = value;
    }

    /**
     * Gets the value of the subnqn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnqn() {
        return subnqn;
    }

    /**
     * Sets the value of the subnqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnqn(String value) {
        this.subnqn = value;
    }

    /**
     * Gets the value of the controllerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getControllerNumber() {
        return controllerNumber;
    }

    /**
     * Sets the value of the controllerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setControllerNumber(Integer value) {
        this.controllerNumber = value;
    }

}
