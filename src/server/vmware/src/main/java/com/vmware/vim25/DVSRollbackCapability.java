
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSRollbackCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSRollbackCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="rollbackSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSRollbackCapability", propOrder = {
    "rollbackSupported"
})
public class DVSRollbackCapability
    extends DynamicData
{

    protected boolean rollbackSupported;

    /**
     * Gets the value of the rollbackSupported property.
     * 
     */
    public boolean isRollbackSupported() {
        return rollbackSupported;
    }

    /**
     * Sets the value of the rollbackSupported property.
     * 
     */
    public void setRollbackSupported(boolean value) {
        this.rollbackSupported = value;
    }

}
