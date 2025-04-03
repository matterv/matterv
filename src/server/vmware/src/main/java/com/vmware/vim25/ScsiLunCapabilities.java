
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScsiLunCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScsiLunCapabilities">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="updateDisplayNameSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScsiLunCapabilities", propOrder = {
    "updateDisplayNameSupported"
})
public class ScsiLunCapabilities
    extends DynamicData
{

    protected boolean updateDisplayNameSupported;

    /**
     * Gets the value of the updateDisplayNameSupported property.
     * 
     */
    public boolean isUpdateDisplayNameSupported() {
        return updateDisplayNameSupported;
    }

    /**
     * Sets the value of the updateDisplayNameSupported property.
     * 
     */
    public void setUpdateDisplayNameSupported(boolean value) {
        this.updateDisplayNameSupported = value;
    }

}
