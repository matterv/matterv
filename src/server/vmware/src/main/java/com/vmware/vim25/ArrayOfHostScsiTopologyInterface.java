
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostScsiTopologyInterface complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostScsiTopologyInterface">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostScsiTopologyInterface" type="{urn:internalvim25}HostScsiTopologyInterface" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostScsiTopologyInterface", propOrder = {
    "hostScsiTopologyInterface"
})
public class ArrayOfHostScsiTopologyInterface {

    @XmlElement(name = "HostScsiTopologyInterface")
    protected List<HostScsiTopologyInterface> hostScsiTopologyInterface;

    /**
     * Gets the value of the hostScsiTopologyInterface property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostScsiTopologyInterface property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostScsiTopologyInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostScsiTopologyInterface }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostScsiTopologyInterface property.
     */
    public List<HostScsiTopologyInterface> getHostScsiTopologyInterface() {
        if (hostScsiTopologyInterface == null) {
            hostScsiTopologyInterface = new ArrayList<>();
        }
        return this.hostScsiTopologyInterface;
    }

}
