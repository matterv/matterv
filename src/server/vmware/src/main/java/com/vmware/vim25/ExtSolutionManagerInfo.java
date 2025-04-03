
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtSolutionManagerInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtSolutionManagerInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="tab" type="{urn:internalvim25}ExtSolutionManagerInfoTabInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="smallIconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtSolutionManagerInfo", propOrder = {
    "tab",
    "smallIconUrl"
})
public class ExtSolutionManagerInfo
    extends DynamicData
{

    protected List<ExtSolutionManagerInfoTabInfo> tab;
    protected String smallIconUrl;

    /**
     * Gets the value of the tab property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tab property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtSolutionManagerInfoTabInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the tab property.
     */
    public List<ExtSolutionManagerInfoTabInfo> getTab() {
        if (tab == null) {
            tab = new ArrayList<>();
        }
        return this.tab;
    }

    /**
     * Gets the value of the smallIconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallIconUrl() {
        return smallIconUrl;
    }

    /**
     * Sets the value of the smallIconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallIconUrl(String value) {
        this.smallIconUrl = value;
    }

}
