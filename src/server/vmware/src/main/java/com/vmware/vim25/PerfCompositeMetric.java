
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerfCompositeMetric complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PerfCompositeMetric">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="entity" type="{urn:internalvim25}PerfEntityMetricBase" minOccurs="0"/>
 *         <element name="childEntity" type="{urn:internalvim25}PerfEntityMetricBase" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfCompositeMetric", propOrder = {
    "entity",
    "childEntity"
})
public class PerfCompositeMetric
    extends DynamicData
{

    protected PerfEntityMetricBase entity;
    protected List<PerfEntityMetricBase> childEntity;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link PerfEntityMetricBase }
     *     
     */
    public PerfEntityMetricBase getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfEntityMetricBase }
     *     
     */
    public void setEntity(PerfEntityMetricBase value) {
        this.entity = value;
    }

    /**
     * Gets the value of the childEntity property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childEntity property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChildEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerfEntityMetricBase }
     * </p>
     * 
     * 
     * @return
     *     The value of the childEntity property.
     */
    public List<PerfEntityMetricBase> getChildEntity() {
        if (childEntity == null) {
            childEntity = new ArrayList<>();
        }
        return this.childEntity;
    }

}
