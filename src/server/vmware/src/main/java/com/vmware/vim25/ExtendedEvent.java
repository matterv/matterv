
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtendedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}GeneralEvent">
 *       <sequence>
 *         <element name="eventTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="managedObject" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="data" type="{urn:internalvim25}ExtendedEventPair" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedEvent", propOrder = {
    "eventTypeId",
    "managedObject",
    "data"
})
public class ExtendedEvent
    extends GeneralEvent
{

    @XmlElement(required = true)
    protected String eventTypeId;
    @XmlElement(required = true)
    protected ManagedObjectReference managedObject;
    protected List<ExtendedEventPair> data;

    /**
     * Gets the value of the eventTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTypeId() {
        return eventTypeId;
    }

    /**
     * Sets the value of the eventTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTypeId(String value) {
        this.eventTypeId = value;
    }

    /**
     * Gets the value of the managedObject property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getManagedObject() {
        return managedObject;
    }

    /**
     * Sets the value of the managedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setManagedObject(ManagedObjectReference value) {
        this.managedObject = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedEventPair }
     * </p>
     * 
     * 
     * @return
     *     The value of the data property.
     */
    public List<ExtendedEventPair> getData() {
        if (data == null) {
            data = new ArrayList<>();
        }
        return this.data;
    }

}
