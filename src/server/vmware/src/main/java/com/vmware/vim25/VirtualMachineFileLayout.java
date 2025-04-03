
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineFileLayout complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineFileLayout">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="configFile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="logFile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="disk" type="{urn:internalvim25}VirtualMachineFileLayoutDiskLayout" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="snapshot" type="{urn:internalvim25}VirtualMachineFileLayoutSnapshotLayout" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="swapFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineFileLayout", propOrder = {
    "configFile",
    "logFile",
    "disk",
    "snapshot",
    "swapFile"
})
public class VirtualMachineFileLayout
    extends DynamicData
{

    protected List<String> configFile;
    protected List<String> logFile;
    protected List<VirtualMachineFileLayoutDiskLayout> disk;
    protected List<VirtualMachineFileLayoutSnapshotLayout> snapshot;
    protected String swapFile;

    /**
     * Gets the value of the configFile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configFile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfigFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the configFile property.
     */
    public List<String> getConfigFile() {
        if (configFile == null) {
            configFile = new ArrayList<>();
        }
        return this.configFile;
    }

    /**
     * Gets the value of the logFile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logFile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLogFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the logFile property.
     */
    public List<String> getLogFile() {
        if (logFile == null) {
            logFile = new ArrayList<>();
        }
        return this.logFile;
    }

    /**
     * Gets the value of the disk property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disk property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDisk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFileLayoutDiskLayout }
     * </p>
     * 
     * 
     * @return
     *     The value of the disk property.
     */
    public List<VirtualMachineFileLayoutDiskLayout> getDisk() {
        if (disk == null) {
            disk = new ArrayList<>();
        }
        return this.disk;
    }

    /**
     * Gets the value of the snapshot property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snapshot property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSnapshot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFileLayoutSnapshotLayout }
     * </p>
     * 
     * 
     * @return
     *     The value of the snapshot property.
     */
    public List<VirtualMachineFileLayoutSnapshotLayout> getSnapshot() {
        if (snapshot == null) {
            snapshot = new ArrayList<>();
        }
        return this.snapshot;
    }

    /**
     * Gets the value of the swapFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapFile() {
        return swapFile;
    }

    /**
     * Sets the value of the swapFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapFile(String value) {
        this.swapFile = value;
    }

}
