
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmBeingClonedEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmBeingClonedEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmCloneEvent">
 *       <sequence>
 *         <element name="destFolder" type="{urn:internalvim25}FolderEventArgument"/>
 *         <element name="destName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="destHost" type="{urn:internalvim25}HostEventArgument"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmBeingClonedEvent", propOrder = {
    "destFolder",
    "destName",
    "destHost"
})
public class VmBeingClonedEvent
    extends VmCloneEvent
{

    @XmlElement(required = true)
    protected FolderEventArgument destFolder;
    @XmlElement(required = true)
    protected String destName;
    @XmlElement(required = true)
    protected HostEventArgument destHost;

    /**
     * Gets the value of the destFolder property.
     * 
     * @return
     *     possible object is
     *     {@link FolderEventArgument }
     *     
     */
    public FolderEventArgument getDestFolder() {
        return destFolder;
    }

    /**
     * Sets the value of the destFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderEventArgument }
     *     
     */
    public void setDestFolder(FolderEventArgument value) {
        this.destFolder = value;
    }

    /**
     * Gets the value of the destName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestName() {
        return destName;
    }

    /**
     * Sets the value of the destName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestName(String value) {
        this.destName = value;
    }

    /**
     * Gets the value of the destHost property.
     * 
     * @return
     *     possible object is
     *     {@link HostEventArgument }
     *     
     */
    public HostEventArgument getDestHost() {
        return destHost;
    }

    /**
     * Sets the value of the destHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostEventArgument }
     *     
     */
    public void setDestHost(HostEventArgument value) {
        this.destHost = value;
    }

}
