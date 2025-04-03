
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostPtpConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostPtpConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="domain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="port" type="{urn:internalvim25}HostPtpConfigPtpPort" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPtpConfig", propOrder = {
    "domain",
    "port"
})
public class HostPtpConfig
    extends DynamicData
{

    protected Integer domain;
    protected List<HostPtpConfigPtpPort> port;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDomain(Integer value) {
        this.domain = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the port property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPtpConfigPtpPort }
     * </p>
     * 
     * 
     * @return
     *     The value of the port property.
     */
    public List<HostPtpConfigPtpPort> getPort() {
        if (port == null) {
            port = new ArrayList<>();
        }
        return this.port;
    }

}
