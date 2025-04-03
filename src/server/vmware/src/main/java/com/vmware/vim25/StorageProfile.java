
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageProfile complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StorageProfile">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ApplyProfile">
 *       <sequence>
 *         <element name="nasStorage" type="{urn:internalvim25}NasStorageProfile" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageProfile", propOrder = {
    "nasStorage"
})
public class StorageProfile
    extends ApplyProfile
{

    protected List<NasStorageProfile> nasStorage;

    /**
     * Gets the value of the nasStorage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nasStorage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNasStorage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NasStorageProfile }
     * </p>
     * 
     * 
     * @return
     *     The value of the nasStorage property.
     */
    public List<NasStorageProfile> getNasStorage() {
        if (nasStorage == null) {
            nasStorage = new ArrayList<>();
        }
        return this.nasStorage;
    }

}
