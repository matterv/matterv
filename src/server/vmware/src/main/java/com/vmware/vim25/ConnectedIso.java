
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedIso complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConnectedIso">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfExport">
 *       <sequence>
 *         <element name="cdrom" type="{urn:internalvim25}VirtualCdrom"/>
 *         <element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedIso", propOrder = {
    "cdrom",
    "filename"
})
public class ConnectedIso
    extends OvfExport
{

    @XmlElement(required = true)
    protected VirtualCdrom cdrom;
    @XmlElement(required = true)
    protected String filename;

    /**
     * Gets the value of the cdrom property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualCdrom }
     *     
     */
    public VirtualCdrom getCdrom() {
        return cdrom;
    }

    /**
     * Sets the value of the cdrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualCdrom }
     *     
     */
    public void setCdrom(VirtualCdrom value) {
        this.cdrom = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

}
