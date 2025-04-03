
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostAutoStartManagerConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostAutoStartManagerConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="defaults" type="{urn:internalvim25}AutoStartDefaults" minOccurs="0"/>
 *         <element name="powerInfo" type="{urn:internalvim25}AutoStartPowerInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAutoStartManagerConfig", propOrder = {
    "defaults",
    "powerInfo"
})
public class HostAutoStartManagerConfig
    extends DynamicData
{

    protected AutoStartDefaults defaults;
    protected List<AutoStartPowerInfo> powerInfo;

    /**
     * Gets the value of the defaults property.
     * 
     * @return
     *     possible object is
     *     {@link AutoStartDefaults }
     *     
     */
    public AutoStartDefaults getDefaults() {
        return defaults;
    }

    /**
     * Sets the value of the defaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoStartDefaults }
     *     
     */
    public void setDefaults(AutoStartDefaults value) {
        this.defaults = value;
    }

    /**
     * Gets the value of the powerInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPowerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoStartPowerInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the powerInfo property.
     */
    public List<AutoStartPowerInfo> getPowerInfo() {
        if (powerInfo == null) {
            powerInfo = new ArrayList<>();
        }
        return this.powerInfo;
    }

}
