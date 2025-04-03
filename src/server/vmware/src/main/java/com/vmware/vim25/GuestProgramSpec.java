
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestProgramSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestProgramSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="programPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="arguments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="workingDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="envVariables" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestProgramSpec", propOrder = {
    "programPath",
    "arguments",
    "workingDirectory",
    "envVariables"
})
@XmlSeeAlso({
    GuestWindowsProgramSpec.class
})
public class GuestProgramSpec
    extends DynamicData
{

    @XmlElement(required = true)
    protected String programPath;
    @XmlElement(required = true)
    protected String arguments;
    protected String workingDirectory;
    protected List<String> envVariables;

    /**
     * Gets the value of the programPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramPath() {
        return programPath;
    }

    /**
     * Sets the value of the programPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramPath(String value) {
        this.programPath = value;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArguments(String value) {
        this.arguments = value;
    }

    /**
     * Gets the value of the workingDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * Sets the value of the workingDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingDirectory(String value) {
        this.workingDirectory = value;
    }

    /**
     * Gets the value of the envVariables property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the envVariables property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEnvVariables().add(newItem);
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
     *     The value of the envVariables property.
     */
    public List<String> getEnvVariables() {
        if (envVariables == null) {
            envVariables = new ArrayList<>();
        }
        return this.envVariables;
    }

}
