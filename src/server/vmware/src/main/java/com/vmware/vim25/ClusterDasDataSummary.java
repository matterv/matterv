
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterDasDataSummary complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterDasDataSummary">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterDasData">
 *       <sequence>
 *         <element name="hostListVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="clusterConfigVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="compatListVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasDataSummary", propOrder = {
    "hostListVersion",
    "clusterConfigVersion",
    "compatListVersion"
})
public class ClusterDasDataSummary
    extends ClusterDasData
{

    protected long hostListVersion;
    protected long clusterConfigVersion;
    protected long compatListVersion;

    /**
     * Gets the value of the hostListVersion property.
     * 
     */
    public long getHostListVersion() {
        return hostListVersion;
    }

    /**
     * Sets the value of the hostListVersion property.
     * 
     */
    public void setHostListVersion(long value) {
        this.hostListVersion = value;
    }

    /**
     * Gets the value of the clusterConfigVersion property.
     * 
     */
    public long getClusterConfigVersion() {
        return clusterConfigVersion;
    }

    /**
     * Sets the value of the clusterConfigVersion property.
     * 
     */
    public void setClusterConfigVersion(long value) {
        this.clusterConfigVersion = value;
    }

    /**
     * Gets the value of the compatListVersion property.
     * 
     */
    public long getCompatListVersion() {
        return compatListVersion;
    }

    /**
     * Sets the value of the compatListVersion property.
     * 
     */
    public void setCompatListVersion(long value) {
        this.compatListVersion = value;
    }

}
