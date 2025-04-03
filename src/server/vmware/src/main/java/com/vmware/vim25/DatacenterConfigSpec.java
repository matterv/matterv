
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatacenterConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatacenterConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="defaultHardwareVersionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="maximumHardwareVersionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterConfigSpec", propOrder = {
    "defaultHardwareVersionKey",
    "maximumHardwareVersionKey"
})
public class DatacenterConfigSpec
    extends DynamicData
{

    protected String defaultHardwareVersionKey;
    protected String maximumHardwareVersionKey;

    /**
     * Gets the value of the defaultHardwareVersionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultHardwareVersionKey() {
        return defaultHardwareVersionKey;
    }

    /**
     * Sets the value of the defaultHardwareVersionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultHardwareVersionKey(String value) {
        this.defaultHardwareVersionKey = value;
    }

    /**
     * Gets the value of the maximumHardwareVersionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumHardwareVersionKey() {
        return maximumHardwareVersionKey;
    }

    /**
     * Sets the value of the maximumHardwareVersionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumHardwareVersionKey(String value) {
        this.maximumHardwareVersionKey = value;
    }

}
