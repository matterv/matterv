
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualDiskRuleSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualDiskRuleSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterRuleInfo">
 *       <sequence>
 *         <element name="diskRuleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="diskId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskRuleSpec", propOrder = {
    "diskRuleType",
    "diskId"
})
public class VirtualDiskRuleSpec
    extends ClusterRuleInfo
{

    @XmlElement(required = true)
    protected String diskRuleType;
    @XmlElement(type = Integer.class)
    protected List<Integer> diskId;

    /**
     * Gets the value of the diskRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskRuleType() {
        return diskRuleType;
    }

    /**
     * Sets the value of the diskRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskRuleType(String value) {
        this.diskRuleType = value;
    }

    /**
     * Gets the value of the diskId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diskId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiskId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the diskId property.
     */
    public List<Integer> getDiskId() {
        if (diskId == null) {
            diskId = new ArrayList<>();
        }
        return this.diskId;
    }

}
