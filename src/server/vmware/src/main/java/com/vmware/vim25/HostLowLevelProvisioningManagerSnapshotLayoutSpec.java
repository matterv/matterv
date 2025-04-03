
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostLowLevelProvisioningManagerSnapshotLayoutSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostLowLevelProvisioningManagerSnapshotLayoutSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="srcFilename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dstFilename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="disk" type="{urn:internalvim25}HostLowLevelProvisioningManagerDiskLayoutSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerSnapshotLayoutSpec", propOrder = {
    "id",
    "srcFilename",
    "dstFilename",
    "disk"
})
public class HostLowLevelProvisioningManagerSnapshotLayoutSpec
    extends DynamicData
{

    protected int id;
    @XmlElement(required = true)
    protected String srcFilename;
    @XmlElement(required = true)
    protected String dstFilename;
    protected List<HostLowLevelProvisioningManagerDiskLayoutSpec> disk;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the srcFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcFilename() {
        return srcFilename;
    }

    /**
     * Sets the value of the srcFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcFilename(String value) {
        this.srcFilename = value;
    }

    /**
     * Gets the value of the dstFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstFilename() {
        return dstFilename;
    }

    /**
     * Sets the value of the dstFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstFilename(String value) {
        this.dstFilename = value;
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
     * {@link HostLowLevelProvisioningManagerDiskLayoutSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the disk property.
     */
    public List<HostLowLevelProvisioningManagerDiskLayoutSpec> getDisk() {
        if (disk == null) {
            disk = new ArrayList<>();
        }
        return this.disk;
    }

}
