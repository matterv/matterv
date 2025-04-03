
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DpuStatusInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DpuStatusInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostHardwareElementInfo">
 *       <sequence>
 *         <element name="dpuId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fru" type="{urn:internalvim25}HostFru" minOccurs="0"/>
 *         <element name="sensors" type="{urn:internalvim25}DpuStatusInfoOperationalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DpuStatusInfo", propOrder = {
    "dpuId",
    "fru",
    "sensors"
})
public class DpuStatusInfo
    extends HostHardwareElementInfo
{

    @XmlElement(required = true)
    protected String dpuId;
    protected HostFru fru;
    protected List<DpuStatusInfoOperationalInfo> sensors;

    /**
     * Gets the value of the dpuId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpuId() {
        return dpuId;
    }

    /**
     * Sets the value of the dpuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpuId(String value) {
        this.dpuId = value;
    }

    /**
     * Gets the value of the fru property.
     * 
     * @return
     *     possible object is
     *     {@link HostFru }
     *     
     */
    public HostFru getFru() {
        return fru;
    }

    /**
     * Sets the value of the fru property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostFru }
     *     
     */
    public void setFru(HostFru value) {
        this.fru = value;
    }

    /**
     * Gets the value of the sensors property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensors property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSensors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DpuStatusInfoOperationalInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the sensors property.
     */
    public List<DpuStatusInfoOperationalInfo> getSensors() {
        if (sensors == null) {
            sensors = new ArrayList<>();
        }
        return this.sensors;
    }

}
