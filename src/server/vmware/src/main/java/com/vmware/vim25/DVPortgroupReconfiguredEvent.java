
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVPortgroupReconfiguredEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVPortgroupReconfiguredEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVPortgroupEvent">
 *       <sequence>
 *         <element name="configSpec" type="{urn:internalvim25}DVPortgroupConfigSpec"/>
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
@XmlType(name = "DVPortgroupReconfiguredEvent", propOrder = {
    "configSpec",
    "configChanges"
})
public class DVPortgroupReconfiguredEvent
    extends DVPortgroupEvent
{

    @XmlElement(required = true)
    protected DVPortgroupConfigSpec configSpec;
    protected ChangesInfoEventArgument configChanges;

    /**
     * Gets the value of the configSpec property.
     * 
     * @return
     *     possible object is
     *     {@link DVPortgroupConfigSpec }
     *     
     */
    public DVPortgroupConfigSpec getConfigSpec() {
        return configSpec;
    }

    /**
     * Sets the value of the configSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPortgroupConfigSpec }
     *     
     */
    public void setConfigSpec(DVPortgroupConfigSpec value) {
        this.configSpec = value;
    }

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
