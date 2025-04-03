
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVsanInternalSystemDeleteVsanObjectsResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVsanInternalSystemDeleteVsanObjectsResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="failureReason" type="{urn:internalvim25}LocalizableMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVsanInternalSystemDeleteVsanObjectsResult", propOrder = {
    "uuid",
    "success",
    "failureReason"
})
public class HostVsanInternalSystemDeleteVsanObjectsResult
    extends DynamicData
{

    @XmlElement(required = true)
    protected String uuid;
    protected boolean success;
    protected List<LocalizableMessage> failureReason;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the failureReason property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failureReason property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFailureReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizableMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the failureReason property.
     */
    public List<LocalizableMessage> getFailureReason() {
        if (failureReason == null) {
            failureReason = new ArrayList<>();
        }
        return this.failureReason;
    }

}
