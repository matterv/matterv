
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidController complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InvalidController">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InvalidDeviceSpec">
 *       <sequence>
 *         <element name="controllerKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidController", propOrder = {
    "controllerKey"
})
public class InvalidController
    extends InvalidDeviceSpec
{

    protected int controllerKey;

    /**
     * Gets the value of the controllerKey property.
     * 
     */
    public int getControllerKey() {
        return controllerKey;
    }

    /**
     * Sets the value of the controllerKey property.
     * 
     */
    public void setControllerKey(int value) {
        this.controllerKey = value;
    }

}
