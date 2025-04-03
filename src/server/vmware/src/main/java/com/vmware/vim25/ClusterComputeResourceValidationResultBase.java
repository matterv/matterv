
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterComputeResourceValidationResultBase complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterComputeResourceValidationResultBase">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="info" type="{urn:internalvim25}LocalizableMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceValidationResultBase", propOrder = {
    "info"
})
@XmlSeeAlso({
    ClusterComputeResourceHostConfigurationValidation.class,
    ClusterComputeResourceDVSConfigurationValidation.class
})
public class ClusterComputeResourceValidationResultBase
    extends DynamicData
{

    protected List<LocalizableMessage> info;

    /**
     * Gets the value of the info property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizableMessage }
     * </p>
     * 
     * 
     * @return
     *     The value of the info property.
     */
    public List<LocalizableMessage> getInfo() {
        if (info == null) {
            info = new ArrayList<>();
        }
        return this.info;
    }

}
