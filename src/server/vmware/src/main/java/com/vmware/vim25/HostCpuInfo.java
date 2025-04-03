
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostCpuInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostCpuInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="numCpuPackages" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="numCpuCores" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="numCpuThreads" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="hz" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCpuInfo", propOrder = {
    "numCpuPackages",
    "numCpuCores",
    "numCpuThreads",
    "hz"
})
public class HostCpuInfo
    extends DynamicData
{

    protected short numCpuPackages;
    protected short numCpuCores;
    protected short numCpuThreads;
    protected long hz;

    /**
     * Gets the value of the numCpuPackages property.
     * 
     */
    public short getNumCpuPackages() {
        return numCpuPackages;
    }

    /**
     * Sets the value of the numCpuPackages property.
     * 
     */
    public void setNumCpuPackages(short value) {
        this.numCpuPackages = value;
    }

    /**
     * Gets the value of the numCpuCores property.
     * 
     */
    public short getNumCpuCores() {
        return numCpuCores;
    }

    /**
     * Sets the value of the numCpuCores property.
     * 
     */
    public void setNumCpuCores(short value) {
        this.numCpuCores = value;
    }

    /**
     * Gets the value of the numCpuThreads property.
     * 
     */
    public short getNumCpuThreads() {
        return numCpuThreads;
    }

    /**
     * Sets the value of the numCpuThreads property.
     * 
     */
    public void setNumCpuThreads(short value) {
        this.numCpuThreads = value;
    }

    /**
     * Gets the value of the hz property.
     * 
     */
    public long getHz() {
        return hz;
    }

    /**
     * Sets the value of the hz property.
     * 
     */
    public void setHz(long value) {
        this.hz = value;
    }

}
