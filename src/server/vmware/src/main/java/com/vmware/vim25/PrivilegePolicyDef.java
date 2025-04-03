
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivilegePolicyDef complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PrivilegePolicyDef">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="createPrivilege" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="readPrivilege" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="updatePrivilege" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="deletePrivilege" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivilegePolicyDef", propOrder = {
    "createPrivilege",
    "readPrivilege",
    "updatePrivilege",
    "deletePrivilege"
})
public class PrivilegePolicyDef
    extends DynamicData
{

    @XmlElement(required = true)
    protected String createPrivilege;
    @XmlElement(required = true)
    protected String readPrivilege;
    @XmlElement(required = true)
    protected String updatePrivilege;
    @XmlElement(required = true)
    protected String deletePrivilege;

    /**
     * Gets the value of the createPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatePrivilege() {
        return createPrivilege;
    }

    /**
     * Sets the value of the createPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatePrivilege(String value) {
        this.createPrivilege = value;
    }

    /**
     * Gets the value of the readPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadPrivilege() {
        return readPrivilege;
    }

    /**
     * Sets the value of the readPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadPrivilege(String value) {
        this.readPrivilege = value;
    }

    /**
     * Gets the value of the updatePrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatePrivilege() {
        return updatePrivilege;
    }

    /**
     * Sets the value of the updatePrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatePrivilege(String value) {
        this.updatePrivilege = value;
    }

    /**
     * Gets the value of the deletePrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeletePrivilege() {
        return deletePrivilege;
    }

    /**
     * Sets the value of the deletePrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeletePrivilege(String value) {
        this.deletePrivilege = value;
    }

}
