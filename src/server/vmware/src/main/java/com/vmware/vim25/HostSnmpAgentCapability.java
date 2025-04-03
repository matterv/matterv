
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostSnmpAgentCapability</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostSnmpAgentCapability">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMPLETE"/>
 *     <enumeration value="DIAGNOSTICS"/>
 *     <enumeration value="CONFIGURATION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostSnmpAgentCapability")
@XmlEnum
public enum HostSnmpAgentCapability {

    COMPLETE,
    DIAGNOSTICS,
    CONFIGURATION;

    public String value() {
        return name();
    }

    public static HostSnmpAgentCapability fromValue(String v) {
        return valueOf(v);
    }

}
