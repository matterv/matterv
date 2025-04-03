
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConflictingConfigurationConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfConflictingConfigurationConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConflictingConfigurationConfig" type="{urn:internalvim25}ConflictingConfigurationConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConflictingConfigurationConfig", propOrder = {
    "conflictingConfigurationConfig"
})
public class ArrayOfConflictingConfigurationConfig {

    @XmlElement(name = "ConflictingConfigurationConfig")
    protected List<ConflictingConfigurationConfig> conflictingConfigurationConfig;

    /**
     * Gets the value of the conflictingConfigurationConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conflictingConfigurationConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConflictingConfigurationConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConflictingConfigurationConfig }
     * </p>
     * 
     * 
     * @return
     *     The value of the conflictingConfigurationConfig property.
     */
    public List<ConflictingConfigurationConfig> getConflictingConfigurationConfig() {
        if (conflictingConfigurationConfig == null) {
            conflictingConfigurationConfig = new ArrayList<>();
        }
        return this.conflictingConfigurationConfig;
    }

}
