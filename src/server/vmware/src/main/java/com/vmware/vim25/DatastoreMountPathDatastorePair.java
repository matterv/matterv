
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatastoreMountPathDatastorePair complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatastoreMountPathDatastorePair">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="oldMountPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datastore" type="{urn:internalvim25}ManagedObjectReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreMountPathDatastorePair", propOrder = {
    "oldMountPath",
    "datastore"
})
public class DatastoreMountPathDatastorePair
    extends DynamicData
{

    @XmlElement(required = true)
    protected String oldMountPath;
    @XmlElement(required = true)
    protected ManagedObjectReference datastore;

    /**
     * Gets the value of the oldMountPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMountPath() {
        return oldMountPath;
    }

    /**
     * Sets the value of the oldMountPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMountPath(String value) {
        this.oldMountPath = value;
    }

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

}
