
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmClonedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmClonedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmCloneEvent">
 *       <sequence>
 *         <element name="sourceVm" type="{urn:internalvim25}VmEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmClonedEvent", propOrder = {
    "sourceVm"
})
public class VmClonedEvent
    extends VmCloneEvent
{

    @XmlElement(required = true)
    protected VmEventArgument sourceVm;

    /**
     * Gets the value of the sourceVm property.
     * 
     * @return
     *     possible object is
     *     {@link VmEventArgument }
     *     
     */
    public VmEventArgument getSourceVm() {
        return sourceVm;
    }

    /**
     * Sets the value of the sourceVm property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmEventArgument }
     *     
     */
    public void setSourceVm(VmEventArgument value) {
        this.sourceVm = value;
    }

}
