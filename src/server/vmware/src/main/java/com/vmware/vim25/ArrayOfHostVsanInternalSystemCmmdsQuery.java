
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostVsanInternalSystemCmmdsQuery complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostVsanInternalSystemCmmdsQuery">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostVsanInternalSystemCmmdsQuery" type="{urn:internalvim25}HostVsanInternalSystemCmmdsQuery" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVsanInternalSystemCmmdsQuery", propOrder = {
    "hostVsanInternalSystemCmmdsQuery"
})
public class ArrayOfHostVsanInternalSystemCmmdsQuery {

    @XmlElement(name = "HostVsanInternalSystemCmmdsQuery")
    protected List<HostVsanInternalSystemCmmdsQuery> hostVsanInternalSystemCmmdsQuery;

    /**
     * Gets the value of the hostVsanInternalSystemCmmdsQuery property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostVsanInternalSystemCmmdsQuery property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostVsanInternalSystemCmmdsQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostVsanInternalSystemCmmdsQuery }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostVsanInternalSystemCmmdsQuery property.
     */
    public List<HostVsanInternalSystemCmmdsQuery> getHostVsanInternalSystemCmmdsQuery() {
        if (hostVsanInternalSystemCmmdsQuery == null) {
            hostVsanInternalSystemCmmdsQuery = new ArrayList<>();
        }
        return this.hostVsanInternalSystemCmmdsQuery;
    }

}
