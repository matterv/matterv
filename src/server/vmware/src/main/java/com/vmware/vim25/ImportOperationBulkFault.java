
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportOperationBulkFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportOperationBulkFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsFault">
 *       <sequence>
 *         <element name="importFaults" type="{urn:internalvim25}ImportOperationBulkFaultFaultOnImport" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportOperationBulkFault", propOrder = {
    "importFaults"
})
public class ImportOperationBulkFault
    extends DvsFault
{

    @XmlElement(required = true)
    protected List<ImportOperationBulkFaultFaultOnImport> importFaults;

    /**
     * Gets the value of the importFaults property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importFaults property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportFaults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportOperationBulkFaultFaultOnImport }
     * </p>
     * 
     * 
     * @return
     *     The value of the importFaults property.
     */
    public List<ImportOperationBulkFaultFaultOnImport> getImportFaults() {
        if (importFaults == null) {
            importFaults = new ArrayList<>();
        }
        return this.importFaults;
    }

}
