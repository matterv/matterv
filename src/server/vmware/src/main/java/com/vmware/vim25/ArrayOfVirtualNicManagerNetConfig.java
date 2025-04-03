
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVirtualNicManagerNetConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVirtualNicManagerNetConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VirtualNicManagerNetConfig" type="{urn:internalvim25}VirtualNicManagerNetConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualNicManagerNetConfig", propOrder = {
    "virtualNicManagerNetConfig"
})
public class ArrayOfVirtualNicManagerNetConfig {

    @XmlElement(name = "VirtualNicManagerNetConfig")
    protected List<VirtualNicManagerNetConfig> virtualNicManagerNetConfig;

    /**
     * Gets the value of the virtualNicManagerNetConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the virtualNicManagerNetConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVirtualNicManagerNetConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualNicManagerNetConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the virtualNicManagerNetConfig property.
     */
    public List<VirtualNicManagerNetConfig> getVirtualNicManagerNetConfig() {
        if (virtualNicManagerNetConfig == null) {
            virtualNicManagerNetConfig = new ArrayList<>();
        }
        return this.virtualNicManagerNetConfig;
    }

}
