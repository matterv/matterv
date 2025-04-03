
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDvsLacpGroupConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDvsLacpGroupConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="uplinkNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="loadbalanceAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vlan" type="{urn:internalvim25}VMwareDvsLagVlanConfig" minOccurs="0"/>
 *         <element name="ipfix" type="{urn:internalvim25}VMwareDvsLagIpfixConfig" minOccurs="0"/>
 *         <element name="uplinkName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="uplinkPortKey" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="timeoutMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDvsLacpGroupConfig", propOrder = {
    "key",
    "name",
    "mode",
    "uplinkNum",
    "loadbalanceAlgorithm",
    "vlan",
    "ipfix",
    "uplinkName",
    "uplinkPortKey",
    "timeoutMode"
})
public class VMwareDvsLacpGroupConfig
    extends DynamicData
{

    protected String key;
    protected String name;
    protected String mode;
    protected Integer uplinkNum;
    protected String loadbalanceAlgorithm;
    protected VMwareDvsLagVlanConfig vlan;
    protected VMwareDvsLagIpfixConfig ipfix;
    protected List<String> uplinkName;
    protected List<String> uplinkPortKey;
    protected String timeoutMode;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

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
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the uplinkNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUplinkNum() {
        return uplinkNum;
    }

    /**
     * Sets the value of the uplinkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUplinkNum(Integer value) {
        this.uplinkNum = value;
    }

    /**
     * Gets the value of the loadbalanceAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadbalanceAlgorithm() {
        return loadbalanceAlgorithm;
    }

    /**
     * Sets the value of the loadbalanceAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadbalanceAlgorithm(String value) {
        this.loadbalanceAlgorithm = value;
    }

    /**
     * Gets the value of the vlan property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareDvsLagVlanConfig }
     *     
     */
    public VMwareDvsLagVlanConfig getVlan() {
        return vlan;
    }

    /**
     * Sets the value of the vlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareDvsLagVlanConfig }
     *     
     */
    public void setVlan(VMwareDvsLagVlanConfig value) {
        this.vlan = value;
    }

    /**
     * Gets the value of the ipfix property.
     * 
     * @return
     *     possible object is
     *     {@link VMwareDvsLagIpfixConfig }
     *     
     */
    public VMwareDvsLagIpfixConfig getIpfix() {
        return ipfix;
    }

    /**
     * Sets the value of the ipfix property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMwareDvsLagIpfixConfig }
     *     
     */
    public void setIpfix(VMwareDvsLagIpfixConfig value) {
        this.ipfix = value;
    }

    /**
     * Gets the value of the uplinkName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uplinkName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUplinkName().add(newItem);
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
     *     The value of the uplinkName property.
     */
    public List<String> getUplinkName() {
        if (uplinkName == null) {
            uplinkName = new ArrayList<>();
        }
        return this.uplinkName;
    }

    /**
     * Gets the value of the uplinkPortKey property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uplinkPortKey property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUplinkPortKey().add(newItem);
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
     *     The value of the uplinkPortKey property.
     */
    public List<String> getUplinkPortKey() {
        if (uplinkPortKey == null) {
            uplinkPortKey = new ArrayList<>();
        }
        return this.uplinkPortKey;
    }

    /**
     * Gets the value of the timeoutMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeoutMode() {
        return timeoutMode;
    }

    /**
     * Sets the value of the timeoutMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeoutMode(String value) {
        this.timeoutMode = value;
    }

}
