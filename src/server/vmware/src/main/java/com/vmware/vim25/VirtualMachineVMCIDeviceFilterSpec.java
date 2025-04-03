
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVMCIDeviceFilterSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVMCIDeviceFilterSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="rank" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="direction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lowerDstPortBoundary" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="upperDstPortBoundary" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVMCIDeviceFilterSpec", propOrder = {
    "rank",
    "action",
    "protocol",
    "direction",
    "lowerDstPortBoundary",
    "upperDstPortBoundary"
})
public class VirtualMachineVMCIDeviceFilterSpec
    extends DynamicData
{

    protected long rank;
    @XmlElement(required = true)
    protected String action;
    @XmlElement(required = true)
    protected String protocol;
    @XmlElement(required = true)
    protected String direction;
    protected Long lowerDstPortBoundary;
    protected Long upperDstPortBoundary;

    /**
     * Gets the value of the rank property.
     * 
     */
    public long getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(long value) {
        this.rank = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the lowerDstPortBoundary property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLowerDstPortBoundary() {
        return lowerDstPortBoundary;
    }

    /**
     * Sets the value of the lowerDstPortBoundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLowerDstPortBoundary(Long value) {
        this.lowerDstPortBoundary = value;
    }

    /**
     * Gets the value of the upperDstPortBoundary property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpperDstPortBoundary() {
        return upperDstPortBoundary;
    }

    /**
     * Sets the value of the upperDstPortBoundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpperDstPortBoundary(Long value) {
        this.upperDstPortBoundary = value;
    }

}
