
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVirtualNumaInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVirtualNumaInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="coresPerNumaNode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="autoCoresPerNumaNode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vnumaOnCpuHotaddExposed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVirtualNumaInfo", propOrder = {
    "coresPerNumaNode",
    "autoCoresPerNumaNode",
    "vnumaOnCpuHotaddExposed"
})
public class VirtualMachineVirtualNumaInfo
    extends DynamicData
{

    protected Integer coresPerNumaNode;
    protected Boolean autoCoresPerNumaNode;
    protected Boolean vnumaOnCpuHotaddExposed;

    /**
     * Gets the value of the coresPerNumaNode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoresPerNumaNode() {
        return coresPerNumaNode;
    }

    /**
     * Sets the value of the coresPerNumaNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoresPerNumaNode(Integer value) {
        this.coresPerNumaNode = value;
    }

    /**
     * Gets the value of the autoCoresPerNumaNode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCoresPerNumaNode() {
        return autoCoresPerNumaNode;
    }

    /**
     * Sets the value of the autoCoresPerNumaNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCoresPerNumaNode(Boolean value) {
        this.autoCoresPerNumaNode = value;
    }

    /**
     * Gets the value of the vnumaOnCpuHotaddExposed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVnumaOnCpuHotaddExposed() {
        return vnumaOnCpuHotaddExposed;
    }

    /**
     * Sets the value of the vnumaOnCpuHotaddExposed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVnumaOnCpuHotaddExposed(Boolean value) {
        this.vnumaOnCpuHotaddExposed = value;
    }

}
