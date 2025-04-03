
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostSharedGpuCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostSharedGpuCapabilities">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vgpu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="diskSnapshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="memorySnapshotSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="suspendSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="migrateSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSharedGpuCapabilities", propOrder = {
    "vgpu",
    "diskSnapshotSupported",
    "memorySnapshotSupported",
    "suspendSupported",
    "migrateSupported"
})
public class HostSharedGpuCapabilities
    extends DynamicData
{

    @XmlElement(required = true)
    protected String vgpu;
    protected boolean diskSnapshotSupported;
    protected boolean memorySnapshotSupported;
    protected boolean suspendSupported;
    protected boolean migrateSupported;

    /**
     * Gets the value of the vgpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVgpu() {
        return vgpu;
    }

    /**
     * Sets the value of the vgpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVgpu(String value) {
        this.vgpu = value;
    }

    /**
     * Gets the value of the diskSnapshotSupported property.
     * 
     */
    public boolean isDiskSnapshotSupported() {
        return diskSnapshotSupported;
    }

    /**
     * Sets the value of the diskSnapshotSupported property.
     * 
     */
    public void setDiskSnapshotSupported(boolean value) {
        this.diskSnapshotSupported = value;
    }

    /**
     * Gets the value of the memorySnapshotSupported property.
     * 
     */
    public boolean isMemorySnapshotSupported() {
        return memorySnapshotSupported;
    }

    /**
     * Sets the value of the memorySnapshotSupported property.
     * 
     */
    public void setMemorySnapshotSupported(boolean value) {
        this.memorySnapshotSupported = value;
    }

    /**
     * Gets the value of the suspendSupported property.
     * 
     */
    public boolean isSuspendSupported() {
        return suspendSupported;
    }

    /**
     * Sets the value of the suspendSupported property.
     * 
     */
    public void setSuspendSupported(boolean value) {
        this.suspendSupported = value;
    }

    /**
     * Gets the value of the migrateSupported property.
     * 
     */
    public boolean isMigrateSupported() {
        return migrateSupported;
    }

    /**
     * Sets the value of the migrateSupported property.
     * 
     */
    public void setMigrateSupported(boolean value) {
        this.migrateSupported = value;
    }

}
