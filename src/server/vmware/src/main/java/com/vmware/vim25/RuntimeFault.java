
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuntimeFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RuntimeFault">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}MethodFault">
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
@XmlType(name = "RuntimeFault")
@XmlSeeAlso({
    HostCommunication.class,
    ManagedObjectNotFound.class,
    InvalidRequest.class,
    NotImplemented.class,
    RequestCanceled.class,
    SystemError.class,
    UnexpectedFault.class,
    CannotDisableDrsOnClustersWithVApps.class,
    ConflictingDatastoreFound.class,
    DatabaseError.class,
    DisallowedChangeByService.class,
    DisallowedOperationOnFailoverHost.class,
    FailToLockFaultToleranceVMs.class,
    NotSupported.class,
    InvalidArgument.class,
    InvalidProfileReferenceHost.class,
    InvalidScheduledTask.class,
    LicenseAssignmentFailed.class,
    MethodAlreadyDisabledFault.class,
    MethodDisabled.class,
    OperationDisallowedOnHost.class,
    RestrictedByAdministrator.class,
    SecurityError.class,
    ThirdPartyLicenseAssignmentFailed.class,
    VAppOperationInProgress.class,
    NotEnoughLicenses.class
})
public class RuntimeFault
    extends MethodFault
{


}
