
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DVSFilterSpecVlanSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DVSFilterSpecVlanSpec">
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
@XmlType(name = "DVSFilterSpecVlanSpec")
@XmlSeeAlso({
    DVSFilterSpecPvlanSpec.class,
    DVSFilterSpecVlanIdSpec.class,
    DVSFilterSpecTrunkVlanSpec.class
})
public class DVSFilterSpecVlanSpec
    extends DynamicData
{


}
