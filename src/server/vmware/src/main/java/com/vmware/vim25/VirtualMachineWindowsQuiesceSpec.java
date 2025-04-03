
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualMachineWindowsQuiesceSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualMachineWindowsQuiesceSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualMachineGuestQuiesceSpec">
 *       <sequence>
 *         <element name="vssBackupType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="vssBootableSystemState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vssPartialFileSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="vssBackupContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineWindowsQuiesceSpec", propOrder = {
    "vssBackupType",
    "vssBootableSystemState",
    "vssPartialFileSupport",
    "vssBackupContext"
})
public class VirtualMachineWindowsQuiesceSpec
    extends VirtualMachineGuestQuiesceSpec
{

    protected Integer vssBackupType;
    protected Boolean vssBootableSystemState;
    protected Boolean vssPartialFileSupport;
    protected String vssBackupContext;

    /**
     * Gets the value of the vssBackupType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVssBackupType() {
        return vssBackupType;
    }

    /**
     * Sets the value of the vssBackupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVssBackupType(Integer value) {
        this.vssBackupType = value;
    }

    /**
     * Gets the value of the vssBootableSystemState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVssBootableSystemState() {
        return vssBootableSystemState;
    }

    /**
     * Sets the value of the vssBootableSystemState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVssBootableSystemState(Boolean value) {
        this.vssBootableSystemState = value;
    }

    /**
     * Gets the value of the vssPartialFileSupport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVssPartialFileSupport() {
        return vssPartialFileSupport;
    }

    /**
     * Sets the value of the vssPartialFileSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVssPartialFileSupport(Boolean value) {
        this.vssPartialFileSupport = value;
    }

    /**
     * Gets the value of the vssBackupContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVssBackupContext() {
        return vssBackupContext;
    }

    /**
     * Sets the value of the vssBackupContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVssBackupContext(String value) {
        this.vssBackupContext = value;
    }

}
