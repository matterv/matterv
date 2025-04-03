
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsbScanCodeSpecKeyEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UsbScanCodeSpecKeyEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="usbHidCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="modifiers" type="{urn:internalvim25}UsbScanCodeSpecModifierType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsbScanCodeSpecKeyEvent", propOrder = {
    "usbHidCode",
    "modifiers"
})
public class UsbScanCodeSpecKeyEvent
    extends DynamicData
{

    protected int usbHidCode;
    protected UsbScanCodeSpecModifierType modifiers;

    /**
     * Gets the value of the usbHidCode property.
     * 
     */
    public int getUsbHidCode() {
        return usbHidCode;
    }

    /**
     * Sets the value of the usbHidCode property.
     * 
     */
    public void setUsbHidCode(int value) {
        this.usbHidCode = value;
    }

    /**
     * Gets the value of the modifiers property.
     * 
     * @return
     *     possible object is
     *     {@link UsbScanCodeSpecModifierType }
     *     
     */
    public UsbScanCodeSpecModifierType getModifiers() {
        return modifiers;
    }

    /**
     * Sets the value of the modifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsbScanCodeSpecModifierType }
     *     
     */
    public void setModifiers(UsbScanCodeSpecModifierType value) {
        this.modifiers = value;
    }

}
