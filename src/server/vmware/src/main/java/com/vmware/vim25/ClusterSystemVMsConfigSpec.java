
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterSystemVMsConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterSystemVMsConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="allowedDatastores" type="{urn:internalvim25}ClusterDatastoreUpdateSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="notAllowedDatastores" type="{urn:internalvim25}ClusterDatastoreUpdateSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dsTagCategoriesToExclude" type="{urn:internalvim25}ClusterTagCategoryUpdateSpec" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="deploymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSystemVMsConfigSpec", propOrder = {
    "allowedDatastores",
    "notAllowedDatastores",
    "dsTagCategoriesToExclude",
    "deploymentMode"
})
public class ClusterSystemVMsConfigSpec
    extends DynamicData
{

    protected List<ClusterDatastoreUpdateSpec> allowedDatastores;
    protected List<ClusterDatastoreUpdateSpec> notAllowedDatastores;
    protected List<ClusterTagCategoryUpdateSpec> dsTagCategoriesToExclude;
    protected String deploymentMode;

    /**
     * Gets the value of the allowedDatastores property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedDatastores property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAllowedDatastores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDatastoreUpdateSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the allowedDatastores property.
     */
    public List<ClusterDatastoreUpdateSpec> getAllowedDatastores() {
        if (allowedDatastores == null) {
            allowedDatastores = new ArrayList<>();
        }
        return this.allowedDatastores;
    }

    /**
     * Gets the value of the notAllowedDatastores property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notAllowedDatastores property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNotAllowedDatastores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterDatastoreUpdateSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the notAllowedDatastores property.
     */
    public List<ClusterDatastoreUpdateSpec> getNotAllowedDatastores() {
        if (notAllowedDatastores == null) {
            notAllowedDatastores = new ArrayList<>();
        }
        return this.notAllowedDatastores;
    }

    /**
     * Gets the value of the dsTagCategoriesToExclude property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsTagCategoriesToExclude property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDsTagCategoriesToExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterTagCategoryUpdateSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the dsTagCategoriesToExclude property.
     */
    public List<ClusterTagCategoryUpdateSpec> getDsTagCategoriesToExclude() {
        if (dsTagCategoriesToExclude == null) {
            dsTagCategoriesToExclude = new ArrayList<>();
        }
        return this.dsTagCategoriesToExclude;
    }

    /**
     * Gets the value of the deploymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentMode() {
        return deploymentMode;
    }

    /**
     * Sets the value of the deploymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentMode(String value) {
        this.deploymentMode = value;
    }

}
