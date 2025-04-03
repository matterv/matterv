
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostLicenseSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostLicenseSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="source" type="{urn:internalvim25}LicenseSource" minOccurs="0"/>
 *         <element name="editionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="disabledFeatureKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="enabledFeatureKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLicenseSpec", propOrder = {
    "source",
    "editionKey",
    "disabledFeatureKey",
    "enabledFeatureKey"
})
public class HostLicenseSpec
    extends DynamicData
{

    protected LicenseSource source;
    protected String editionKey;
    protected List<String> disabledFeatureKey;
    protected List<String> enabledFeatureKey;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseSource }
     *     
     */
    public LicenseSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseSource }
     *     
     */
    public void setSource(LicenseSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the editionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditionKey() {
        return editionKey;
    }

    /**
     * Sets the value of the editionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditionKey(String value) {
        this.editionKey = value;
    }

    /**
     * Gets the value of the disabledFeatureKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabledFeatureKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDisabledFeatureKey().add(newItem);
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
     *     The value of the disabledFeatureKey property.
     */
    public List<String> getDisabledFeatureKey() {
        if (disabledFeatureKey == null) {
            disabledFeatureKey = new ArrayList<>();
        }
        return this.disabledFeatureKey;
    }

    /**
     * Gets the value of the enabledFeatureKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enabledFeatureKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEnabledFeatureKey().add(newItem);
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
     *     The value of the enabledFeatureKey property.
     */
    public List<String> getEnabledFeatureKey() {
        if (enabledFeatureKey == null) {
            enabledFeatureKey = new ArrayList<>();
        }
        return this.enabledFeatureKey;
    }

}
