
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HttpNfcLeaseProbeResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HttpNfcLeaseProbeResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="serverAccessible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseProbeResult", propOrder = {
    "serverAccessible"
})
public class HttpNfcLeaseProbeResult
    extends DynamicData
{

    protected boolean serverAccessible;

    /**
     * Gets the value of the serverAccessible property.
     * 
     */
    public boolean isServerAccessible() {
        return serverAccessible;
    }

    /**
     * Sets the value of the serverAccessible property.
     * 
     */
    public void setServerAccessible(boolean value) {
        this.serverAccessible = value;
    }

}
