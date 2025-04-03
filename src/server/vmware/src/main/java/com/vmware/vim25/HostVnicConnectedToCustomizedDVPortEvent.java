
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVnicConnectedToCustomizedDVPortEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVnicConnectedToCustomizedDVPortEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
 *       <sequence>
 *         <element name="vnic" type="{urn:internalvim25}VnicPortArgument"/>
 *         <element name="prevPortKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVnicConnectedToCustomizedDVPortEvent", propOrder = {
    "vnic",
    "prevPortKey"
})
public class HostVnicConnectedToCustomizedDVPortEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected VnicPortArgument vnic;
    protected String prevPortKey;

    /**
     * Gets the value of the vnic property.
     * 
     * @return
     *     possible object is
     *     {@link VnicPortArgument }
     *     
     */
    public VnicPortArgument getVnic() {
        return vnic;
    }

    /**
     * Sets the value of the vnic property.
     * 
     * @param value
     *     allowed object is
     *     {@link VnicPortArgument }
     *     
     */
    public void setVnic(VnicPortArgument value) {
        this.vnic = value;
    }

    /**
     * Gets the value of the prevPortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevPortKey() {
        return prevPortKey;
    }

    /**
     * Sets the value of the prevPortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevPortKey(String value) {
        this.prevPortKey = value;
    }

}
