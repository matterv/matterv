
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageRequirement complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageRequirement">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="datastore" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="freeSpaceRequiredInKb" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageRequirement", propOrder = {
    "datastore",
    "freeSpaceRequiredInKb"
})
public class StorageRequirement
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference datastore;
    protected long freeSpaceRequiredInKb;

    /**
     * Gets the value of the datastore property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDatastore() {
        return datastore;
    }

    /**
     * Sets the value of the datastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDatastore(ManagedObjectReference value) {
        this.datastore = value;
    }

    /**
     * Gets the value of the freeSpaceRequiredInKb property.
     * 
     */
    public long getFreeSpaceRequiredInKb() {
        return freeSpaceRequiredInKb;
    }

    /**
     * Sets the value of the freeSpaceRequiredInKb property.
     * 
     */
    public void setFreeSpaceRequiredInKb(long value) {
        this.freeSpaceRequiredInKb = value;
    }

}
