
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProfileValidationFailureInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostProfileValidationFailureInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="updateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="applyProfile" type="{urn:internalvim25}HostApplyProfile" minOccurs="0"/>
 *         <element name="failures" type="{urn:internalvim25}ProfileUpdateFailedUpdateFailure" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="faults" type="{urn:internalvim25}LocalizedMethodFault" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileValidationFailureInfo", propOrder = {
    "name",
    "annotation",
    "updateType",
    "host",
    "applyProfile",
    "failures",
    "faults"
})
public class HostProfileValidationFailureInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String annotation;
    @XmlElement(required = true)
    protected String updateType;
    protected ManagedObjectReference host;
    protected HostApplyProfile applyProfile;
    protected List<ProfileUpdateFailedUpdateFailure> failures;
    protected List<LocalizedMethodFault> faults;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the updateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateType() {
        return updateType;
    }

    /**
     * Sets the value of the updateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateType(String value) {
        this.updateType = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the applyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link HostApplyProfile }
     *     
     */
    public HostApplyProfile getApplyProfile() {
        return applyProfile;
    }

    /**
     * Sets the value of the applyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostApplyProfile }
     *     
     */
    public void setApplyProfile(HostApplyProfile value) {
        this.applyProfile = value;
    }

    /**
     * Gets the value of the failures property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failures property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFailures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileUpdateFailedUpdateFailure }
     * </p>
     * 
     * 
     * @return
     *     The value of the failures property.
     */
    public List<ProfileUpdateFailedUpdateFailure> getFailures() {
        if (failures == null) {
            failures = new ArrayList<>();
        }
        return this.failures;
    }

    /**
     * Gets the value of the faults property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faults property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFaults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedMethodFault }
     * </p>
     * 
     * 
     * @return
     *     The value of the faults property.
     */
    public List<LocalizedMethodFault> getFaults() {
        if (faults == null) {
            faults = new ArrayList<>();
        }
        return this.faults;
    }

}
