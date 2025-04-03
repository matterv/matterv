
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VMwareDvsLacpLoadBalanceAlgorithm</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VMwareDvsLacpLoadBalanceAlgorithm">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="srcMac"/>
 *     <enumeration value="destMac"/>
 *     <enumeration value="srcDestMac"/>
 *     <enumeration value="destIpVlan"/>
 *     <enumeration value="srcIpVlan"/>
 *     <enumeration value="srcDestIpVlan"/>
 *     <enumeration value="destTcpUdpPort"/>
 *     <enumeration value="srcTcpUdpPort"/>
 *     <enumeration value="srcDestTcpUdpPort"/>
 *     <enumeration value="destIpTcpUdpPort"/>
 *     <enumeration value="srcIpTcpUdpPort"/>
 *     <enumeration value="srcDestIpTcpUdpPort"/>
 *     <enumeration value="destIpTcpUdpPortVlan"/>
 *     <enumeration value="srcIpTcpUdpPortVlan"/>
 *     <enumeration value="srcDestIpTcpUdpPortVlan"/>
 *     <enumeration value="destIp"/>
 *     <enumeration value="srcIp"/>
 *     <enumeration value="srcDestIp"/>
 *     <enumeration value="vlan"/>
 *     <enumeration value="srcPortId"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VMwareDvsLacpLoadBalanceAlgorithm")
@XmlEnum
public enum VMwareDvsLacpLoadBalanceAlgorithm {

    @XmlEnumValue("srcMac")
    SRC_MAC("srcMac"),
    @XmlEnumValue("destMac")
    DEST_MAC("destMac"),
    @XmlEnumValue("srcDestMac")
    SRC_DEST_MAC("srcDestMac"),
    @XmlEnumValue("destIpVlan")
    DEST_IP_VLAN("destIpVlan"),
    @XmlEnumValue("srcIpVlan")
    SRC_IP_VLAN("srcIpVlan"),
    @XmlEnumValue("srcDestIpVlan")
    SRC_DEST_IP_VLAN("srcDestIpVlan"),
    @XmlEnumValue("destTcpUdpPort")
    DEST_TCP_UDP_PORT("destTcpUdpPort"),
    @XmlEnumValue("srcTcpUdpPort")
    SRC_TCP_UDP_PORT("srcTcpUdpPort"),
    @XmlEnumValue("srcDestTcpUdpPort")
    SRC_DEST_TCP_UDP_PORT("srcDestTcpUdpPort"),
    @XmlEnumValue("destIpTcpUdpPort")
    DEST_IP_TCP_UDP_PORT("destIpTcpUdpPort"),
    @XmlEnumValue("srcIpTcpUdpPort")
    SRC_IP_TCP_UDP_PORT("srcIpTcpUdpPort"),
    @XmlEnumValue("srcDestIpTcpUdpPort")
    SRC_DEST_IP_TCP_UDP_PORT("srcDestIpTcpUdpPort"),
    @XmlEnumValue("destIpTcpUdpPortVlan")
    DEST_IP_TCP_UDP_PORT_VLAN("destIpTcpUdpPortVlan"),
    @XmlEnumValue("srcIpTcpUdpPortVlan")
    SRC_IP_TCP_UDP_PORT_VLAN("srcIpTcpUdpPortVlan"),
    @XmlEnumValue("srcDestIpTcpUdpPortVlan")
    SRC_DEST_IP_TCP_UDP_PORT_VLAN("srcDestIpTcpUdpPortVlan"),
    @XmlEnumValue("destIp")
    DEST_IP("destIp"),
    @XmlEnumValue("srcIp")
    SRC_IP("srcIp"),
    @XmlEnumValue("srcDestIp")
    SRC_DEST_IP("srcDestIp"),
    @XmlEnumValue("vlan")
    VLAN("vlan"),
    @XmlEnumValue("srcPortId")
    SRC_PORT_ID("srcPortId");
    private final String value;

    VMwareDvsLacpLoadBalanceAlgorithm(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static VMwareDvsLacpLoadBalanceAlgorithm fromValue(String v) {
        for (VMwareDvsLacpLoadBalanceAlgorithm c: VMwareDvsLacpLoadBalanceAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
