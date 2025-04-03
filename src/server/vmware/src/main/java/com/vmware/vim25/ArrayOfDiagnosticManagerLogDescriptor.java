
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDiagnosticManagerLogDescriptor complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDiagnosticManagerLogDescriptor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DiagnosticManagerLogDescriptor" type="{urn:internalvim25}DiagnosticManagerLogDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticManagerLogDescriptor", propOrder = {
    "diagnosticManagerLogDescriptor"
})
public class ArrayOfDiagnosticManagerLogDescriptor {

    @XmlElement(name = "DiagnosticManagerLogDescriptor")
    protected List<DiagnosticManagerLogDescriptor> diagnosticManagerLogDescriptor;

    /**
     * Gets the value of the diagnosticManagerLogDescriptor property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosticManagerLogDescriptor property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiagnosticManagerLogDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticManagerLogDescriptor }
     * </p>
     * 
     * 
     * @return
     *     The value of the diagnosticManagerLogDescriptor property.
     */
    public List<DiagnosticManagerLogDescriptor> getDiagnosticManagerLogDescriptor() {
        if (diagnosticManagerLogDescriptor == null) {
            diagnosticManagerLogDescriptor = new ArrayList<>();
        }
        return this.diagnosticManagerLogDescriptor;
    }

}
