
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportUnmanagedSnapshotRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportUnmanagedSnapshotRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="vdisk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datacenter" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="vvolId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportUnmanagedSnapshotRequestType", propOrder = {
    "_this",
    "vdisk",
    "datacenter",
    "vvolId"
})
public class ImportUnmanagedSnapshotRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String vdisk;
    protected ManagedObjectReference datacenter;
    @XmlElement(required = true)
    protected String vvolId;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the vdisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVdisk() {
        return vdisk;
    }

    /**
     * Sets the value of the vdisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVdisk(String value) {
        this.vdisk = value;
    }

    /**
     * Gets the value of the datacenter property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getDatacenter() {
        return datacenter;
    }

    /**
     * Sets the value of the datacenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setDatacenter(ManagedObjectReference value) {
        this.datacenter = value;
    }

    /**
     * Gets the value of the vvolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVvolId() {
        return vvolId;
    }

    /**
     * Sets the value of the vvolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVvolId(String value) {
        this.vvolId = value;
    }

}
