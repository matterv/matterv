
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostVirtualSwitchAutoBridge complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostVirtualSwitchAutoBridge">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostVirtualSwitchBridge">
 *       <sequence>
 *         <element name="excludedNicDevice" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchAutoBridge", propOrder = {
    "excludedNicDevice"
})
public class HostVirtualSwitchAutoBridge
    extends HostVirtualSwitchBridge
{

    protected List<String> excludedNicDevice;

    /**
     * Gets the value of the excludedNicDevice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedNicDevice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExcludedNicDevice().add(newItem);
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
     *     The value of the excludedNicDevice property.
     */
    public List<String> getExcludedNicDevice() {
        if (excludedNicDevice == null) {
            excludedNicDevice = new ArrayList<>();
        }
        return this.excludedNicDevice;
    }

}
