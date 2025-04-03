
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNvdimmDimmInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfNvdimmDimmInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NvdimmDimmInfo" type="{urn:internalvim25}NvdimmDimmInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNvdimmDimmInfo", propOrder = {
    "nvdimmDimmInfo"
})
public class ArrayOfNvdimmDimmInfo {

    @XmlElement(name = "NvdimmDimmInfo")
    protected List<NvdimmDimmInfo> nvdimmDimmInfo;

    /**
     * Gets the value of the nvdimmDimmInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nvdimmDimmInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNvdimmDimmInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NvdimmDimmInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the nvdimmDimmInfo property.
     */
    public List<NvdimmDimmInfo> getNvdimmDimmInfo() {
        if (nvdimmDimmInfo == null) {
            nvdimmDimmInfo = new ArrayList<>();
        }
        return this.nvdimmDimmInfo;
    }

}
