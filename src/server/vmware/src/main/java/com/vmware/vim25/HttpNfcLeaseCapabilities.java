
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HttpNfcLeaseCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HttpNfcLeaseCapabilities">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="pullModeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="corsSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseCapabilities", propOrder = {
    "pullModeSupported",
    "corsSupported"
})
public class HttpNfcLeaseCapabilities
    extends DynamicData
{

    protected boolean pullModeSupported;
    protected boolean corsSupported;

    /**
     * Gets the value of the pullModeSupported property.
     * 
     */
    public boolean isPullModeSupported() {
        return pullModeSupported;
    }

    /**
     * Sets the value of the pullModeSupported property.
     * 
     */
    public void setPullModeSupported(boolean value) {
        this.pullModeSupported = value;
    }

    /**
     * Gets the value of the corsSupported property.
     * 
     */
    public boolean isCorsSupported() {
        return corsSupported;
    }

    /**
     * Sets the value of the corsSupported property.
     * 
     */
    public void setCorsSupported(boolean value) {
        this.corsSupported = value;
    }

}
