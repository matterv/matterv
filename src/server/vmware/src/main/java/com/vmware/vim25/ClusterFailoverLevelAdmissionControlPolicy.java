
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterFailoverLevelAdmissionControlPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterFailoverLevelAdmissionControlPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterDasAdmissionControlPolicy">
 *       <sequence>
 *         <element name="failoverLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="slotPolicy" type="{urn:internalvim25}ClusterSlotPolicy" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverLevelAdmissionControlPolicy", propOrder = {
    "failoverLevel",
    "slotPolicy"
})
public class ClusterFailoverLevelAdmissionControlPolicy
    extends ClusterDasAdmissionControlPolicy
{

    protected int failoverLevel;
    protected ClusterSlotPolicy slotPolicy;

    /**
     * Gets the value of the failoverLevel property.
     * 
     */
    public int getFailoverLevel() {
        return failoverLevel;
    }

    /**
     * Sets the value of the failoverLevel property.
     * 
     */
    public void setFailoverLevel(int value) {
        this.failoverLevel = value;
    }

    /**
     * Gets the value of the slotPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterSlotPolicy }
     *     
     */
    public ClusterSlotPolicy getSlotPolicy() {
        return slotPolicy;
    }

    /**
     * Sets the value of the slotPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterSlotPolicy }
     *     
     */
    public void setSlotPolicy(ClusterSlotPolicy value) {
        this.slotPolicy = value;
    }

}
