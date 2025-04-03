
package com.vmware.vim25;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMwareDVSVlanHealthCheckResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VMwareDVSVlanHealthCheckResult">
 *   <complexContent>
 *     <extension base="{urn:internalvim25}HostMemberUplinkHealthCheckResult">
 *       <sequence>
 *         <element name="trunkedVlan" type="{urn:internalvim25}NumericRange" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="untrunkedVlan" type="{urn:internalvim25}NumericRange" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSVlanHealthCheckResult", propOrder = {
    "trunkedVlan",
    "untrunkedVlan"
})
public class VMwareDVSVlanHealthCheckResult
    extends HostMemberUplinkHealthCheckResult
{

    protected List<NumericRange> trunkedVlan;
    protected List<NumericRange> untrunkedVlan;

    /**
     * Gets the value of the trunkedVlan property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trunkedVlan property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTrunkedVlan().add(newItem);
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
     *     The value of the trunkedVlan property.
     */
    public List<NumericRange> getTrunkedVlan() {
        if (trunkedVlan == null) {
            trunkedVlan = new ArrayList<>();
        }
        return this.trunkedVlan;
    }

    /**
     * Gets the value of the untrunkedVlan property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the untrunkedVlan property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUntrunkedVlan().add(newItem);
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
     *     The value of the untrunkedVlan property.
     */
    public List<NumericRange> getUntrunkedVlan() {
        if (untrunkedVlan == null) {
            untrunkedVlan = new ArrayList<>();
        }
        return this.untrunkedVlan;
    }

}
