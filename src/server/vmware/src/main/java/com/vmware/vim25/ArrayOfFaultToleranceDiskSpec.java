
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFaultToleranceDiskSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfFaultToleranceDiskSpec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FaultToleranceDiskSpec" type="{urn:internalvim25}FaultToleranceDiskSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFaultToleranceDiskSpec", propOrder = {
    "faultToleranceDiskSpec"
})
public class ArrayOfFaultToleranceDiskSpec {

    @XmlElement(name = "FaultToleranceDiskSpec")
    protected List<FaultToleranceDiskSpec> faultToleranceDiskSpec;

    /**
     * Gets the value of the faultToleranceDiskSpec property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultToleranceDiskSpec property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFaultToleranceDiskSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultToleranceDiskSpec }
     * </p>
     * 
     * 
     * @return
     *     The value of the faultToleranceDiskSpec property.
     */
    public List<FaultToleranceDiskSpec> getFaultToleranceDiskSpec() {
        if (faultToleranceDiskSpec == null) {
            faultToleranceDiskSpec = new ArrayList<>();
        }
        return this.faultToleranceDiskSpec;
    }

}
