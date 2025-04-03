
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmPoweredOffEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VmPoweredOffEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VmEvent">
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
@XmlType(name = "VmPoweredOffEvent")
@XmlSeeAlso({
    VmPowerOffOnIsolationEvent.class,
    VmShutdownOnIsolationEvent.class
})
public class VmPoweredOffEvent
    extends VmEvent
{


}
