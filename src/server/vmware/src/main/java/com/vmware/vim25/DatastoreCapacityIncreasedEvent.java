
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatastoreCapacityIncreasedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatastoreCapacityIncreasedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DatastoreEvent">
 *       <sequence>
 *         <element name="oldCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="newCapacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreCapacityIncreasedEvent", propOrder = {
    "oldCapacity",
    "newCapacity"
})
public class DatastoreCapacityIncreasedEvent
    extends DatastoreEvent
{

    protected long oldCapacity;
    protected long newCapacity;

    /**
     * Gets the value of the oldCapacity property.
     * 
     */
    public long getOldCapacity() {
        return oldCapacity;
    }

    /**
     * Sets the value of the oldCapacity property.
     * 
     */
    public void setOldCapacity(long value) {
        this.oldCapacity = value;
    }

    /**
     * Gets the value of the newCapacity property.
     * 
     */
    public long getNewCapacity() {
        return newCapacity;
    }

    /**
     * Sets the value of the newCapacity property.
     * 
     */
    public void setNewCapacity(long value) {
        this.newCapacity = value;
    }

}
