
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MismatchedBundle complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MismatchedBundle">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}VimFault">
 *       <sequence>
 *         <element name="bundleUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hostUuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="bundleBuildNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="hostBuildNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MismatchedBundle", propOrder = {
    "bundleUuid",
    "hostUuid",
    "bundleBuildNumber",
    "hostBuildNumber"
})
public class MismatchedBundle
    extends VimFault
{

    @XmlElement(required = true)
    protected String bundleUuid;
    @XmlElement(required = true)
    protected String hostUuid;
    protected int bundleBuildNumber;
    protected int hostBuildNumber;

    /**
     * Gets the value of the bundleUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleUuid() {
        return bundleUuid;
    }

    /**
     * Sets the value of the bundleUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleUuid(String value) {
        this.bundleUuid = value;
    }

    /**
     * Gets the value of the hostUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostUuid() {
        return hostUuid;
    }

    /**
     * Sets the value of the hostUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostUuid(String value) {
        this.hostUuid = value;
    }

    /**
     * Gets the value of the bundleBuildNumber property.
     * 
     */
    public int getBundleBuildNumber() {
        return bundleBuildNumber;
    }

    /**
     * Sets the value of the bundleBuildNumber property.
     * 
     */
    public void setBundleBuildNumber(int value) {
        this.bundleBuildNumber = value;
    }

    /**
     * Gets the value of the hostBuildNumber property.
     * 
     */
    public int getHostBuildNumber() {
        return hostBuildNumber;
    }

    /**
     * Sets the value of the hostBuildNumber property.
     * 
     */
    public void setHostBuildNumber(int value) {
        this.hostBuildNumber = value;
    }

}
