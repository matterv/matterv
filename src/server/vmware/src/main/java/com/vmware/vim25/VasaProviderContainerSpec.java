
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VasaProviderContainerSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VasaProviderContainerSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="vasaProviderInfo" type="{urn:internalvim25}VimVasaProviderInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="scId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="stretched" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VasaProviderContainerSpec", propOrder = {
    "vasaProviderInfo",
    "scId",
    "deleted",
    "stretched"
})
public class VasaProviderContainerSpec
    extends DynamicData
{

    protected List<VimVasaProviderInfo> vasaProviderInfo;
    @XmlElement(required = true)
    protected String scId;
    protected boolean deleted;
    protected Boolean stretched;

    /**
     * Gets the value of the vasaProviderInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vasaProviderInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVasaProviderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VimVasaProviderInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the vasaProviderInfo property.
     */
    public List<VimVasaProviderInfo> getVasaProviderInfo() {
        if (vasaProviderInfo == null) {
            vasaProviderInfo = new ArrayList<>();
        }
        return this.vasaProviderInfo;
    }

    /**
     * Gets the value of the scId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScId() {
        return scId;
    }

    /**
     * Sets the value of the scId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScId(String value) {
        this.scId = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the stretched property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStretched() {
        return stretched;
    }

    /**
     * Sets the value of the stretched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStretched(Boolean value) {
        this.stretched = value;
    }

}
