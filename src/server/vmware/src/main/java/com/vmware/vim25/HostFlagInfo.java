
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFlagInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostFlagInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="backgroundSnapshotsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFlagInfo", propOrder = {
    "backgroundSnapshotsEnabled"
})
public class HostFlagInfo
    extends DynamicData
{

    protected Boolean backgroundSnapshotsEnabled;

    /**
     * Gets the value of the backgroundSnapshotsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackgroundSnapshotsEnabled() {
        return backgroundSnapshotsEnabled;
    }

    /**
     * Sets the value of the backgroundSnapshotsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackgroundSnapshotsEnabled(Boolean value) {
        this.backgroundSnapshotsEnabled = value;
    }

}
