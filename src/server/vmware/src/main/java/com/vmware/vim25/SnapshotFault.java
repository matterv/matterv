
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SnapshotFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SnapshotFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
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
@XmlType(name = "SnapshotFault")
@XmlSeeAlso({
    ApplicationQuiesceFault.class,
    FilesystemQuiesceFault.class,
    MemorySnapshotOnIndependentDisk.class,
    MultipleSnapshotsNotSupported.class,
    SnapshotDisabled.class,
    SnapshotIncompatibleDeviceInVm.class,
    SnapshotLocked.class,
    SnapshotNoChange.class,
    TooManySnapshotLevels.class
})
public class SnapshotFault
    extends VimFault
{


}
