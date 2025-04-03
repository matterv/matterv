
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmInstanceUuidChangedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmInstanceUuidChangedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="oldInstanceUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="newInstanceUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmInstanceUuidChangedEvent", propOrder = {
    "oldInstanceUuid",
    "newInstanceUuid"
})
public class VmInstanceUuidChangedEvent
    extends VmEvent
{

    @XmlElement(required = true)
    protected String oldInstanceUuid;
    @XmlElement(required = true)
    protected String newInstanceUuid;

    /**
     * Gets the value of the oldInstanceUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldInstanceUuid() {
        return oldInstanceUuid;
    }

    /**
     * Sets the value of the oldInstanceUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldInstanceUuid(String value) {
        this.oldInstanceUuid = value;
    }

    /**
     * Gets the value of the newInstanceUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewInstanceUuid() {
        return newInstanceUuid;
    }

    /**
     * Sets the value of the newInstanceUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewInstanceUuid(String value) {
        this.newInstanceUuid = value;
    }

}
