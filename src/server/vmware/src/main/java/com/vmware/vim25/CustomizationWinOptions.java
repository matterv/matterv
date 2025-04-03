
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationWinOptions complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationWinOptions">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CustomizationOptions">
 *       <sequence>
 *         <element name="changeSID" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="deleteAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="reboot" type="{urn:internalvim25}CustomizationSysprepRebootOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationWinOptions", propOrder = {
    "changeSID",
    "deleteAccounts",
    "reboot"
})
public class CustomizationWinOptions
    extends CustomizationOptions
{

    protected boolean changeSID;
    protected boolean deleteAccounts;
    @XmlSchemaType(name = "string")
    protected CustomizationSysprepRebootOption reboot;

    /**
     * Gets the value of the changeSID property.
     * 
     */
    public boolean isChangeSID() {
        return changeSID;
    }

    /**
     * Sets the value of the changeSID property.
     * 
     */
    public void setChangeSID(boolean value) {
        this.changeSID = value;
    }

    /**
     * Gets the value of the deleteAccounts property.
     * 
     */
    public boolean isDeleteAccounts() {
        return deleteAccounts;
    }

    /**
     * Sets the value of the deleteAccounts property.
     * 
     */
    public void setDeleteAccounts(boolean value) {
        this.deleteAccounts = value;
    }

    /**
     * Gets the value of the reboot property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationSysprepRebootOption }
     *     
     */
    public CustomizationSysprepRebootOption getReboot() {
        return reboot;
    }

    /**
     * Sets the value of the reboot property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationSysprepRebootOption }
     *     
     */
    public void setReboot(CustomizationSysprepRebootOption value) {
        this.reboot = value;
    }

}
