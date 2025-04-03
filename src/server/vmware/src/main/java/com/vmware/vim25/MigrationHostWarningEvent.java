
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigrationHostWarningEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MigrationHostWarningEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MigrationEvent">
 *       <sequence>
 *         <element name="dstHost" type="{urn:internalvim25}HostEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationHostWarningEvent", propOrder = {
    "dstHost"
})
public class MigrationHostWarningEvent
    extends MigrationEvent
{

    @XmlElement(required = true)
    protected HostEventArgument dstHost;

    /**
     * Gets the value of the dstHost property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getDstHost() {
        return dstHost;
    }

    /**
     * Sets the value of the dstHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setDstHost(HostEventArgument value) {
        this.dstHost = value;
    }

}
