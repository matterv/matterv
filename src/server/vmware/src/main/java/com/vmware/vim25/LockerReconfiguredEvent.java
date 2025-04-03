
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LockerReconfiguredEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LockerReconfiguredEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Event">
 *       <sequence>
 *         <element name="oldDatastore" type="{urn:internalvim25}DatastoreEventArgument" minOccurs="0"/>
 *         <element name="newDatastore" type="{urn:internalvim25}DatastoreEventArgument" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockerReconfiguredEvent", propOrder = {
    "oldDatastore",
    "newDatastore"
})
public class LockerReconfiguredEvent
    extends Event
{

    protected DatastoreEventArgument oldDatastore;
    protected DatastoreEventArgument newDatastore;

    /**
     * Gets the value of the oldDatastore property.
     * 
     * @return
     *     possible object is
     *     {@link DatastoreEventArgument }
     *     
     */
    public DatastoreEventArgument getOldDatastore() {
        return oldDatastore;
    }

    /**
     * Sets the value of the oldDatastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatastoreEventArgument }
     *     
     */
    public void setOldDatastore(DatastoreEventArgument value) {
        this.oldDatastore = value;
    }

    /**
     * Gets the value of the newDatastore property.
     * 
     * @return
     *     possible object is
     *     {@link DatastoreEventArgument }
     *     
     */
    public DatastoreEventArgument getNewDatastore() {
        return newDatastore;
    }

    /**
     * Sets the value of the newDatastore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatastoreEventArgument }
     *     
     */
    public void setNewDatastore(DatastoreEventArgument value) {
        this.newDatastore = value;
    }

}
