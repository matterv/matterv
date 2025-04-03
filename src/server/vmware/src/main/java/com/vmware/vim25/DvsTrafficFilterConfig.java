
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsTrafficFilterConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsTrafficFilterConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsFilterConfig">
 *       <sequence>
 *         <element name="trafficRuleset" type="{urn:internalvim25}DvsTrafficRuleset" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsTrafficFilterConfig", propOrder = {
    "trafficRuleset"
})
@XmlSeeAlso({
    DvsTrafficFilterConfigSpec.class
})
public class DvsTrafficFilterConfig
    extends DvsFilterConfig
{

    protected DvsTrafficRuleset trafficRuleset;

    /**
     * Gets the value of the trafficRuleset property.
     * 
     * @return
     *     possible object is
     *     {@link DvsTrafficRuleset }
     *     
     */
    public DvsTrafficRuleset getTrafficRuleset() {
        return trafficRuleset;
    }

    /**
     * Sets the value of the trafficRuleset property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvsTrafficRuleset }
     *     
     */
    public void setTrafficRuleset(DvsTrafficRuleset value) {
        this.trafficRuleset = value;
    }

}
