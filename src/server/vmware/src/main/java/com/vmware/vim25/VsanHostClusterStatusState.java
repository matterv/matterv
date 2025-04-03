
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VsanHostClusterStatusState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VsanHostClusterStatusState">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="completion" type="{urn:internalvim25}VsanHostClusterStatusStateCompletionEstimate" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostClusterStatusState", propOrder = {
    "state",
    "completion"
})
public class VsanHostClusterStatusState
    extends DynamicData
{

    @XmlElement(required = true)
    protected String state;
    protected VsanHostClusterStatusStateCompletionEstimate completion;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the completion property.
     * 
     * @return
     *     possible object is
     *     {@link VsanHostClusterStatusStateCompletionEstimate }
     *     
     */
    public VsanHostClusterStatusStateCompletionEstimate getCompletion() {
        return completion;
    }

    /**
     * Sets the value of the completion property.
     * 
     * @param value
     *     allowed object is
     *     {@link VsanHostClusterStatusStateCompletionEstimate }
     *     
     */
    public void setCompletion(VsanHostClusterStatusStateCompletionEstimate value) {
        this.completion = value;
    }

}
