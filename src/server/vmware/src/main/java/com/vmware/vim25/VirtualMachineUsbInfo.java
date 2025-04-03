
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineUsbInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineUsbInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineTargetInfo">
 *       <sequence>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vendor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="product" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="physicalPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="family" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="speed" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="summary" type="{urn:internalvim25}VirtualMachineSummary" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineUsbInfo", propOrder = {
    "description",
    "vendor",
    "product",
    "physicalPath",
    "family",
    "speed",
    "summary"
})
public class VirtualMachineUsbInfo
    extends VirtualMachineTargetInfo
{

    @XmlElement(required = true)
    protected String description;
    protected int vendor;
    protected int product;
    @XmlElement(required = true)
    protected String physicalPath;
    protected List<String> family;
    protected List<String> speed;
    protected VirtualMachineSummary summary;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     */
    public int getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     */
    public void setVendor(int value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the product property.
     * 
     */
    public int getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     */
    public void setProduct(int value) {
        this.product = value;
    }

    /**
     * Gets the value of the physicalPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalPath() {
        return physicalPath;
    }

    /**
     * Sets the value of the physicalPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalPath(String value) {
        this.physicalPath = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the family property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFamily().add(newItem);
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
     *     The value of the family property.
     */
    public List<String> getFamily() {
        if (family == null) {
            family = new ArrayList<>();
        }
        return this.family;
    }

    /**
     * Gets the value of the speed property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speed property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSpeed().add(newItem);
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
     *     The value of the speed property.
     */
    public List<String> getSpeed() {
        if (speed == null) {
            speed = new ArrayList<>();
        }
        return this.speed;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualMachineSummary }
     *     
     */
    public VirtualMachineSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualMachineSummary }
     *     
     */
    public void setSummary(VirtualMachineSummary value) {
        this.summary = value;
    }

}
