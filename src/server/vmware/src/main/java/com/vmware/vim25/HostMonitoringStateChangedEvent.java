
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostMonitoringStateChangedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostMonitoringStateChangedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterEvent">
 *       <sequence>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prevState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMonitoringStateChangedEvent", propOrder = {
    "state",
    "prevState"
})
public class HostMonitoringStateChangedEvent
    extends ClusterEvent
{

    @XmlElement(required = true)
    protected String state;
    protected String prevState;

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
     * Gets the value of the prevState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevState() {
        return prevState;
    }

    /**
     * Sets the value of the prevState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevState(String value) {
        this.prevState = value;
    }

}
