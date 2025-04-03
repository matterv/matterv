
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsbScanCodeSpecModifierType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UsbScanCodeSpecModifierType">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="leftControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="leftShift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="leftAlt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="leftGui" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="rightControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="rightShift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="rightAlt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="rightGui" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsbScanCodeSpecModifierType", propOrder = {
    "leftControl",
    "leftShift",
    "leftAlt",
    "leftGui",
    "rightControl",
    "rightShift",
    "rightAlt",
    "rightGui"
})
public class UsbScanCodeSpecModifierType
    extends DynamicData
{

    protected Boolean leftControl;
    protected Boolean leftShift;
    protected Boolean leftAlt;
    protected Boolean leftGui;
    protected Boolean rightControl;
    protected Boolean rightShift;
    protected Boolean rightAlt;
    protected Boolean rightGui;

    /**
     * Gets the value of the leftControl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeftControl() {
        return leftControl;
    }

    /**
     * Sets the value of the leftControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftControl(Boolean value) {
        this.leftControl = value;
    }

    /**
     * Gets the value of the leftShift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeftShift() {
        return leftShift;
    }

    /**
     * Sets the value of the leftShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftShift(Boolean value) {
        this.leftShift = value;
    }

    /**
     * Gets the value of the leftAlt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeftAlt() {
        return leftAlt;
    }

    /**
     * Sets the value of the leftAlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftAlt(Boolean value) {
        this.leftAlt = value;
    }

    /**
     * Gets the value of the leftGui property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeftGui() {
        return leftGui;
    }

    /**
     * Sets the value of the leftGui property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftGui(Boolean value) {
        this.leftGui = value;
    }

    /**
     * Gets the value of the rightControl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightControl() {
        return rightControl;
    }

    /**
     * Sets the value of the rightControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightControl(Boolean value) {
        this.rightControl = value;
    }

    /**
     * Gets the value of the rightShift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightShift() {
        return rightShift;
    }

    /**
     * Sets the value of the rightShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightShift(Boolean value) {
        this.rightShift = value;
    }

    /**
     * Gets the value of the rightAlt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightAlt() {
        return rightAlt;
    }

    /**
     * Sets the value of the rightAlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightAlt(Boolean value) {
        this.rightAlt = value;
    }

    /**
     * Gets the value of the rightGui property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightGui() {
        return rightGui;
    }

    /**
     * Sets the value of the rightGui property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightGui(Boolean value) {
        this.rightGui = value;
    }

}
