
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsUpdateTagNetworkRuleAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsUpdateTagNetworkRuleAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsNetworkRuleAction">
 *       <sequence>
 *         <element name="qosTag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="dscpTag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsUpdateTagNetworkRuleAction", propOrder = {
    "qosTag",
    "dscpTag"
})
public class DvsUpdateTagNetworkRuleAction
    extends DvsNetworkRuleAction
{

    protected Integer qosTag;
    protected Integer dscpTag;

    /**
     * Gets the value of the qosTag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQosTag() {
        return qosTag;
    }

    /**
     * Sets the value of the qosTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQosTag(Integer value) {
        this.qosTag = value;
    }

    /**
     * Gets the value of the dscpTag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDscpTag() {
        return dscpTag;
    }

    /**
     * Sets the value of the dscpTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDscpTag(Integer value) {
        this.dscpTag = value;
    }

}
