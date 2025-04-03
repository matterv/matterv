
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostAuthenticationStoreInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostAuthenticationStoreInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostAuthenticationStoreInfo" type="{urn:internalvim25}HostAuthenticationStoreInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostAuthenticationStoreInfo", propOrder = {
    "hostAuthenticationStoreInfo"
})
public class ArrayOfHostAuthenticationStoreInfo {

    @XmlElement(name = "HostAuthenticationStoreInfo")
    protected List<HostAuthenticationStoreInfo> hostAuthenticationStoreInfo;

    /**
     * Gets the value of the hostAuthenticationStoreInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostAuthenticationStoreInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostAuthenticationStoreInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostAuthenticationStoreInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostAuthenticationStoreInfo property.
     */
    public List<HostAuthenticationStoreInfo> getHostAuthenticationStoreInfo() {
        if (hostAuthenticationStoreInfo == null) {
            hostAuthenticationStoreInfo = new ArrayList<>();
        }
        return this.hostAuthenticationStoreInfo;
    }

}
