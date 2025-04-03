
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaskDescription">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="methodInfo" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="state" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="reason" type="{urn:internalvim25}TypeDescription" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskDescription", propOrder = {
    "methodInfo",
    "state",
    "reason"
})
public class TaskDescription
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<ElementDescription> methodInfo;
    @XmlElement(required = true)
    protected List<ElementDescription> state;
    @XmlElement(required = true)
    protected List<TypeDescription> reason;

    /**
     * Gets the value of the methodInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMethodInfo().add(newItem);
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
     *     The value of the methodInfo property.
     */
    public List<ElementDescription> getMethodInfo() {
        if (methodInfo == null) {
            methodInfo = new ArrayList<>();
        }
        return this.methodInfo;
    }

    /**
     * Gets the value of the state property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getState().add(newItem);
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
     *     The value of the state property.
     */
    public List<ElementDescription> getState() {
        if (state == null) {
            state = new ArrayList<>();
        }
        return this.state;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the reason property.
     */
    public List<TypeDescription> getReason() {
        if (reason == null) {
            reason = new ArrayList<>();
        }
        return this.reason;
    }

}
