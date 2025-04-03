
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvfExport complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OvfExport">
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
@XmlType(name = "OvfExport")
@XmlSeeAlso({
    ConnectedIso.class,
    OvfDuplicatedPropertyIdExport.class,
    OvfDuplicatedPropertyIdImport.class,
    OvfExportFailed.class,
    OvfPropertyExport.class,
    OvfPropertyNetworkExport.class,
    OvfHardwareExport.class
})
public class OvfExport
    extends OvfFault
{


}
