
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityEventArgument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EntityEventArgument">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}EventArgument">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityEventArgument", propOrder = {
    "name"
})
@XmlSeeAlso({
    ManagedEntityEventArgument.class,
    FolderEventArgument.class,
    DatacenterEventArgument.class,
    ComputeResourceEventArgument.class,
    ResourcePoolEventArgument.class,
    HostEventArgument.class,
    VmEventArgument.class,
    DatastoreEventArgument.class,
    NetworkEventArgument.class,
    AlarmEventArgument.class,
    ScheduledTaskEventArgument.class,
    DvsEventArgument.class
})
public class EntityEventArgument
    extends EventArgument
{

    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
