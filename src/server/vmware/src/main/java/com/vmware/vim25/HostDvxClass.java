
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDvxClass complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDvxClass">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="deviceClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="checkpointSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="swDMATracingSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sriovNic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDvxClass", propOrder = {
    "deviceClass",
    "checkpointSupported",
    "swDMATracingSupported",
    "sriovNic"
})
public class HostDvxClass
    extends DynamicData
{

    @XmlElement(required = true)
    protected String deviceClass;
    protected boolean checkpointSupported;
    protected boolean swDMATracingSupported;
    protected boolean sriovNic;

    /**
     * Gets the value of the deviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceClass() {
        return deviceClass;
    }

    /**
     * Sets the value of the deviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceClass(String value) {
        this.deviceClass = value;
    }

    /**
     * Gets the value of the checkpointSupported property.
     * 
     */
    public boolean isCheckpointSupported() {
        return checkpointSupported;
    }

    /**
     * Sets the value of the checkpointSupported property.
     * 
     */
    public void setCheckpointSupported(boolean value) {
        this.checkpointSupported = value;
    }

    /**
     * Gets the value of the swDMATracingSupported property.
     * 
     */
    public boolean isSwDMATracingSupported() {
        return swDMATracingSupported;
    }

    /**
     * Sets the value of the swDMATracingSupported property.
     * 
     */
    public void setSwDMATracingSupported(boolean value) {
        this.swDMATracingSupported = value;
    }

    /**
     * Gets the value of the sriovNic property.
     * 
     */
    public boolean isSriovNic() {
        return sriovNic;
    }

    /**
     * Sets the value of the sriovNic property.
     * 
     */
    public void setSriovNic(boolean value) {
        this.sriovNic = value;
    }

}
