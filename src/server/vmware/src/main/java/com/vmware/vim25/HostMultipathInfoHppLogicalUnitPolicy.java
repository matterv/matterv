
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostMultipathInfoHppLogicalUnitPolicy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostMultipathInfoHppLogicalUnitPolicy">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostMultipathInfoLogicalUnitPolicy">
 *       <sequence>
 *         <element name="bytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="iops" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="latencyEvalTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="samplingIosPerPath" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMultipathInfoHppLogicalUnitPolicy", propOrder = {
    "bytes",
    "iops",
    "path",
    "latencyEvalTime",
    "samplingIosPerPath"
})
public class HostMultipathInfoHppLogicalUnitPolicy
    extends HostMultipathInfoLogicalUnitPolicy
{

    protected Long bytes;
    protected Long iops;
    protected String path;
    protected Long latencyEvalTime;
    protected Long samplingIosPerPath;

    /**
     * Gets the value of the bytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBytes() {
        return bytes;
    }

    /**
     * Sets the value of the bytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBytes(Long value) {
        this.bytes = value;
    }

    /**
     * Gets the value of the iops property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIops() {
        return iops;
    }

    /**
     * Sets the value of the iops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIops(Long value) {
        this.iops = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the latencyEvalTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLatencyEvalTime() {
        return latencyEvalTime;
    }

    /**
     * Sets the value of the latencyEvalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLatencyEvalTime(Long value) {
        this.latencyEvalTime = value;
    }

    /**
     * Gets the value of the samplingIosPerPath property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSamplingIosPerPath() {
        return samplingIosPerPath;
    }

    /**
     * Sets the value of the samplingIosPerPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSamplingIosPerPath(Long value) {
        this.samplingIosPerPath = value;
    }

}
