
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostForceMountedInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostForceMountedInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="persist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mounted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostForceMountedInfo", propOrder = {
    "persist",
    "mounted"
})
public class HostForceMountedInfo
    extends DynamicData
{

    protected boolean persist;
    protected boolean mounted;

    /**
     * Gets the value of the persist property.
     * 
     */
    public boolean isPersist() {
        return persist;
    }

    /**
     * Sets the value of the persist property.
     * 
     */
    public void setPersist(boolean value) {
        this.persist = value;
    }

    /**
     * Gets the value of the mounted property.
     * 
     */
    public boolean isMounted() {
        return mounted;
    }

    /**
     * Sets the value of the mounted property.
     * 
     */
    public void setMounted(boolean value) {
        this.mounted = value;
    }

}
