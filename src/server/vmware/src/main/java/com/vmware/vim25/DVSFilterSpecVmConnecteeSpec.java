
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSFilterSpecVmConnecteeSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSFilterSpecVmConnecteeSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVSFilterSpecConnecteeSpec">
 *       <sequence>
 *         <element name="vmNameSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSFilterSpecVmConnecteeSpec", propOrder = {
    "vmNameSpec"
})
public class DVSFilterSpecVmConnecteeSpec
    extends DVSFilterSpecConnecteeSpec
{

    protected String vmNameSpec;

    /**
     * Gets the value of the vmNameSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmNameSpec() {
        return vmNameSpec;
    }

    /**
     * Sets the value of the vmNameSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmNameSpec(String value) {
        this.vmNameSpec = value;
    }

}
