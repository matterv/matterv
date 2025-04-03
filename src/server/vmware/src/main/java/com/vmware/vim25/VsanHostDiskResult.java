
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostDiskResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostDiskResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="disk" type="{urn:internalvim25}HostScsiDisk"/>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vsanUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="error" type="{urn:internalvim25}LocalizedMethodFault" minOccurs="0"/>
 *         <element name="degraded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostDiskResult", propOrder = {
    "disk",
    "state",
    "vsanUuid",
    "error",
    "degraded"
})
public class VsanHostDiskResult
    extends DynamicData
{

    @XmlElement(required = true)
    protected HostScsiDisk disk;
    @XmlElement(required = true)
    protected String state;
    protected String vsanUuid;
    protected LocalizedMethodFault error;
    protected Boolean degraded;

    /**
     * Gets the value of the disk property.
     * 
     * @return
     *     possible object is
     *     {@link HostScsiDisk }
     *     
     */
    public HostScsiDisk getDisk() {
        return disk;
    }

    /**
     * Sets the value of the disk property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostScsiDisk }
     *     
     */
    public void setDisk(HostScsiDisk value) {
        this.disk = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the vsanUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsanUuid() {
        return vsanUuid;
    }

    /**
     * Sets the value of the vsanUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVsanUuid(String value) {
        this.vsanUuid = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setError(LocalizedMethodFault value) {
        this.error = value;
    }

    /**
     * Gets the value of the degraded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDegraded() {
        return degraded;
    }

    /**
     * Sets the value of the degraded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDegraded(Boolean value) {
        this.degraded = value;
    }

}
