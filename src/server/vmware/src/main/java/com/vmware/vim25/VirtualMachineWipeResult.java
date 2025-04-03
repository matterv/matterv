
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineWipeResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineWipeResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="diskId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="shrinkableDiskSpace" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineWipeResult", propOrder = {
    "diskId",
    "shrinkableDiskSpace"
})
public class VirtualMachineWipeResult
    extends DynamicData
{

    protected int diskId;
    protected long shrinkableDiskSpace;

    /**
     * Gets the value of the diskId property.
     * 
     */
    public int getDiskId() {
        return diskId;
    }

    /**
     * Sets the value of the diskId property.
     * 
     */
    public void setDiskId(int value) {
        this.diskId = value;
    }

    /**
     * Gets the value of the shrinkableDiskSpace property.
     * 
     */
    public long getShrinkableDiskSpace() {
        return shrinkableDiskSpace;
    }

    /**
     * Sets the value of the shrinkableDiskSpace property.
     * 
     */
    public void setShrinkableDiskSpace(long value) {
        this.shrinkableDiskSpace = value;
    }

}
