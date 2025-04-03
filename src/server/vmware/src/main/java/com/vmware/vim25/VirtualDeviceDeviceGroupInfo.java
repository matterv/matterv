
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDeviceDeviceGroupInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDeviceDeviceGroupInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="groupInstanceKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="sequenceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceDeviceGroupInfo", propOrder = {
    "groupInstanceKey",
    "sequenceId"
})
public class VirtualDeviceDeviceGroupInfo
    extends DynamicData
{

    protected int groupInstanceKey;
    protected int sequenceId;

    /**
     * Gets the value of the groupInstanceKey property.
     * 
     */
    public int getGroupInstanceKey() {
        return groupInstanceKey;
    }

    /**
     * Sets the value of the groupInstanceKey property.
     * 
     */
    public void setGroupInstanceKey(int value) {
        this.groupInstanceKey = value;
    }

    /**
     * Gets the value of the sequenceId property.
     * 
     */
    public int getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the value of the sequenceId property.
     * 
     */
    public void setSequenceId(int value) {
        this.sequenceId = value;
    }

}
