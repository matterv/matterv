
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupAlarmAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GroupAlarmAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}AlarmAction">
 *       <sequence>
 *         <element name="action" type="{urn:internalvim25}AlarmAction" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupAlarmAction", propOrder = {
    "action"
})
public class GroupAlarmAction
    extends AlarmAction
{

    @XmlElement(required = true)
    protected List<AlarmAction> action;

    /**
     * Gets the value of the action property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmAction }
     * </p>
     * 
     * 
     * @return
     *     The value of the action property.
     */
    public List<AlarmAction> getAction() {
        if (action == null) {
            action = new ArrayList<>();
        }
        return this.action;
    }

}
