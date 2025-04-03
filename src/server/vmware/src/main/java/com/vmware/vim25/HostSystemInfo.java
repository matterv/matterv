
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSystemInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSystemInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="otherIdentifyingInfo" type="{urn:internalvim25}HostSystemIdentificationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="qualifiedName" type="{urn:internalvim25}HostQualifiedName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vvolHostNQN" type="{urn:internalvim25}HostQualifiedName" minOccurs="0"/>
 *         <element name="vvolHostId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="bootCommandLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSystemInfo", propOrder = {
    "vendor",
    "model",
    "uuid",
    "otherIdentifyingInfo",
    "serialNumber",
    "qualifiedName",
    "vvolHostNQN",
    "vvolHostId",
    "bootCommandLine"
})
public class HostSystemInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String vendor;
    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    protected String uuid;
    protected List<HostSystemIdentificationInfo> otherIdentifyingInfo;
    protected String serialNumber;
    protected List<HostQualifiedName> qualifiedName;
    protected HostQualifiedName vvolHostNQN;
    protected String vvolHostId;
    protected String bootCommandLine;

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
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the otherIdentifyingInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherIdentifyingInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOtherIdentifyingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostSystemIdentificationInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the otherIdentifyingInfo property.
     */
    public List<HostSystemIdentificationInfo> getOtherIdentifyingInfo() {
        if (otherIdentifyingInfo == null) {
            otherIdentifyingInfo = new ArrayList<>();
        }
        return this.otherIdentifyingInfo;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the qualifiedName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifiedName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getQualifiedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostQualifiedName }
     * </p>
     * 
     * 
     * @return
     *     The value of the qualifiedName property.
     */
    public List<HostQualifiedName> getQualifiedName() {
        if (qualifiedName == null) {
            qualifiedName = new ArrayList<>();
        }
        return this.qualifiedName;
    }

    /**
     * Gets the value of the vvolHostNQN property.
     * 
     * @return
     *     possible object is
     *     {@link HostQualifiedName }
     *     
     */
    public HostQualifiedName getVvolHostNQN() {
        return vvolHostNQN;
    }

    /**
     * Sets the value of the vvolHostNQN property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostQualifiedName }
     *     
     */
    public void setVvolHostNQN(HostQualifiedName value) {
        this.vvolHostNQN = value;
    }

    /**
     * Gets the value of the vvolHostId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVvolHostId() {
        return vvolHostId;
    }

    /**
     * Sets the value of the vvolHostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVvolHostId(String value) {
        this.vvolHostId = value;
    }

    /**
     * Gets the value of the bootCommandLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBootCommandLine() {
        return bootCommandLine;
    }

    /**
     * Sets the value of the bootCommandLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBootCommandLine(String value) {
        this.bootCommandLine = value;
    }

}
