
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HttpNfcLeaseDatastoreLeaseInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HttpNfcLeaseDatastoreLeaseInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="datastoreKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hosts" type="{urn:internalvim25}HttpNfcLeaseHostInfo" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseDatastoreLeaseInfo", propOrder = {
    "datastoreKey",
    "hosts"
})
public class HttpNfcLeaseDatastoreLeaseInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String datastoreKey;
    @XmlElement(required = true)
    protected List<HttpNfcLeaseHostInfo> hosts;

    /**
     * Gets the value of the datastoreKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatastoreKey() {
        return datastoreKey;
    }

    /**
     * Sets the value of the datastoreKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatastoreKey(String value) {
        this.datastoreKey = value;
    }

    /**
     * Gets the value of the hosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HttpNfcLeaseHostInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hosts property.
     */
    public List<HttpNfcLeaseHostInfo> getHosts() {
        if (hosts == null) {
            hosts = new ArrayList<>();
        }
        return this.hosts;
    }

}
