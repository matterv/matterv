
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualVmxnet3 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualVmxnet3">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualVmxnet">
 *       <sequence>
 *         <element name="uptv2Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVmxnet3", propOrder = {
    "uptv2Enabled"
})
@XmlSeeAlso({
    VirtualVmxnet3Vrdma.class
})
public class VirtualVmxnet3
    extends VirtualVmxnet
{

    protected Boolean uptv2Enabled;

    /**
     * Gets the value of the uptv2Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUptv2Enabled() {
        return uptv2Enabled;
    }

    /**
     * Sets the value of the uptv2Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUptv2Enabled(Boolean value) {
        this.uptv2Enabled = value;
    }

}
