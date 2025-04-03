
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineConfigInfoOverheadInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineConfigInfoOverheadInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="initialMemoryReservation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="initialSwapReservation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConfigInfoOverheadInfo", propOrder = {
    "initialMemoryReservation",
    "initialSwapReservation"
})
public class VirtualMachineConfigInfoOverheadInfo
    extends DynamicData
{

    protected Long initialMemoryReservation;
    protected Long initialSwapReservation;

    /**
     * Gets the value of the initialMemoryReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInitialMemoryReservation() {
        return initialMemoryReservation;
    }

    /**
     * Sets the value of the initialMemoryReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInitialMemoryReservation(Long value) {
        this.initialMemoryReservation = value;
    }

    /**
     * Gets the value of the initialSwapReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInitialSwapReservation() {
        return initialSwapReservation;
    }

    /**
     * Sets the value of the initialSwapReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInitialSwapReservation(Long value) {
        this.initialSwapReservation = value;
    }

}
