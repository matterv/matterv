
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplyProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApplyProfile">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="policy" type="{urn:internalvim25}ProfilePolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="profileTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profileVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="property" type="{urn:internalvim25}ProfileApplyProfileProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="favorite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="toBeMerged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="toReplaceWith" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="toBeDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="copyEnableStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyProfile", propOrder = {
    "enabled",
    "policy",
    "profileTypeName",
    "profileVersion",
    "property",
    "favorite",
    "toBeMerged",
    "toReplaceWith",
    "toBeDeleted",
    "copyEnableStatus",
    "hidden"
})
@XmlSeeAlso({
    ProfileApplyProfileElement.class,
    HostApplyProfile.class,
    PhysicalNicProfile.class,
    HostMemoryProfile.class,
    UserProfile.class,
    UserGroupProfile.class,
    SecurityProfile.class,
    OptionProfile.class,
    DateTimeProfile.class,
    ServiceProfile.class,
    FirewallProfile.class,
    FirewallProfileRulesetProfile.class,
    NasStorageProfile.class,
    StorageProfile.class,
    NetworkProfile.class,
    NetworkProfileDnsConfigProfile.class,
    DvsVNicProfile.class,
    DvsProfile.class,
    PnicUplinkProfile.class,
    NsxHostVNicProfile.class,
    OpaqueSwitchProfile.class,
    IpRouteProfile.class,
    StaticRouteProfile.class,
    VirtualSwitchProfile.class,
    LinkProfile.class,
    NumPortsProfile.class,
    NetStackInstanceProfile.class,
    VlanProfile.class,
    VirtualSwitchSelectionProfile.class,
    PortGroupProfile.class,
    NetworkPolicyProfile.class,
    IpAddressProfile.class,
    AuthenticationProfile.class,
    ActiveDirectoryProfile.class,
    PermissionProfile.class
})
public class ApplyProfile
    extends DynamicData
{

    protected boolean enabled;
    protected List<ProfilePolicy> policy;
    protected String profileTypeName;
    protected String profileVersion;
    protected List<ProfileApplyProfileProperty> property;
    protected Boolean favorite;
    protected Boolean toBeMerged;
    protected Boolean toReplaceWith;
    protected Boolean toBeDeleted;
    protected Boolean copyEnableStatus;
    protected Boolean hidden;

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfilePolicy }
     * </p>
     * 
     * 
     * @return
     *     The value of the policy property.
     */
    public List<ProfilePolicy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<>();
        }
        return this.policy;
    }

    /**
     * Gets the value of the profileTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileTypeName() {
        return profileTypeName;
    }

    /**
     * Sets the value of the profileTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileTypeName(String value) {
        this.profileTypeName = value;
    }

    /**
     * Gets the value of the profileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileVersion(String value) {
        this.profileVersion = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileApplyProfileProperty }
     * </p>
     * 
     * 
     * @return
     *     The value of the property property.
     */
    public List<ProfileApplyProfileProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<>();
        }
        return this.property;
    }

    /**
     * Gets the value of the favorite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFavorite() {
        return favorite;
    }

    /**
     * Sets the value of the favorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFavorite(Boolean value) {
        this.favorite = value;
    }

    /**
     * Gets the value of the toBeMerged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToBeMerged() {
        return toBeMerged;
    }

    /**
     * Sets the value of the toBeMerged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBeMerged(Boolean value) {
        this.toBeMerged = value;
    }

    /**
     * Gets the value of the toReplaceWith property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToReplaceWith() {
        return toReplaceWith;
    }

    /**
     * Sets the value of the toReplaceWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToReplaceWith(Boolean value) {
        this.toReplaceWith = value;
    }

    /**
     * Gets the value of the toBeDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToBeDeleted() {
        return toBeDeleted;
    }

    /**
     * Sets the value of the toBeDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBeDeleted(Boolean value) {
        this.toBeDeleted = value;
    }

    /**
     * Gets the value of the copyEnableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyEnableStatus() {
        return copyEnableStatus;
    }

    /**
     * Sets the value of the copyEnableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyEnableStatus(Boolean value) {
        this.copyEnableStatus = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

}
