
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for HostDistributedVirtualSwitchManagerFailoverStage</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HostDistributedVirtualSwitchManagerFailoverStage">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STAGE_1"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HostDistributedVirtualSwitchManagerFailoverStage")
@XmlEnum
public enum HostDistributedVirtualSwitchManagerFailoverStage {

    STAGE_1;

    public String value() {
        return name();
    }

    public static HostDistributedVirtualSwitchManagerFailoverStage fromValue(String v) {
        return valueOf(v);
    }

}
