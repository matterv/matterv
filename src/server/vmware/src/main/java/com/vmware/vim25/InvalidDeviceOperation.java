
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidDeviceOperation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InvalidDeviceOperation">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InvalidDeviceSpec">
 *       <sequence>
 *         <element name="badOp" type="{urn:internalvim25}VirtualDeviceConfigSpecOperation" minOccurs="0"/>
 *         <element name="badFileOp" type="{urn:internalvim25}VirtualDeviceConfigSpecFileOperation" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidDeviceOperation", propOrder = {
    "badOp",
    "badFileOp"
})
public class InvalidDeviceOperation
    extends InvalidDeviceSpec
{

    @XmlSchemaType(name = "string")
    protected VirtualDeviceConfigSpecOperation badOp;
    @XmlSchemaType(name = "string")
    protected VirtualDeviceConfigSpecFileOperation badFileOp;

    /**
     * Gets the value of the badOp property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceConfigSpecOperation }
     *     
     */
    public VirtualDeviceConfigSpecOperation getBadOp() {
        return badOp;
    }

    /**
     * Sets the value of the badOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceConfigSpecOperation }
     *     
     */
    public void setBadOp(VirtualDeviceConfigSpecOperation value) {
        this.badOp = value;
    }

    /**
     * Gets the value of the badFileOp property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualDeviceConfigSpecFileOperation }
     *     
     */
    public VirtualDeviceConfigSpecFileOperation getBadFileOp() {
        return badFileOp;
    }

    /**
     * Sets the value of the badFileOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualDeviceConfigSpecFileOperation }
     *     
     */
    public void setBadFileOp(VirtualDeviceConfigSpecFileOperation value) {
        this.badFileOp = value;
    }

}
