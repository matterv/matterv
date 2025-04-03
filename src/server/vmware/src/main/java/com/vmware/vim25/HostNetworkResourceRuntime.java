
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNetworkResourceRuntime complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostNetworkResourceRuntime">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="pnicResourceInfo" type="{urn:internalvim25}HostPnicNetworkResourceInfo" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkResourceRuntime", propOrder = {
    "pnicResourceInfo"
})
public class HostNetworkResourceRuntime
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<HostPnicNetworkResourceInfo> pnicResourceInfo;

    /**
     * Gets the value of the pnicResourceInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnicResourceInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPnicResourceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPnicNetworkResourceInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the pnicResourceInfo property.
     */
    public List<HostPnicNetworkResourceInfo> getPnicResourceInfo() {
        if (pnicResourceInfo == null) {
            pnicResourceInfo = new ArrayList<>();
        }
        return this.pnicResourceInfo;
    }

}
