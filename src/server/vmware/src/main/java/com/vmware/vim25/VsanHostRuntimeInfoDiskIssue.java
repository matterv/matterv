
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostRuntimeInfoDiskIssue complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostRuntimeInfoDiskIssue">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="diskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="issue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostRuntimeInfoDiskIssue", propOrder = {
    "diskId",
    "issue"
})
public class VsanHostRuntimeInfoDiskIssue
    extends DynamicData
{

    @XmlElement(required = true)
    protected String diskId;
    @XmlElement(required = true)
    protected String issue;

    /**
     * Gets the value of the diskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * Sets the value of the diskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskId(String value) {
        this.diskId = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

}
