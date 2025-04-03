
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KmipClusterInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="KmipClusterInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="clusterId" type="{urn:internalvim25}KeyProviderId"/>
 *         <element name="servers" type="{urn:internalvim25}KmipServerInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="useAsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="managementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="useAsEntityDefault" type="{urn:internalvim25}ManagedObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="hasBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="tpmRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="keyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KmipClusterInfo", propOrder = {
    "clusterId",
    "servers",
    "useAsDefault",
    "managementType",
    "useAsEntityDefault",
    "hasBackup",
    "tpmRequired",
    "keyId"
})
public class KmipClusterInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected KeyProviderId clusterId;
    protected List<KmipServerInfo> servers;
    protected boolean useAsDefault;
    protected String managementType;
    protected List<ManagedObjectReference> useAsEntityDefault;
    protected Boolean hasBackup;
    protected Boolean tpmRequired;
    protected String keyId;

    /**
     * Gets the value of the clusterId property.
     * 
     * @return
     *     possible object is
     *     {@link KeyProviderId }
     *     
     */
    public KeyProviderId getClusterId() {
        return clusterId;
    }

    /**
     * Sets the value of the clusterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyProviderId }
     *     
     */
    public void setClusterId(KeyProviderId value) {
        this.clusterId = value;
    }

    /**
     * Gets the value of the servers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KmipServerInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the servers property.
     */
    public List<KmipServerInfo> getServers() {
        if (servers == null) {
            servers = new ArrayList<>();
        }
        return this.servers;
    }

    /**
     * Gets the value of the useAsDefault property.
     * 
     */
    public boolean isUseAsDefault() {
        return useAsDefault;
    }

    /**
     * Sets the value of the useAsDefault property.
     * 
     */
    public void setUseAsDefault(boolean value) {
        this.useAsDefault = value;
    }

    /**
     * Gets the value of the managementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementType() {
        return managementType;
    }

    /**
     * Sets the value of the managementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementType(String value) {
        this.managementType = value;
    }

    /**
     * Gets the value of the useAsEntityDefault property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useAsEntityDefault property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUseAsEntityDefault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedObjectReference }
     * </p>
     * 
     * 
     * @return
     *     The value of the useAsEntityDefault property.
     */
    public List<ManagedObjectReference> getUseAsEntityDefault() {
        if (useAsEntityDefault == null) {
            useAsEntityDefault = new ArrayList<>();
        }
        return this.useAsEntityDefault;
    }

    /**
     * Gets the value of the hasBackup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBackup() {
        return hasBackup;
    }

    /**
     * Sets the value of the hasBackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBackup(Boolean value) {
        this.hasBackup = value;
    }

    /**
     * Gets the value of the tpmRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTpmRequired() {
        return tpmRequired;
    }

    /**
     * Sets the value of the tpmRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTpmRequired(Boolean value) {
        this.tpmRequired = value;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyId(String value) {
        this.keyId = value;
    }

}
