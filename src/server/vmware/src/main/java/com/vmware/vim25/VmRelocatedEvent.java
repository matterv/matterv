
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmRelocatedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmRelocatedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmRelocateSpecEvent">
 *       <sequence>
 *         <element name="sourceHost" type="{urn:internalvim25}HostEventArgument"/>
 *         <element name="sourceDatacenter" type="{urn:internalvim25}DatacenterEventArgument" minOccurs="0"/>
 *         <element name="sourceDatastore" type="{urn:internalvim25}DatastoreEventArgument" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmRelocatedEvent", propOrder = {
    "sourceHost",
    "sourceDatacenter",
    "sourceDatastore"
})
public class VmRelocatedEvent
    extends VmRelocateSpecEvent
{

    @XmlElement(required = true)
    protected HostEventArgument sourceHost;
    protected DatacenterEventArgument sourceDatacenter;
    protected DatastoreEventArgument sourceDatastore;

    /**
     * Gets the value of the sourceHost property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getSourceHost() {
        return sourceHost;
    }

    /**
     * Sets the value of the sourceHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setSourceHost(HostEventArgument value) {
        this.sourceHost = value;
    }

    /**
     * Gets the value of the sourceDatacenter property.
     * 
     * @return
     *     possible object is
     *     {@link DatacenterEventArgument }
     *     
     */
    public DatacenterEventArgument getSourceDatacenter() {
        return sourceDatacenter;
    }

    /**
     * Sets the value of the sourceDatacenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatacenterEventArgument }
     *     
     */
    public void setSourceDatacenter(DatacenterEventArgument value) {
        this.sourceDatacenter = value;
    }

    /**
     * Gets the value of the sourceDatastore property.
     * 
     * @return
     *     possible object is
     *     {@link DatastoreEventArgument }
     *     
     */
    public DatastoreEventArgument getSourceDatastore() {
        return sourceDatastore;
    }

    /**
     * Sets the value of the sourceDatastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatastoreEventArgument }
     *     
     */
    public void setSourceDatastore(DatastoreEventArgument value) {
        this.sourceDatastore = value;
    }

}
