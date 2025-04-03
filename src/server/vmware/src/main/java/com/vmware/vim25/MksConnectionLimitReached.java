
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MksConnectionLimitReached complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MksConnectionLimitReached">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}InvalidState">
 *       <sequence>
 *         <element name="connectionLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MksConnectionLimitReached", propOrder = {
    "connectionLimit"
})
public class MksConnectionLimitReached
    extends InvalidState
{

    protected int connectionLimit;

    /**
     * Gets the value of the connectionLimit property.
     * 
     */
    public int getConnectionLimit() {
        return connectionLimit;
    }

    /**
     * Sets the value of the connectionLimit property.
     * 
     */
    public void setConnectionLimit(int value) {
        this.connectionLimit = value;
    }

}
