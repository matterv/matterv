
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatchMissingDependencies complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PatchMissingDependencies">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}PatchNotApplicable">
 *       <sequence>
 *         <element name="prerequisitePatch" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="prerequisiteLib" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatchMissingDependencies", propOrder = {
    "prerequisitePatch",
    "prerequisiteLib"
})
public class PatchMissingDependencies
    extends PatchNotApplicable
{

    protected List<String> prerequisitePatch;
    protected List<String> prerequisiteLib;

    /**
     * Gets the value of the prerequisitePatch property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prerequisitePatch property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrerequisitePatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the prerequisitePatch property.
     */
    public List<String> getPrerequisitePatch() {
        if (prerequisitePatch == null) {
            prerequisitePatch = new ArrayList<>();
        }
        return this.prerequisitePatch;
    }

    /**
     * Gets the value of the prerequisiteLib property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prerequisiteLib property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrerequisiteLib().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the prerequisiteLib property.
     */
    public List<String> getPrerequisiteLib() {
        if (prerequisiteLib == null) {
            prerequisiteLib = new ArrayList<>();
        }
        return this.prerequisiteLib;
    }

}
