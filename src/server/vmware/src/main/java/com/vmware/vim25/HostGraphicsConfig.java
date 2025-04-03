
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostGraphicsConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostGraphicsConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="hostDefaultGraphicsType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sharedPassthruAssignmentPolicy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deviceType" type="{urn:internalvim25}HostGraphicsConfigDeviceType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostGraphicsConfig", propOrder = {
    "hostDefaultGraphicsType",
    "sharedPassthruAssignmentPolicy",
    "deviceType"
})
public class HostGraphicsConfig
    extends DynamicData
{

    @XmlElement(required = true)
    protected String hostDefaultGraphicsType;
    @XmlElement(required = true)
    protected String sharedPassthruAssignmentPolicy;
    protected List<HostGraphicsConfigDeviceType> deviceType;

    /**
     * Gets the value of the hostDefaultGraphicsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostDefaultGraphicsType() {
        return hostDefaultGraphicsType;
    }

    /**
     * Sets the value of the hostDefaultGraphicsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostDefaultGraphicsType(String value) {
        this.hostDefaultGraphicsType = value;
    }

    /**
     * Gets the value of the sharedPassthruAssignmentPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedPassthruAssignmentPolicy() {
        return sharedPassthruAssignmentPolicy;
    }

    /**
     * Sets the value of the sharedPassthruAssignmentPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedPassthruAssignmentPolicy(String value) {
        this.sharedPassthruAssignmentPolicy = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeviceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostGraphicsConfigDeviceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the deviceType property.
     */
    public List<HostGraphicsConfigDeviceType> getDeviceType() {
        if (deviceType == null) {
            deviceType = new ArrayList<>();
        }
        return this.deviceType;
    }

}
