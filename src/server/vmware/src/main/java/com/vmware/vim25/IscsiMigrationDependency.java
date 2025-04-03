
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IscsiMigrationDependency complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IscsiMigrationDependency">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="migrationAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="disallowReason" type="{urn:internalvim25}IscsiStatus" minOccurs="0"/>
 *         <element name="dependency" type="{urn:internalvim25}IscsiDependencyEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscsiMigrationDependency", propOrder = {
    "migrationAllowed",
    "disallowReason",
    "dependency"
})
public class IscsiMigrationDependency
    extends DynamicData
{

    protected boolean migrationAllowed;
    protected IscsiStatus disallowReason;
    protected List<IscsiDependencyEntity> dependency;

    /**
     * Gets the value of the migrationAllowed property.
     * 
     */
    public boolean isMigrationAllowed() {
        return migrationAllowed;
    }

    /**
     * Sets the value of the migrationAllowed property.
     * 
     */
    public void setMigrationAllowed(boolean value) {
        this.migrationAllowed = value;
    }

    /**
     * Gets the value of the disallowReason property.
     * 
     * @return
     *     possible object is
     *     {@link IscsiStatus }
     *     
     */
    public IscsiStatus getDisallowReason() {
        return disallowReason;
    }

    /**
     * Sets the value of the disallowReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link IscsiStatus }
     *     
     */
    public void setDisallowReason(IscsiStatus value) {
        this.disallowReason = value;
    }

    /**
     * Gets the value of the dependency property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependency property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDependency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IscsiDependencyEntity }
     * </p>
     * 
     * 
     * @return
     *     The value of the dependency property.
     */
    public List<IscsiDependencyEntity> getDependency() {
        if (dependency == null) {
            dependency = new ArrayList<>();
        }
        return this.dependency;
    }

}
