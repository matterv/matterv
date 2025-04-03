
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSFilterSpecPnicConnecteeSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSFilterSpecPnicConnecteeSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVSFilterSpecConnecteeSpec">
 *       <sequence>
 *         <element name="pnicNameSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSFilterSpecPnicConnecteeSpec", propOrder = {
    "pnicNameSpec"
})
public class DVSFilterSpecPnicConnecteeSpec
    extends DVSFilterSpecConnecteeSpec
{

    protected String pnicNameSpec;

    /**
     * Gets the value of the pnicNameSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnicNameSpec() {
        return pnicNameSpec;
    }

    /**
     * Sets the value of the pnicNameSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnicNameSpec(String value) {
        this.pnicNameSpec = value;
    }

}
