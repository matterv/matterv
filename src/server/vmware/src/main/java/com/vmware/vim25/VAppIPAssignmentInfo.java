
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VAppIPAssignmentInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VAppIPAssignmentInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="supportedAllocationScheme" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipAllocationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="supportedIpProtocol" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ipProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppIPAssignmentInfo", propOrder = {
    "supportedAllocationScheme",
    "ipAllocationPolicy",
    "supportedIpProtocol",
    "ipProtocol"
})
public class VAppIPAssignmentInfo
    extends DynamicData
{

    protected List<String> supportedAllocationScheme;
    protected String ipAllocationPolicy;
    protected List<String> supportedIpProtocol;
    protected String ipProtocol;

    /**
     * Gets the value of the supportedAllocationScheme property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedAllocationScheme property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedAllocationScheme().add(newItem);
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
     *     The value of the supportedAllocationScheme property.
     */
    public List<String> getSupportedAllocationScheme() {
        if (supportedAllocationScheme == null) {
            supportedAllocationScheme = new ArrayList<>();
        }
        return this.supportedAllocationScheme;
    }

    /**
     * Gets the value of the ipAllocationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAllocationPolicy() {
        return ipAllocationPolicy;
    }

    /**
     * Sets the value of the ipAllocationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAllocationPolicy(String value) {
        this.ipAllocationPolicy = value;
    }

    /**
     * Gets the value of the supportedIpProtocol property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedIpProtocol property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedIpProtocol().add(newItem);
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
     *     The value of the supportedIpProtocol property.
     */
    public List<String> getSupportedIpProtocol() {
        if (supportedIpProtocol == null) {
            supportedIpProtocol = new ArrayList<>();
        }
        return this.supportedIpProtocol;
    }

    /**
     * Gets the value of the ipProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpProtocol() {
        return ipProtocol;
    }

    /**
     * Sets the value of the ipProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpProtocol(String value) {
        this.ipProtocol = value;
    }

}
