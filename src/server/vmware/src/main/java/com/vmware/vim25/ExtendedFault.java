
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExtendedFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="faultTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="data" type="{urn:internalvim25}KeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedFault", propOrder = {
    "faultTypeId",
    "data"
})
public class ExtendedFault
    extends VimFault
{

    @XmlElement(required = true)
    protected String faultTypeId;
    protected List<KeyValue> data;

    /**
     * Gets the value of the faultTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultTypeId() {
        return faultTypeId;
    }

    /**
     * Sets the value of the faultTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultTypeId(String value) {
        this.faultTypeId = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the data property.
     */
    public List<KeyValue> getData() {
        if (data == null) {
            data = new ArrayList<>();
        }
        return this.data;
    }

}
