
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineDvxClassInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineDvxClassInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="deviceClass" type="{urn:internalvim25}ElementDescription"/>
 *         <element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sriovNic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="configParams" type="{urn:internalvim25}OptionDef" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDvxClassInfo", propOrder = {
    "deviceClass",
    "vendorName",
    "sriovNic",
    "configParams"
})
public class VirtualMachineDvxClassInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected ElementDescription deviceClass;
    @XmlElement(required = true)
    protected String vendorName;
    protected boolean sriovNic;
    protected List<OptionDef> configParams;

    /**
     * Gets the value of the deviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link ElementDescription }
     *     
     */
    public ElementDescription getDeviceClass() {
        return deviceClass;
    }

    /**
     * Sets the value of the deviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementDescription }
     *     
     */
    public void setDeviceClass(ElementDescription value) {
        this.deviceClass = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
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

    /**
     * Gets the value of the configParams property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configParams property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfigParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionDef }
     * </p>
     * 
     * 
     * @return
     *     The value of the configParams property.
     */
    public List<OptionDef> getConfigParams() {
        if (configParams == null) {
            configParams = new ArrayList<>();
        }
        return this.configParams;
    }

}
