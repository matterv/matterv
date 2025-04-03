
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PMemDatastoreInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PMemDatastoreInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DatastoreInfo">
 *       <sequence>
 *         <element name="pmem" type="{urn:internalvim25}HostPMemVolume"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PMemDatastoreInfo", propOrder = {
    "pmem"
})
public class PMemDatastoreInfo
    extends DatastoreInfo
{

    @XmlElement(required = true)
    protected HostPMemVolume pmem;

    /**
     * Gets the value of the pmem property.
     * 
     * @return
     *     possible object is
     *     {@link HostPMemVolume }
     *     
     */
    public HostPMemVolume getPmem() {
        return pmem;
    }

    /**
     * Sets the value of the pmem property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostPMemVolume }
     *     
     */
    public void setPmem(HostPMemVolume value) {
        this.pmem = value;
    }

}
