
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostScsiTopologyLun complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostScsiTopologyLun">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lun" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="scsiLun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostScsiTopologyLun", propOrder = {
    "key",
    "lun",
    "scsiLun"
})
public class HostScsiTopologyLun
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    protected int lun;
    @XmlElement(required = true)
    protected String scsiLun;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the lun property.
     * 
     */
    public int getLun() {
        return lun;
    }

    /**
     * Sets the value of the lun property.
     * 
     */
    public void setLun(int value) {
        this.lun = value;
    }

    /**
     * Gets the value of the scsiLun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScsiLun() {
        return scsiLun;
    }

    /**
     * Sets the value of the scsiLun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScsiLun(String value) {
        this.scsiLun = value;
    }

}
