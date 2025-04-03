
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VStorageObjectConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VStorageObjectConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}BaseConfigInfo">
 *       <sequence>
 *         <element name="descriptorVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="capacityInMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="consumptionType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="consumerId" type="{urn:internalvim25}ID" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectConfigInfo", propOrder = {
    "descriptorVersion",
    "capacityInMB",
    "consumptionType",
    "consumerId"
})
public class VStorageObjectConfigInfo
    extends BaseConfigInfo
{

    protected Integer descriptorVersion;
    protected long capacityInMB;
    protected List<String> consumptionType;
    protected List<ID> consumerId;

    /**
     * Gets the value of the descriptorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDescriptorVersion() {
        return descriptorVersion;
    }

    /**
     * Sets the value of the descriptorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDescriptorVersion(Integer value) {
        this.descriptorVersion = value;
    }

    /**
     * Gets the value of the capacityInMB property.
     * 
     */
    public long getCapacityInMB() {
        return capacityInMB;
    }

    /**
     * Sets the value of the capacityInMB property.
     * 
     */
    public void setCapacityInMB(long value) {
        this.capacityInMB = value;
    }

    /**
     * Gets the value of the consumptionType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConsumptionType().add(newItem);
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
     *     The value of the consumptionType property.
     */
    public List<String> getConsumptionType() {
        if (consumptionType == null) {
            consumptionType = new ArrayList<>();
        }
        return this.consumptionType;
    }

    /**
     * Gets the value of the consumerId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConsumerId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ID }
     * </p>
     * 
     * 
     * @return
     *     The value of the consumerId property.
     */
    public List<ID> getConsumerId() {
        if (consumerId == null) {
            consumerId = new ArrayList<>();
        }
        return this.consumerId;
    }

}
