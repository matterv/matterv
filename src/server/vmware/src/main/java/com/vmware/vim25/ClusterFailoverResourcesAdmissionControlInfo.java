
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterFailoverResourcesAdmissionControlInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterFailoverResourcesAdmissionControlInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterDasAdmissionControlInfo">
 *       <sequence>
 *         <element name="currentCpuFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="currentMemoryFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="currentPMemFailoverResourcesPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverResourcesAdmissionControlInfo", propOrder = {
    "currentCpuFailoverResourcesPercent",
    "currentMemoryFailoverResourcesPercent",
    "currentPMemFailoverResourcesPercent"
})
public class ClusterFailoverResourcesAdmissionControlInfo
    extends ClusterDasAdmissionControlInfo
{

    protected int currentCpuFailoverResourcesPercent;
    protected int currentMemoryFailoverResourcesPercent;
    protected Integer currentPMemFailoverResourcesPercent;

    /**
     * Gets the value of the currentCpuFailoverResourcesPercent property.
     * 
     */
    public int getCurrentCpuFailoverResourcesPercent() {
        return currentCpuFailoverResourcesPercent;
    }

    /**
     * Sets the value of the currentCpuFailoverResourcesPercent property.
     * 
     */
    public void setCurrentCpuFailoverResourcesPercent(int value) {
        this.currentCpuFailoverResourcesPercent = value;
    }

    /**
     * Gets the value of the currentMemoryFailoverResourcesPercent property.
     * 
     */
    public int getCurrentMemoryFailoverResourcesPercent() {
        return currentMemoryFailoverResourcesPercent;
    }

    /**
     * Sets the value of the currentMemoryFailoverResourcesPercent property.
     * 
     */
    public void setCurrentMemoryFailoverResourcesPercent(int value) {
        this.currentMemoryFailoverResourcesPercent = value;
    }

    /**
     * Gets the value of the currentPMemFailoverResourcesPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentPMemFailoverResourcesPercent() {
        return currentPMemFailoverResourcesPercent;
    }

    /**
     * Sets the value of the currentPMemFailoverResourcesPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPMemFailoverResourcesPercent(Integer value) {
        this.currentPMemFailoverResourcesPercent = value;
    }

}
