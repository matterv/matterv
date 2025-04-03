
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmFaultToleranceTooManyFtVcpusOnHost complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmFaultToleranceTooManyFtVcpusOnHost">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InsufficientResourcesFault">
 *       <sequence>
 *         <element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="maxNumFtVcpus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceTooManyFtVcpusOnHost", propOrder = {
    "hostName",
    "maxNumFtVcpus"
})
public class VmFaultToleranceTooManyFtVcpusOnHost
    extends InsufficientResourcesFault
{

    protected String hostName;
    protected int maxNumFtVcpus;

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
     * Gets the value of the maxNumFtVcpus property.
     * 
     */
    public int getMaxNumFtVcpus() {
        return maxNumFtVcpus;
    }

    /**
     * Sets the value of the maxNumFtVcpus property.
     * 
     */
    public void setMaxNumFtVcpus(int value) {
        this.maxNumFtVcpus = value;
    }

}
