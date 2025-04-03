
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmWwnChangedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmWwnChangedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="oldNodeWwns" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="oldPortWwns" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="newNodeWwns" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="newPortWwns" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmWwnChangedEvent", propOrder = {
    "oldNodeWwns",
    "oldPortWwns",
    "newNodeWwns",
    "newPortWwns"
})
public class VmWwnChangedEvent
    extends VmEvent
{

    @XmlElement(type = Long.class)
    protected List<Long> oldNodeWwns;
    @XmlElement(type = Long.class)
    protected List<Long> oldPortWwns;
    @XmlElement(type = Long.class)
    protected List<Long> newNodeWwns;
    @XmlElement(type = Long.class)
    protected List<Long> newPortWwns;

    /**
     * Gets the value of the oldNodeWwns property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oldNodeWwns property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOldNodeWwns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * </p>
     * 
     * 
     * @return
     *     The value of the oldNodeWwns property.
     */
    public List<Long> getOldNodeWwns() {
        if (oldNodeWwns == null) {
            oldNodeWwns = new ArrayList<>();
        }
        return this.oldNodeWwns;
    }

    /**
     * Gets the value of the oldPortWwns property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oldPortWwns property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOldPortWwns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * </p>
     * 
     * 
     * @return
     *     The value of the oldPortWwns property.
     */
    public List<Long> getOldPortWwns() {
        if (oldPortWwns == null) {
            oldPortWwns = new ArrayList<>();
        }
        return this.oldPortWwns;
    }

    /**
     * Gets the value of the newNodeWwns property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newNodeWwns property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNewNodeWwns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * </p>
     * 
     * 
     * @return
     *     The value of the newNodeWwns property.
     */
    public List<Long> getNewNodeWwns() {
        if (newNodeWwns == null) {
            newNodeWwns = new ArrayList<>();
        }
        return this.newNodeWwns;
    }

    /**
     * Gets the value of the newPortWwns property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newPortWwns property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNewPortWwns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * </p>
     * 
     * 
     * @return
     *     The value of the newPortWwns property.
     */
    public List<Long> getNewPortWwns() {
        if (newPortWwns == null) {
            newPortWwns = new ArrayList<>();
        }
        return this.newPortWwns;
    }

}
