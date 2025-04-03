
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsufficientStorageIops complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InsufficientStorageIops">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="unreservedIops" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="requestedIops" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="datastoreName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientStorageIops", propOrder = {
    "unreservedIops",
    "requestedIops",
    "datastoreName"
})
public class InsufficientStorageIops
    extends VimFault
{

    protected long unreservedIops;
    protected long requestedIops;
    @XmlElement(required = true)
    protected String datastoreName;

    /**
     * Gets the value of the unreservedIops property.
     * 
     */
    public long getUnreservedIops() {
        return unreservedIops;
    }

    /**
     * Sets the value of the unreservedIops property.
     * 
     */
    public void setUnreservedIops(long value) {
        this.unreservedIops = value;
    }

    /**
     * Gets the value of the requestedIops property.
     * 
     */
    public long getRequestedIops() {
        return requestedIops;
    }

    /**
     * Sets the value of the requestedIops property.
     * 
     */
    public void setRequestedIops(long value) {
        this.requestedIops = value;
    }

    /**
     * Gets the value of the datastoreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    /**
     * Sets the value of the datastoreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatastoreName(String value) {
        this.datastoreName = value;
    }

}
