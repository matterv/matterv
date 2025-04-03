
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAuthorizationPrivilege complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAuthorizationPrivilege">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuthorizationPrivilege" type="{urn:internalvim25}AuthorizationPrivilege" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuthorizationPrivilege", propOrder = {
    "authorizationPrivilege"
})
public class ArrayOfAuthorizationPrivilege {

    @XmlElement(name = "AuthorizationPrivilege")
    protected List<AuthorizationPrivilege> authorizationPrivilege;

    /**
     * Gets the value of the authorizationPrivilege property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizationPrivilege property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAuthorizationPrivilege().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorizationPrivilege }
     * </p>
     * 
     * 
     * @return
     *     The value of the authorizationPrivilege property.
     */
    public List<AuthorizationPrivilege> getAuthorizationPrivilege() {
        if (authorizationPrivilege == null) {
            authorizationPrivilege = new ArrayList<>();
        }
        return this.authorizationPrivilege;
    }

}
