
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultToleranceSecondaryConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FaultToleranceSecondaryConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}FaultToleranceConfigInfo">
 *       <sequence>
 *         <element name="primaryVM" type="{urn:internalvim25}ManagedObjectReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceSecondaryConfigInfo", propOrder = {
    "primaryVM"
})
public class FaultToleranceSecondaryConfigInfo
    extends FaultToleranceConfigInfo
{

    @XmlElement(required = true)
    protected ManagedObjectReference primaryVM;

    /**
     * Gets the value of the primaryVM property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getPrimaryVM() {
        return primaryVM;
    }

    /**
     * Sets the value of the primaryVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setPrimaryVM(ManagedObjectReference value) {
        this.primaryVM = value;
    }

}
