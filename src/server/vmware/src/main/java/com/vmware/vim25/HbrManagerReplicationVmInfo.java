
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HbrManagerReplicationVmInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HbrManagerReplicationVmInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="progressInfo" type="{urn:internalvim25}ReplicationVmProgressInfo" minOccurs="0"/>
 *         <element name="imageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lastError" type="{urn:internalvim25}LocalizedMethodFault" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HbrManagerReplicationVmInfo", propOrder = {
    "state",
    "progressInfo",
    "imageId",
    "lastError"
})
public class HbrManagerReplicationVmInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String state;
    protected ReplicationVmProgressInfo progressInfo;
    protected String imageId;
    protected LocalizedMethodFault lastError;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the progressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationVmProgressInfo }
     *     
     */
    public ReplicationVmProgressInfo getProgressInfo() {
        return progressInfo;
    }

    /**
     * Sets the value of the progressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationVmProgressInfo }
     *     
     */
    public void setProgressInfo(ReplicationVmProgressInfo value) {
        this.progressInfo = value;
    }

    /**
     * Gets the value of the imageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageId(String value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the lastError property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getLastError() {
        return lastError;
    }

    /**
     * Sets the value of the lastError property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setLastError(LocalizedMethodFault value) {
        this.lastError = value;
    }

}
