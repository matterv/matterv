
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProxySwitchHostLagConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostProxySwitchHostLagConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="lagKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="uplinkPort" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProxySwitchHostLagConfig", propOrder = {
    "lagKey",
    "lagName",
    "uplinkPort"
})
public class HostProxySwitchHostLagConfig
    extends DynamicData
{

    @XmlElement(required = true)
    protected String lagKey;
    protected String lagName;
    protected List<KeyValue> uplinkPort;

    /**
     * Gets the value of the lagKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLagKey() {
        return lagKey;
    }

    /**
     * Sets the value of the lagKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLagKey(String value) {
        this.lagKey = value;
    }

    /**
     * Gets the value of the lagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLagName() {
        return lagName;
    }

    /**
     * Sets the value of the lagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLagName(String value) {
        this.lagName = value;
    }

    /**
     * Gets the value of the uplinkPort property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uplinkPort property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUplinkPort().add(newItem);
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
     *     The value of the uplinkPort property.
     */
    public List<KeyValue> getUplinkPort() {
        if (uplinkPort == null) {
            uplinkPort = new ArrayList<>();
        }
        return this.uplinkPort;
    }

}
