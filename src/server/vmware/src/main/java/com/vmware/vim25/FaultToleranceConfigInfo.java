
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultToleranceConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FaultToleranceConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="role" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="instanceUuids" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="configPaths" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="orphaned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceConfigInfo", propOrder = {
    "role",
    "instanceUuids",
    "configPaths",
    "orphaned"
})
@XmlSeeAlso({
    FaultTolerancePrimaryConfigInfo.class,
    FaultToleranceSecondaryConfigInfo.class
})
public class FaultToleranceConfigInfo
    extends DynamicData
{

    protected int role;
    @XmlElement(required = true)
    protected List<String> instanceUuids;
    @XmlElement(required = true)
    protected List<String> configPaths;
    protected Boolean orphaned;

    /**
     * Gets the value of the role property.
     * 
     */
    public int getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     */
    public void setRole(int value) {
        this.role = value;
    }

    /**
     * Gets the value of the instanceUuids property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instanceUuids property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInstanceUuids().add(newItem);
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
     *     The value of the instanceUuids property.
     */
    public List<String> getInstanceUuids() {
        if (instanceUuids == null) {
            instanceUuids = new ArrayList<>();
        }
        return this.instanceUuids;
    }

    /**
     * Gets the value of the configPaths property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configPaths property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfigPaths().add(newItem);
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
     *     The value of the configPaths property.
     */
    public List<String> getConfigPaths() {
        if (configPaths == null) {
            configPaths = new ArrayList<>();
        }
        return this.configPaths;
    }

    /**
     * Gets the value of the orphaned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrphaned() {
        return orphaned;
    }

    /**
     * Sets the value of the orphaned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrphaned(Boolean value) {
        this.orphaned = value;
    }

}
