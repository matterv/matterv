
package com.vmware.vim25;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CpuIncompatible81EDX complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CpuIncompatible81EDX">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}CpuIncompatible">
 *       <sequence>
 *         <element name="nx" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ffxsr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="rdtscp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="lm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="other" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="otherOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpuIncompatible81EDX", propOrder = {
    "nx",
    "ffxsr",
    "rdtscp",
    "lm",
    "other",
    "otherOnly"
})
public class CpuIncompatible81EDX
    extends CpuIncompatible
{

    protected boolean nx;
    protected boolean ffxsr;
    protected boolean rdtscp;
    protected boolean lm;
    protected boolean other;
    protected boolean otherOnly;

    /**
     * Gets the value of the nx property.
     * 
     */
    public boolean isNx() {
        return nx;
    }

    /**
     * Sets the value of the nx property.
     * 
     */
    public void setNx(boolean value) {
        this.nx = value;
    }

    /**
     * Gets the value of the ffxsr property.
     * 
     */
    public boolean isFfxsr() {
        return ffxsr;
    }

    /**
     * Sets the value of the ffxsr property.
     * 
     */
    public void setFfxsr(boolean value) {
        this.ffxsr = value;
    }

    /**
     * Gets the value of the rdtscp property.
     * 
     */
    public boolean isRdtscp() {
        return rdtscp;
    }

    /**
     * Sets the value of the rdtscp property.
     * 
     */
    public void setRdtscp(boolean value) {
        this.rdtscp = value;
    }

    /**
     * Gets the value of the lm property.
     * 
     */
    public boolean isLm() {
        return lm;
    }

    /**
     * Sets the value of the lm property.
     * 
     */
    public void setLm(boolean value) {
        this.lm = value;
    }

    /**
     * Gets the value of the other property.
     * 
     */
    public boolean isOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     */
    public void setOther(boolean value) {
        this.other = value;
    }

    /**
     * Gets the value of the otherOnly property.
     * 
     */
    public boolean isOtherOnly() {
        return otherOnly;
    }

    /**
     * Sets the value of the otherOnly property.
     * 
     */
    public void setOtherOnly(boolean value) {
        this.otherOnly = value;
    }

}
