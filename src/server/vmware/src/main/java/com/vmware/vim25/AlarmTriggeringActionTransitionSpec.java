
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlarmTriggeringActionTransitionSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AlarmTriggeringActionTransitionSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="startState" type="{urn:internalvim25}ManagedEntityStatus"/>
 *         <element name="finalState" type="{urn:internalvim25}ManagedEntityStatus"/>
 *         <element name="repeats" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmTriggeringActionTransitionSpec", propOrder = {
    "startState",
    "finalState",
    "repeats"
})
public class AlarmTriggeringActionTransitionSpec
    extends DynamicData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ManagedEntityStatus startState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ManagedEntityStatus finalState;
    protected boolean repeats;

    /**
     * Gets the value of the startState property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public ManagedEntityStatus getStartState() {
        return startState;
    }

    /**
     * Sets the value of the startState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public void setStartState(ManagedEntityStatus value) {
        this.startState = value;
    }

    /**
     * Gets the value of the finalState property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public ManagedEntityStatus getFinalState() {
        return finalState;
    }

    /**
     * Sets the value of the finalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedEntityStatus }
     *     
     */
    public void setFinalState(ManagedEntityStatus value) {
        this.finalState = value;
    }

    /**
     * Gets the value of the repeats property.
     * 
     */
    public boolean isRepeats() {
        return repeats;
    }

    /**
     * Sets the value of the repeats property.
     * 
     */
    public void setRepeats(boolean value) {
        this.repeats = value;
    }

}
