
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmVnicPoolReservationViolationRaiseEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmVnicPoolReservationViolationRaiseEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsEvent">
 *       <sequence>
 *         <element name="vmVnicResourcePoolKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vmVnicResourcePoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmVnicPoolReservationViolationRaiseEvent", propOrder = {
    "vmVnicResourcePoolKey",
    "vmVnicResourcePoolName"
})
public class VmVnicPoolReservationViolationRaiseEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected String vmVnicResourcePoolKey;
    protected String vmVnicResourcePoolName;

    /**
     * Gets the value of the vmVnicResourcePoolKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmVnicResourcePoolKey() {
        return vmVnicResourcePoolKey;
    }

    /**
     * Sets the value of the vmVnicResourcePoolKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmVnicResourcePoolKey(String value) {
        this.vmVnicResourcePoolKey = value;
    }

    /**
     * Gets the value of the vmVnicResourcePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmVnicResourcePoolName() {
        return vmVnicResourcePoolName;
    }

    /**
     * Sets the value of the vmVnicResourcePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmVnicResourcePoolName(String value) {
        this.vmVnicResourcePoolName = value;
    }

}
