
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VvolDatastoreInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VvolDatastoreInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DatastoreInfo">
 *       <sequence>
 *         <element name="vvolDS" type="{urn:internalvim25}HostVvolVolume" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VvolDatastoreInfo", propOrder = {
    "vvolDS"
})
public class VvolDatastoreInfo
    extends DatastoreInfo
{

    protected HostVvolVolume vvolDS;

    /**
     * Gets the value of the vvolDS property.
     * 
     * @return
     *     possible object is
     *     {@link HostVvolVolume }
     *     
     */
    public HostVvolVolume getVvolDS() {
        return vvolDS;
    }

    /**
     * Sets the value of the vvolDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVvolVolume }
     *     
     */
    public void setVvolDS(HostVvolVolume value) {
        this.vvolDS = value;
    }

}
