
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumVirtualCpusExceedsLimit complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NumVirtualCpusExceedsLimit">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InsufficientResourcesFault">
 *       <sequence>
 *         <element name="maxSupportedVcpus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumVirtualCpusExceedsLimit", propOrder = {
    "maxSupportedVcpus"
})
public class NumVirtualCpusExceedsLimit
    extends InsufficientResourcesFault
{

    protected int maxSupportedVcpus;

    /**
     * Gets the value of the maxSupportedVcpus property.
     * 
     */
    public int getMaxSupportedVcpus() {
        return maxSupportedVcpus;
    }

    /**
     * Sets the value of the maxSupportedVcpus property.
     * 
     */
    public void setMaxSupportedVcpus(int value) {
        this.maxSupportedVcpus = value;
    }

}
