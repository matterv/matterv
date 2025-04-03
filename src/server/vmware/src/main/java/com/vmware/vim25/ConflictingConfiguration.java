
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConflictingConfiguration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConflictingConfiguration">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsFault">
 *       <sequence>
 *         <element name="configInConflict" type="{urn:internalvim25}ConflictingConfigurationConfig" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConflictingConfiguration", propOrder = {
    "configInConflict"
})
public class ConflictingConfiguration
    extends DvsFault
{

    @XmlElement(required = true)
    protected List<ConflictingConfigurationConfig> configInConflict;

    /**
     * Gets the value of the configInConflict property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configInConflict property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConfigInConflict().add(newItem);
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
     *     The value of the configInConflict property.
     */
    public List<ConflictingConfigurationConfig> getConfigInConflict() {
        if (configInConflict == null) {
            configInConflict = new ArrayList<>();
        }
        return this.configInConflict;
    }

}
