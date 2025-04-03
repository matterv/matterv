
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostDiskMapInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostDiskMapInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="mapping" type="{urn:internalvim25}VsanHostDiskMapping"/>
 *         <element name="mounted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostDiskMapInfo", propOrder = {
    "mapping",
    "mounted"
})
public class VsanHostDiskMapInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected VsanHostDiskMapping mapping;
    protected boolean mounted;

    /**
     * Gets the value of the mapping property.
     * 
     * @return
     *     possible object is
     *     {@link VsanHostDiskMapping }
     *     
     */
    public VsanHostDiskMapping getMapping() {
        return mapping;
    }

    /**
     * Sets the value of the mapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanHostDiskMapping }
     *     
     */
    public void setMapping(VsanHostDiskMapping value) {
        this.mapping = value;
    }

    /**
     * Gets the value of the mounted property.
     * 
     */
    public boolean isMounted() {
        return mounted;
    }

    /**
     * Sets the value of the mounted property.
     * 
     */
    public void setMounted(boolean value) {
        this.mounted = value;
    }

}
