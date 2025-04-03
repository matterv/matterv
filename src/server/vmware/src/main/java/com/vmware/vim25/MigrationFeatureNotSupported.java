
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigrationFeatureNotSupported complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MigrationFeatureNotSupported">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MigrationFault">
 *       <sequence>
 *         <element name="atSourceHost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="failedHostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="failedHost" type="{urn:internalvim25}ManagedObjectReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationFeatureNotSupported", propOrder = {
    "atSourceHost",
    "failedHostName",
    "failedHost"
})
@XmlSeeAlso({
    FullStorageVMotionNotSupported.class,
    IndependentDiskVMotionNotSupported.class,
    NonHomeRDMVMotionNotSupported.class,
    StorageVMotionNotSupported.class,
    UnsharedSwapVMotionNotSupported.class,
    VMotionAcrossNetworkNotSupported.class
})
public class MigrationFeatureNotSupported
    extends MigrationFault
{

    protected boolean atSourceHost;
    @XmlElement(required = true)
    protected String failedHostName;
    @XmlElement(required = true)
    protected ManagedObjectReference failedHost;

    /**
     * Gets the value of the atSourceHost property.
     * 
     */
    public boolean isAtSourceHost() {
        return atSourceHost;
    }

    /**
     * Sets the value of the atSourceHost property.
     * 
     */
    public void setAtSourceHost(boolean value) {
        this.atSourceHost = value;
    }

    /**
     * Gets the value of the failedHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedHostName() {
        return failedHostName;
    }

    /**
     * Sets the value of the failedHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedHostName(String value) {
        this.failedHostName = value;
    }

    /**
     * Gets the value of the failedHost property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getFailedHost() {
        return failedHost;
    }

    /**
     * Sets the value of the failedHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setFailedHost(ManagedObjectReference value) {
        this.failedHost = value;
    }

}
