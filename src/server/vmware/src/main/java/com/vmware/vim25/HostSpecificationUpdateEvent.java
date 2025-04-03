
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSpecificationUpdateEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSpecificationUpdateEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostEvent">
 *       <sequence>
 *         <element name="hostSpec" type="{urn:internalvim25}HostSpecification"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSpecificationUpdateEvent", propOrder = {
    "hostSpec"
})
public class HostSpecificationUpdateEvent
    extends HostEvent
{

    @XmlElement(required = true)
    protected HostSpecification hostSpec;

    /**
     * Gets the value of the hostSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostSpecification }
     *     
     */
    public HostSpecification getHostSpec() {
        return hostSpec;
    }

    /**
     * Sets the value of the hostSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSpecification }
     *     
     */
    public void setHostSpec(HostSpecification value) {
        this.hostSpec = value;
    }

}
