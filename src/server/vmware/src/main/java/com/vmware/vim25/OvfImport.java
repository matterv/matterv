
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfImport complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfImport">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}OvfFault">
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
@XmlType(name = "OvfImport")
@XmlSeeAlso({
    OvfCpuCompatibility.class,
    OvfCpuCompatibilityCheckNotSupported.class,
    OvfHardwareCheck.class,
    OvfImportFailed.class,
    OvfMappedOsId.class,
    OvfMissingHardware.class,
    OvfNetworkMappingNotSupported.class,
    OvfUnsupportedDiskProvisioning.class
})
public class OvfImport
    extends OvfFault
{


}
