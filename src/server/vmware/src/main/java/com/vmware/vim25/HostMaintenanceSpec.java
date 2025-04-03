
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostMaintenanceSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostMaintenanceSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vsanMode" type="{urn:internalvim25}VsanHostDecommissionMode" minOccurs="0"/>
 *         <element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMaintenanceSpec", propOrder = {
    "vsanMode",
    "purpose"
})
public class HostMaintenanceSpec
    extends DynamicData
{

    protected VsanHostDecommissionMode vsanMode;
    protected String purpose;

    /**
     * Gets the value of the vsanMode property.
     * 
     * @return
     *     possible object is
     *     {@link VsanHostDecommissionMode }
     *     
     */
    public VsanHostDecommissionMode getVsanMode() {
        return vsanMode;
    }

    /**
     * Sets the value of the vsanMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanHostDecommissionMode }
     *     
     */
    public void setVsanMode(VsanHostDecommissionMode value) {
        this.vsanMode = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

}
