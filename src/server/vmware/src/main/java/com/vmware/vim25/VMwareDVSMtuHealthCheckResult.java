
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSMtuHealthCheckResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSMtuHealthCheckResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostMemberUplinkHealthCheckResult">
 *       <sequence>
 *         <element name="mtuMismatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="vlanSupportSwitchMtu" type="{urn:internalvim25}NumericRange" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="vlanNotSupportSwitchMtu" type="{urn:internalvim25}NumericRange" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSMtuHealthCheckResult", propOrder = {
    "mtuMismatch",
    "vlanSupportSwitchMtu",
    "vlanNotSupportSwitchMtu"
})
public class VMwareDVSMtuHealthCheckResult
    extends HostMemberUplinkHealthCheckResult
{

    protected boolean mtuMismatch;
    protected List<NumericRange> vlanSupportSwitchMtu;
    protected List<NumericRange> vlanNotSupportSwitchMtu;

    /**
     * Gets the value of the mtuMismatch property.
     * 
     */
    public boolean isMtuMismatch() {
        return mtuMismatch;
    }

    /**
     * Sets the value of the mtuMismatch property.
     * 
     */
    public void setMtuMismatch(boolean value) {
        this.mtuMismatch = value;
    }

    /**
     * Gets the value of the vlanSupportSwitchMtu property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vlanSupportSwitchMtu property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVlanSupportSwitchMtu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumericRange }
     * </p>
     * 
     * 
     * @return
     *     The value of the vlanSupportSwitchMtu property.
     */
    public List<NumericRange> getVlanSupportSwitchMtu() {
        if (vlanSupportSwitchMtu == null) {
            vlanSupportSwitchMtu = new ArrayList<>();
        }
        return this.vlanSupportSwitchMtu;
    }

    /**
     * Gets the value of the vlanNotSupportSwitchMtu property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vlanNotSupportSwitchMtu property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVlanNotSupportSwitchMtu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumericRange }
     * </p>
     * 
     * 
     * @return
     *     The value of the vlanNotSupportSwitchMtu property.
     */
    public List<NumericRange> getVlanNotSupportSwitchMtu() {
        if (vlanNotSupportSwitchMtu == null) {
            vlanNotSupportSwitchMtu = new ArrayList<>();
        }
        return this.vlanNotSupportSwitchMtu;
    }

}
