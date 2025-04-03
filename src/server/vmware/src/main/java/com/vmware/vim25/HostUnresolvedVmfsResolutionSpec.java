
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostUnresolvedVmfsResolutionSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostUnresolvedVmfsResolutionSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="extentDevicePath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="uuidResolution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostUnresolvedVmfsResolutionSpec", propOrder = {
    "extentDevicePath",
    "uuidResolution"
})
public class HostUnresolvedVmfsResolutionSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<String> extentDevicePath;
    @XmlElement(required = true)
    protected String uuidResolution;

    /**
     * Gets the value of the extentDevicePath property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extentDevicePath property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExtentDevicePath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the extentDevicePath property.
     */
    public List<String> getExtentDevicePath() {
        if (extentDevicePath == null) {
            extentDevicePath = new ArrayList<>();
        }
        return this.extentDevicePath;
    }

    /**
     * Gets the value of the uuidResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidResolution() {
        return uuidResolution;
    }

    /**
     * Sets the value of the uuidResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidResolution(String value) {
        this.uuidResolution = value;
    }

}
