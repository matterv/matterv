
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfManagerCommonParams complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfManagerCommonParams">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deploymentOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="msgBundle" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="importOption" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfManagerCommonParams", propOrder = {
    "locale",
    "deploymentOption",
    "msgBundle",
    "importOption"
})
@XmlSeeAlso({
    OvfValidateHostParams.class,
    OvfParseDescriptorParams.class,
    OvfCreateImportSpecParams.class
})
public class OvfManagerCommonParams
    extends DynamicData
{

    @XmlElement(required = true)
    protected String locale;
    @XmlElement(required = true)
    protected String deploymentOption;
    protected List<KeyValue> msgBundle;
    protected List<String> importOption;

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the deploymentOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentOption() {
        return deploymentOption;
    }

    /**
     * Sets the value of the deploymentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentOption(String value) {
        this.deploymentOption = value;
    }

    /**
     * Gets the value of the msgBundle property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgBundle property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMsgBundle().add(newItem);
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
     *     The value of the msgBundle property.
     */
    public List<KeyValue> getMsgBundle() {
        if (msgBundle == null) {
            msgBundle = new ArrayList<>();
        }
        return this.msgBundle;
    }

    /**
     * Gets the value of the importOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportOption().add(newItem);
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
     *     The value of the importOption property.
     */
    public List<String> getImportOption() {
        if (importOption == null) {
            importOption = new ArrayList<>();
        }
        return this.importOption;
    }

}
