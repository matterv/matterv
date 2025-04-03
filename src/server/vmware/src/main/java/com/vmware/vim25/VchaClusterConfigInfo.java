
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VchaClusterConfigInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VchaClusterConfigInfo">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *         <element name="failoverNodeInfo1" type="{urn:internalvim25}FailoverNodeInfo" minOccurs="0"/>
 *         <element name="failoverNodeInfo2" type="{urn:internalvim25}FailoverNodeInfo" minOccurs="0"/>
 *         <element name="witnessNodeInfo" type="{urn:internalvim25}WitnessNodeInfo" minOccurs="0"/>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaClusterConfigInfo", propOrder = {
    "failoverNodeInfo1",
    "failoverNodeInfo2",
    "witnessNodeInfo",
    "state"
})
public class VchaClusterConfigInfo
    extends DynamicData
{

    protected FailoverNodeInfo failoverNodeInfo1;
    protected FailoverNodeInfo failoverNodeInfo2;
    protected WitnessNodeInfo witnessNodeInfo;
    @XmlElement(required = true)
    protected String state;

    /**
     * Gets the value of the failoverNodeInfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link FailoverNodeInfo }
     *     
     */
    public FailoverNodeInfo getFailoverNodeInfo1() {
        return failoverNodeInfo1;
    }

    /**
     * Sets the value of the failoverNodeInfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailoverNodeInfo }
     *     
     */
    public void setFailoverNodeInfo1(FailoverNodeInfo value) {
        this.failoverNodeInfo1 = value;
    }

    /**
     * Gets the value of the failoverNodeInfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link FailoverNodeInfo }
     *     
     */
    public FailoverNodeInfo getFailoverNodeInfo2() {
        return failoverNodeInfo2;
    }

    /**
     * Sets the value of the failoverNodeInfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailoverNodeInfo }
     *     
     */
    public void setFailoverNodeInfo2(FailoverNodeInfo value) {
        this.failoverNodeInfo2 = value;
    }

    /**
     * Gets the value of the witnessNodeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WitnessNodeInfo }
     *     
     */
    public WitnessNodeInfo getWitnessNodeInfo() {
        return witnessNodeInfo;
    }

    /**
     * Sets the value of the witnessNodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessNodeInfo }
     *     
     */
    public void setWitnessNodeInfo(WitnessNodeInfo value) {
        this.witnessNodeInfo = value;
    }

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

}
