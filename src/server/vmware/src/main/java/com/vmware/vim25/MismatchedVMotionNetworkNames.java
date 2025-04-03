
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MismatchedVMotionNetworkNames complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MismatchedVMotionNetworkNames">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MigrationFault">
 *       <sequence>
 *         <element name="sourceNetwork" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="destNetwork" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MismatchedVMotionNetworkNames", propOrder = {
    "sourceNetwork",
    "destNetwork"
})
public class MismatchedVMotionNetworkNames
    extends MigrationFault
{

    @XmlElement(required = true)
    protected String sourceNetwork;
    @XmlElement(required = true)
    protected String destNetwork;

    /**
     * Gets the value of the sourceNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceNetwork() {
        return sourceNetwork;
    }

    /**
     * Sets the value of the sourceNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceNetwork(String value) {
        this.sourceNetwork = value;
    }

    /**
     * Gets the value of the destNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestNetwork() {
        return destNetwork;
    }

    /**
     * Sets the value of the destNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestNetwork(String value) {
        this.destNetwork = value;
    }

}
