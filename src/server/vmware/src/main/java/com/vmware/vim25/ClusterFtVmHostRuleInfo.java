
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterFtVmHostRuleInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterFtVmHostRuleInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterRuleInfo">
 *       <sequence>
 *         <element name="vmGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostGroupName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFtVmHostRuleInfo", propOrder = {
    "vmGroupName",
    "hostGroupName"
})
public class ClusterFtVmHostRuleInfo
    extends ClusterRuleInfo
{

    @XmlElement(required = true)
    protected String vmGroupName;
    protected List<String> hostGroupName;

    /**
     * Gets the value of the vmGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmGroupName() {
        return vmGroupName;
    }

    /**
     * Sets the value of the vmGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmGroupName(String value) {
        this.vmGroupName = value;
    }

    /**
     * Gets the value of the hostGroupName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostGroupName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostGroupName().add(newItem);
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
     *     The value of the hostGroupName property.
     */
    public List<String> getHostGroupName() {
        if (hostGroupName == null) {
            hostGroupName = new ArrayList<>();
        }
        return this.hostGroupName;
    }

}
