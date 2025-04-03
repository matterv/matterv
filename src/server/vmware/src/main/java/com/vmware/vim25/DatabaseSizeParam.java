
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseSizeParam complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatabaseSizeParam">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="inventoryDesc" type="{urn:internalvim25}InventoryDescription"/>
 *         <element name="perfStatsDesc" type="{urn:internalvim25}PerformanceStatisticsDescription" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseSizeParam", propOrder = {
    "inventoryDesc",
    "perfStatsDesc"
})
public class DatabaseSizeParam
    extends DynamicData
{

    @XmlElement(required = true)
    protected InventoryDescription inventoryDesc;
    protected PerformanceStatisticsDescription perfStatsDesc;

    /**
     * Gets the value of the inventoryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryDescription }
     *     
     */
    public InventoryDescription getInventoryDesc() {
        return inventoryDesc;
    }

    /**
     * Sets the value of the inventoryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDescription }
     *     
     */
    public void setInventoryDesc(InventoryDescription value) {
        this.inventoryDesc = value;
    }

    /**
     * Gets the value of the perfStatsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceStatisticsDescription }
     *     
     */
    public PerformanceStatisticsDescription getPerfStatsDesc() {
        return perfStatsDesc;
    }

    /**
     * Sets the value of the perfStatsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceStatisticsDescription }
     *     
     */
    public void setPerfStatsDesc(PerformanceStatisticsDescription value) {
        this.perfStatsDesc = value;
    }

}
