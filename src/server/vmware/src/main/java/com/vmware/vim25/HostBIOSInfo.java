
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostBIOSInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostBIOSInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="biosVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="majorRelease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="minorRelease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="firmwareMajorRelease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="firmwareMinorRelease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="firmwareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostBIOSInfo", propOrder = {
    "biosVersion",
    "releaseDate",
    "vendor",
    "majorRelease",
    "minorRelease",
    "firmwareMajorRelease",
    "firmwareMinorRelease",
    "firmwareType"
})
public class HostBIOSInfo
    extends DynamicData
{

    protected String biosVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDate;
    protected String vendor;
    protected Integer majorRelease;
    protected Integer minorRelease;
    protected Integer firmwareMajorRelease;
    protected Integer firmwareMinorRelease;
    protected String firmwareType;

    /**
     * Gets the value of the biosVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiosVersion() {
        return biosVersion;
    }

    /**
     * Sets the value of the biosVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiosVersion(String value) {
        this.biosVersion = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(XMLGregorianCalendar value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the majorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMajorRelease() {
        return majorRelease;
    }

    /**
     * Sets the value of the majorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMajorRelease(Integer value) {
        this.majorRelease = value;
    }

    /**
     * Gets the value of the minorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinorRelease() {
        return minorRelease;
    }

    /**
     * Sets the value of the minorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinorRelease(Integer value) {
        this.minorRelease = value;
    }

    /**
     * Gets the value of the firmwareMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirmwareMajorRelease() {
        return firmwareMajorRelease;
    }

    /**
     * Sets the value of the firmwareMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirmwareMajorRelease(Integer value) {
        this.firmwareMajorRelease = value;
    }

    /**
     * Gets the value of the firmwareMinorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirmwareMinorRelease() {
        return firmwareMinorRelease;
    }

    /**
     * Sets the value of the firmwareMinorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirmwareMinorRelease(Integer value) {
        this.firmwareMinorRelease = value;
    }

    /**
     * Gets the value of the firmwareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareType() {
        return firmwareType;
    }

    /**
     * Sets the value of the firmwareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareType(String value) {
        this.firmwareType = value;
    }

}
