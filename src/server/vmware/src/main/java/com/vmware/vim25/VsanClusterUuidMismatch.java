
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanClusterUuidMismatch complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanClusterUuidMismatch">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CannotMoveVsanEnabledHost">
 *       <sequence>
 *         <element name="hostClusterUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="destinationClusterUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanClusterUuidMismatch", propOrder = {
    "hostClusterUuid",
    "destinationClusterUuid"
})
public class VsanClusterUuidMismatch
    extends CannotMoveVsanEnabledHost
{

    @XmlElement(required = true)
    protected String hostClusterUuid;
    @XmlElement(required = true)
    protected String destinationClusterUuid;

    /**
     * Gets the value of the hostClusterUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostClusterUuid() {
        return hostClusterUuid;
    }

    /**
     * Sets the value of the hostClusterUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostClusterUuid(String value) {
        this.hostClusterUuid = value;
    }

    /**
     * Gets the value of the destinationClusterUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationClusterUuid() {
        return destinationClusterUuid;
    }

    /**
     * Sets the value of the destinationClusterUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationClusterUuid(String value) {
        this.destinationClusterUuid = value;
    }

}
