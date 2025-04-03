
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SessionManagerHttpServiceRequestSpecMethod</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SessionManagerHttpServiceRequestSpecMethod">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="httpOptions"/>
 *     <enumeration value="httpGet"/>
 *     <enumeration value="httpHead"/>
 *     <enumeration value="httpPost"/>
 *     <enumeration value="httpPut"/>
 *     <enumeration value="httpDelete"/>
 *     <enumeration value="httpTrace"/>
 *     <enumeration value="httpConnect"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SessionManagerHttpServiceRequestSpecMethod")
@XmlEnum
public enum SessionManagerHttpServiceRequestSpecMethod {

    @XmlEnumValue("httpOptions")
    HTTP_OPTIONS("httpOptions"),
    @XmlEnumValue("httpGet")
    HTTP_GET("httpGet"),
    @XmlEnumValue("httpHead")
    HTTP_HEAD("httpHead"),
    @XmlEnumValue("httpPost")
    HTTP_POST("httpPost"),
    @XmlEnumValue("httpPut")
    HTTP_PUT("httpPut"),
    @XmlEnumValue("httpDelete")
    HTTP_DELETE("httpDelete"),
    @XmlEnumValue("httpTrace")
    HTTP_TRACE("httpTrace"),
    @XmlEnumValue("httpConnect")
    HTTP_CONNECT("httpConnect");
    private final String value;

    SessionManagerHttpServiceRequestSpecMethod(String v) {
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
    public static SessionManagerHttpServiceRequestSpecMethod fromValue(String v) {
        for (SessionManagerHttpServiceRequestSpecMethod c: SessionManagerHttpServiceRequestSpecMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
