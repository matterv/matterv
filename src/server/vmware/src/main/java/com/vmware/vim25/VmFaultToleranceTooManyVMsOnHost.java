
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmFaultToleranceTooManyVMsOnHost complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmFaultToleranceTooManyVMsOnHost">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InsufficientResourcesFault">
 *       <sequence>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="maxNumFtVms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceTooManyVMsOnHost", propOrder = {
    "hostName",
    "maxNumFtVms"
})
public class VmFaultToleranceTooManyVMsOnHost
    extends InsufficientResourcesFault
{

    protected String hostName;
    protected int maxNumFtVms;

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the maxNumFtVms property.
     * 
     */
    public int getMaxNumFtVms() {
        return maxNumFtVms;
    }

    /**
     * Sets the value of the maxNumFtVms property.
     * 
     */
    public void setMaxNumFtVms(int value) {
        this.maxNumFtVms = value;
    }

}
