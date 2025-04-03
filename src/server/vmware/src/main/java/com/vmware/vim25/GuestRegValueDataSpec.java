
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestRegValueDataSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GuestRegValueDataSpec">
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
@XmlType(name = "GuestRegValueDataSpec")
@XmlSeeAlso({
    GuestRegValueDwordSpec.class,
    GuestRegValueQwordSpec.class,
    GuestRegValueStringSpec.class,
    GuestRegValueExpandStringSpec.class,
    GuestRegValueMultiStringSpec.class,
    GuestRegValueBinarySpec.class
})
public class GuestRegValueDataSpec
    extends DynamicData
{


}
