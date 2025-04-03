
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpaqueNetworkCapability complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OpaqueNetworkCapability">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="networkReservationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpaqueNetworkCapability", propOrder = {
    "networkReservationSupported"
})
public class OpaqueNetworkCapability
    extends DynamicData
{

    protected boolean networkReservationSupported;

    /**
     * Gets the value of the networkReservationSupported property.
     * 
     */
    public boolean isNetworkReservationSupported() {
        return networkReservationSupported;
    }

    /**
     * Sets the value of the networkReservationSupported property.
     * 
     */
    public void setNetworkReservationSupported(boolean value) {
        this.networkReservationSupported = value;
    }

}
