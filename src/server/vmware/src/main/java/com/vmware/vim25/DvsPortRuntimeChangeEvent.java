
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsPortRuntimeChangeEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsPortRuntimeChangeEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsEvent">
 *       <sequence>
 *         <element name="portKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="runtimeInfo" type="{urn:internalvim25}DVPortStatus"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortRuntimeChangeEvent", propOrder = {
    "portKey",
    "runtimeInfo"
})
public class DvsPortRuntimeChangeEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected String portKey;
    @XmlElement(required = true)
    protected DVPortStatus runtimeInfo;

    /**
     * Gets the value of the portKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortKey() {
        return portKey;
    }

    /**
     * Sets the value of the portKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortKey(String value) {
        this.portKey = value;
    }

    /**
     * Gets the value of the runtimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DVPortStatus }
     *     
     */
    public DVPortStatus getRuntimeInfo() {
        return runtimeInfo;
    }

    /**
     * Sets the value of the runtimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPortStatus }
     *     
     */
    public void setRuntimeInfo(DVPortStatus value) {
        this.runtimeInfo = value;
    }

}
