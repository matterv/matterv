
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineDefinedProfileSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineDefinedProfileSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineProfileSpec">
 *       <sequence>
 *         <element name="profileId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="replicationSpec" type="{urn:internalvim25}ReplicationSpec" minOccurs="0"/>
 *         <element name="profileData" type="{urn:internalvim25}VirtualMachineProfileRawData" minOccurs="0"/>
 *         <element name="profileParams" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDefinedProfileSpec", propOrder = {
    "profileId",
    "replicationSpec",
    "profileData",
    "profileParams"
})
public class VirtualMachineDefinedProfileSpec
    extends VirtualMachineProfileSpec
{

    @XmlElement(required = true)
    protected String profileId;
    protected ReplicationSpec replicationSpec;
    protected VirtualMachineProfileRawData profileData;
    protected List<KeyValue> profileParams;

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the replicationSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationSpec }
     *     
     */
    public ReplicationSpec getReplicationSpec() {
        return replicationSpec;
    }

    /**
     * Sets the value of the replicationSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationSpec }
     *     
     */
    public void setReplicationSpec(ReplicationSpec value) {
        this.replicationSpec = value;
    }

    /**
     * Gets the value of the profileData property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineProfileRawData }
     *     
     */
    public VirtualMachineProfileRawData getProfileData() {
        return profileData;
    }

    /**
     * Sets the value of the profileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineProfileRawData }
     *     
     */
    public void setProfileData(VirtualMachineProfileRawData value) {
        this.profileData = value;
    }

    /**
     * Gets the value of the profileParams property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileParams property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProfileParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the profileParams property.
     */
    public List<KeyValue> getProfileParams() {
        if (profileParams == null) {
            profileParams = new ArrayList<>();
        }
        return this.profileParams;
    }

}
