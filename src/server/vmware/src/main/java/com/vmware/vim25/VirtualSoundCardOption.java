
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualSoundCardOption complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualSoundCardOption">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VirtualDeviceOption">
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
@XmlType(name = "VirtualSoundCardOption")
@XmlSeeAlso({
    VirtualEnsoniq1371Option.class,
    VirtualHdAudioCardOption.class,
    VirtualSoundBlaster16Option.class
})
public class VirtualSoundCardOption
    extends VirtualDeviceOption
{


}
