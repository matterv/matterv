
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostAuthenticationManagerInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostAuthenticationManagerInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="authConfig" type="{urn:internalvim25}HostAuthenticationStoreInfo" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAuthenticationManagerInfo", propOrder = {
    "authConfig"
})
public class HostAuthenticationManagerInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected List<HostAuthenticationStoreInfo> authConfig;

    /**
     * Gets the value of the authConfig property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authConfig property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAuthConfig().add(newItem);
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
     *     The value of the authConfig property.
     */
    public List<HostAuthenticationStoreInfo> getAuthConfig() {
        if (authConfig == null) {
            authConfig = new ArrayList<>();
        }
        return this.authConfig;
    }

}
