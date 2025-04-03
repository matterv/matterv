
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceConsoleReservationInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceConsoleReservationInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="serviceConsoleReservedCfg" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="serviceConsoleReserved" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="unreserved" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConsoleReservationInfo", propOrder = {
    "serviceConsoleReservedCfg",
    "serviceConsoleReserved",
    "unreserved"
})
public class ServiceConsoleReservationInfo
    extends DynamicData
{

    protected long serviceConsoleReservedCfg;
    protected long serviceConsoleReserved;
    protected long unreserved;

    /**
     * Gets the value of the serviceConsoleReservedCfg property.
     * 
     */
    public long getServiceConsoleReservedCfg() {
        return serviceConsoleReservedCfg;
    }

    /**
     * Sets the value of the serviceConsoleReservedCfg property.
     * 
     */
    public void setServiceConsoleReservedCfg(long value) {
        this.serviceConsoleReservedCfg = value;
    }

    /**
     * Gets the value of the serviceConsoleReserved property.
     * 
     */
    public long getServiceConsoleReserved() {
        return serviceConsoleReserved;
    }

    /**
     * Sets the value of the serviceConsoleReserved property.
     * 
     */
    public void setServiceConsoleReserved(long value) {
        this.serviceConsoleReserved = value;
    }

    /**
     * Gets the value of the unreserved property.
     * 
     */
    public long getUnreserved() {
        return unreserved;
    }

    /**
     * Sets the value of the unreserved property.
     * 
     */
    public void setUnreserved(long value) {
        this.unreserved = value;
    }

}
