
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExtensionFaultTypeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfExtensionFaultTypeInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExtensionFaultTypeInfo" type="{urn:internalvim25}ExtensionFaultTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionFaultTypeInfo", propOrder = {
    "extensionFaultTypeInfo"
})
public class ArrayOfExtensionFaultTypeInfo {

    @XmlElement(name = "ExtensionFaultTypeInfo")
    protected List<ExtensionFaultTypeInfo> extensionFaultTypeInfo;

    /**
     * Gets the value of the extensionFaultTypeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionFaultTypeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExtensionFaultTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionFaultTypeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the extensionFaultTypeInfo property.
     */
    public List<ExtensionFaultTypeInfo> getExtensionFaultTypeInfo() {
        if (extensionFaultTypeInfo == null) {
            extensionFaultTypeInfo = new ArrayList<>();
        }
        return this.extensionFaultTypeInfo;
    }

}
