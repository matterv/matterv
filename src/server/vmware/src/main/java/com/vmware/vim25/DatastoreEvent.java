
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatastoreEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatastoreEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Event">
 *       <sequence>
 *         <element name="datastore" type="{urn:internalvim25}DatastoreEventArgument" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreEvent", propOrder = {
    "datastore"
})
@XmlSeeAlso({
    DatastoreDestroyedEvent.class,
    DatastoreRenamedEvent.class,
    DatastoreCapacityIncreasedEvent.class,
    DatastoreDuplicatedEvent.class,
    DatastoreFileEvent.class,
    NonVIWorkloadDetectedOnDatastoreEvent.class,
    DatastoreIORMReconfiguredEvent.class
})
public class DatastoreEvent
    extends Event
{

    protected DatastoreEventArgument datastore;

    /**
     * Gets the value of the datastore property.
     * 
     * @return
     *     possible object is
     *     {@link DatastoreEventArgument }
     *     
     */
    public DatastoreEventArgument getDatastore() {
        return datastore;
    }

    /**
     * Sets the value of the datastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatastoreEventArgument }
     *     
     */
    public void setDatastore(DatastoreEventArgument value) {
        this.datastore = value;
    }

}
