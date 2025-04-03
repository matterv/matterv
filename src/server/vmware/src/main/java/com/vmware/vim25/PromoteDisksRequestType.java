
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromoteDisksRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PromoteDisksRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="unlink" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="disks" type="{urn:internalvim25}VirtualDisk" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromoteDisksRequestType", propOrder = {
    "_this",
    "unlink",
    "disks"
})
public class PromoteDisksRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    protected boolean unlink;
    protected List<VirtualDisk> disks;

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
     * Gets the value of the unlink property.
     * 
     */
    public boolean isUnlink() {
        return unlink;
    }

    /**
     * Sets the value of the unlink property.
     * 
     */
    public void setUnlink(boolean value) {
        this.unlink = value;
    }

    /**
     * Gets the value of the disks property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disks property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDisks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualDisk }
     * </p>
     * 
     * 
     * @return
     *     The value of the disks property.
     */
    public List<VirtualDisk> getDisks() {
        if (disks == null) {
            disks = new ArrayList<>();
        }
        return this.disks;
    }

}
