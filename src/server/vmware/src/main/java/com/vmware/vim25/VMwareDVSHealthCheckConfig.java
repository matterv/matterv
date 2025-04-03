
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSHealthCheckConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSHealthCheckConfig">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DVSHealthCheckConfig">
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
@XmlType(name = "VMwareDVSHealthCheckConfig")
@XmlSeeAlso({
    VMwareDVSVlanMtuHealthCheckConfig.class,
    VMwareDVSTeamingHealthCheckConfig.class
})
public class VMwareDVSHealthCheckConfig
    extends DVSHealthCheckConfig
{


}
