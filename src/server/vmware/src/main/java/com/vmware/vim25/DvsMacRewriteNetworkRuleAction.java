
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsMacRewriteNetworkRuleAction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsMacRewriteNetworkRuleAction">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsNetworkRuleAction">
 *       <sequence>
 *         <element name="rewriteMac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsMacRewriteNetworkRuleAction", propOrder = {
    "rewriteMac"
})
public class DvsMacRewriteNetworkRuleAction
    extends DvsNetworkRuleAction
{

    @XmlElement(required = true)
    protected String rewriteMac;

    /**
     * Gets the value of the rewriteMac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewriteMac() {
        return rewriteMac;
    }

    /**
     * Sets the value of the rewriteMac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewriteMac(String value) {
        this.rewriteMac = value;
    }

}
