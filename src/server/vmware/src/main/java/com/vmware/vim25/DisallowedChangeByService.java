
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisallowedChangeByService complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DisallowedChangeByService">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}RuntimeFault">
 *       <sequence>
 *         <element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="disallowedChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisallowedChangeByService", propOrder = {
    "serviceName",
    "disallowedChange"
})
public class DisallowedChangeByService
    extends RuntimeFault
{

    @XmlElement(required = true)
    protected String serviceName;
    protected String disallowedChange;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the disallowedChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisallowedChange() {
        return disallowedChange;
    }

    /**
     * Sets the value of the disallowedChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisallowedChange(String value) {
        this.disallowedChange = value;
    }

}
