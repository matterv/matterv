
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostProxySwitchEnsInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostProxySwitchEnsInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="opsVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="numPSOps" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="numLcoreOps" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="errorStatus" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="lcoreStatus" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProxySwitchEnsInfo", propOrder = {
    "opsVersion",
    "numPSOps",
    "numLcoreOps",
    "errorStatus",
    "lcoreStatus"
})
public class HostProxySwitchEnsInfo
    extends DynamicData
{

    protected long opsVersion;
    protected long numPSOps;
    protected long numLcoreOps;
    protected long errorStatus;
    protected long lcoreStatus;

    /**
     * Gets the value of the opsVersion property.
     * 
     */
    public long getOpsVersion() {
        return opsVersion;
    }

    /**
     * Sets the value of the opsVersion property.
     * 
     */
    public void setOpsVersion(long value) {
        this.opsVersion = value;
    }

    /**
     * Gets the value of the numPSOps property.
     * 
     */
    public long getNumPSOps() {
        return numPSOps;
    }

    /**
     * Sets the value of the numPSOps property.
     * 
     */
    public void setNumPSOps(long value) {
        this.numPSOps = value;
    }

    /**
     * Gets the value of the numLcoreOps property.
     * 
     */
    public long getNumLcoreOps() {
        return numLcoreOps;
    }

    /**
     * Sets the value of the numLcoreOps property.
     * 
     */
    public void setNumLcoreOps(long value) {
        this.numLcoreOps = value;
    }

    /**
     * Gets the value of the errorStatus property.
     * 
     */
    public long getErrorStatus() {
        return errorStatus;
    }

    /**
     * Sets the value of the errorStatus property.
     * 
     */
    public void setErrorStatus(long value) {
        this.errorStatus = value;
    }

    /**
     * Gets the value of the lcoreStatus property.
     * 
     */
    public long getLcoreStatus() {
        return lcoreStatus;
    }

    /**
     * Sets the value of the lcoreStatus property.
     * 
     */
    public void setLcoreStatus(long value) {
        this.lcoreStatus = value;
    }

}
