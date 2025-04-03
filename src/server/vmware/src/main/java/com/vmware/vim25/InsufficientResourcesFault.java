
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsufficientResourcesFault complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InsufficientResourcesFault">
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
@XmlType(name = "InsufficientResourcesFault")
@XmlSeeAlso({
    InsufficientAgentVmsDeployed.class,
    InsufficientCpuResourcesFault.class,
    InsufficientFailoverResourcesFault.class,
    InsufficientGraphicsResourcesFault.class,
    InsufficientMemoryResourcesFault.class,
    InsufficientNetworkCapacity.class,
    InsufficientNetworkResourcePoolCapacity.class,
    InsufficientHostCapacityFault.class,
    InsufficientStandbyResource.class,
    InsufficientStorageSpace.class,
    InsufficientVFlashResourcesFault.class,
    InvalidResourcePoolStructureFault.class,
    NumVirtualCpusExceedsLimit.class,
    VmFaultToleranceTooManyFtVcpusOnHost.class,
    VmFaultToleranceTooManyVMsOnHost.class,
    VmSmpFaultToleranceTooManyVMsOnHost.class
})
public class InsufficientResourcesFault
    extends VimFault
{


}
