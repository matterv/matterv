
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deployVchaRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="deployVchaRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="deploymentSpec" type="{urn:internalvim25}VchaClusterDeploymentSpec"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deployVchaRequestType", propOrder = {
    "_this",
    "deploymentSpec"
})
public class DeployVchaRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected VchaClusterDeploymentSpec deploymentSpec;

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
     * Gets the value of the deploymentSpec property.
     * 
     * @return
     *     possible object is
     *     {@link VchaClusterDeploymentSpec }
     *     
     */
    public VchaClusterDeploymentSpec getDeploymentSpec() {
        return deploymentSpec;
    }

    /**
     * Sets the value of the deploymentSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link VchaClusterDeploymentSpec }
     *     
     */
    public void setDeploymentSpec(VchaClusterDeploymentSpec value) {
        this.deploymentSpec = value;
    }

}
