
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualPCNet32Option complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualPCNet32Option">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualEthernetCardOption">
 *       <sequence>
 *         <element name="supportsMorphing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCNet32Option", propOrder = {
    "supportsMorphing"
})
public class VirtualPCNet32Option
    extends VirtualEthernetCardOption
{

    protected boolean supportsMorphing;

    /**
     * Gets the value of the supportsMorphing property.
     * 
     */
    public boolean isSupportsMorphing() {
        return supportsMorphing;
    }

    /**
     * Sets the value of the supportsMorphing property.
     * 
     */
    public void setSupportsMorphing(boolean value) {
        this.supportsMorphing = value;
    }

}
