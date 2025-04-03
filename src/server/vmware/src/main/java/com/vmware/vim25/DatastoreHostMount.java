
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatastoreHostMount complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatastoreHostMount">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="mountInfo" type="{urn:internalvim25}HostMountInfo"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreHostMount", propOrder = {
    "key",
    "mountInfo"
})
public class DatastoreHostMount
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference key;
    @XmlElement(required = true)
    protected HostMountInfo mountInfo;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setKey(ManagedObjectReference value) {
        this.key = value;
    }

    /**
     * Gets the value of the mountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HostMountInfo }
     *     
     */
    public HostMountInfo getMountInfo() {
        return mountInfo;
    }

    /**
     * Sets the value of the mountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostMountInfo }
     *     
     */
    public void setMountInfo(HostMountInfo value) {
        this.mountInfo = value;
    }

}
