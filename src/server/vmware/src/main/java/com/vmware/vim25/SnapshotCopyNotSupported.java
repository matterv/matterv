
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SnapshotCopyNotSupported complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SnapshotCopyNotSupported">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MigrationFault">
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
@XmlType(name = "SnapshotCopyNotSupported")
@XmlSeeAlso({
    HotSnapshotMoveNotSupported.class,
    SnapshotCloneNotSupported.class,
    SnapshotMoveFromNonHomeNotSupported.class,
    SnapshotMoveNotSupported.class,
    SnapshotMoveToNonHomeNotSupported.class
})
public class SnapshotCopyNotSupported
    extends MigrationFault
{


}
