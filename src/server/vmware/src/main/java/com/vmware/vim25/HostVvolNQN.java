
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVvolNQN complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVvolNQN">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="targetNQN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="storageArray" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="online" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVvolNQN", propOrder = {
    "targetNQN",
    "storageArray",
    "online"
})
public class HostVvolNQN
    extends DynamicData
{

    @XmlElement(required = true)
    protected String targetNQN;
    @XmlElement(required = true)
    protected String storageArray;
    protected boolean online;

    /**
     * Gets the value of the targetNQN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNQN() {
        return targetNQN;
    }

    /**
     * Sets the value of the targetNQN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNQN(String value) {
        this.targetNQN = value;
    }

    /**
     * Gets the value of the storageArray property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageArray() {
        return storageArray;
    }

    /**
     * Sets the value of the storageArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageArray(String value) {
        this.storageArray = value;
    }

    /**
     * Gets the value of the online property.
     * 
     */
    public boolean isOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     */
    public void setOnline(boolean value) {
        this.online = value;
    }

}
