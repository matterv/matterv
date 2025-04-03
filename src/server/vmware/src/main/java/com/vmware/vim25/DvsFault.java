
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvsFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DvsFault">
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
@XmlType(name = "DvsFault")
@XmlSeeAlso({
    BackupBlobReadFailure.class,
    BackupBlobWriteFailure.class,
    CollectorAddressUnset.class,
    ConflictingConfiguration.class,
    DvsApplyOperationFault.class,
    DvsNotAuthorized.class,
    DvsOperationBulkFault.class,
    DvsScopeViolated.class,
    ImportHostAddFailure.class,
    ImportOperationBulkFault.class,
    InvalidIpfixConfig.class,
    RollbackFailure.class,
    SwitchIpUnset.class,
    SwitchNotInUpgradeMode.class,
    VspanDestPortConflict.class,
    VspanPortConflict.class,
    VspanPortMoveFault.class,
    VspanPortPromiscChangeFault.class,
    VspanPortgroupPromiscChangeFault.class,
    VspanPortgroupTypeChangeFault.class,
    VspanPromiscuousPortNotSupported.class,
    VspanSameSessionPortConflict.class
})
public class DvsFault
    extends VimFault
{


}
