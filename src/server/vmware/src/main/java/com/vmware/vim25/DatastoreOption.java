
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatastoreOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatastoreOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="unsupportedVolumes" type="{urn:internalvim25}VirtualMachineDatastoreVolumeOption" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreOption", propOrder = {
    "unsupportedVolumes"
})
public class DatastoreOption
    extends DynamicData
{

    protected List<VirtualMachineDatastoreVolumeOption> unsupportedVolumes;

    /**
     * Gets the value of the unsupportedVolumes property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsupportedVolumes property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUnsupportedVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VirtualMachineDatastoreVolumeOption }
     * </p>
     * 
     * 
     * @return
     *     The value of the unsupportedVolumes property.
     */
    public List<VirtualMachineDatastoreVolumeOption> getUnsupportedVolumes() {
        if (unsupportedVolumes == null) {
            unsupportedVolumes = new ArrayList<>();
        }
        return this.unsupportedVolumes;
    }

}
