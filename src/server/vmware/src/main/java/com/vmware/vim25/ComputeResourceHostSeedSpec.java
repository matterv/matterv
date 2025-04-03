
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputeResourceHostSeedSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ComputeResourceHostSeedSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="singleHostSpec" type="{urn:internalvim25}ComputeResourceHostSeedSpecSingleHostSpec"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceHostSeedSpec", propOrder = {
    "singleHostSpec"
})
public class ComputeResourceHostSeedSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected ComputeResourceHostSeedSpecSingleHostSpec singleHostSpec;

    /**
     * Gets the value of the singleHostSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ComputeResourceHostSeedSpecSingleHostSpec }
     *     
     */
    public ComputeResourceHostSeedSpecSingleHostSpec getSingleHostSpec() {
        return singleHostSpec;
    }

    /**
     * Sets the value of the singleHostSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputeResourceHostSeedSpecSingleHostSpec }
     *     
     */
    public void setSingleHostSpec(ComputeResourceHostSeedSpecSingleHostSpec value) {
        this.singleHostSpec = value;
    }

}
