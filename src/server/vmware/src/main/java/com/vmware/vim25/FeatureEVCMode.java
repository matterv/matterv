
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureEVCMode complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FeatureEVCMode">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ElementDescription">
 *       <sequence>
 *         <element name="mask" type="{urn:internalvim25}HostFeatureMask" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="capability" type="{urn:internalvim25}HostFeatureCapability" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="requirement" type="{urn:internalvim25}VirtualMachineFeatureRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureEVCMode", propOrder = {
    "mask",
    "capability",
    "requirement"
})
public class FeatureEVCMode
    extends ElementDescription
{

    protected List<HostFeatureMask> mask;
    protected List<HostFeatureCapability> capability;
    protected List<VirtualMachineFeatureRequirement> requirement;

    /**
     * Gets the value of the mask property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mask property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFeatureMask }
     * </p>
     * 
     * 
     * @return
     *     The value of the mask property.
     */
    public List<HostFeatureMask> getMask() {
        if (mask == null) {
            mask = new ArrayList<>();
        }
        return this.mask;
    }

    /**
     * Gets the value of the capability property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capability property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostFeatureCapability }
     * </p>
     * 
     * 
     * @return
     *     The value of the capability property.
     */
    public List<HostFeatureCapability> getCapability() {
        if (capability == null) {
            capability = new ArrayList<>();
        }
        return this.capability;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineFeatureRequirement }
     * </p>
     * 
     * 
     * @return
     *     The value of the requirement property.
     */
    public List<VirtualMachineFeatureRequirement> getRequirement() {
        if (requirement == null) {
            requirement = new ArrayList<>();
        }
        return this.requirement;
    }

}
