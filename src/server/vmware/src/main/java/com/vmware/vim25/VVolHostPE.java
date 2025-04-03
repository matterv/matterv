
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VVolHostPE complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VVolHostPE">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="key" type="{urn:internalvim25}ManagedObjectReference"/>
 *         <element name="protocolEndpoint" type="{urn:internalvim25}HostProtocolEndpoint" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VVolHostPE", propOrder = {
    "key",
    "protocolEndpoint"
})
public class VVolHostPE
    extends DynamicData
{

    @XmlElement(required = true)
    protected ManagedObjectReference key;
    @XmlElement(required = true)
    protected List<HostProtocolEndpoint> protocolEndpoint;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setKey(ManagedObjectReference value) {
        this.key = value;
    }

    /**
     * Gets the value of the protocolEndpoint property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocolEndpoint property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProtocolEndpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostProtocolEndpoint }
     * </p>
     * 
     * 
     * @return
     *     The value of the protocolEndpoint property.
     */
    public List<HostProtocolEndpoint> getProtocolEndpoint() {
        if (protocolEndpoint == null) {
            protocolEndpoint = new ArrayList<>();
        }
        return this.protocolEndpoint;
    }

}
