
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="options" type="{urn:internalvim25}CustomizationOptions" minOccurs="0"/>
 *         <element name="identity" type="{urn:internalvim25}CustomizationIdentitySettings"/>
 *         <element name="globalIPSettings" type="{urn:internalvim25}CustomizationGlobalIPSettings"/>
 *         <element name="nicSettingMap" type="{urn:internalvim25}CustomizationAdapterMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="encryptionKey" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSpec", propOrder = {
    "options",
    "identity",
    "globalIPSettings",
    "nicSettingMap",
    "encryptionKey"
})
public class CustomizationSpec
    extends DynamicData
{

    protected CustomizationOptions options;
    @XmlElement(required = true)
    protected CustomizationIdentitySettings identity;
    @XmlElement(required = true)
    protected CustomizationGlobalIPSettings globalIPSettings;
    protected List<CustomizationAdapterMapping> nicSettingMap;
    @XmlElement(type = Byte.class)
    protected List<Byte> encryptionKey;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationOptions }
     *     
     */
    public CustomizationOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationOptions }
     *     
     */
    public void setOptions(CustomizationOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationIdentitySettings }
     *     
     */
    public CustomizationIdentitySettings getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationIdentitySettings }
     *     
     */
    public void setIdentity(CustomizationIdentitySettings value) {
        this.identity = value;
    }

    /**
     * Gets the value of the globalIPSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationGlobalIPSettings }
     *     
     */
    public CustomizationGlobalIPSettings getGlobalIPSettings() {
        return globalIPSettings;
    }

    /**
     * Sets the value of the globalIPSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationGlobalIPSettings }
     *     
     */
    public void setGlobalIPSettings(CustomizationGlobalIPSettings value) {
        this.globalIPSettings = value;
    }

    /**
     * Gets the value of the nicSettingMap property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nicSettingMap property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNicSettingMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomizationAdapterMapping }
     * </p>
     * 
     * 
     * @return
     *     The value of the nicSettingMap property.
     */
    public List<CustomizationAdapterMapping> getNicSettingMap() {
        if (nicSettingMap == null) {
            nicSettingMap = new ArrayList<>();
        }
        return this.nicSettingMap;
    }

    /**
     * Gets the value of the encryptionKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptionKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEncryptionKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * </p>
     * 
     * 
     * @return
     *     The value of the encryptionKey property.
     */
    public List<Byte> getEncryptionKey() {
        if (encryptionKey == null) {
            encryptionKey = new ArrayList<>();
        }
        return this.encryptionKey;
    }

}
