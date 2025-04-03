
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostConfigFailed complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostConfigFailed">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostConfigFault">
 *       <sequence>
 *         <element name="failure" type="{urn:internalvim25}LocalizedMethodFault" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigFailed", propOrder = {
    "failure"
})
public class HostConfigFailed
    extends HostConfigFault
{

    @XmlElement(required = true)
    protected List<LocalizedMethodFault> failure;

    /**
     * Gets the value of the failure property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failure property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFailure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedMethodFault }
     * </p>
     * 
     * 
     * @return
     *     The value of the failure property.
     */
    public List<LocalizedMethodFault> getFailure() {
        if (failure == null) {
            failure = new ArrayList<>();
        }
        return this.failure;
    }

}
