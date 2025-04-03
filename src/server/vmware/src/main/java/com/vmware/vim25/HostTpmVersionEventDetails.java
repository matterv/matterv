
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTpmVersionEventDetails complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTpmVersionEventDetails">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostTpmEventDetails">
 *       <sequence>
 *         <element name="version" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmVersionEventDetails", propOrder = {
    "version"
})
public class HostTpmVersionEventDetails
    extends HostTpmEventDetails
{

    @XmlElement(required = true)
    protected byte[] version;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setVersion(byte[] value) {
        this.version = value;
    }

}
