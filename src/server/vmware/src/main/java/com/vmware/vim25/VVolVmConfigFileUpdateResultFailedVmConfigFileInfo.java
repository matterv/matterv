
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VVolVmConfigFileUpdateResultFailedVmConfigFileInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VVolVmConfigFileUpdateResultFailedVmConfigFileInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="targetConfigVVolId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dsPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fault" type="{urn:internalvim25}LocalizedMethodFault"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VVolVmConfigFileUpdateResultFailedVmConfigFileInfo", propOrder = {
    "targetConfigVVolId",
    "dsPath",
    "fault"
})
public class VVolVmConfigFileUpdateResultFailedVmConfigFileInfo
    extends DynamicData
{

    @XmlElement(required = true)
    protected String targetConfigVVolId;
    protected String dsPath;
    @XmlElement(required = true)
    protected LocalizedMethodFault fault;

    /**
     * Gets the value of the targetConfigVVolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetConfigVVolId() {
        return targetConfigVVolId;
    }

    /**
     * Sets the value of the targetConfigVVolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetConfigVVolId(String value) {
        this.targetConfigVVolId = value;
    }

    /**
     * Gets the value of the dsPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsPath() {
        return dsPath;
    }

    /**
     * Sets the value of the dsPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsPath(String value) {
        this.dsPath = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public LocalizedMethodFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedMethodFault }
     *     
     */
    public void setFault(LocalizedMethodFault value) {
        this.fault = value;
    }

}
