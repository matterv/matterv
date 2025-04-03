
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualVmxnet3Option complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualVmxnet3Option">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualVmxnetOption">
 *       <sequence>
 *         <element name="uptv2Enabled" type="{urn:internalvim25}BoolOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVmxnet3Option", propOrder = {
    "uptv2Enabled"
})
@XmlSeeAlso({
    VirtualVmxnet3VrdmaOption.class
})
public class VirtualVmxnet3Option
    extends VirtualVmxnetOption
{

    protected BoolOption uptv2Enabled;

    /**
     * Gets the value of the uptv2Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link BoolOption }
     *     
     */
    public BoolOption getUptv2Enabled() {
        return uptv2Enabled;
    }

    /**
     * Sets the value of the uptv2Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoolOption }
     *     
     */
    public void setUptv2Enabled(BoolOption value) {
        this.uptv2Enabled = value;
    }

}
