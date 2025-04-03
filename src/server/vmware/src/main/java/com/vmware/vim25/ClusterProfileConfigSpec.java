
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClusterProfileConfigSpec complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClusterProfileConfigSpec">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ClusterProfileCreateSpec">
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
@XmlType(name = "ClusterProfileConfigSpec")
@XmlSeeAlso({
    ClusterProfileCompleteConfigSpec.class,
    ClusterProfileConfigServiceCreateSpec.class
})
public class ClusterProfileConfigSpec
    extends ClusterProfileCreateSpec
{


}
