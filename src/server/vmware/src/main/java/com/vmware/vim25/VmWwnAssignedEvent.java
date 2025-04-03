
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmWwnAssignedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmWwnAssignedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
 *       <sequence>
 *         <element name="nodeWwns" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *         <element name="portWwns" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmWwnAssignedEvent", propOrder = {
    "nodeWwns",
    "portWwns"
})
public class VmWwnAssignedEvent
    extends VmEvent
{

    @XmlElement(type = Long.class)
    protected List<Long> nodeWwns;
    @XmlElement(type = Long.class)
    protected List<Long> portWwns;

    /**
     * Gets the value of the nodeWwns property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeWwns property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNodeWwns().add(newItem);
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
     *     The value of the nodeWwns property.
     */
    public List<Long> getNodeWwns() {
        if (nodeWwns == null) {
            nodeWwns = new ArrayList<>();
        }
        return this.nodeWwns;
    }

    /**
     * Gets the value of the portWwns property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portWwns property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPortWwns().add(newItem);
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
     *     The value of the portWwns property.
     */
    public List<Long> getPortWwns() {
        if (portWwns == null) {
            portWwns = new ArrayList<>();
        }
        return this.portWwns;
    }

}
