
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NicSettingMismatch complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NicSettingMismatch">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CustomizationFault">
 *       <sequence>
 *         <element name="numberOfNicsInSpec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numberOfNicsInVM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NicSettingMismatch", propOrder = {
    "numberOfNicsInSpec",
    "numberOfNicsInVM"
})
public class NicSettingMismatch
    extends CustomizationFault
{

    protected int numberOfNicsInSpec;
    protected int numberOfNicsInVM;

    /**
     * Gets the value of the numberOfNicsInSpec property.
     * 
     */
    public int getNumberOfNicsInSpec() {
        return numberOfNicsInSpec;
    }

    /**
     * Sets the value of the numberOfNicsInSpec property.
     * 
     */
    public void setNumberOfNicsInSpec(int value) {
        this.numberOfNicsInSpec = value;
    }

    /**
     * Gets the value of the numberOfNicsInVM property.
     * 
     */
    public int getNumberOfNicsInVM() {
        return numberOfNicsInVM;
    }

    /**
     * Sets the value of the numberOfNicsInVM property.
     * 
     */
    public void setNumberOfNicsInVM(int value) {
        this.numberOfNicsInVM = value;
    }

}
