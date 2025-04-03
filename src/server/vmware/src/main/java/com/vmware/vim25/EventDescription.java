
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EventDescription">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="category" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="eventInfo" type="{urn:internalvim25}EventDescriptionEventDetail" maxOccurs="unbounded"/>
 *         <element name="enumeratedTypes" type="{urn:internalvim25}EnumDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDescription", propOrder = {
    "category",
    "eventInfo",
    "enumeratedTypes"
})
public class EventDescription
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<ElementDescription> category;
    @XmlElement(required = true)
    protected List<EventDescriptionEventDetail> eventInfo;
    protected List<EnumDescription> enumeratedTypes;

    /**
     * Gets the value of the category property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the category property.
     */
    public List<ElementDescription> getCategory() {
        if (category == null) {
            category = new ArrayList<>();
        }
        return this.category;
    }

    /**
     * Gets the value of the eventInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEventInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDescriptionEventDetail }
     * </p>
     * 
     * 
     * @return
     *     The value of the eventInfo property.
     */
    public List<EventDescriptionEventDetail> getEventInfo() {
        if (eventInfo == null) {
            eventInfo = new ArrayList<>();
        }
        return this.eventInfo;
    }

    /**
     * Gets the value of the enumeratedTypes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumeratedTypes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEnumeratedTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the enumeratedTypes property.
     */
    public List<EnumDescription> getEnumeratedTypes() {
        if (enumeratedTypes == null) {
            enumeratedTypes = new ArrayList<>();
        }
        return this.enumeratedTypes;
    }

}
