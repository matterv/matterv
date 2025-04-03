
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationDescription complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AuthorizationDescription">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="privilege" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *         <element name="privilegeGroup" type="{urn:internalvim25}ElementDescription" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationDescription", propOrder = {
    "privilege",
    "privilegeGroup"
})
public class AuthorizationDescription
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<ElementDescription> privilege;
    @XmlElement(required = true)
    protected List<ElementDescription> privilegeGroup;

    /**
     * Gets the value of the privilege property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privilege property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrivilege().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the privilege property.
     */
    public List<ElementDescription> getPrivilege() {
        if (privilege == null) {
            privilege = new ArrayList<>();
        }
        return this.privilege;
    }

    /**
     * Gets the value of the privilegeGroup property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privilegeGroup property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrivilegeGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementDescription }
     * </p>
     * 
     * 
     * @return
     *     The value of the privilegeGroup property.
     */
    public List<ElementDescription> getPrivilegeGroup() {
        if (privilegeGroup == null) {
            privilegeGroup = new ArrayList<>();
        }
        return this.privilegeGroup;
    }

}
