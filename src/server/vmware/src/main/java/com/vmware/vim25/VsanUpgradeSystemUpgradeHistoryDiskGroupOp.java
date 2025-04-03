
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanUpgradeSystemUpgradeHistoryDiskGroupOp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanUpgradeSystemUpgradeHistoryDiskGroupOp">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VsanUpgradeSystemUpgradeHistoryItem">
 *       <sequence>
 *         <element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="diskMapping" type="{urn:internalvim25}VsanHostDiskMapping"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanUpgradeSystemUpgradeHistoryDiskGroupOp", propOrder = {
    "operation",
    "diskMapping"
})
public class VsanUpgradeSystemUpgradeHistoryDiskGroupOp
    extends VsanUpgradeSystemUpgradeHistoryItem
{

    @XmlElement(required = true)
    protected String operation;
    @XmlElement(required = true)
    protected VsanHostDiskMapping diskMapping;

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

    /**
     * Gets the value of the diskMapping property.
     * 
     * @return
     *     possible object is
     *     {@link VsanHostDiskMapping }
     *     
     */
    public VsanHostDiskMapping getDiskMapping() {
        return diskMapping;
    }

    /**
     * Sets the value of the diskMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanHostDiskMapping }
     *     
     */
    public void setDiskMapping(VsanHostDiskMapping value) {
        this.diskMapping = value;
    }

}
