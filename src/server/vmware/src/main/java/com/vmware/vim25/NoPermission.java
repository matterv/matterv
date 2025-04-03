
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoPermission complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NoPermission">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}SecurityError">
 *       <sequence>
 *         <element name="object" type="{urn:internalvim25}ManagedObjectReference" minOccurs="0"/>
 *         <element name="privilegeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="missingPrivileges" type="{urn:internalvim25}NoPermissionEntityPrivileges" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoPermission", propOrder = {
    "object",
    "privilegeId",
    "missingPrivileges"
})
@XmlSeeAlso({
    NotAuthenticated.class
})
public class NoPermission
    extends SecurityError
{

    protected ManagedObjectReference object;
    protected String privilegeId;
    protected List<NoPermissionEntityPrivileges> missingPrivileges;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setObject(ManagedObjectReference value) {
        this.object = value;
    }

    /**
     * Gets the value of the privilegeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivilegeId() {
        return privilegeId;
    }

    /**
     * Sets the value of the privilegeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivilegeId(String value) {
        this.privilegeId = value;
    }

    /**
     * Gets the value of the missingPrivileges property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingPrivileges property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMissingPrivileges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoPermissionEntityPrivileges }
     * </p>
     * 
     * 
     * @return
     *     The value of the missingPrivileges property.
     */
    public List<NoPermissionEntityPrivileges> getMissingPrivileges() {
        if (missingPrivileges == null) {
            missingPrivileges = new ArrayList<>();
        }
        return this.missingPrivileges;
    }

}
