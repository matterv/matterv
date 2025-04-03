
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharesOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SharesOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="sharesOption" type="{urn:internalvim25}IntOption"/>
 *         <element name="defaultLevel" type="{urn:internalvim25}SharesLevel"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharesOption", propOrder = {
    "sharesOption",
    "defaultLevel"
})
public class SharesOption
    extends DynamicData
{

    @XmlElement(required = true)
    protected IntOption sharesOption;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SharesLevel defaultLevel;

    /**
     * Gets the value of the sharesOption property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getSharesOption() {
        return sharesOption;
    }

    /**
     * Sets the value of the sharesOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setSharesOption(IntOption value) {
        this.sharesOption = value;
    }

    /**
     * Gets the value of the defaultLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SharesLevel }
     *     
     */
    public SharesLevel getDefaultLevel() {
        return defaultLevel;
    }

    /**
     * Sets the value of the defaultLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesLevel }
     *     
     */
    public void setDefaultLevel(SharesLevel value) {
        this.defaultLevel = value;
    }

}
