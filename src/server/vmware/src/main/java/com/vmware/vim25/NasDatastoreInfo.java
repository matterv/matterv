
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NasDatastoreInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NasDatastoreInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DatastoreInfo">
 *       <sequence>
 *         <element name="nas" type="{urn:internalvim25}HostNasVolume" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasDatastoreInfo", propOrder = {
    "nas"
})
public class NasDatastoreInfo
    extends DatastoreInfo
{

    protected HostNasVolume nas;

    /**
     * Gets the value of the nas property.
     * 
     * @return
     *     possible object is
     *     {@link HostNasVolume }
     *     
     */
    public HostNasVolume getNas() {
        return nas;
    }

    /**
     * Sets the value of the nas property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostNasVolume }
     *     
     */
    public void setNas(HostNasVolume value) {
        this.nas = value;
    }

}
