
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createWitnessNodeRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="createWitnessNodeRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="witnessDeploymentSpec" type="{urn:internalvim25}NodeDeploymentSpec"/>
 *         <element name="sourceVcSpec" type="{urn:internalvim25}SourceNodeSpec"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createWitnessNodeRequestType", propOrder = {
    "_this",
    "witnessDeploymentSpec",
    "sourceVcSpec"
})
public class CreateWitnessNodeRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected NodeDeploymentSpec witnessDeploymentSpec;
    @XmlElement(required = true)
    protected SourceNodeSpec sourceVcSpec;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the witnessDeploymentSpec property.
     * 
     * @return
     *     possible object is
     *     {@link NodeDeploymentSpec }
     *     
     */
    public NodeDeploymentSpec getWitnessDeploymentSpec() {
        return witnessDeploymentSpec;
    }

    /**
     * Sets the value of the witnessDeploymentSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeDeploymentSpec }
     *     
     */
    public void setWitnessDeploymentSpec(NodeDeploymentSpec value) {
        this.witnessDeploymentSpec = value;
    }

    /**
     * Gets the value of the sourceVcSpec property.
     * 
     * @return
     *     possible object is
     *     {@link SourceNodeSpec }
     *     
     */
    public SourceNodeSpec getSourceVcSpec() {
        return sourceVcSpec;
    }

    /**
     * Sets the value of the sourceVcSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceNodeSpec }
     *     
     */
    public void setSourceVcSpec(SourceNodeSpec value) {
        this.sourceVcSpec = value;
    }

}
