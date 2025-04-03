
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestRegistryFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestRegistryFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}GuestOperationsFault">
 *       <sequence>
 *         <element name="windowsSystemErrorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegistryFault", propOrder = {
    "windowsSystemErrorCode"
})
@XmlSeeAlso({
    GuestRegistryKeyFault.class,
    GuestRegistryValueFault.class
})
public class GuestRegistryFault
    extends GuestOperationsFault
{

    protected long windowsSystemErrorCode;

    /**
     * Gets the value of the windowsSystemErrorCode property.
     * 
     */
    public long getWindowsSystemErrorCode() {
        return windowsSystemErrorCode;
    }

    /**
     * Sets the value of the windowsSystemErrorCode property.
     * 
     */
    public void setWindowsSystemErrorCode(long value) {
        this.windowsSystemErrorCode = value;
    }

}
