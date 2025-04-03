
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExtensionTaskTypeInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfExtensionTaskTypeInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExtensionTaskTypeInfo" type="{urn:internalvim25}ExtensionTaskTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtensionTaskTypeInfo", propOrder = {
    "extensionTaskTypeInfo"
})
public class ArrayOfExtensionTaskTypeInfo {

    @XmlElement(name = "ExtensionTaskTypeInfo")
    protected List<ExtensionTaskTypeInfo> extensionTaskTypeInfo;

    /**
     * Gets the value of the extensionTaskTypeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionTaskTypeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExtensionTaskTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionTaskTypeInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the extensionTaskTypeInfo property.
     */
    public List<ExtensionTaskTypeInfo> getExtensionTaskTypeInfo() {
        if (extensionTaskTypeInfo == null) {
            extensionTaskTypeInfo = new ArrayList<>();
        }
        return this.extensionTaskTypeInfo;
    }

}
