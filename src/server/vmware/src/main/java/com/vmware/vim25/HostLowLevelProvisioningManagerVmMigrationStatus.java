
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostLowLevelProvisioningManagerVmMigrationStatus complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostLowLevelProvisioningManagerVmMigrationStatus">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="migrationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="source" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="consideredSuccessful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerVmMigrationStatus", propOrder = {
    "migrationId",
    "type",
    "source",
    "consideredSuccessful"
})
public class HostLowLevelProvisioningManagerVmMigrationStatus
    extends DynamicData
{

    protected long migrationId;
    @XmlElement(required = true)
    protected String type;
    protected boolean source;
    protected boolean consideredSuccessful;

    /**
     * Gets the value of the migrationId property.
     * 
     */
    public long getMigrationId() {
        return migrationId;
    }

    /**
     * Sets the value of the migrationId property.
     * 
     */
    public void setMigrationId(long value) {
        this.migrationId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the source property.
     * 
     */
    public boolean isSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     */
    public void setSource(boolean value) {
        this.source = value;
    }

    /**
     * Gets the value of the consideredSuccessful property.
     * 
     */
    public boolean isConsideredSuccessful() {
        return consideredSuccessful;
    }

    /**
     * Sets the value of the consideredSuccessful property.
     * 
     */
    public void setConsideredSuccessful(boolean value) {
        this.consideredSuccessful = value;
    }

}
