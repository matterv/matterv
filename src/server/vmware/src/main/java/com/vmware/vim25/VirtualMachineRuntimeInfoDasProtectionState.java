
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineRuntimeInfoDasProtectionState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineRuntimeInfoDasProtectionState">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dasProtected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRuntimeInfoDasProtectionState", propOrder = {
    "dasProtected"
})
public class VirtualMachineRuntimeInfoDasProtectionState
    extends DynamicData
{

    protected boolean dasProtected;

    /**
     * Gets the value of the dasProtected property.
     * 
     */
    public boolean isDasProtected() {
        return dasProtected;
    }

    /**
     * Sets the value of the dasProtected property.
     * 
     */
    public void setDasProtected(boolean value) {
        this.dasProtected = value;
    }

}
