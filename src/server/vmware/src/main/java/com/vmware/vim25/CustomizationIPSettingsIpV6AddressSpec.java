
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationIPSettingsIpV6AddressSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationIPSettingsIpV6AddressSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="ip" type="{urn:internalvim25}CustomizationIpV6Generator" maxOccurs="unbounded"/>
 *         <element name="gateway" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationIPSettingsIpV6AddressSpec", propOrder = {
    "ip",
    "gateway"
})
public class CustomizationIPSettingsIpV6AddressSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<CustomizationIpV6Generator> ip;
    protected List<String> gateway;

    /**
     * Gets the value of the ip property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ip property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomizationIpV6Generator }
     * </p>
     * 
     * 
     * @return
     *     The value of the ip property.
     */
    public List<CustomizationIpV6Generator> getIp() {
        if (ip == null) {
            ip = new ArrayList<>();
        }
        return this.ip;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gateway property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGateway().add(newItem);
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
     *     The value of the gateway property.
     */
    public List<String> getGateway() {
        if (gateway == null) {
            gateway = new ArrayList<>();
        }
        return this.gateway;
    }

}
