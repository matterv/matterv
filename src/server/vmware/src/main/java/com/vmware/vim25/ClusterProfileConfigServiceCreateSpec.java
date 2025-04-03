
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterProfileConfigServiceCreateSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterProfileConfigServiceCreateSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterProfileConfigSpec">
 *       <sequence>
 *         <element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterProfileConfigServiceCreateSpec", propOrder = {
    "serviceType"
})
public class ClusterProfileConfigServiceCreateSpec
    extends ClusterProfileConfigSpec
{

    protected List<String> serviceType;

    /**
     * Gets the value of the serviceType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceType().add(newItem);
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
     *     The value of the serviceType property.
     */
    public List<String> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<>();
        }
        return this.serviceType;
    }

}
