
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceConnectOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceConnectOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="startConnected" type="{urn:internalvim25}BoolOption"/>
 *         <element name="allowGuestControl" type="{urn:internalvim25}BoolOption"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceConnectOption", propOrder = {
    "startConnected",
    "allowGuestControl"
})
public class VirtualDeviceConnectOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected BoolOption startConnected;
    @XmlElement(required = true)
    protected BoolOption allowGuestControl;

    /**
     * Gets the value of the startConnected property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getStartConnected() {
        return startConnected;
    }

    /**
     * Sets the value of the startConnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setStartConnected(BoolOption value) {
        this.startConnected = value;
    }

    /**
     * Gets the value of the allowGuestControl property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getAllowGuestControl() {
        return allowGuestControl;
    }

    /**
     * Sets the value of the allowGuestControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setAllowGuestControl(BoolOption value) {
        this.allowGuestControl = value;
    }

}
