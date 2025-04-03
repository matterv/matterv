
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmSmpFaultToleranceTooManyVMsOnHost complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmSmpFaultToleranceTooManyVMsOnHost">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InsufficientResourcesFault">
 *       <sequence>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="maxNumSmpFtVms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmSmpFaultToleranceTooManyVMsOnHost", propOrder = {
    "hostName",
    "maxNumSmpFtVms"
})
public class VmSmpFaultToleranceTooManyVMsOnHost
    extends InsufficientResourcesFault
{

    protected String hostName;
    protected int maxNumSmpFtVms;

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
     * Gets the value of the maxNumSmpFtVms property.
     * 
     */
    public int getMaxNumSmpFtVms() {
        return maxNumSmpFtVms;
    }

    /**
     * Sets the value of the maxNumSmpFtVms property.
     * 
     */
    public void setMaxNumSmpFtVms(int value) {
        this.maxNumSmpFtVms = value;
    }

}
