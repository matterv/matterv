
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestWindowsProgramSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestWindowsProgramSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}GuestProgramSpec">
 *       <sequence>
 *         <element name="startMinimized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestWindowsProgramSpec", propOrder = {
    "startMinimized"
})
public class GuestWindowsProgramSpec
    extends GuestProgramSpec
{

    protected boolean startMinimized;

    /**
     * Gets the value of the startMinimized property.
     * 
     */
    public boolean isStartMinimized() {
        return startMinimized;
    }

    /**
     * Sets the value of the startMinimized property.
     * 
     */
    public void setStartMinimized(boolean value) {
        this.startMinimized = value;
    }

}
