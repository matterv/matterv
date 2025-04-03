
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsMergedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsMergedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsEvent">
 *       <sequence>
 *         <element name="sourceDvs" type="{urn:internalvim25}DvsEventArgument"/>
 *         <element name="destinationDvs" type="{urn:internalvim25}DvsEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsMergedEvent", propOrder = {
    "sourceDvs",
    "destinationDvs"
})
public class DvsMergedEvent
    extends DvsEvent
{

    @XmlElement(required = true)
    protected DvsEventArgument sourceDvs;
    @XmlElement(required = true)
    protected DvsEventArgument destinationDvs;

    /**
     * Gets the value of the sourceDvs property.
     * 
     * @return
     *     possible object is
     *     {@link DvsEventArgument }
     *     
     */
    public DvsEventArgument getSourceDvs() {
        return sourceDvs;
    }

    /**
     * Sets the value of the sourceDvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvsEventArgument }
     *     
     */
    public void setSourceDvs(DvsEventArgument value) {
        this.sourceDvs = value;
    }

    /**
     * Gets the value of the destinationDvs property.
     * 
     * @return
     *     possible object is
     *     {@link DvsEventArgument }
     *     
     */
    public DvsEventArgument getDestinationDvs() {
        return destinationDvs;
    }

    /**
     * Sets the value of the destinationDvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvsEventArgument }
     *     
     */
    public void setDestinationDvs(DvsEventArgument value) {
        this.destinationDvs = value;
    }

}
