
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmBeingDeployedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmBeingDeployedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="srcTemplate" type="{urn:internalvim25}VmEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmBeingDeployedEvent", propOrder = {
    "srcTemplate"
})
public class VmBeingDeployedEvent
    extends VmEvent
{

    @XmlElement(required = true)
    protected VmEventArgument srcTemplate;

    /**
     * Gets the value of the srcTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link VmEventArgument }
     *     
     */
    public VmEventArgument getSrcTemplate() {
        return srcTemplate;
    }

    /**
     * Sets the value of the srcTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmEventArgument }
     *     
     */
    public void setSrcTemplate(VmEventArgument value) {
        this.srcTemplate = value;
    }

}
