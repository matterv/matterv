
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostNetStackInstance complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostNetStackInstance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostNetStackInstance" type="{urn:internalvim25}HostNetStackInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNetStackInstance", propOrder = {
    "hostNetStackInstance"
})
public class ArrayOfHostNetStackInstance {

    @XmlElement(name = "HostNetStackInstance")
    protected List<HostNetStackInstance> hostNetStackInstance;

    /**
     * Gets the value of the hostNetStackInstance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostNetStackInstance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostNetStackInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostNetStackInstance }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostNetStackInstance property.
     */
    public List<HostNetStackInstance> getHostNetStackInstance() {
        if (hostNetStackInstance == null) {
            hostNetStackInstance = new ArrayList<>();
        }
        return this.hostNetStackInstance;
    }

}
