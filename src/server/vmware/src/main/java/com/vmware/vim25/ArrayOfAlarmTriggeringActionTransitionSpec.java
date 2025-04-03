
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAlarmTriggeringActionTransitionSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAlarmTriggeringActionTransitionSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AlarmTriggeringActionTransitionSpec" type="{urn:internalvim25}AlarmTriggeringActionTransitionSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlarmTriggeringActionTransitionSpec", propOrder = {
    "alarmTriggeringActionTransitionSpec"
})
public class ArrayOfAlarmTriggeringActionTransitionSpec {

    @XmlElement(name = "AlarmTriggeringActionTransitionSpec")
    protected List<AlarmTriggeringActionTransitionSpec> alarmTriggeringActionTransitionSpec;

    /**
     * Gets the value of the alarmTriggeringActionTransitionSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmTriggeringActionTransitionSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAlarmTriggeringActionTransitionSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmTriggeringActionTransitionSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the alarmTriggeringActionTransitionSpec property.
     */
    public List<AlarmTriggeringActionTransitionSpec> getAlarmTriggeringActionTransitionSpec() {
        if (alarmTriggeringActionTransitionSpec == null) {
            alarmTriggeringActionTransitionSpec = new ArrayList<>();
        }
        return this.alarmTriggeringActionTransitionSpec;
    }

}
