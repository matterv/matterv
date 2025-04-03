
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTpmOptionEventDetails complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTpmOptionEventDetails">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostTpmEventDetails">
 *       <sequence>
 *         <element name="optionsFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="bootOptions" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmOptionEventDetails", propOrder = {
    "optionsFileName",
    "bootOptions"
})
public class HostTpmOptionEventDetails
    extends HostTpmEventDetails
{

    @XmlElement(required = true)
    protected String optionsFileName;
    @XmlElement(type = Byte.class)
    protected List<Byte> bootOptions;

    /**
     * Gets the value of the optionsFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionsFileName() {
        return optionsFileName;
    }

    /**
     * Sets the value of the optionsFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionsFileName(String value) {
        this.optionsFileName = value;
    }

    /**
     * Gets the value of the bootOptions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bootOptions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBootOptions().add(newItem);
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
     *     The value of the bootOptions property.
     */
    public List<Byte> getBootOptions() {
        if (bootOptions == null) {
            bootOptions = new ArrayList<>();
        }
        return this.bootOptions;
    }

}
