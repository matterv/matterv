
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPhysicalNicConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfPhysicalNicConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PhysicalNicConfig" type="{urn:internalvim25}PhysicalNicConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicalNicConfig", propOrder = {
    "physicalNicConfig"
})
public class ArrayOfPhysicalNicConfig {

    @XmlElement(name = "PhysicalNicConfig")
    protected List<PhysicalNicConfig> physicalNicConfig;

    /**
     * Gets the value of the physicalNicConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalNicConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPhysicalNicConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalNicConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the physicalNicConfig property.
     */
    public List<PhysicalNicConfig> getPhysicalNicConfig() {
        if (physicalNicConfig == null) {
            physicalNicConfig = new ArrayList<>();
        }
        return this.physicalNicConfig;
    }

}
