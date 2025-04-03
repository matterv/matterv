
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostTargetTransport complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostTargetTransport">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}DynamicData">
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
@XmlType(name = "HostTargetTransport")
@XmlSeeAlso({
    HostParallelScsiTargetTransport.class,
    HostBlockAdapterTargetTransport.class,
    HostSerialAttachedTargetTransport.class,
    HostInternetScsiTargetTransport.class,
    HostFibreChannelTargetTransport.class,
    HostPcieTargetTransport.class,
    HostRdmaTargetTransport.class,
    HostTcpTargetTransport.class
})
public class HostTargetTransport
    extends DynamicData
{


}
