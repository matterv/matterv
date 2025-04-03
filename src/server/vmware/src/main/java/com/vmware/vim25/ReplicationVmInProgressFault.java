
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplicationVmInProgressFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReplicationVmInProgressFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ReplicationVmFault">
 *       <sequence>
 *         <element name="requestedActivity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="inProgressActivity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationVmInProgressFault", propOrder = {
    "requestedActivity",
    "inProgressActivity"
})
public class ReplicationVmInProgressFault
    extends ReplicationVmFault
{

    @XmlElement(required = true)
    protected String requestedActivity;
    @XmlElement(required = true)
    protected String inProgressActivity;

    /**
     * Gets the value of the requestedActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedActivity() {
        return requestedActivity;
    }

    /**
     * Sets the value of the requestedActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedActivity(String value) {
        this.requestedActivity = value;
    }

    /**
     * Gets the value of the inProgressActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInProgressActivity() {
        return inProgressActivity;
    }

    /**
     * Sets the value of the inProgressActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInProgressActivity(String value) {
        this.inProgressActivity = value;
    }

}
