
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSubSpecificationUpdateEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSubSpecificationUpdateEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
 *       <sequence>
 *         <element name="hostSubSpec" type="{urn:internalvim25}HostSubSpecification"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSubSpecificationUpdateEvent", propOrder = {
    "hostSubSpec"
})
public class HostSubSpecificationUpdateEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected HostSubSpecification hostSubSpec;

    /**
     * Gets the value of the hostSubSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostSubSpecification }
     *     
     */
    public HostSubSpecification getHostSubSpec() {
        return hostSubSpec;
    }

    /**
     * Sets the value of the hostSubSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSubSpecification }
     *     
     */
    public void setHostSubSpec(HostSubSpecification value) {
        this.hostSubSpec = value;
    }

}
