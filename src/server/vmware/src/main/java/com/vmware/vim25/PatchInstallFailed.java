
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatchInstallFailed complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PatchInstallFailed">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}PlatformConfigFault">
 *       <sequence>
 *         <element name="rolledBack" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatchInstallFailed", propOrder = {
    "rolledBack"
})
public class PatchInstallFailed
    extends PlatformConfigFault
{

    protected boolean rolledBack;

    /**
     * Gets the value of the rolledBack property.
     * 
     */
    public boolean isRolledBack() {
        return rolledBack;
    }

    /**
     * Sets the value of the rolledBack property.
     * 
     */
    public void setRolledBack(boolean value) {
        this.rolledBack = value;
    }

}
