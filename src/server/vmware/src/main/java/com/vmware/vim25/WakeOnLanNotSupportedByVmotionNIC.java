
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WakeOnLanNotSupportedByVmotionNIC complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WakeOnLanNotSupportedByVmotionNIC">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostPowerOpFailed">
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
@XmlType(name = "WakeOnLanNotSupportedByVmotionNIC")
public class WakeOnLanNotSupportedByVmotionNIC
    extends HostPowerOpFailed
{


}
