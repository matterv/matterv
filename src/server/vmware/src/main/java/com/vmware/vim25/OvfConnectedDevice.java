
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfConnectedDevice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfConnectedDevice">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfHardwareExport">
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
@XmlType(name = "OvfConnectedDevice")
@XmlSeeAlso({
    OvfConnectedDeviceFloppy.class,
    OvfConnectedDeviceIso.class
})
public class OvfConnectedDevice
    extends OvfHardwareExport
{


}
