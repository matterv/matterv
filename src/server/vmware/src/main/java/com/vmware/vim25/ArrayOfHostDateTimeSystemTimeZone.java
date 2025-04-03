
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostDateTimeSystemTimeZone complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostDateTimeSystemTimeZone">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostDateTimeSystemTimeZone" type="{urn:internalvim25}HostDateTimeSystemTimeZone" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDateTimeSystemTimeZone", propOrder = {
    "hostDateTimeSystemTimeZone"
})
public class ArrayOfHostDateTimeSystemTimeZone {

    @XmlElement(name = "HostDateTimeSystemTimeZone")
    protected List<HostDateTimeSystemTimeZone> hostDateTimeSystemTimeZone;

    /**
     * Gets the value of the hostDateTimeSystemTimeZone property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostDateTimeSystemTimeZone property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostDateTimeSystemTimeZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostDateTimeSystemTimeZone }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostDateTimeSystemTimeZone property.
     */
    public List<HostDateTimeSystemTimeZone> getHostDateTimeSystemTimeZone() {
        if (hostDateTimeSystemTimeZone == null) {
            hostDateTimeSystemTimeZone = new ArrayList<>();
        }
        return this.hostDateTimeSystemTimeZone;
    }

}
