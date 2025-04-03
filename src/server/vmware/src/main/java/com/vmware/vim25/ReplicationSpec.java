
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplicationSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReplicationSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="replicationGroupId" type="{urn:internalvim25}ReplicationGroupId"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationSpec", propOrder = {
    "replicationGroupId"
})
public class ReplicationSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected ReplicationGroupId replicationGroupId;

    /**
     * Gets the value of the replicationGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationGroupId }
     *     
     */
    public ReplicationGroupId getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * Sets the value of the replicationGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationGroupId }
     *     
     */
    public void setReplicationGroupId(ReplicationGroupId value) {
        this.replicationGroupId = value;
    }

}
