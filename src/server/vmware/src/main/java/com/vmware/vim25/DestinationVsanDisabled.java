
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinationVsanDisabled complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DestinationVsanDisabled">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CannotMoveVsanEnabledHost">
 *       <sequence>
 *         <element name="destinationCluster" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationVsanDisabled", propOrder = {
    "destinationCluster"
})
public class DestinationVsanDisabled
    extends CannotMoveVsanEnabledHost
{

    @XmlElement(required = true)
    protected String destinationCluster;

    /**
     * Gets the value of the destinationCluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCluster() {
        return destinationCluster;
    }

    /**
     * Sets the value of the destinationCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCluster(String value) {
        this.destinationCluster = value;
    }

}
