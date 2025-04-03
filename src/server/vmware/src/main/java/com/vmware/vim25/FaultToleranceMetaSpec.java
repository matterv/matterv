
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultToleranceMetaSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FaultToleranceMetaSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="metaDataDatastore" type="{urn:internalvim25}ManagedObjectReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceMetaSpec", propOrder = {
    "metaDataDatastore"
})
public class FaultToleranceMetaSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference metaDataDatastore;

    /**
     * Gets the value of the metaDataDatastore property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getMetaDataDatastore() {
        return metaDataDatastore;
    }

    /**
     * Sets the value of the metaDataDatastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setMetaDataDatastore(ManagedObjectReference value) {
        this.metaDataDatastore = value;
    }

}
