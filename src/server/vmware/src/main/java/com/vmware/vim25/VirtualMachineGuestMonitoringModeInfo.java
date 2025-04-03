
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineGuestMonitoringModeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineGuestMonitoringModeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="gmmFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gmmAppliance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineGuestMonitoringModeInfo", propOrder = {
    "gmmFile",
    "gmmAppliance"
})
public class VirtualMachineGuestMonitoringModeInfo
    extends DynamicData
{

    protected String gmmFile;
    protected String gmmAppliance;

    /**
     * Gets the value of the gmmFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmmFile() {
        return gmmFile;
    }

    /**
     * Sets the value of the gmmFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmmFile(String value) {
        this.gmmFile = value;
    }

    /**
     * Gets the value of the gmmAppliance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmmAppliance() {
        return gmmAppliance;
    }

    /**
     * Sets the value of the gmmAppliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmmAppliance(String value) {
        this.gmmAppliance = value;
    }

}
