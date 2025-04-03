
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="storageAPDSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="storagePDLSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo", propOrder = {
    "storageAPDSupported",
    "storagePDLSupported"
})
public class ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo
    extends DynamicData
{

    protected boolean storageAPDSupported;
    protected boolean storagePDLSupported;

    /**
     * Gets the value of the storageAPDSupported property.
     * 
     */
    public boolean isStorageAPDSupported() {
        return storageAPDSupported;
    }

    /**
     * Sets the value of the storageAPDSupported property.
     * 
     */
    public void setStorageAPDSupported(boolean value) {
        this.storageAPDSupported = value;
    }

    /**
     * Gets the value of the storagePDLSupported property.
     * 
     */
    public boolean isStoragePDLSupported() {
        return storagePDLSupported;
    }

    /**
     * Sets the value of the storagePDLSupported property.
     * 
     */
    public void setStoragePDLSupported(boolean value) {
        this.storagePDLSupported = value;
    }

}
