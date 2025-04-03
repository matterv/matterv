
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVvolVolume complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVvolVolume">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostFileSystemVolume">
 *       <sequence>
 *         <element name="scId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostPE" type="{urn:internalvim25}VVolHostPE" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hostVvolNQN" type="{urn:internalvim25}HostVvolVolumeHostVvolNQN" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vasaProviderInfo" type="{urn:internalvim25}VimVasaProviderInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="storageArray" type="{urn:internalvim25}VASAStorageArray" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="protocolEndpointType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vvolNQNFieldsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "HostVvolVolume", propOrder = {
    "scId",
    "hostPE",
    "hostVvolNQN",
    "vasaProviderInfo",
    "storageArray",
    "protocolEndpointType",
    "vvolNQNFieldsAvailable",
    "stretched"
})
public class HostVvolVolume
    extends HostFileSystemVolume
{

    @XmlElement(required = true)
    protected String scId;
    protected List<VVolHostPE> hostPE;
    protected List<HostVvolVolumeHostVvolNQN> hostVvolNQN;
    protected List<VimVasaProviderInfo> vasaProviderInfo;
    protected List<VASAStorageArray> storageArray;
    protected String protocolEndpointType;
    protected Boolean vvolNQNFieldsAvailable;
    protected Boolean stretched;

    /**
     * Gets the value of the scId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScId() {
        return scId;
    }

    /**
     * Sets the value of the scId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScId(String value) {
        this.scId = value;
    }

    /**
     * Gets the value of the hostPE property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostPE property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VVolHostPE }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostPE property.
     */
    public List<VVolHostPE> getHostPE() {
        if (hostPE == null) {
            hostPE = new ArrayList<>();
        }
        return this.hostPE;
    }

    /**
     * Gets the value of the hostVvolNQN property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostVvolNQN property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostVvolNQN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVvolVolumeHostVvolNQN }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostVvolNQN property.
     */
    public List<HostVvolVolumeHostVvolNQN> getHostVvolNQN() {
        if (hostVvolNQN == null) {
            hostVvolNQN = new ArrayList<>();
        }
        return this.hostVvolNQN;
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
     * Gets the value of the protocolEndpointType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolEndpointType() {
        return protocolEndpointType;
    }

    /**
     * Sets the value of the protocolEndpointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolEndpointType(String value) {
        this.protocolEndpointType = value;
    }

    /**
     * Gets the value of the vvolNQNFieldsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVvolNQNFieldsAvailable() {
        return vvolNQNFieldsAvailable;
    }

    /**
     * Sets the value of the vvolNQNFieldsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVvolNQNFieldsAvailable(Boolean value) {
        this.vvolNQNFieldsAvailable = value;
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
