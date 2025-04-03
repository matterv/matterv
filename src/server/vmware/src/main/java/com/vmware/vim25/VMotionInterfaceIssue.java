
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMotionInterfaceIssue complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMotionInterfaceIssue">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MigrationFault">
 *       <sequence>
 *         <element name="atSourceHost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="failedHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="failedHostEntity" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMotionInterfaceIssue", propOrder = {
    "atSourceHost",
    "failedHost",
    "failedHostEntity"
})
@XmlSeeAlso({
    VMotionLinkCapacityLow.class,
    VMotionLinkDown.class,
    VMotionNotConfigured.class,
    VMotionNotLicensed.class,
    VMotionNotSupported.class
})
public class VMotionInterfaceIssue
    extends MigrationFault
{

    protected boolean atSourceHost;
    @XmlElement(required = true)
    protected String failedHost;
    protected ManagedObjectReference failedHostEntity;

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
     * Gets the value of the failedHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedHost() {
        return failedHost;
    }

    /**
     * Sets the value of the failedHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedHost(String value) {
        this.failedHost = value;
    }

    /**
     * Gets the value of the failedHostEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getFailedHostEntity() {
        return failedHostEntity;
    }

    /**
     * Sets the value of the failedHostEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setFailedHostEntity(ManagedObjectReference value) {
        this.failedHostEntity = value;
    }

}
