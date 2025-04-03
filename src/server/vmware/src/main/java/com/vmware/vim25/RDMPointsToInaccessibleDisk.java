
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RDMPointsToInaccessibleDisk complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RDMPointsToInaccessibleDisk">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CannotAccessVmDisk">
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
@XmlType(name = "RDMPointsToInaccessibleDisk")
public class RDMPointsToInaccessibleDisk
    extends CannotAccessVmDisk
{


}
