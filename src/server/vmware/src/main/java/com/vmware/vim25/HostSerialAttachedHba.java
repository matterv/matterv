
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSerialAttachedHba complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSerialAttachedHba">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostHostBusAdapter">
 *       <sequence>
 *         <element name="nodeWorldWideName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSerialAttachedHba", propOrder = {
    "nodeWorldWideName"
})
public class HostSerialAttachedHba
    extends HostHostBusAdapter
{

    @XmlElement(required = true)
    protected String nodeWorldWideName;

    /**
     * Gets the value of the nodeWorldWideName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeWorldWideName() {
        return nodeWorldWideName;
    }

    /**
     * Sets the value of the nodeWorldWideName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeWorldWideName(String value) {
        this.nodeWorldWideName = value;
    }

}
