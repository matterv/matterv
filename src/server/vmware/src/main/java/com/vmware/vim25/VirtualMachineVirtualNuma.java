
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineVirtualNuma complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineVirtualNuma">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="coresPerNumaNode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="exposeVnumaOnCpuHotadd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineVirtualNuma", propOrder = {
    "coresPerNumaNode",
    "exposeVnumaOnCpuHotadd"
})
public class VirtualMachineVirtualNuma
    extends DynamicData
{

    protected Integer coresPerNumaNode;
    protected Boolean exposeVnumaOnCpuHotadd;

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
     * Gets the value of the exposeVnumaOnCpuHotadd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExposeVnumaOnCpuHotadd() {
        return exposeVnumaOnCpuHotadd;
    }

    /**
     * Sets the value of the exposeVnumaOnCpuHotadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExposeVnumaOnCpuHotadd(Boolean value) {
        this.exposeVnumaOnCpuHotadd = value;
    }

}
