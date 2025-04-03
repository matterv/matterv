
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NvdimmHealthInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NvdimmHealthInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="healthStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="healthInformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="stateFlagInfo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dimmTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="dimmTemperatureThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="spareBlocksPercentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="spareBlockThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="dimmLifespanPercentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="esTemperature" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="esTemperatureThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="esLifespanPercentage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmHealthInfo", propOrder = {
    "healthStatus",
    "healthInformation",
    "stateFlagInfo",
    "dimmTemperature",
    "dimmTemperatureThreshold",
    "spareBlocksPercentage",
    "spareBlockThreshold",
    "dimmLifespanPercentage",
    "esTemperature",
    "esTemperatureThreshold",
    "esLifespanPercentage"
})
public class NvdimmHealthInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String healthStatus;
    @XmlElement(required = true)
    protected String healthInformation;
    protected List<String> stateFlagInfo;
    protected int dimmTemperature;
    protected int dimmTemperatureThreshold;
    protected int spareBlocksPercentage;
    protected int spareBlockThreshold;
    protected int dimmLifespanPercentage;
    protected Integer esTemperature;
    protected Integer esTemperatureThreshold;
    protected Integer esLifespanPercentage;

    /**
     * Gets the value of the healthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * Sets the value of the healthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthStatus(String value) {
        this.healthStatus = value;
    }

    /**
     * Gets the value of the healthInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthInformation() {
        return healthInformation;
    }

    /**
     * Sets the value of the healthInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthInformation(String value) {
        this.healthInformation = value;
    }

    /**
     * Gets the value of the stateFlagInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateFlagInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStateFlagInfo().add(newItem);
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
     *     The value of the stateFlagInfo property.
     */
    public List<String> getStateFlagInfo() {
        if (stateFlagInfo == null) {
            stateFlagInfo = new ArrayList<>();
        }
        return this.stateFlagInfo;
    }

    /**
     * Gets the value of the dimmTemperature property.
     * 
     */
    public int getDimmTemperature() {
        return dimmTemperature;
    }

    /**
     * Sets the value of the dimmTemperature property.
     * 
     */
    public void setDimmTemperature(int value) {
        this.dimmTemperature = value;
    }

    /**
     * Gets the value of the dimmTemperatureThreshold property.
     * 
     */
    public int getDimmTemperatureThreshold() {
        return dimmTemperatureThreshold;
    }

    /**
     * Sets the value of the dimmTemperatureThreshold property.
     * 
     */
    public void setDimmTemperatureThreshold(int value) {
        this.dimmTemperatureThreshold = value;
    }

    /**
     * Gets the value of the spareBlocksPercentage property.
     * 
     */
    public int getSpareBlocksPercentage() {
        return spareBlocksPercentage;
    }

    /**
     * Sets the value of the spareBlocksPercentage property.
     * 
     */
    public void setSpareBlocksPercentage(int value) {
        this.spareBlocksPercentage = value;
    }

    /**
     * Gets the value of the spareBlockThreshold property.
     * 
     */
    public int getSpareBlockThreshold() {
        return spareBlockThreshold;
    }

    /**
     * Sets the value of the spareBlockThreshold property.
     * 
     */
    public void setSpareBlockThreshold(int value) {
        this.spareBlockThreshold = value;
    }

    /**
     * Gets the value of the dimmLifespanPercentage property.
     * 
     */
    public int getDimmLifespanPercentage() {
        return dimmLifespanPercentage;
    }

    /**
     * Sets the value of the dimmLifespanPercentage property.
     * 
     */
    public void setDimmLifespanPercentage(int value) {
        this.dimmLifespanPercentage = value;
    }

    /**
     * Gets the value of the esTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsTemperature() {
        return esTemperature;
    }

    /**
     * Sets the value of the esTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsTemperature(Integer value) {
        this.esTemperature = value;
    }

    /**
     * Gets the value of the esTemperatureThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsTemperatureThreshold() {
        return esTemperatureThreshold;
    }

    /**
     * Sets the value of the esTemperatureThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsTemperatureThreshold(Integer value) {
        this.esTemperatureThreshold = value;
    }

    /**
     * Gets the value of the esLifespanPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsLifespanPercentage() {
        return esLifespanPercentage;
    }

    /**
     * Sets the value of the esLifespanPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsLifespanPercentage(Integer value) {
        this.esLifespanPercentage = value;
    }

}
