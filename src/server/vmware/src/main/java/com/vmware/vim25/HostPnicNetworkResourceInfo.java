
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostPnicNetworkResourceInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostPnicNetworkResourceInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="pnicDevice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="availableBandwidthForVMTraffic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="unusedBandwidthForVMTraffic" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="placedVirtualNics" type="{urn:internalvim25}HostPlacedVirtualNicIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPnicNetworkResourceInfo", propOrder = {
    "pnicDevice",
    "availableBandwidthForVMTraffic",
    "unusedBandwidthForVMTraffic",
    "placedVirtualNics"
})
public class HostPnicNetworkResourceInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String pnicDevice;
    protected Long availableBandwidthForVMTraffic;
    protected Long unusedBandwidthForVMTraffic;
    protected List<HostPlacedVirtualNicIdentifier> placedVirtualNics;

    /**
     * Gets the value of the pnicDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnicDevice() {
        return pnicDevice;
    }

    /**
     * Sets the value of the pnicDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnicDevice(String value) {
        this.pnicDevice = value;
    }

    /**
     * Gets the value of the availableBandwidthForVMTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableBandwidthForVMTraffic() {
        return availableBandwidthForVMTraffic;
    }

    /**
     * Sets the value of the availableBandwidthForVMTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableBandwidthForVMTraffic(Long value) {
        this.availableBandwidthForVMTraffic = value;
    }

    /**
     * Gets the value of the unusedBandwidthForVMTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnusedBandwidthForVMTraffic() {
        return unusedBandwidthForVMTraffic;
    }

    /**
     * Sets the value of the unusedBandwidthForVMTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnusedBandwidthForVMTraffic(Long value) {
        this.unusedBandwidthForVMTraffic = value;
    }

    /**
     * Gets the value of the placedVirtualNics property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placedVirtualNics property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPlacedVirtualNics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPlacedVirtualNicIdentifier }
     * </p>
     * 
     * 
     * @return
     *     The value of the placedVirtualNics property.
     */
    public List<HostPlacedVirtualNicIdentifier> getPlacedVirtualNics() {
        if (placedVirtualNics == null) {
            placedVirtualNics = new ArrayList<>();
        }
        return this.placedVirtualNics;
    }

}
