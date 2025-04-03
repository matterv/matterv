
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSFilterSpecPvlanSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSFilterSpecPvlanSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVSFilterSpecVlanSpec">
 *       <sequence>
 *         <element name="pvlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSFilterSpecPvlanSpec", propOrder = {
    "pvlanId"
})
public class DVSFilterSpecPvlanSpec
    extends DVSFilterSpecVlanSpec
{

    protected Integer pvlanId;

    /**
     * Gets the value of the pvlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPvlanId() {
        return pvlanId;
    }

    /**
     * Sets the value of the pvlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPvlanId(Integer value) {
        this.pvlanId = value;
    }

}
