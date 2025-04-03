
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VimVasaProviderInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VimVasaProviderInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="provider" type="{urn:internalvim25}VimVasaProvider"/>
 *         <element name="arrayState" type="{urn:internalvim25}VimVasaProviderStatePerArray" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VimVasaProviderInfo", propOrder = {
    "provider",
    "arrayState"
})
public class VimVasaProviderInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected VimVasaProvider provider;
    protected List<VimVasaProviderStatePerArray> arrayState;

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link VimVasaProvider }
     *     
     */
    public VimVasaProvider getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link VimVasaProvider }
     *     
     */
    public void setProvider(VimVasaProvider value) {
        this.provider = value;
    }

    /**
     * Gets the value of the arrayState property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayState property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getArrayState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VimVasaProviderStatePerArray }
     * </p>
     * 
     * 
     * @return
     *     The value of the arrayState property.
     */
    public List<VimVasaProviderStatePerArray> getArrayState() {
        if (arrayState == null) {
            arrayState = new ArrayList<>();
        }
        return this.arrayState;
    }

}
