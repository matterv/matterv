
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VspanSameSessionPortConflict complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VspanSameSessionPortConflict">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsFault">
 *       <sequence>
 *         <element name="vspanSessionKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="portKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VspanSameSessionPortConflict", propOrder = {
    "vspanSessionKey",
    "portKey"
})
public class VspanSameSessionPortConflict
    extends DvsFault
{

    @XmlElement(required = true)
    protected String vspanSessionKey;
    @XmlElement(required = true)
    protected String portKey;

    /**
     * Gets the value of the vspanSessionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVspanSessionKey() {
        return vspanSessionKey;
    }

    /**
     * Sets the value of the vspanSessionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVspanSessionKey(String value) {
        this.vspanSessionKey = value;
    }

    /**
     * Gets the value of the portKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortKey() {
        return portKey;
    }

    /**
     * Sets the value of the portKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortKey(String value) {
        this.portKey = value;
    }

}
