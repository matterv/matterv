
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplicationInfoDiskSettings complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReplicationInfoDiskSettings">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="diskReplicationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationInfoDiskSettings", propOrder = {
    "key",
    "diskReplicationId"
})
public class ReplicationInfoDiskSettings
    extends DynamicData
{

    protected int key;
    @XmlElement(required = true)
    protected String diskReplicationId;

    /**
     * Gets the value of the key property.
     * 
     */
    public int getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     */
    public void setKey(int value) {
        this.key = value;
    }

    /**
     * Gets the value of the diskReplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskReplicationId() {
        return diskReplicationId;
    }

    /**
     * Sets the value of the diskReplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskReplicationId(String value) {
        this.diskReplicationId = value;
    }

}
