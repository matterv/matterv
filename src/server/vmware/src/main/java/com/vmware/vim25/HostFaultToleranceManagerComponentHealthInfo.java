
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFaultToleranceManagerComponentHealthInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostFaultToleranceManagerComponentHealthInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="isStorageHealthy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isNetworkHealthy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFaultToleranceManagerComponentHealthInfo", propOrder = {
    "isStorageHealthy",
    "isNetworkHealthy"
})
public class HostFaultToleranceManagerComponentHealthInfo
    extends DynamicData
{

    protected boolean isStorageHealthy;
    protected boolean isNetworkHealthy;

    /**
     * Gets the value of the isStorageHealthy property.
     * 
     */
    public boolean isIsStorageHealthy() {
        return isStorageHealthy;
    }

    /**
     * Sets the value of the isStorageHealthy property.
     * 
     */
    public void setIsStorageHealthy(boolean value) {
        this.isStorageHealthy = value;
    }

    /**
     * Gets the value of the isNetworkHealthy property.
     * 
     */
    public boolean isIsNetworkHealthy() {
        return isNetworkHealthy;
    }

    /**
     * Sets the value of the isNetworkHealthy property.
     * 
     */
    public void setIsNetworkHealthy(boolean value) {
        this.isNetworkHealthy = value;
    }

}
