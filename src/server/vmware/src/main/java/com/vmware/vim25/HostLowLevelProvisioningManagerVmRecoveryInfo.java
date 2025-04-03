
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostLowLevelProvisioningManagerVmRecoveryInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostLowLevelProvisioningManagerVmRecoveryInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="biosUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="instanceUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ftInfo" type="{urn:internalvim25}FaultToleranceConfigInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerVmRecoveryInfo", propOrder = {
    "version",
    "biosUUID",
    "instanceUUID",
    "ftInfo"
})
public class HostLowLevelProvisioningManagerVmRecoveryInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String biosUUID;
    @XmlElement(required = true)
    protected String instanceUUID;
    protected FaultToleranceConfigInfo ftInfo;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the biosUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiosUUID() {
        return biosUUID;
    }

    /**
     * Sets the value of the biosUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiosUUID(String value) {
        this.biosUUID = value;
    }

    /**
     * Gets the value of the instanceUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceUUID() {
        return instanceUUID;
    }

    /**
     * Sets the value of the instanceUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceUUID(String value) {
        this.instanceUUID = value;
    }

    /**
     * Gets the value of the ftInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FaultToleranceConfigInfo }
     *     
     */
    public FaultToleranceConfigInfo getFtInfo() {
        return ftInfo;
    }

    /**
     * Sets the value of the ftInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultToleranceConfigInfo }
     *     
     */
    public void setFtInfo(FaultToleranceConfigInfo value) {
        this.ftInfo = value;
    }

}
