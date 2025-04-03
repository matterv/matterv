
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostAccountSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostAccountSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostAccountSpec" type="{urn:internalvim25}HostAccountSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostAccountSpec", propOrder = {
    "hostAccountSpec"
})
public class ArrayOfHostAccountSpec {

    @XmlElement(name = "HostAccountSpec")
    protected List<HostAccountSpec> hostAccountSpec;

    /**
     * Gets the value of the hostAccountSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostAccountSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostAccountSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostAccountSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostAccountSpec property.
     */
    public List<HostAccountSpec> getHostAccountSpec() {
        if (hostAccountSpec == null) {
            hostAccountSpec = new ArrayList<>();
        }
        return this.hostAccountSpec;
    }

}
