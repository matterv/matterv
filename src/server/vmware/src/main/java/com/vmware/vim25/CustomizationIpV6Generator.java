
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationIpV6Generator complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CustomizationIpV6Generator">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
 *       <sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationIpV6Generator")
@XmlSeeAlso({
    CustomizationDhcpIpV6Generator.class,
    CustomizationStatelessIpV6Generator.class,
    CustomizationFixedIpV6 .class,
    CustomizationAutoIpV6Generator.class,
    CustomizationUnknownIpV6Generator.class,
    CustomizationCustomIpV6Generator.class
})
public class CustomizationIpV6Generator
    extends DynamicData
{


}
