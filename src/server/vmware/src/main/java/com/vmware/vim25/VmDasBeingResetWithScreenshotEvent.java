
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmDasBeingResetWithScreenshotEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmDasBeingResetWithScreenshotEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmDasBeingResetEvent">
 *       <sequence>
 *         <element name="screenshotFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDasBeingResetWithScreenshotEvent", propOrder = {
    "screenshotFilePath"
})
public class VmDasBeingResetWithScreenshotEvent
    extends VmDasBeingResetEvent
{

    @XmlElement(required = true)
    protected String screenshotFilePath;

    /**
     * Gets the value of the screenshotFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenshotFilePath() {
        return screenshotFilePath;
    }

    /**
     * Sets the value of the screenshotFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenshotFilePath(String value) {
        this.screenshotFilePath = value;
    }

}
