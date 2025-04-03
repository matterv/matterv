
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VStorageObjectSnapshot complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VStorageObjectSnapshot">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{urn:internalvim25}ID"/>
 *         <element name="vclock" type="{urn:internalvim25}vslmVClockInfo"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectSnapshot", propOrder = {
    "id",
    "vclock"
})
public class VStorageObjectSnapshot
    extends DynamicData
{

    @XmlElement(required = true)
    protected ID id;
    @XmlElement(required = true)
    protected VslmVClockInfo vclock;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setId(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the vclock property.
     * 
     * @return
     *     possible object is
     *     {@link VslmVClockInfo }
     *     
     */
    public VslmVClockInfo getVclock() {
        return vclock;
    }

    /**
     * Sets the value of the vclock property.
     * 
     * @param value
     *     allowed object is
     *     {@link VslmVClockInfo }
     *     
     */
    public void setVclock(VslmVClockInfo value) {
        this.vclock = value;
    }

}
