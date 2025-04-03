
package com.vmware.vim25;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseDiagnostics complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseDiagnostics">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="sourceLastChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="sourceLost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sourceLatency" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="licenseRequests" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="licenseRequestFailures" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="licenseFeatureUnknowns" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="opState" type="{urn:internalvim25}LicenseManagerState"/>
 *         <element name="lastStatusUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="opFailureMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseDiagnostics", propOrder = {
    "sourceLastChanged",
    "sourceLost",
    "sourceLatency",
    "licenseRequests",
    "licenseRequestFailures",
    "licenseFeatureUnknowns",
    "opState",
    "lastStatusUpdate",
    "opFailureMessage"
})
public class LicenseDiagnostics
    extends DynamicData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sourceLastChanged;
    @XmlElement(required = true)
    protected String sourceLost;
    protected float sourceLatency;
    @XmlElement(required = true)
    protected String licenseRequests;
    @XmlElement(required = true)
    protected String licenseRequestFailures;
    @XmlElement(required = true)
    protected String licenseFeatureUnknowns;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LicenseManagerState opState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastStatusUpdate;
    @XmlElement(required = true)
    protected String opFailureMessage;

    /**
     * Gets the value of the sourceLastChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSourceLastChanged() {
        return sourceLastChanged;
    }

    /**
     * Sets the value of the sourceLastChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSourceLastChanged(XMLGregorianCalendar value) {
        this.sourceLastChanged = value;
    }

    /**
     * Gets the value of the sourceLost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLost() {
        return sourceLost;
    }

    /**
     * Sets the value of the sourceLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLost(String value) {
        this.sourceLost = value;
    }

    /**
     * Gets the value of the sourceLatency property.
     * 
     */
    public float getSourceLatency() {
        return sourceLatency;
    }

    /**
     * Sets the value of the sourceLatency property.
     * 
     */
    public void setSourceLatency(float value) {
        this.sourceLatency = value;
    }

    /**
     * Gets the value of the licenseRequests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseRequests() {
        return licenseRequests;
    }

    /**
     * Sets the value of the licenseRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseRequests(String value) {
        this.licenseRequests = value;
    }

    /**
     * Gets the value of the licenseRequestFailures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseRequestFailures() {
        return licenseRequestFailures;
    }

    /**
     * Sets the value of the licenseRequestFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseRequestFailures(String value) {
        this.licenseRequestFailures = value;
    }

    /**
     * Gets the value of the licenseFeatureUnknowns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseFeatureUnknowns() {
        return licenseFeatureUnknowns;
    }

    /**
     * Sets the value of the licenseFeatureUnknowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseFeatureUnknowns(String value) {
        this.licenseFeatureUnknowns = value;
    }

    /**
     * Gets the value of the opState property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseManagerState }
     *     
     */
    public LicenseManagerState getOpState() {
        return opState;
    }

    /**
     * Sets the value of the opState property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseManagerState }
     *     
     */
    public void setOpState(LicenseManagerState value) {
        this.opState = value;
    }

    /**
     * Gets the value of the lastStatusUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastStatusUpdate() {
        return lastStatusUpdate;
    }

    /**
     * Sets the value of the lastStatusUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastStatusUpdate(XMLGregorianCalendar value) {
        this.lastStatusUpdate = value;
    }

    /**
     * Gets the value of the opFailureMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpFailureMessage() {
        return opFailureMessage;
    }

    /**
     * Sets the value of the opFailureMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpFailureMessage(String value) {
        this.opFailureMessage = value;
    }

}
