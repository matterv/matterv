
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceDVSConfigurationValidation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceDVSConfigurationValidation">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterComputeResourceValidationResultBase">
 *       <sequence>
 *         <element name="isDvsValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isDvpgValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceDVSConfigurationValidation", propOrder = {
    "isDvsValid",
    "isDvpgValid"
})
public class ClusterComputeResourceDVSConfigurationValidation
    extends ClusterComputeResourceValidationResultBase
{

    protected boolean isDvsValid;
    protected boolean isDvpgValid;

    /**
     * Gets the value of the isDvsValid property.
     * 
     */
    public boolean isIsDvsValid() {
        return isDvsValid;
    }

    /**
     * Sets the value of the isDvsValid property.
     * 
     */
    public void setIsDvsValid(boolean value) {
        this.isDvsValid = value;
    }

    /**
     * Gets the value of the isDvpgValid property.
     * 
     */
    public boolean isIsDvpgValid() {
        return isDvpgValid;
    }

    /**
     * Sets the value of the isDvpgValid property.
     * 
     */
    public void setIsDvpgValid(boolean value) {
        this.isDvpgValid = value;
    }

}
