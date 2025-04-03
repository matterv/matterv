
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualNVMEControllerOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualNVMEControllerOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualControllerOption">
 *       <sequence>
 *         <element name="numNVMEDisks" type="{urn:internalvim25}IntOption"/>
 *         <element name="sharing" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVMEControllerOption", propOrder = {
    "numNVMEDisks",
    "sharing"
})
public class VirtualNVMEControllerOption
    extends VirtualControllerOption
{

    @XmlElement(required = true)
    protected IntOption numNVMEDisks;
    protected List<String> sharing;

    /**
     * Gets the value of the numNVMEDisks property.
     * 
     * @return
     *     possible object is
     *     {@link IntOption }
     *     
     */
    public IntOption getNumNVMEDisks() {
        return numNVMEDisks;
    }

    /**
     * Sets the value of the numNVMEDisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntOption }
     *     
     */
    public void setNumNVMEDisks(IntOption value) {
        this.numNVMEDisks = value;
    }

    /**
     * Gets the value of the sharing property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharing property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSharing().add(newItem);
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
     *     The value of the sharing property.
     */
    public List<String> getSharing() {
        if (sharing == null) {
            sharing = new ArrayList<>();
        }
        return this.sharing;
    }

}
