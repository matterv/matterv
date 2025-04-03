
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostHardwareStatusInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostHardwareStatusInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="memoryStatusInfo" type="{urn:internalvim25}HostHardwareElementInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="cpuStatusInfo" type="{urn:internalvim25}HostHardwareElementInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="storageStatusInfo" type="{urn:internalvim25}HostStorageElementInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="dpuStatusInfo" type="{urn:internalvim25}DpuStatusInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostHardwareStatusInfo", propOrder = {
    "memoryStatusInfo",
    "cpuStatusInfo",
    "storageStatusInfo",
    "dpuStatusInfo"
})
public class HostHardwareStatusInfo
    extends DynamicData
{

    protected List<HostHardwareElementInfo> memoryStatusInfo;
    protected List<HostHardwareElementInfo> cpuStatusInfo;
    protected List<HostStorageElementInfo> storageStatusInfo;
    protected List<DpuStatusInfo> dpuStatusInfo;

    /**
     * Gets the value of the memoryStatusInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memoryStatusInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMemoryStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostHardwareElementInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the memoryStatusInfo property.
     */
    public List<HostHardwareElementInfo> getMemoryStatusInfo() {
        if (memoryStatusInfo == null) {
            memoryStatusInfo = new ArrayList<>();
        }
        return this.memoryStatusInfo;
    }

    /**
     * Gets the value of the cpuStatusInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpuStatusInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCpuStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostHardwareElementInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the cpuStatusInfo property.
     */
    public List<HostHardwareElementInfo> getCpuStatusInfo() {
        if (cpuStatusInfo == null) {
            cpuStatusInfo = new ArrayList<>();
        }
        return this.cpuStatusInfo;
    }

    /**
     * Gets the value of the storageStatusInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageStatusInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStorageStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostStorageElementInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the storageStatusInfo property.
     */
    public List<HostStorageElementInfo> getStorageStatusInfo() {
        if (storageStatusInfo == null) {
            storageStatusInfo = new ArrayList<>();
        }
        return this.storageStatusInfo;
    }

    /**
     * Gets the value of the dpuStatusInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dpuStatusInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDpuStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DpuStatusInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the dpuStatusInfo property.
     */
    public List<DpuStatusInfo> getDpuStatusInfo() {
        if (dpuStatusInfo == null) {
            dpuStatusInfo = new ArrayList<>();
        }
        return this.dpuStatusInfo;
    }

}
