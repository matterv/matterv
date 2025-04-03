
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstimateDatabaseSizeRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EstimateDatabaseSizeRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="_this" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="dbSizeParam" type="{urn:internalvim25}DatabaseSizeParam"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimateDatabaseSizeRequestType", propOrder = {
    "_this",
    "dbSizeParam"
})
public class EstimateDatabaseSizeRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected DatabaseSizeParam dbSizeParam;

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
     * Gets the value of the dbSizeParam property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseSizeParam }
     *     
     */
    public DatabaseSizeParam getDbSizeParam() {
        return dbSizeParam;
    }

    /**
     * Sets the value of the dbSizeParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseSizeParam }
     *     
     */
    public void setDbSizeParam(DatabaseSizeParam value) {
        this.dbSizeParam = value;
    }

}
