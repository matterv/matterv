
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementRankResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PlacementRankResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="candidate" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="reservedSpaceMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="usedSpaceMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="totalSpaceMB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="utilization" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="faults" type="{urn:internalvim25}LocalizedMethodFault" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementRankResult", propOrder = {
    "key",
    "candidate",
    "reservedSpaceMB",
    "usedSpaceMB",
    "totalSpaceMB",
    "utilization",
    "faults"
})
public class PlacementRankResult
    extends DynamicData
{

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected ManagedObjectReference candidate;
    protected long reservedSpaceMB;
    protected long usedSpaceMB;
    protected long totalSpaceMB;
    protected double utilization;
    protected List<LocalizedMethodFault> faults;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the candidate property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getCandidate() {
        return candidate;
    }

    /**
     * Sets the value of the candidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setCandidate(ManagedObjectReference value) {
        this.candidate = value;
    }

    /**
     * Gets the value of the reservedSpaceMB property.
     * 
     */
    public long getReservedSpaceMB() {
        return reservedSpaceMB;
    }

    /**
     * Sets the value of the reservedSpaceMB property.
     * 
     */
    public void setReservedSpaceMB(long value) {
        this.reservedSpaceMB = value;
    }

    /**
     * Gets the value of the usedSpaceMB property.
     * 
     */
    public long getUsedSpaceMB() {
        return usedSpaceMB;
    }

    /**
     * Sets the value of the usedSpaceMB property.
     * 
     */
    public void setUsedSpaceMB(long value) {
        this.usedSpaceMB = value;
    }

    /**
     * Gets the value of the totalSpaceMB property.
     * 
     */
    public long getTotalSpaceMB() {
        return totalSpaceMB;
    }

    /**
     * Sets the value of the totalSpaceMB property.
     * 
     */
    public void setTotalSpaceMB(long value) {
        this.totalSpaceMB = value;
    }

    /**
     * Gets the value of the utilization property.
     * 
     */
    public double getUtilization() {
        return utilization;
    }

    /**
     * Sets the value of the utilization property.
     * 
     */
    public void setUtilization(double value) {
        this.utilization = value;
    }

    /**
     * Gets the value of the faults property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faults property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFaults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedMethodFault }
     * </p>
     * 
     * 
     * @return
     *     The value of the faults property.
     */
    public List<LocalizedMethodFault> getFaults() {
        if (faults == null) {
            faults = new ArrayList<>();
        }
        return this.faults;
    }

}
