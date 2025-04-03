
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VStorageObject complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VStorageObject">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="config" type="{urn:internalvim25}VStorageObjectConfigInfo"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObject", propOrder = {
    "config"
})
public class VStorageObject
    extends DynamicData
{

    @XmlElement(required = true)
    protected VStorageObjectConfigInfo config;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link VStorageObjectConfigInfo }
     *     
     */
    public VStorageObjectConfigInfo getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link VStorageObjectConfigInfo }
     *     
     */
    public void setConfig(VStorageObjectConfigInfo value) {
        this.config = value;
    }

}
