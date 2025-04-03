
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmFaultToleranceInvalidFileBacking complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmFaultToleranceInvalidFileBacking">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmFaultToleranceIssue">
 *       <sequence>
 *         <element name="backingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="backingFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceInvalidFileBacking", propOrder = {
    "backingType",
    "backingFilename"
})
public class VmFaultToleranceInvalidFileBacking
    extends VmFaultToleranceIssue
{

    protected String backingType;
    protected String backingFilename;

    /**
     * Gets the value of the backingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackingType() {
        return backingType;
    }

    /**
     * Sets the value of the backingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackingType(String value) {
        this.backingType = value;
    }

    /**
     * Gets the value of the backingFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackingFilename() {
        return backingFilename;
    }

    /**
     * Sets the value of the backingFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackingFilename(String value) {
        this.backingFilename = value;
    }

}
