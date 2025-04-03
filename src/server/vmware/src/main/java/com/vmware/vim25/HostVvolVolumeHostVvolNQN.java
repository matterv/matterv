
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVvolVolumeHostVvolNQN complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVvolVolumeHostVvolNQN">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="host" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="vvolNQN" type="{urn:internalvim25}HostVvolNQN" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVvolVolumeHostVvolNQN", propOrder = {
    "host",
    "vvolNQN"
})
public class HostVvolVolumeHostVvolNQN
    extends DynamicData
{

    protected ManagedObjectReference host;
    protected List<HostVvolNQN> vvolNQN;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setHost(ManagedObjectReference value) {
        this.host = value;
    }

    /**
     * Gets the value of the vvolNQN property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vvolNQN property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVvolNQN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVvolNQN }
     * </p>
     * 
     * 
     * @return
     *     The value of the vvolNQN property.
     */
    public List<HostVvolNQN> getVvolNQN() {
        if (vvolNQN == null) {
            vvolNQN = new ArrayList<>();
        }
        return this.vvolNQN;
    }

}
