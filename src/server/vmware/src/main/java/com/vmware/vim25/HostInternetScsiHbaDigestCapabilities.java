
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostInternetScsiHbaDigestCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostInternetScsiHbaDigestCapabilities">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="headerDigestSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="dataDigestSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="targetHeaderDigestSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="targetDataDigestSettable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaDigestCapabilities", propOrder = {
    "headerDigestSettable",
    "dataDigestSettable",
    "targetHeaderDigestSettable",
    "targetDataDigestSettable"
})
public class HostInternetScsiHbaDigestCapabilities
    extends DynamicData
{

    protected Boolean headerDigestSettable;
    protected Boolean dataDigestSettable;
    protected Boolean targetHeaderDigestSettable;
    protected Boolean targetDataDigestSettable;

    /**
     * Gets the value of the headerDigestSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeaderDigestSettable() {
        return headerDigestSettable;
    }

    /**
     * Sets the value of the headerDigestSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeaderDigestSettable(Boolean value) {
        this.headerDigestSettable = value;
    }

    /**
     * Gets the value of the dataDigestSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataDigestSettable() {
        return dataDigestSettable;
    }

    /**
     * Sets the value of the dataDigestSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataDigestSettable(Boolean value) {
        this.dataDigestSettable = value;
    }

    /**
     * Gets the value of the targetHeaderDigestSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetHeaderDigestSettable() {
        return targetHeaderDigestSettable;
    }

    /**
     * Sets the value of the targetHeaderDigestSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetHeaderDigestSettable(Boolean value) {
        this.targetHeaderDigestSettable = value;
    }

    /**
     * Gets the value of the targetDataDigestSettable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTargetDataDigestSettable() {
        return targetDataDigestSettable;
    }

    /**
     * Sets the value of the targetDataDigestSettable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetDataDigestSettable(Boolean value) {
        this.targetDataDigestSettable = value;
    }

}
