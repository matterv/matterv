
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsOperationBulkFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsOperationBulkFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsFault">
 *       <sequence>
 *         <element name="hostFault" type="{urn:internalvim25}DvsOperationBulkFaultFaultOnHost" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsOperationBulkFault", propOrder = {
    "hostFault"
})
public class DvsOperationBulkFault
    extends DvsFault
{

    @XmlElement(required = true)
    protected List<DvsOperationBulkFaultFaultOnHost> hostFault;

    /**
     * Gets the value of the hostFault property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostFault property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHostFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DvsOperationBulkFaultFaultOnHost }
     * </p>
     * 
     * 
     * @return
     *     The value of the hostFault property.
     */
    public List<DvsOperationBulkFaultFaultOnHost> getHostFault() {
        if (hostFault == null) {
            hostFault = new ArrayList<>();
        }
        return this.hostFault;
    }

}
