
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsSystemTrafficNetworkRuleQualifier complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsSystemTrafficNetworkRuleQualifier">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DvsNetworkRuleQualifier">
 *       <sequence>
 *         <element name="typeOfSystemTraffic" type="{urn:internalvim25}StringExpression" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsSystemTrafficNetworkRuleQualifier", propOrder = {
    "typeOfSystemTraffic"
})
public class DvsSystemTrafficNetworkRuleQualifier
    extends DvsNetworkRuleQualifier
{

    protected StringExpression typeOfSystemTraffic;

    /**
     * Gets the value of the typeOfSystemTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link StringExpression }
     *     
     */
    public StringExpression getTypeOfSystemTraffic() {
        return typeOfSystemTraffic;
    }

    /**
     * Sets the value of the typeOfSystemTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringExpression }
     *     
     */
    public void setTypeOfSystemTraffic(StringExpression value) {
        this.typeOfSystemTraffic = value;
    }

}
