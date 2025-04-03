
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetOffloadCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNetOffloadCapabilities">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="csumOffload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="tcpSegmentation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="zeroCopyXmit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetOffloadCapabilities", propOrder = {
    "csumOffload",
    "tcpSegmentation",
    "zeroCopyXmit"
})
public class HostNetOffloadCapabilities
    extends DynamicData
{

    protected Boolean csumOffload;
    protected Boolean tcpSegmentation;
    protected Boolean zeroCopyXmit;

    /**
     * Gets the value of the csumOffload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCsumOffload() {
        return csumOffload;
    }

    /**
     * Sets the value of the csumOffload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCsumOffload(Boolean value) {
        this.csumOffload = value;
    }

    /**
     * Gets the value of the tcpSegmentation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTcpSegmentation() {
        return tcpSegmentation;
    }

    /**
     * Sets the value of the tcpSegmentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTcpSegmentation(Boolean value) {
        this.tcpSegmentation = value;
    }

    /**
     * Gets the value of the zeroCopyXmit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroCopyXmit() {
        return zeroCopyXmit;
    }

    /**
     * Sets the value of the zeroCopyXmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroCopyXmit(Boolean value) {
        this.zeroCopyXmit = value;
    }

}
