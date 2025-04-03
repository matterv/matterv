
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsSingleIpPort complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsSingleIpPort">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsIpPort">
 *       <sequence>
 *         <element name="portNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsSingleIpPort", propOrder = {
    "portNumber"
})
public class DvsSingleIpPort
    extends DvsIpPort
{

    protected int portNumber;

    /**
     * Gets the value of the portNumber property.
     * 
     */
    public int getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     * 
     */
    public void setPortNumber(int value) {
        this.portNumber = value;
    }

}
