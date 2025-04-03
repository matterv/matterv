
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfCreateImportSpecParams complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfCreateImportSpecParams">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfManagerCommonParams">
 *       <sequence>
 *         <element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostSystem" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="networkMapping" type="{urn:internalvim25}OvfNetworkMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipAllocationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ipProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="propertyMapping" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="resourceMapping" type="{urn:internalvim25}OvfResourceMap" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="diskProvisioning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="instantiationOst" type="{urn:internalvim25}OvfConsumerOstNode" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfCreateImportSpecParams", propOrder = {
    "entityName",
    "hostSystem",
    "networkMapping",
    "ipAllocationPolicy",
    "ipProtocol",
    "propertyMapping",
    "resourceMapping",
    "diskProvisioning",
    "instantiationOst"
})
public class OvfCreateImportSpecParams
    extends OvfManagerCommonParams
{

    @XmlElement(required = true)
    protected String entityName;
    protected ManagedObjectReference hostSystem;
    protected List<OvfNetworkMapping> networkMapping;
    protected String ipAllocationPolicy;
    protected String ipProtocol;
    protected List<KeyValue> propertyMapping;
    protected List<OvfResourceMap> resourceMapping;
    protected String diskProvisioning;
    protected OvfConsumerOstNode instantiationOst;

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the hostSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHostSystem() {
        return hostSystem;
    }

    /**
     * Sets the value of the hostSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHostSystem(ManagedObjectReference value) {
        this.hostSystem = value;
    }

    /**
     * Gets the value of the networkMapping property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkMapping property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetworkMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvfNetworkMapping }
     * </p>
     * 
     * 
     * @return
     *     The value of the networkMapping property.
     */
    public List<OvfNetworkMapping> getNetworkMapping() {
        if (networkMapping == null) {
            networkMapping = new ArrayList<>();
        }
        return this.networkMapping;
    }

    /**
     * Gets the value of the ipAllocationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAllocationPolicy() {
        return ipAllocationPolicy;
    }

    /**
     * Sets the value of the ipAllocationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAllocationPolicy(String value) {
        this.ipAllocationPolicy = value;
    }

    /**
     * Gets the value of the ipProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpProtocol() {
        return ipProtocol;
    }

    /**
     * Sets the value of the ipProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpProtocol(String value) {
        this.ipProtocol = value;
    }

    /**
     * Gets the value of the propertyMapping property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyMapping property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPropertyMapping().add(newItem);
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
     *     The value of the propertyMapping property.
     */
    public List<KeyValue> getPropertyMapping() {
        if (propertyMapping == null) {
            propertyMapping = new ArrayList<>();
        }
        return this.propertyMapping;
    }

    /**
     * Gets the value of the resourceMapping property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceMapping property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResourceMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvfResourceMap }
     * </p>
     * 
     * 
     * @return
     *     The value of the resourceMapping property.
     */
    public List<OvfResourceMap> getResourceMapping() {
        if (resourceMapping == null) {
            resourceMapping = new ArrayList<>();
        }
        return this.resourceMapping;
    }

    /**
     * Gets the value of the diskProvisioning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskProvisioning() {
        return diskProvisioning;
    }

    /**
     * Sets the value of the diskProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskProvisioning(String value) {
        this.diskProvisioning = value;
    }

    /**
     * Gets the value of the instantiationOst property.
     * 
     * @return
     *     possible object is
     *     {@link OvfConsumerOstNode }
     *     
     */
    public OvfConsumerOstNode getInstantiationOst() {
        return instantiationOst;
    }

    /**
     * Sets the value of the instantiationOst property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvfConsumerOstNode }
     *     
     */
    public void setInstantiationOst(OvfConsumerOstNode value) {
        this.instantiationOst = value;
    }

}
