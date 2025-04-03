
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseUsageInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseUsageInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="source" type="{urn:internalvim25}LicenseSource"/>
 *         <element name="sourceAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="reservationInfo" type="{urn:internalvim25}LicenseReservationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="featureInfo" type="{urn:internalvim25}LicenseFeatureInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseUsageInfo", propOrder = {
    "source",
    "sourceAvailable",
    "reservationInfo",
    "featureInfo"
})
public class LicenseUsageInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected LicenseSource source;
    protected boolean sourceAvailable;
    protected List<LicenseReservationInfo> reservationInfo;
    protected List<LicenseFeatureInfo> featureInfo;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseSource }
     *     
     */
    public LicenseSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseSource }
     *     
     */
    public void setSource(LicenseSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourceAvailable property.
     * 
     */
    public boolean isSourceAvailable() {
        return sourceAvailable;
    }

    /**
     * Sets the value of the sourceAvailable property.
     * 
     */
    public void setSourceAvailable(boolean value) {
        this.sourceAvailable = value;
    }

    /**
     * Gets the value of the reservationInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservationInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReservationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseReservationInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the reservationInfo property.
     */
    public List<LicenseReservationInfo> getReservationInfo() {
        if (reservationInfo == null) {
            reservationInfo = new ArrayList<>();
        }
        return this.reservationInfo;
    }

    /**
     * Gets the value of the featureInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeatureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseFeatureInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the featureInfo property.
     */
    public List<LicenseFeatureInfo> getFeatureInfo() {
        if (featureInfo == null) {
            featureInfo = new ArrayList<>();
        }
        return this.featureInfo;
    }

}
