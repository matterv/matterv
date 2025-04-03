
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduledTaskReconfiguredEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScheduledTaskReconfiguredEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ScheduledTaskEvent">
 *       <sequence>
 *         <element name="configChanges" type="{urn:internalvim25}ChangesInfoEventArgument" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskReconfiguredEvent", propOrder = {
    "configChanges"
})
public class ScheduledTaskReconfiguredEvent
    extends ScheduledTaskEvent
{

    protected ChangesInfoEventArgument configChanges;

    /**
     * Gets the value of the configChanges property.
     * 
     * @return
     *     possible object is
     *     {@link ChangesInfoEventArgument }
     *     
     */
    public ChangesInfoEventArgument getConfigChanges() {
        return configChanges;
    }

    /**
     * Sets the value of the configChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangesInfoEventArgument }
     *     
     */
    public void setConfigChanges(ChangesInfoEventArgument value) {
        this.configChanges = value;
    }

}
