
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionEvent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SessionEvent">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}Event">
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
@XmlType(name = "SessionEvent")
@XmlSeeAlso({
    ServerStartedSessionEvent.class,
    UserLoginSessionEvent.class,
    UserLogoutSessionEvent.class,
    BadUsernameSessionEvent.class,
    AlreadyAuthenticatedSessionEvent.class,
    NoAccessUserEvent.class,
    SessionTerminatedEvent.class,
    GlobalMessageChangedEvent.class
})
public class SessionEvent
    extends Event
{


}
