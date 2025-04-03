
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmUuidChangedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmUuidChangedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="oldUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="newUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmUuidChangedEvent", propOrder = {
    "oldUuid",
    "newUuid"
})
public class VmUuidChangedEvent
    extends VmEvent
{

    @XmlElement(required = true)
    protected String oldUuid;
    @XmlElement(required = true)
    protected String newUuid;

    /**
     * Gets the value of the oldUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldUuid() {
        return oldUuid;
    }

    /**
     * Sets the value of the oldUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldUuid(String value) {
        this.oldUuid = value;
    }

    /**
     * Gets the value of the newUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUuid() {
        return newUuid;
    }

    /**
     * Sets the value of the newUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUuid(String value) {
        this.newUuid = value;
    }

}
