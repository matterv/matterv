
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTpmDigestInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTpmDigestInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostDigestInfo">
 *       <sequence>
 *         <element name="pcrNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmDigestInfo", propOrder = {
    "pcrNumber"
})
public class HostTpmDigestInfo
    extends HostDigestInfo
{

    protected int pcrNumber;

    /**
     * Gets the value of the pcrNumber property.
     * 
     */
    public int getPcrNumber() {
        return pcrNumber;
    }

    /**
     * Sets the value of the pcrNumber property.
     * 
     */
    public void setPcrNumber(int value) {
        this.pcrNumber = value;
    }

}
