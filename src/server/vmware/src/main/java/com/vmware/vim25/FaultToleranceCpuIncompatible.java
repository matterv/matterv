
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultToleranceCpuIncompatible complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FaultToleranceCpuIncompatible">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CpuIncompatible">
 *       <sequence>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="family" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="stepping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceCpuIncompatible", propOrder = {
    "model",
    "family",
    "stepping"
})
public class FaultToleranceCpuIncompatible
    extends CpuIncompatible
{

    protected boolean model;
    protected boolean family;
    protected boolean stepping;

    /**
     * Gets the value of the model property.
     * 
     */
    public boolean isModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     */
    public void setModel(boolean value) {
        this.model = value;
    }

    /**
     * Gets the value of the family property.
     * 
     */
    public boolean isFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     */
    public void setFamily(boolean value) {
        this.family = value;
    }

    /**
     * Gets the value of the stepping property.
     * 
     */
    public boolean isStepping() {
        return stepping;
    }

    /**
     * Sets the value of the stepping property.
     * 
     */
    public void setStepping(boolean value) {
        this.stepping = value;
    }

}
