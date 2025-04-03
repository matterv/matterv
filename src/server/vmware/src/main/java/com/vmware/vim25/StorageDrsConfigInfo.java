
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageDrsConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageDrsConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="podConfig" type="{urn:internalvim25}StorageDrsPodConfigInfo"/>
 *         <element name="vmConfig" type="{urn:internalvim25}StorageDrsVmConfigInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsConfigInfo", propOrder = {
    "podConfig",
    "vmConfig"
})
public class StorageDrsConfigInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected StorageDrsPodConfigInfo podConfig;
    protected List<StorageDrsVmConfigInfo> vmConfig;

    /**
     * Gets the value of the podConfig property.
     * 
     * @return
     *     possible object is
     *     {@link StorageDrsPodConfigInfo }
     *     
     */
    public StorageDrsPodConfigInfo getPodConfig() {
        return podConfig;
    }

    /**
     * Sets the value of the podConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageDrsPodConfigInfo }
     *     
     */
    public void setPodConfig(StorageDrsPodConfigInfo value) {
        this.podConfig = value;
    }

    /**
     * Gets the value of the vmConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVmConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StorageDrsVmConfigInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vmConfig property.
     */
    public List<StorageDrsVmConfigInfo> getVmConfig() {
        if (vmConfig == null) {
            vmConfig = new ArrayList<>();
        }
        return this.vmConfig;
    }

}
