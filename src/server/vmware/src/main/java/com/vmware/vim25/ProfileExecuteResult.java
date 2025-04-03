
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileExecuteResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProfileExecuteResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="configSpec" type="{urn:internalvim25}HostConfigSpec" minOccurs="0"/>
 *         <element name="inapplicablePath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="requireInput" type="{urn:internalvim25}ProfileDeferredPolicyOptionParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="error" type="{urn:internalvim25}ProfileExecuteError" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileExecuteResult", propOrder = {
    "status",
    "configSpec",
    "inapplicablePath",
    "requireInput",
    "error"
})
@XmlSeeAlso({
    ApplyHostProfileConfigurationSpec.class
})
public class ProfileExecuteResult
    extends DynamicData
{

    @XmlElement(required = true)
    protected String status;
    protected HostConfigSpec configSpec;
    protected List<String> inapplicablePath;
    protected List<ProfileDeferredPolicyOptionParameter> requireInput;
    protected List<ProfileExecuteError> error;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the configSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostConfigSpec }
     *     
     */
    public HostConfigSpec getConfigSpec() {
        return configSpec;
    }

    /**
     * Sets the value of the configSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostConfigSpec }
     *     
     */
    public void setConfigSpec(HostConfigSpec value) {
        this.configSpec = value;
    }

    /**
     * Gets the value of the inapplicablePath property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inapplicablePath property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInapplicablePath().add(newItem);
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
     *     The value of the inapplicablePath property.
     */
    public List<String> getInapplicablePath() {
        if (inapplicablePath == null) {
            inapplicablePath = new ArrayList<>();
        }
        return this.inapplicablePath;
    }

    /**
     * Gets the value of the requireInput property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requireInput property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequireInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileDeferredPolicyOptionParameter }
     * </p>
     * 
     * 
     * @return
     *     The value of the requireInput property.
     */
    public List<ProfileDeferredPolicyOptionParameter> getRequireInput() {
        if (requireInput == null) {
            requireInput = new ArrayList<>();
        }
        return this.requireInput;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileExecuteError }
     * </p>
     * 
     * 
     * @return
     *     The value of the error property.
     */
    public List<ProfileExecuteError> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
    }

}
