
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFilterSpecByUsername complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EventFilterSpecByUsername">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="systemUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="userList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventFilterSpecByUsername", propOrder = {
    "systemUser",
    "userList"
})
public class EventFilterSpecByUsername
    extends DynamicData
{

    protected boolean systemUser;
    protected List<String> userList;

    /**
     * Gets the value of the systemUser property.
     * 
     */
    public boolean isSystemUser() {
        return systemUser;
    }

    /**
     * Sets the value of the systemUser property.
     * 
     */
    public void setSystemUser(boolean value) {
        this.systemUser = value;
    }

    /**
     * Gets the value of the userList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUserList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the userList property.
     */
    public List<String> getUserList() {
        if (userList == null) {
            userList = new ArrayList<>();
        }
        return this.userList;
    }

}
