
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSPvlanConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSPvlanConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="pvlanEntry" type="{urn:internalvim25}VMwareDVSPvlanMapEntry"/>
 *         <element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSPvlanConfigSpec", propOrder = {
    "pvlanEntry",
    "operation"
})
public class VMwareDVSPvlanConfigSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected VMwareDVSPvlanMapEntry pvlanEntry;
    @XmlElement(required = true)
    protected String operation;

    /**
     * Gets the value of the pvlanEntry property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareDVSPvlanMapEntry }
     *     
     */
    public VMwareDVSPvlanMapEntry getPvlanEntry() {
        return pvlanEntry;
    }

    /**
     * Sets the value of the pvlanEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareDVSPvlanMapEntry }
     *     
     */
    public void setPvlanEntry(VMwareDVSPvlanMapEntry value) {
        this.pvlanEntry = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
