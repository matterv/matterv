
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryPerfCompositeRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="QueryPerfCompositeRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="querySpec" type="{urn:internalvim25}PerfQuerySpec"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPerfCompositeRequestType", propOrder = {
    "_this",
    "querySpec"
})
public class QueryPerfCompositeRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected PerfQuerySpec querySpec;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the querySpec property.
     * 
     * @return
     *     possible object is
     *     {@link PerfQuerySpec }
     *     
     */
    public PerfQuerySpec getQuerySpec() {
        return querySpec;
    }

    /**
     * Sets the value of the querySpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfQuerySpec }
     *     
     */
    public void setQuerySpec(PerfQuerySpec value) {
        this.querySpec = value;
    }

}
