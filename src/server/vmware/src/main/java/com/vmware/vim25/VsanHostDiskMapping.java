
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostDiskMapping complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostDiskMapping">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ssd" type="{urn:internalvim25}HostScsiDisk"/>
 *         <element name="nonSsd" type="{urn:internalvim25}HostScsiDisk" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostDiskMapping", propOrder = {
    "ssd",
    "nonSsd"
})
public class VsanHostDiskMapping
    extends DynamicData
{

    @XmlElement(required = true)
    protected HostScsiDisk ssd;
    @XmlElement(required = true)
    protected List<HostScsiDisk> nonSsd;

    /**
     * Gets the value of the ssd property.
     * 
     * @return
     *     possible object is
     *     {@link HostScsiDisk }
     *     
     */
    public HostScsiDisk getSsd() {
        return ssd;
    }

    /**
     * Sets the value of the ssd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostScsiDisk }
     *     
     */
    public void setSsd(HostScsiDisk value) {
        this.ssd = value;
    }

    /**
     * Gets the value of the nonSsd property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonSsd property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNonSsd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostScsiDisk }
     * </p>
     * 
     * 
     * @return
     *     The value of the nonSsd property.
     */
    public List<HostScsiDisk> getNonSsd() {
        if (nonSsd == null) {
            nonSsd = new ArrayList<>();
        }
        return this.nonSsd;
    }

}
