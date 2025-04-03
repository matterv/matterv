
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFileSystemVolumeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostFileSystemVolumeInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="volumeTypeList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="mountInfo" type="{urn:internalvim25}HostFileSystemMountInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFileSystemVolumeInfo", propOrder = {
    "volumeTypeList",
    "mountInfo"
})
public class HostFileSystemVolumeInfo
    extends DynamicData
{

    protected List<String> volumeTypeList;
    protected List<HostFileSystemMountInfo> mountInfo;

    /**
     * Gets the value of the volumeTypeList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumeTypeList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVolumeTypeList().add(newItem);
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
     *     The value of the volumeTypeList property.
     */
    public List<String> getVolumeTypeList() {
        if (volumeTypeList == null) {
            volumeTypeList = new ArrayList<>();
        }
        return this.volumeTypeList;
    }

    /**
     * Gets the value of the mountInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mountInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMountInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFileSystemMountInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the mountInfo property.
     */
    public List<HostFileSystemMountInfo> getMountInfo() {
        if (mountInfo == null) {
            mountInfo = new ArrayList<>();
        }
        return this.mountInfo;
    }

}
