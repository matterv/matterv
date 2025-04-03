
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterIoFilterInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterIoFilterInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}IoFilterInfo">
 *       <sequence>
 *         <element name="opType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vibUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterIoFilterInfo", propOrder = {
    "opType",
    "vibUrl"
})
public class ClusterIoFilterInfo
    extends IoFilterInfo
{

    @XmlElement(required = true)
    protected String opType;
    protected String vibUrl;

    /**
     * Gets the value of the opType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpType() {
        return opType;
    }

    /**
     * Sets the value of the opType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpType(String value) {
        this.opType = value;
    }

    /**
     * Gets the value of the vibUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVibUrl() {
        return vibUrl;
    }

    /**
     * Sets the value of the vibUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVibUrl(String value) {
        this.vibUrl = value;
    }

}
