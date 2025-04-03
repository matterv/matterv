
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfParseDescriptorResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfParseDescriptorResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="eula" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="network" type="{urn:internalvim25}OvfNetworkInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipAllocationScheme" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipProtocols" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="property" type="{urn:internalvim25}VAppPropertyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="productInfo" type="{urn:internalvim25}VAppProductInfo" minOccurs="0"/>
 *         <element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="approximateDownloadSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="approximateFlatDeploymentSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="approximateSparseDeploymentSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="defaultEntityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="virtualApp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="deploymentOption" type="{urn:internalvim25}OvfDeploymentOption" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="defaultDeploymentOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="entityName" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="annotatedOst" type="{urn:internalvim25}OvfConsumerOstNode" minOccurs="0"/>
 *         <element name="error" type="{urn:internalvim25}LocalizedMethodFault" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="warning" type="{urn:internalvim25}LocalizedMethodFault" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfParseDescriptorResult", propOrder = {
    "eula",
    "network",
    "ipAllocationScheme",
    "ipProtocols",
    "property",
    "productInfo",
    "annotation",
    "approximateDownloadSize",
    "approximateFlatDeploymentSize",
    "approximateSparseDeploymentSize",
    "defaultEntityName",
    "virtualApp",
    "deploymentOption",
    "defaultDeploymentOption",
    "entityName",
    "annotatedOst",
    "error",
    "warning"
})
public class OvfParseDescriptorResult
    extends DynamicData
{

    protected List<String> eula;
    protected List<OvfNetworkInfo> network;
    protected List<String> ipAllocationScheme;
    protected List<String> ipProtocols;
    protected List<VAppPropertyInfo> property;
    protected VAppProductInfo productInfo;
    @XmlElement(required = true)
    protected String annotation;
    protected Long approximateDownloadSize;
    protected Long approximateFlatDeploymentSize;
    protected Long approximateSparseDeploymentSize;
    @XmlElement(required = true)
    protected String defaultEntityName;
    protected boolean virtualApp;
    protected List<OvfDeploymentOption> deploymentOption;
    @XmlElement(required = true)
    protected String defaultDeploymentOption;
    protected List<KeyValue> entityName;
    protected OvfConsumerOstNode annotatedOst;
    protected List<LocalizedMethodFault> error;
    protected List<LocalizedMethodFault> warning;

    /**
     * Gets the value of the eula property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eula property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEula().add(newItem);
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
     *     The value of the eula property.
     */
    public List<String> getEula() {
        if (eula == null) {
            eula = new ArrayList<>();
        }
        return this.eula;
    }

    /**
     * Gets the value of the network property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the network property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvfNetworkInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the network property.
     */
    public List<OvfNetworkInfo> getNetwork() {
        if (network == null) {
            network = new ArrayList<>();
        }
        return this.network;
    }

    /**
     * Gets the value of the ipAllocationScheme property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipAllocationScheme property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIpAllocationScheme().add(newItem);
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
     *     The value of the ipAllocationScheme property.
     */
    public List<String> getIpAllocationScheme() {
        if (ipAllocationScheme == null) {
            ipAllocationScheme = new ArrayList<>();
        }
        return this.ipAllocationScheme;
    }

    /**
     * Gets the value of the ipProtocols property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipProtocols property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIpProtocols().add(newItem);
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
     *     The value of the ipProtocols property.
     */
    public List<String> getIpProtocols() {
        if (ipProtocols == null) {
            ipProtocols = new ArrayList<>();
        }
        return this.ipProtocols;
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
     * {@link VAppPropertyInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the property property.
     */
    public List<VAppPropertyInfo> getProperty() {
        if (property == null) {
            property = new ArrayList<>();
        }
        return this.property;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VAppProductInfo }
     *     
     */
    public VAppProductInfo getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VAppProductInfo }
     *     
     */
    public void setProductInfo(VAppProductInfo value) {
        this.productInfo = value;
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
     * Gets the value of the approximateDownloadSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApproximateDownloadSize() {
        return approximateDownloadSize;
    }

    /**
     * Sets the value of the approximateDownloadSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApproximateDownloadSize(Long value) {
        this.approximateDownloadSize = value;
    }

    /**
     * Gets the value of the approximateFlatDeploymentSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApproximateFlatDeploymentSize() {
        return approximateFlatDeploymentSize;
    }

    /**
     * Sets the value of the approximateFlatDeploymentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApproximateFlatDeploymentSize(Long value) {
        this.approximateFlatDeploymentSize = value;
    }

    /**
     * Gets the value of the approximateSparseDeploymentSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApproximateSparseDeploymentSize() {
        return approximateSparseDeploymentSize;
    }

    /**
     * Sets the value of the approximateSparseDeploymentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApproximateSparseDeploymentSize(Long value) {
        this.approximateSparseDeploymentSize = value;
    }

    /**
     * Gets the value of the defaultEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultEntityName() {
        return defaultEntityName;
    }

    /**
     * Sets the value of the defaultEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultEntityName(String value) {
        this.defaultEntityName = value;
    }

    /**
     * Gets the value of the virtualApp property.
     * 
     */
    public boolean isVirtualApp() {
        return virtualApp;
    }

    /**
     * Sets the value of the virtualApp property.
     * 
     */
    public void setVirtualApp(boolean value) {
        this.virtualApp = value;
    }

    /**
     * Gets the value of the deploymentOption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deploymentOption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeploymentOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvfDeploymentOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the deploymentOption property.
     */
    public List<OvfDeploymentOption> getDeploymentOption() {
        if (deploymentOption == null) {
            deploymentOption = new ArrayList<>();
        }
        return this.deploymentOption;
    }

    /**
     * Gets the value of the defaultDeploymentOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultDeploymentOption() {
        return defaultDeploymentOption;
    }

    /**
     * Sets the value of the defaultDeploymentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultDeploymentOption(String value) {
        this.defaultDeploymentOption = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntityName().add(newItem);
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
     *     The value of the entityName property.
     */
    public List<KeyValue> getEntityName() {
        if (entityName == null) {
            entityName = new ArrayList<>();
        }
        return this.entityName;
    }

    /**
     * Gets the value of the annotatedOst property.
     * 
     * @return
     *     possible object is
     *     {@link OvfConsumerOstNode }
     *     
     */
    public OvfConsumerOstNode getAnnotatedOst() {
        return annotatedOst;
    }

    /**
     * Sets the value of the annotatedOst property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvfConsumerOstNode }
     *     
     */
    public void setAnnotatedOst(OvfConsumerOstNode value) {
        this.annotatedOst = value;
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
     * {@link LocalizedMethodFault }
     * </p>
     * 
     * 
     * @return
     *     The value of the error property.
     */
    public List<LocalizedMethodFault> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWarning().add(newItem);
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
     *     The value of the warning property.
     */
    public List<LocalizedMethodFault> getWarning() {
        if (warning == null) {
            warning = new ArrayList<>();
        }
        return this.warning;
    }

}
