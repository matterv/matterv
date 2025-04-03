
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostPosixAccountSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostPosixAccountSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostAccountSpec">
 *       <sequence>
 *         <element name="posixId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="shellAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPosixAccountSpec", propOrder = {
    "posixId",
    "shellAccess"
})
public class HostPosixAccountSpec
    extends HostAccountSpec
{

    protected Integer posixId;
    protected Boolean shellAccess;

    /**
     * Gets the value of the posixId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosixId() {
        return posixId;
    }

    /**
     * Sets the value of the posixId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosixId(Integer value) {
        this.posixId = value;
    }

    /**
     * Gets the value of the shellAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShellAccess() {
        return shellAccess;
    }

    /**
     * Sets the value of the shellAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShellAccess(Boolean value) {
        this.shellAccess = value;
    }

}
