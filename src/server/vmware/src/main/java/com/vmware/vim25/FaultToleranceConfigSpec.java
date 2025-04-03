
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultToleranceConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FaultToleranceConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="metaDataPath" type="{urn:internalvim25}FaultToleranceMetaSpec" minOccurs="0"/>
 *         <element name="secondaryVmSpec" type="{urn:internalvim25}FaultToleranceVMConfigSpec" minOccurs="0"/>
 *         <element name="metroFtEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="metroFtHostGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceConfigSpec", propOrder = {
    "metaDataPath",
    "secondaryVmSpec",
    "metroFtEnabled",
    "metroFtHostGroup"
})
public class FaultToleranceConfigSpec
    extends DynamicData
{

    protected FaultToleranceMetaSpec metaDataPath;
    protected FaultToleranceVMConfigSpec secondaryVmSpec;
    protected Boolean metroFtEnabled;
    protected String metroFtHostGroup;

    /**
     * Gets the value of the metaDataPath property.
     * 
     * @return
     *     possible object is
     *     {@link FaultToleranceMetaSpec }
     *     
     */
    public FaultToleranceMetaSpec getMetaDataPath() {
        return metaDataPath;
    }

    /**
     * Sets the value of the metaDataPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultToleranceMetaSpec }
     *     
     */
    public void setMetaDataPath(FaultToleranceMetaSpec value) {
        this.metaDataPath = value;
    }

    /**
     * Gets the value of the secondaryVmSpec property.
     * 
     * @return
     *     possible object is
     *     {@link FaultToleranceVMConfigSpec }
     *     
     */
    public FaultToleranceVMConfigSpec getSecondaryVmSpec() {
        return secondaryVmSpec;
    }

    /**
     * Sets the value of the secondaryVmSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultToleranceVMConfigSpec }
     *     
     */
    public void setSecondaryVmSpec(FaultToleranceVMConfigSpec value) {
        this.secondaryVmSpec = value;
    }

    /**
     * Gets the value of the metroFtEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMetroFtEnabled() {
        return metroFtEnabled;
    }

    /**
     * Sets the value of the metroFtEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMetroFtEnabled(Boolean value) {
        this.metroFtEnabled = value;
    }

    /**
     * Gets the value of the metroFtHostGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetroFtHostGroup() {
        return metroFtHostGroup;
    }

    /**
     * Sets the value of the metroFtHostGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetroFtHostGroup(String value) {
        this.metroFtHostGroup = value;
    }

}
