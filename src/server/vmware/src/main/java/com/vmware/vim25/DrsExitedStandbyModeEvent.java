
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrsExitedStandbyModeEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DrsExitedStandbyModeEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}ExitedStandbyModeEvent">
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
@XmlType(name = "DrsExitedStandbyModeEvent")
public class DrsExitedStandbyModeEvent
    extends ExitedStandbyModeEvent
{


}
