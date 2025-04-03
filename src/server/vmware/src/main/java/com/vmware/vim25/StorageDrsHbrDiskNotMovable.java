
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageDrsHbrDiskNotMovable complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageDrsHbrDiskNotMovable">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="nonMovableDiskIds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsHbrDiskNotMovable", propOrder = {
    "nonMovableDiskIds"
})
public class StorageDrsHbrDiskNotMovable
    extends VimFault
{

    @XmlElement(required = true)
    protected String nonMovableDiskIds;

    /**
     * Gets the value of the nonMovableDiskIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonMovableDiskIds() {
        return nonMovableDiskIds;
    }

    /**
     * Sets the value of the nonMovableDiskIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonMovableDiskIds(String value) {
        this.nonMovableDiskIds = value;
    }

}
