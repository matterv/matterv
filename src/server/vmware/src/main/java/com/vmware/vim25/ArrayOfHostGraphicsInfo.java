
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostGraphicsInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHostGraphicsInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostGraphicsInfo" type="{urn:internalvim25}HostGraphicsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostGraphicsInfo", propOrder = {
    "hostGraphicsInfo"
})
public class ArrayOfHostGraphicsInfo {

    @XmlElement(name = "HostGraphicsInfo")
    protected List<HostGraphicsInfo> hostGraphicsInfo;

    /**
     * Gets the value of the hostGraphicsInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostGraphicsInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostGraphicsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostGraphicsInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostGraphicsInfo property.
     */
    public List<HostGraphicsInfo> getHostGraphicsInfo() {
        if (hostGraphicsInfo == null) {
            hostGraphicsInfo = new ArrayList<>();
        }
        return this.hostGraphicsInfo;
    }

}
