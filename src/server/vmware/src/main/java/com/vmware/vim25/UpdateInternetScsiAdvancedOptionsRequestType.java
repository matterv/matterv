
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateInternetScsiAdvancedOptionsRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UpdateInternetScsiAdvancedOptionsRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="iScsiHbaDevice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="targetSet" type="{urn:internalvim25}HostInternetScsiHbaTargetSet" minOccurs="0"/>
 *         <element name="options" type="{urn:internalvim25}HostInternetScsiHbaParamValue" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInternetScsiAdvancedOptionsRequestType", propOrder = {
    "_this",
    "iScsiHbaDevice",
    "targetSet",
    "options"
})
public class UpdateInternetScsiAdvancedOptionsRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String iScsiHbaDevice;
    protected HostInternetScsiHbaTargetSet targetSet;
    @XmlElement(required = true)
    protected List<HostInternetScsiHbaParamValue> options;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the iScsiHbaDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIScsiHbaDevice() {
        return iScsiHbaDevice;
    }

    /**
     * Sets the value of the iScsiHbaDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIScsiHbaDevice(String value) {
        this.iScsiHbaDevice = value;
    }

    /**
     * Gets the value of the targetSet property.
     * 
     * @return
     *     possible object is
     *     {@link HostInternetScsiHbaTargetSet }
     *     
     */
    public HostInternetScsiHbaTargetSet getTargetSet() {
        return targetSet;
    }

    /**
     * Sets the value of the targetSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostInternetScsiHbaTargetSet }
     *     
     */
    public void setTargetSet(HostInternetScsiHbaTargetSet value) {
        this.targetSet = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostInternetScsiHbaParamValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the options property.
     */
    public List<HostInternetScsiHbaParamValue> getOptions() {
        if (options == null) {
            options = new ArrayList<>();
        }
        return this.options;
    }

}
