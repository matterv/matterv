
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostDnsConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostDnsConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostDnsConfig">
 *       <sequence>
 *         <element name="virtualNicConnection" type="{urn:internalvim25}HostVirtualNicConnection" minOccurs="0"/>
 *         <element name="virtualNicConnectionV6" type="{urn:internalvim25}HostVirtualNicConnection" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDnsConfigSpec", propOrder = {
    "virtualNicConnection",
    "virtualNicConnectionV6"
})
public class HostDnsConfigSpec
    extends HostDnsConfig
{

    protected HostVirtualNicConnection virtualNicConnection;
    protected HostVirtualNicConnection virtualNicConnectionV6;

    /**
     * Gets the value of the virtualNicConnection property.
     * 
     * @return
     *     possible object is
     *     {@link HostVirtualNicConnection }
     *     
     */
    public HostVirtualNicConnection getVirtualNicConnection() {
        return virtualNicConnection;
    }

    /**
     * Sets the value of the virtualNicConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVirtualNicConnection }
     *     
     */
    public void setVirtualNicConnection(HostVirtualNicConnection value) {
        this.virtualNicConnection = value;
    }

    /**
     * Gets the value of the virtualNicConnectionV6 property.
     * 
     * @return
     *     possible object is
     *     {@link HostVirtualNicConnection }
     *     
     */
    public HostVirtualNicConnection getVirtualNicConnectionV6() {
        return virtualNicConnectionV6;
    }

    /**
     * Sets the value of the virtualNicConnectionV6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostVirtualNicConnection }
     *     
     */
    public void setVirtualNicConnectionV6(HostVirtualNicConnection value) {
        this.virtualNicConnectionV6 = value;
    }

}
