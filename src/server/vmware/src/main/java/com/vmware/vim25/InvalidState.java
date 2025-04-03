
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InvalidState">
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
@XmlType(name = "InvalidState")
@XmlSeeAlso({
    CannotPowerOffVmInCluster.class,
    EncryptionKeyRequired.class,
    InvalidDatastoreState.class,
    InvalidHostState.class,
    InvalidPowerState.class,
    InvalidVmState.class,
    MksConnectionLimitReached.class,
    NoActiveHostInCluster.class,
    OvfConsumerPowerOnFault.class,
    QuestionPending.class,
    VmPowerOnDisabled.class
})
public class InvalidState
    extends VimFault
{


}
