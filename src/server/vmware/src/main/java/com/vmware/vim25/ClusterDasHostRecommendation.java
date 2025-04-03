
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasHostRecommendation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasHostRecommendation">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="drsRating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasHostRecommendation", propOrder = {
    "host",
    "drsRating"
})
public class ClusterDasHostRecommendation
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference host;
    protected Integer drsRating;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the drsRating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrsRating() {
        return drsRating;
    }

    /**
     * Sets the value of the drsRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrsRating(Integer value) {
        this.drsRating = value;
    }

}
