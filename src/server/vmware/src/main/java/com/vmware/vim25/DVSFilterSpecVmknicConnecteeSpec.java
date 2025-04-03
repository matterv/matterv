
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSFilterSpecVmknicConnecteeSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSFilterSpecVmknicConnecteeSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVSFilterSpecConnecteeSpec">
 *       <sequence>
 *         <element name="vmknicNameSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSFilterSpecVmknicConnecteeSpec", propOrder = {
    "vmknicNameSpec"
})
public class DVSFilterSpecVmknicConnecteeSpec
    extends DVSFilterSpecConnecteeSpec
{

    protected String vmknicNameSpec;

    /**
     * Gets the value of the vmknicNameSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmknicNameSpec() {
        return vmknicNameSpec;
    }

    /**
     * Sets the value of the vmknicNameSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmknicNameSpec(String value) {
        this.vmknicNameSpec = value;
    }

}
