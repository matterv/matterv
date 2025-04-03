
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualNicManagerNetConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualNicManagerNetConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="nicType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="multiSelectAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="candidateVnic" type="{urn:internalvim25}HostVirtualNic" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="selectedVnic" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNicManagerNetConfig", propOrder = {
    "nicType",
    "multiSelectAllowed",
    "candidateVnic",
    "selectedVnic"
})
public class VirtualNicManagerNetConfig
    extends DynamicData
{

    @XmlElement(required = true)
    protected String nicType;
    protected boolean multiSelectAllowed;
    protected List<HostVirtualNic> candidateVnic;
    protected List<String> selectedVnic;

    /**
     * Gets the value of the nicType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNicType() {
        return nicType;
    }

    /**
     * Sets the value of the nicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNicType(String value) {
        this.nicType = value;
    }

    /**
     * Gets the value of the multiSelectAllowed property.
     * 
     */
    public boolean isMultiSelectAllowed() {
        return multiSelectAllowed;
    }

    /**
     * Sets the value of the multiSelectAllowed property.
     * 
     */
    public void setMultiSelectAllowed(boolean value) {
        this.multiSelectAllowed = value;
    }

    /**
     * Gets the value of the candidateVnic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidateVnic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCandidateVnic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVirtualNic }
     * </p>
     * 
     * 
     * @return
     *     The value of the candidateVnic property.
     */
    public List<HostVirtualNic> getCandidateVnic() {
        if (candidateVnic == null) {
            candidateVnic = new ArrayList<>();
        }
        return this.candidateVnic;
    }

    /**
     * Gets the value of the selectedVnic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedVnic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSelectedVnic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the selectedVnic property.
     */
    public List<String> getSelectedVnic() {
        if (selectedVnic == null) {
            selectedVnic = new ArrayList<>();
        }
        return this.selectedVnic;
    }

}
