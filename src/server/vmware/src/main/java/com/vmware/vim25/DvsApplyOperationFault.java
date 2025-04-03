
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsApplyOperationFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsApplyOperationFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsFault">
 *       <sequence>
 *         <element name="objectFault" type="{urn:internalvim25}DvsApplyOperationFaultFaultOnObject" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsApplyOperationFault", propOrder = {
    "objectFault"
})
public class DvsApplyOperationFault
    extends DvsFault
{

    @XmlElement(required = true)
    protected List<DvsApplyOperationFaultFaultOnObject> objectFault;

    /**
     * Gets the value of the objectFault property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectFault property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getObjectFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DvsApplyOperationFaultFaultOnObject }
     * </p>
     * 
     * 
     * @return
     *     The value of the objectFault property.
     */
    public List<DvsApplyOperationFaultFaultOnObject> getObjectFault() {
        if (objectFault == null) {
            objectFault = new ArrayList<>();
        }
        return this.objectFault;
    }

}
