
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDpuStatusInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDpuStatusInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DpuStatusInfo" type="{urn:internalvim25}DpuStatusInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDpuStatusInfo", propOrder = {
    "dpuStatusInfo"
})
public class ArrayOfDpuStatusInfo {

    @XmlElement(name = "DpuStatusInfo")
    protected List<DpuStatusInfo> dpuStatusInfo;

    /**
     * Gets the value of the dpuStatusInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dpuStatusInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDpuStatusInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DpuStatusInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the dpuStatusInfo property.
     */
    public List<DpuStatusInfo> getDpuStatusInfo() {
        if (dpuStatusInfo == null) {
            dpuStatusInfo = new ArrayList<>();
        }
        return this.dpuStatusInfo;
    }

}
