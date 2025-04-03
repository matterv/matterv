
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTpmEventDetails complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTpmEventDetails">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="dataHash" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded"/>
 *         <element name="dataHashMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmEventDetails", propOrder = {
    "dataHash",
    "dataHashMethod"
})
@XmlSeeAlso({
    HostTpmBootCompleteEventDetails.class,
    HostTpmCommandEventDetails.class,
    HostTpmOptionEventDetails.class,
    HostTpmBootSecurityOptionEventDetails.class,
    HostTpmSoftwareComponentEventDetails.class,
    HostTpmVersionEventDetails.class
})
public class HostTpmEventDetails
    extends DynamicData
{

    @XmlElement(type = Byte.class)
    protected List<Byte> dataHash;
    protected String dataHashMethod;

    /**
     * Gets the value of the dataHash property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataHash property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDataHash().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * </p>
     * 
     * 
     * @return
     *     The value of the dataHash property.
     */
    public List<Byte> getDataHash() {
        if (dataHash == null) {
            dataHash = new ArrayList<>();
        }
        return this.dataHash;
    }

    /**
     * Gets the value of the dataHashMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataHashMethod() {
        return dataHashMethod;
    }

    /**
     * Sets the value of the dataHashMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHashMethod(String value) {
        this.dataHashMethod = value;
    }

}
