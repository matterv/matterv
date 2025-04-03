
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVvolVolumeSpecification complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVvolVolumeSpecification">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="maxSizeInMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="volumeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vasaProviderInfo" type="{urn:internalvim25}VimVasaProviderInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="storageArray" type="{urn:internalvim25}VASAStorageArray" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="stretched" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVvolVolumeSpecification", propOrder = {
    "maxSizeInMB",
    "volumeName",
    "vasaProviderInfo",
    "storageArray",
    "uuid",
    "stretched"
})
public class HostVvolVolumeSpecification
    extends DynamicData
{

    protected long maxSizeInMB;
    @XmlElement(required = true)
    protected String volumeName;
    protected List<VimVasaProviderInfo> vasaProviderInfo;
    protected List<VASAStorageArray> storageArray;
    @XmlElement(required = true)
    protected String uuid;
    protected Boolean stretched;

    /**
     * Gets the value of the maxSizeInMB property.
     * 
     */
    public long getMaxSizeInMB() {
        return maxSizeInMB;
    }

    /**
     * Sets the value of the maxSizeInMB property.
     * 
     */
    public void setMaxSizeInMB(long value) {
        this.maxSizeInMB = value;
    }

    /**
     * Gets the value of the volumeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * Sets the value of the volumeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeName(String value) {
        this.volumeName = value;
    }

    /**
     * Gets the value of the vasaProviderInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vasaProviderInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVasaProviderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VimVasaProviderInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vasaProviderInfo property.
     */
    public List<VimVasaProviderInfo> getVasaProviderInfo() {
        if (vasaProviderInfo == null) {
            vasaProviderInfo = new ArrayList<>();
        }
        return this.vasaProviderInfo;
    }

    /**
     * Gets the value of the storageArray property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageArray property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStorageArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VASAStorageArray }
     * </p>
     * 
     * 
     * @return
     *     The value of the storageArray property.
     */
    public List<VASAStorageArray> getStorageArray() {
        if (storageArray == null) {
            storageArray = new ArrayList<>();
        }
        return this.storageArray;
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
     * Gets the value of the stretched property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStretched() {
        return stretched;
    }

    /**
     * Sets the value of the stretched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStretched(Boolean value) {
        this.stretched = value;
    }

}
