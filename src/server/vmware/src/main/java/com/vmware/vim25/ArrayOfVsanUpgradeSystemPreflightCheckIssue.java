
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVsanUpgradeSystemPreflightCheckIssue complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfVsanUpgradeSystemPreflightCheckIssue">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VsanUpgradeSystemPreflightCheckIssue" type="{urn:internalvim25}VsanUpgradeSystemPreflightCheckIssue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVsanUpgradeSystemPreflightCheckIssue", propOrder = {
    "vsanUpgradeSystemPreflightCheckIssue"
})
public class ArrayOfVsanUpgradeSystemPreflightCheckIssue {

    @XmlElement(name = "VsanUpgradeSystemPreflightCheckIssue")
    protected List<VsanUpgradeSystemPreflightCheckIssue> vsanUpgradeSystemPreflightCheckIssue;

    /**
     * Gets the value of the vsanUpgradeSystemPreflightCheckIssue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsanUpgradeSystemPreflightCheckIssue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVsanUpgradeSystemPreflightCheckIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VsanUpgradeSystemPreflightCheckIssue }
     * </p>
     * 
     * 
     * @return
     *     The value of the vsanUpgradeSystemPreflightCheckIssue property.
     */
    public List<VsanUpgradeSystemPreflightCheckIssue> getVsanUpgradeSystemPreflightCheckIssue() {
        if (vsanUpgradeSystemPreflightCheckIssue == null) {
            vsanUpgradeSystemPreflightCheckIssue = new ArrayList<>();
        }
        return this.vsanUpgradeSystemPreflightCheckIssue;
    }

}
